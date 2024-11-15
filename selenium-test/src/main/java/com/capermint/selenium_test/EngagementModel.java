package com.capermint.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EngagementModel extends CommanMathods{
	
	public EngagementModel(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/engagement-model/");
            Thread.sleep(10000);

            Actions hoverActions = new Actions(driver);
            WebElement AnythingToHover = findElementByXpath(driver, "//span[normalize-space()='Why Capermint']");
            hoverActions.moveToElement(AnythingToHover).perform();
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

            validateTitle(driver, "//h1[normalize-space()='Engagement Model']", "Engagement Model", "Main Section Title");
            validateTitle(driver, "//p[contains(text(),'Our aim is to provide you a complete enterprise bu')]", "Our aim is to provide you a complete enterprise business solutions that are unique for your plans.", "Main Section Text1");
            
            checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-2855fbee elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
            
            validateTitle(driver, "//h2[contains(text(),'Capermint’s Engagement Models')]", "Capermint’s Engagement Models", "Main Section Text2");
            validateTitle(driver, "//div[contains(text(), 'None of the businesses are alike.')]", "None of the businesses are alike. At Capermint, we make sure that all projects should be unique in their way. So, we develop an incomparable project model that is in accordance with your dynamic enterprise needs.", "Main Section Content");
            
            // Page Scrolling
            
            WebElement ScrollToSection1 = findElementByXpath(driver, "//img[@alt='Hire-a-Developer-Model']");
            scrollToElement(driver, ScrollToSection1);
            Thread.sleep(3000);
            
            // Hire a Developer Model Section
            
            printSectionHeader("Hire a Developer Model Section");
            
            checkImageVisibility(driver, "//img[@alt='Hire-a-Developer-Model']");
            validateTitle(driver, "//h2[normalize-space()='Hire a Developer Model']", "Hire a Developer Model", "Section1 Title");
            validateTitle(driver, "//p[contains(text(),'This model lets you hire our services, dedicated w')]", "This model lets you hire our services, dedicated web developers and designers. We have categorized this model in 3 options accordingly your needs and requirements of projects.", "Section1 Content");
            validateTitle(driver, "//p[normalize-space()='Full-Time Hire , Part-Time Hire , Hour-Based Hire']", "Full-Time Hire , Part-Time Hire , Hour-Based Hire", "Section1 Text");
            
            // Page Scrolling
            
            WebElement ScrollToSection2 = findElementByXpath(driver, "//img[@alt='Fixed-Price-Development-Model']");
            scrollToElement(driver, ScrollToSection2);
            Thread.sleep(3000);
            
            // Fixed Price Development Model Section
            
            printSectionHeader("Fixed Price Development Model Section");
            
            checkImageVisibility(driver, "//img[@alt='Fixed-Price-Development-Model']");
            validateTitle(driver, "//h2[normalize-space()='Fixed Price Development Model']", "Fixed Price Development Model", "Section2 Title");
            validateTitle(driver, "//p[contains(text(),'When you want complete solutions for your enterpri')]", "When you want complete solutions for your enterprise, full-time hire model is most preferable development model. In this model, the client gets one specific person for the project and it also allows a client to communicate direct and clear. You can hire our experts in SEO, mobile app development, web development throughout the project.", "Section2 Content");
            
            // Page Scrolling
            
            WebElement ScrollToSection3 = findElementByXpath(driver, "//img[@alt='Time-and-Material-Development-Model']");
            scrollToElement(driver, ScrollToSection3);
            Thread.sleep(3000);
            
            // Time and Material Development Model Section
            
            printSectionHeader("Time and Material Development Model Section");
            
            checkImageVisibility(driver, "//img[@alt='Time-and-Material-Development-Model']");
            validateTitle(driver, "//h2[normalize-space()='Time and Material Development Model']", "Time and Material Development Model", "Section3 Title");
            validateTitle(driver, "//p[contains(text(),'When a client has the only idea and he has not fix')]", "When a client has the only idea and he has not fixed timeline, this development model is most suitable. For constant involvement and changing requirement, use of time and material development model is perfect. With our experts team, we work on such projects on a daily, weekly and monthly and we charge the client based on a number of hours devoted by our team members.", "Section3 Content");
            
	 } catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
         e.printStackTrace();
     } finally {
         driver.quit();
     }
		
     }
	}

