package com.capermint.selenium_test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OurProcess extends CommanMathods{
	
	public OurProcess(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/our-process/");
            Thread.sleep(10000);

            Actions hoverActions = new Actions(driver);
            WebElement ContactUS = findElementByXpath(driver, "//a[@target='_self']");
            hoverActions.moveToElement(ContactUS).perform();
            Thread.sleep(2000);
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            
            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cp-close-btn cp-callback-widget__close-btn cp-close-btn--mobile-friendly']")));
            closeButton.click();        
            Thread.sleep(2000);
                   
            WebElement Callclosebutton = driver.findElement(By.xpath("(//button[@class='cp-close-btn cp-tooltip__close-btn cp-close-btn--round cp-close-btn--offset cp-close-btn--mobile-friendly'])[1]"));
            Callclosebutton.click();        
            Thread.sleep(2000);
            
            // Main Section
            
            printSectionHeader("Main Section");
            
            validateTitle(driver, "//p[@class='elementor-heading-title elementor-size-default']", "Our Process", "OurProcessTitle");
            validateTitle(driver, "//h1[normalize-space()='We help you to grow your business!']", "We help you to grow your business!", "OurProcessText");
            validateTitle(driver, "//p[contains(text(),'We’ve helped our clients in raising their bar with')]", "We’ve helped our clients in raising their bar with our excellent product development process!", "OurProcessContent");
            
            validateLink(driver, "//a[@target='_self']", "https://www.capermint.com/contact/", "ContactUsButton");
            
            checkBackgroundImage(driver, "//div[@class='elementor-widget-wrap']");
            
            validateTitle(driver, "//h2[contains(text(),'Our Conducive process to fuel your business growth')]", "Our Conducive process to fuel your business growth!", "ContentTitle");
            validateTitle(driver, "(//div[@class='elementor-widget-container'])[6]", "Capermint’s motive is to provide the most extraordinary app and game solutions to help clients achieve their goals easily and nurture their businesses. To ensure that we create the most refined and effective solution, we follow this curated development process:", "Content");
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[1]");
            
            // Step 1 Section
            
            printSectionHeader("Step 1 Section");
            
            checkImageVisibility(driver, "//img[@alt='Research Analysis']");
            
            validateTitle(driver, "//span[text()='Step 01']", "STEP 01", "Step1Text");
            validateTitle(driver, "//h3[normalize-space()='Research & Analysis']", "Research & Analysis", "Step1Title");
            validateTitle(driver, "//p[contains(text(),'A dedicated project manager will be assigned to yo')]", "A dedicated project manager will be assigned to you to understand your requirements, your goals, and your expectations. They will formulate a project strategy based on your requirements. Whether it’s a development from scratch or if you come to us with a half-coded product, our manager will assess everything and will create the roadmap that leads to maximum efficiency.", "Step1Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[1]", "What We Cover", "ListTitle");
            
            By listLocator1 = By.xpath("(//ul)[64]/li");
            List<String> expectedTexts1 = Arrays.asList(
                "Requirement Analysis",
                "Features Enhancement",
                "Competitor Analysis",
                "Tech Stack",
                "Product Roadmap",
                "Approx Product Estimation"
            );
            
            verifyTextInList(driver, listLocator1, expectedTexts1);
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[2]");
            
            // Step 2 Section
            
            printSectionHeader("Step 2 Section");
            
            checkImageVisibility(driver, "//img[@alt='Wireframing']");
            
            validateTitle(driver, "//span[text()='Step 02']", "STEP 02", "Step2Text");
            validateTitle(driver, "//h3[normalize-space()='Wireframe & Prototype']", "Wireframe & Prototype", "Step2Title");
            validateTitle(driver, "//p[contains(text(),'It’s time to create the outline of your product. I')]", "It’s time to create the outline of your product. It provides a clear view of how your app will function, look and feel. In layman’s terms, it can be stated as a prototype. The wireframe will be a visual guide on how the app/game will work and how the transaction will happen from one part of the app/game to another. Wireframing works as a cheaper alternative to see the user journey of your game/app.", "Step2Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[2]", "What We Cover", "ListTitle");
            
            By listLocator2 = By.xpath("(//ul)[65]/li");
            List<String> expectedTexts2 = Arrays.asList(
                "Product Flow",
                "Interactive Clickable Prototype",
                "Unlimited Changes",
                "Final Prototype"
            );
            
            verifyTextInList(driver, listLocator2, expectedTexts2);
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[3]");
            
            // Step 3 Section
            
            printSectionHeader("Step 3 Section");
            
            checkImageVisibility(driver, "//img[@alt='Product Designing']");
            
            validateTitle(driver, "//span[text()='Step 03']", "STEP 03", "Step3Text");
            validateTitle(driver, "//h3[normalize-space()='Product Designing']", "Product Designing", "Step3Title");
            validateTitle(driver, "//p[contains(text(),'Attraction is the key to sales. In this stage, we ')]", "Attraction is the key to sales. In this stage, we will work on designing the most intriguing product for you that will be attractive, as well as it will be the most useful and user-friendly design for your product. We will design the backgrounds, in-app transitions, all the assets of the app/game, and the entire UI/UX of the app/game. Based on these designs we will now start the development process.", "Step3Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[3]", "What We Cover", "ListTitle");
            
            By listLocator3 = By.xpath("(//ul)[66]/li");
            List<String> expectedTexts3 = Arrays.asList(
                "Colors & Logo Selection",
                "Easy-to-use UI Design",
                "Art & Character Design",
                "Assets Design",
                "Unlimited Changes"
            );
            
            verifyTextInList(driver, listLocator3, expectedTexts3);
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[4]");
            
            // Step 4 Section
            
            printSectionHeader("Step 4 Section");
            
            checkImageVisibility(driver, "//img[@alt='Product Development - Process']");
            
            validateTitle(driver, "//span[text()='Step 04']", "STEP 04", "Step4Text");
            validateTitle(driver, "//h3[normalize-space()='Product Development']", "Product Development", "Step4Title");
            validateTitle(driver, "//p[contains(text(),'To ensure that there are no errors or lags in your')]", "To ensure that there are no errors or lags in your product, in this step, we will test your product and it will go through various rigorous tests. We run the app on various devices, and through various scenarios, we see if there are any bugs in the app. This process ensures that you have the best version of your product. Once we receive the green light from the testing team, we are ready for the app launch.", "Step4Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[4]", "What We Cover", "ListTitle");
            
            By listLocator4 = By.xpath("(//ul)[67]/li");
            List<String> expectedTexts4 = Arrays.asList(
                "Structured Light Weight Coding",
                "Features & Functionality Development",
                "Code Optimization"
            );
            
            verifyTextInList(driver, listLocator4, expectedTexts4);
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[5]");
            
            // Step 5 Section
            
            printSectionHeader("Step 5 Section");
            
            checkImageVisibility(driver, "//img[@alt='QA-Process']");
            
            validateTitle(driver, "//span[text()='Step 05']", "STEP 05", "Step5Text");
            validateTitle(driver, "//h3[normalize-space()='Quality Assurance']", "Quality Assurance", "Step5Title");
            validateTitle(driver, "//p[contains(text(),'To ensure that there are no errors or lags in your')]", "To ensure that there are no errors or lags in your product, in this step, we will test your product and it will go through various rigorous tests. We run the app on various devices, and through various scenarios, we see if there are any bugs in the app. This process ensures that you have the best version of your product. Once we receive the green light from the testing team, we are ready for the app launch.", "Step5Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[5]", "What We Cover", "ListTitle");
            
            By listLocator5 = By.xpath("(//ul)[68]/li");
            List<String> expectedTexts5 = Arrays.asList(
                "Document & Design Testing",
                "Functional testing",
                "Non-functional testing",
                "Regression testing",
                "Ad- hoc testing",
                "Smoke testing",
                "Compatibility Testing",
                "Security testing"
            );
            
            verifyTextInList(driver, listLocator5, expectedTexts5);
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "(//h5[normalize-space()='What We Cover'])[5]");
            
            // Step 6 Section
            
            printSectionHeader("Step 6 Section");
            
            checkImageVisibility(driver, "//img[@alt='Launch Applications']");
            
            validateTitle(driver, "//span[text()='Step 06']", "STEP 06", "Step6Text");
            validateTitle(driver, "//h3[normalize-space()='Launch']", "Launch", "Step6Title");
            validateTitle(driver, "//h6[contains(text(),'Now as your product has passed through all the qua')]", "Now as your product has passed through all the quality tests, this is the time to launch your product and make it available to the users. We will launch your app onto the internet and app stores. At this step, the clients usually hire us for all the future updates and maintenance of the product. We provide 24*7 support services and maintenance services to make sure your app provides the best experience.", "Step6Content");
            validateTitle(driver, "(//h5[normalize-space()='What We Cover'])[6]", "What We Cover", "ListTitle");
            
            By listLocator6 = By.xpath("(//ul)[69]/li");
            List<String> expectedTexts6 = Arrays.asList(
                "Product Launch at Multiple AppStores",
                "On-going Bug Fixes",
                "Future Product Enhancement",
                "Post-Support"
            );
            
            verifyTextInList(driver, listLocator6, expectedTexts6);
            
            // page scrolling
            
            scrollToElementByXpath(driver, "//h2[@class='elementor-heading-title elementor-size-default']");
            
            // Last Section
            
            printSectionHeader("LastSection");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[2]", "The further you go into technology, the further you advance towards a better, more productive, and opportunistic future.", "Heading Title");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
