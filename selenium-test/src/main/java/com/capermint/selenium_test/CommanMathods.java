package com.capermint.selenium_test;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CommanMathods {
    protected static WebDriver driver;

    public CommanMathods(WebDriver driver) {
        CommanMathods.driver = driver;
    }

    public static void printSectionHeader(String sectionName) {
        System.out.println("\n--- " + sectionName + " ---\n");
    }

    public static WebElement findElementByXpath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollToElementByXpath(WebDriver driver, String xpath) throws InterruptedException {
        WebElement element = findElementByXpath(driver, xpath);
        scrollToElement(driver, element);
        Thread.sleep(3000);
    }
    
    public static void hoverOverElement(WebDriver driver, String xpath) {
        Actions hoverActions = new Actions(driver);
        WebElement elementToHover = findElementByXpath(driver, xpath);
        hoverActions.moveToElement(elementToHover).perform();
    }
    
    public static void validateCardHighlightAnimation(WebDriver driver, String cardXpath, String expectedBorderColor, String expectedShadow) {
        WebElement card = driver.findElement(By.xpath(cardXpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(card).perform();

        try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }

        String actualBorderColor = card.getCssValue("border-color");
        String actualShadow = card.getCssValue("box-shadow");

        if (actualBorderColor.equals(expectedBorderColor)) {
            System.out.println("Border color is correct upon hover.");
        } else {
            System.out.println("Border color is incorrect. Expected: " + expectedBorderColor + " but got: " + actualBorderColor);
        }
        if (actualShadow.contains(expectedShadow)) {
            System.out.println("Box shadow effect is correct upon hover.");
        } else {
            System.out.println("Box shadow effect is incorrect. Expected to contain: " + expectedShadow + " but got: " + actualShadow);
        }
    }
    
    public static void hoverOverAllElements(WebDriver driver, List<String> xpaths) {
        Actions hoverActions = new Actions(driver);

        for (String xpath : xpaths) {
            WebElement faqElement = findElementByXpath(driver, xpath);
            hoverActions.moveToElement(faqElement).pause(500).perform();
        }
    }
    
    public static void hoverOverFaqs(WebDriver driver, List<String> faqQuestions) {
        Actions hoverActions = new Actions(driver);

        for (String question : faqQuestions) {
            String xpath = String.format("//span[contains(., '%s')]", question);
            WebElement faqElement = driver.findElement(By.xpath(xpath));

            hoverActions.moveToElement(faqElement).pause(500).perform();
            System.out.println("Hover is performed on: " + question);

            faqElement.click();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkImageVisibility(WebDriver driver, String xpath) {
        WebElement element = findElementByXpath(driver, xpath);
        System.out.println("Image is " + (element.isDisplayed() ? "visible" : "NOT visible") + ".");
    }

    public static void checkMultipleImagesVisibility(WebDriver driver, String[] xpaths) {
        for (String xpath : xpaths) {
            checkImageVisibility(driver, xpath);
        }
    }
    
    // Pending
    
    public static void checkImageAndNavigate(WebDriver driver, String targetImageXpath, String nextButtonXpath) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By nextSlideButton = By.xpath(nextButtonXpath);

        for (int i = 0; i < 13; i++) {
            WebElement image = findElementByXpath(driver, targetImageXpath);
            if (image.isDisplayed()) {
                System.out.println("Image is visible.");
                break;
            } else {
                WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(nextSlideButton));
                nextButton.click();
                System.out.println("Clicked next button. Attempt: " + (i + 1));
                Thread.sleep(1000);
            }
        }
    }

    public static void validateLink(WebDriver driver, String xpath, String expectedLink, String linkIdentifier) {
        String actualLink = findElementByXpath(driver, xpath).getAttribute("href");
        System.out.println(linkIdentifier + (actualLink.equals(expectedLink) ? " is correct." : " is incorrect."));
    }

    public static void checkBackgroundImage(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        String backgroundImage = ((JavascriptExecutor) driver)
                .executeScript("return window.getComputedStyle(arguments[0], null).getPropertyValue('background-image');", element)
                .toString();
        System.out.println((backgroundImage != null && !backgroundImage.equals("none")) 
                ? "Background image is present: " + backgroundImage 
                : "No background image found.");
    }
    
    public static void checkMultipleBackgroundImages(WebDriver driver, String[] xpaths) {
        for (String xpath : xpaths) {
            checkBackgroundImage(driver, xpath);
        }
    }

    public static void verifyTextInList(WebDriver driver, By locator, List<String> expectedTexts) {
        List<WebElement> listItems = driver.findElements(locator);
        if (listItems.size() != expectedTexts.size()) {
            throw new AssertionError("Number of list items does not match expected count.");
        }

        for (String expectedText : expectedTexts) {
            boolean found = listItems.stream().anyMatch(item -> item.getText().trim().equals(expectedText));
            if (!found) {
                throw new AssertionError("Text not found: " + expectedText);
            }
        }
        System.out.println("All expected texts are present in the list.");
    }

    private static String buildNameXpath(String type, String name) {

        if ("certificate".equalsIgnoreCase(type)) {
            return String.format("//p[normalize-space()='%s']", name);
        } else if (type.matches("(?i)Elements|Portfolio|Solutions|Gamification|Services|Real Estate Apps|EasyGamification|Features|Examples|Benefits")) {
            return String.format("//h3[normalize-space()='%s']", name);
        } else if ("Process".equals(type) || "Advantages".equals(type)) {
            return String.format("//h5[normalize-space()='%s']", name);
        } else {
            return String.format("//h4[normalize-space()='%s']", name);
        }
    }
    
    public static void validateTitle(WebDriver driver, String xpath, String expectedText, String identifier) {

        String actualText = normalizeText(findElementByXpath(driver, xpath).getText());
        String normalizedExpectedText = normalizeText(expectedText);
        boolean isTextCorrect = actualText.equalsIgnoreCase(normalizedExpectedText);

        System.out.println(identifier + (isTextCorrect ? " is correct." : " is incorrect."));
    }
    
    private static String normalizeText(String text) {
        if (text == null) return "";
        return text.replaceAll("<[^>]*>", "")
        		   .replaceAll("(?i)<br\\s*/?>", " ")
                   .replace("\u00A0", " ")
                   .replaceAll("\\s+", " ")
                   .replaceAll("[\r\n]+", " ")
                   .trim();
    }
    
    public static void validateElements(WebDriver driver, String[] names, String[] contents, String[] imageXpaths, String type) {
        int numberOfElements = names.length;

        for (int i = 0; i < numberOfElements; i++) {
            if (imageXpaths != null && imageXpaths.length > 0) {
                checkImageVisibility(driver, imageXpaths[i]);
            }

            String nameXpath = buildNameXpath(type, names[i]);
            validateTitle(driver, nameXpath, names[i], names[i]);

            if (contents != null && contents.length > 0 && contents[i] != null) {
                String contentXpath = getContentXpath(driver, type, names[i], contents[i]);
                if (contentXpath != null) {
                    validateTitle(driver, contentXpath, contents[i], names[i] + " Content");
                } else {
                    System.out.println("No valid XPath found for content: " + contents[i]);
                }
            }
        }
    }

    private static String getContentXpath(WebDriver driver, String type, String name, String content) {

    	String sanitizedContent = content.substring(0, Math.min(content.length(), 20)).replace("'", "''");

        String[] xpaths = {
            String.format("//span[contains(text(), \"%s\")]", sanitizedContent),
            String.format("//div[contains(text(), \"%s\")]", sanitizedContent),
            String.format("//p[contains(., \"%s\")]", sanitizedContent),
            String.format("//p[contains(text(), \"%s\")]", sanitizedContent),
            String.format("//p[contains(normalize-space(text()), \"%s\")]", sanitizedContent),
            String.format("//p[normalize-space(.)= \"%s\"]", sanitizedContent),
            String.format("//p[contains(.,\"%s\")]", sanitizedContent),
            String.format("//p[contains(.,'%s')]", sanitizedContent),
            String.format("//p[contains(.,\"%s\")]", sanitizedContent)
        };

        for (String xpath : xpaths) {
            try {
                if (driver.findElements(By.xpath(xpath)).size() > 0) {
                    return xpath;
                }
            } catch (Exception e) {
                // Log the exception if needed or continue with the next XPath
                // Optionally, log the exception for debugging
            }
        }
        return null;
    }
 
    public static void validateCounterValue(WebDriver driver, String xpath, int expectedValue) {
        WebElement counterElement = driver.findElement(By.xpath(xpath));

        String dataToValue = counterElement.getAttribute("data-to-value");
        int finalCounterValue = Integer.parseInt(dataToValue);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(counterElement, String.valueOf(finalCounterValue)));

        int displayedValue = Integer.parseInt(counterElement.getText().replace(",", "").trim());

        System.out.println(displayedValue == expectedValue 
            ? "Counter is correct and displays: " + displayedValue 
            : "Counter is incorrect. Expected: " + expectedValue + ", but found: " + displayedValue);
    }
}