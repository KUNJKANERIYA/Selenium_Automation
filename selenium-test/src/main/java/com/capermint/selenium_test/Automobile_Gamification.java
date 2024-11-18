package com.capermint.selenium_test;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automobile_Gamification extends CommanMathods{
	
	public Automobile_Gamification(WebDriver driver) {	
		super(driver);			
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/mobile-app-gamification/");
        Thread.sleep(10000);
        
        hoverOverElement(driver, "//span[normalize-space()='Why Capermint']");
        Thread.sleep(2000);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cp-close-btn cp-callback-widget__close-btn cp-close-btn--mobile-friendly']")));
        closeButton.click();        
        Thread.sleep(2000);
               
        WebElement Callclosebutton = driver.findElement(By.xpath("(//button[@class='cp-close-btn cp-tooltip__close-btn cp-close-btn--round cp-close-btn--offset cp-close-btn--mobile-friendly'])[1]"));
        Callclosebutton.click();        
        Thread.sleep(2000);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Drift Widget Chat Controller']")));
        driver.findElement(By.cssSelector(".drift-widget-controller-icon.circle")).click();  
        driver.switchTo().defaultContent();
        
        // Main Section
        
        printSectionHeader("Main Section");
        Thread.sleep(2000);
        
        String border = driver.findElement(By.xpath("(//div[@class='elementor-image-box-content'])[1]")).getCssValue("border-color");
        System.out.print(border);
        
        scrollToElementByXpath(driver, "(//div[@class='eael-elements-flip-box-front-container'])[5]");
        Thread.sleep(2000);
        
        List<String> frontSideXPaths = List.of(
                "(//div[@class='eael-elements-flip-box-front-container'])[5]",
                "(//div[@class='eael-elements-flip-box-front-container'])[6]",
                "(//div[@class='eael-elements-flip-box-front-container'])[7]",
                "(//div[@class='eael-elements-flip-box-front-container'])[8]",
                "(//div[@class='eael-elements-flip-box-front-container'])[9]",
                "(//div[@class='eael-elements-flip-box-front-container'])[10]",
                "(//div[@class='eael-elements-flip-box-front-container'])[11]"
            );

            List<String> backSideXPaths = List.of(
                "//div[contains(text(), 'Food and Restaurant Gamification includes setting loyalty')]",
                "//div[contains(text(), 'Drive Motivation into your banking and financial service')]",
                "//div[contains(text(), 'Drive Intrinsic Motivation and Boost Sales with')]",
                "//div[contains(text(), 'With Gamification in Transport and Automotive, you can improve')]",
                "//div[contains(text(), 'As a full-fledged mobile game development company')]",
                "//div[contains(text(), 'Create valuable relationships with your audience with')]",
                "//div[contains(text(), 'Add fun to learning with Capermi')]"
            );
            Duration waitTime = Duration.ofSeconds(10);

            validateMultipleFlipCardAnimations(driver, frontSideXPaths, backSideXPaths, waitTime);

        
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}