package com.capermint.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snake_Ladder_Game extends CommanMathods{

	public Snake_Ladder_Game(WebDriver driver) {	
		super(driver);			
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/snake-ladder-game-development/");
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
        
        validateTitle(driver, "//h1[normalize-space()='Snake & Ladder Game Development Company']", "Snake & Ladder Game Development Company", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint is a leading snake & ladder game develop')]", "Capermint is a leading snake & ladder game development company. With our help of expert game developers, we are providing top-notch snake & ladder game app and website development services.", "Content");
        
        validateLink(driver, "//a[@target='_self']", "https://www.capermint.com/contact/", "Contact Us Button");
        
        checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap'])[1]");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-23837de9 elementor-section-full_width new-gs-1 elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(4, 154, 254, 1)");
        
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}