package com.capermint.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperCasual_Game_Development extends CommanMathods{
	
	public HyperCasual_Game_Development(WebDriver driver) {	
		super(driver);			
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/hyper-casual-game-development/");
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
        
        checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-ce83adf elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
        
        validateTitle(driver, "//h1[normalize-space()='Hyper Casual Game Development Company']", "Hyper Casual Game Development Company", "Title");
        validateTitle(driver, "//h2[normalize-space()='Best Hyper Casual Mobile Game Developers']", "Best Hyper Casual Mobile Game Developers", "Text");
        validateTitle(driver, "//p[contains(.,'Craft engaging and captivating games with our trusted')]", "Craft engaging and captivating games with our trusted hyper casual game development services. Push the limits of unforgettable gameplay and deliver an exceptional gaming experience that stands out in the industry.", "Content");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]", "https://www.capermint.com/contact/", "Free Quote Button");
        
        String[] Images = {
        		"//img[@alt='expert-uno']",
        		"//img[@class='attachment-full size-full wp-image-104108']",
        		"//img[@alt='certified-dev']",
        		"//img[@alt='customizable-uno']"
        };
        
        checkMultipleImagesVisibility(driver, Images);
        
        validateTitle(driver, "//span[normalize-space()='Certified Developers']", "Certified Developers", "Text 1");
        validateTitle(driver, "//span[normalize-space()='Client Satisfaction']", "Client Satisfaction", "Text 2");
        validateTitle(driver, "//span[normalize-space()='NDA Signed']", "NDA Signed", "Text 3");
        validateTitle(driver, "//span[normalize-space()='Proactive Approach']", "Proactive Approach", "Text 4");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Top Hyper Casual Game Developers']");
        
        // Top Hyper Casual Game Developers Section
        
        printSectionHeader("Top Hyper Casual Game Developers Section");
        
        validateTitle(driver, "//h2[normalize-space()='Top Hyper Casual Game Developers']", "Top Hyper Casual Game Developers", "Title");
        validateTitle(driver, "//span[contains(text(),'We are known for developing the best Hyper Casual ')]", "We are known for developing the best Hyper Casual Mobile Games in the gaming industry. Our expert developers are specialized in developing addictive games that engage players globally.", "Content 1");
        validateTitle(driver, "//span[contains(text(),'Our team is dedicated to game development and we b')]", "Our team is dedicated to game development and we bring your gaming ideas into reality. We offer customized hyper casual game solutions to our clients. If you have a new idea for your next game then talk with our expert developers and start your gaming business with us. ", "Content 2");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]", "https://www.capermint.com/games-portfolio/", "Explore our games Button");
        checkImageVisibility(driver, "//img[@alt='expert_casual']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Hyper Casual Game Development Services']");
        
        // Game Development Services Section
        
        printSectionHeader("Game Development Services Section");
        
        validateTitle(driver, "//h2[normalize-space()='Hyper Casual Game Development Services']", "Hyper Casual Game Development Services", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint is a leading hyper casual game design an')]", "Capermint is a leading hyper casual game design and development company in the USA. We specialize in developing games that are quick and easy to play with high graphics that provide the best gaming experience to the user. Our hyper casual game development service is designed to be easily enjoyed by a wide range of players. Check out the below services for hyper casual mobile games:- ", "Content");
        
        checkImageVisibility(driver, "//img[@alt='casual-icon']");
        
        String[] ServiceNames = {
        		"One-stop shop for Hyper casual games",
        		"Hyper Casual Game Conceptualization",
        		"Hyper-Casual Game Design",
        		"Game Prototyping",
        		"Testing & Quality Assurance",
        		"Regular Updates"
        };
        
        String[] ServiceContents = {
        		"Capermint Technologies is a one-stop shop for all your hyper casual game design requirements. We guide you through every step from brainstorming to development & launch. Our expert team ensures a seamless process and delivers a game that engages the players.",
        		"Bring your game ideas to life with our hyper casual game conceptualization services. We create unique and engaging concepts that capture players' interest and stand out. Our team designs fresh & exciting gameplay experiences.",
        		"Let our designers craft engaging hyper-casual game designs with standout characters and immersive environments. We focus on creating visually appealing experiences that are intuitive and addictive.",
        		"Experience your game’s possibilities with our dynamic prototyping services. We quickly create interactive models to test and enhance gameplay ideas. Our team ensures each element is optimized before full development begins.",
        		"Ensure your game runs smoothly with our Testing & Quality Assurance services. We check every part of your game to find and fix any issues. This ensures a seamless and enjoyable experience for players.",
        		"Keep your hyper-casual game engaging with our Regular Updates service. We offer ongoing enhancements and quick fixes to ensure your game remains fresh, fun, and fully optimized for players."
        };
        
        String[] ServiceImages = {
        		"//img[@class='attachment-full size-full wp-image-105700']",
        		"//img[@alt='game-concep']",
        		"//img[@alt='hyper-casual-game']",
        		"//img[@alt='game-prototyping']",
        		"//img[@alt='testing-quality']",
        		"//img[@alt='Regular']"
        };
        
        validateElements(driver, ServiceNames, ServiceContents, ServiceImages, "Services");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "");
        
        // Explore Section
        
        printSectionHeader("Explore Section");
        
        
        
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}