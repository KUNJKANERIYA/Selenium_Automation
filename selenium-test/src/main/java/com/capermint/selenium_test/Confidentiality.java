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

public class Confidentiality extends CommanMathods{
	
	public Confidentiality(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/confidentiality/");
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
            Thread.sleep(3000);

            validateTitle(driver, "//h1[normalize-space()='Confidentiality']", "Confidentiality", "Main Section Title");
            validateTitle(driver, "//p[contains(text(),'We believe that privacy and confidentiality are th')]", "We believe that privacy and confidentiality are the core elements of every project. And so we sign the strict non-disclosure agreement with the employees and the clients.", "Main Section Text1");

            checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-9ba2771 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
      
            validateTitle(driver, "//p[contains(text(),'With these agreements, your data will securely mai')]", "With these agreements, your data will securely maintain which is long-term relationship sign with you. Your data is an encyclopedia of your business and you rely on this data for the business and so we take care of your business data by following security measures.", "Main Section Text2");
            
            scrollToElementByXpath(driver, "//p[contains(text(),'To access in office premises, use of an electronic')]");
            
            // Security Section
            
            printSectionHeader("Security Section");
            
            validateTitle(driver, "//h2[normalize-space()='Security']", "Security", "Security Title");
            
            validateTitle(driver, "//h5[normalize-space()='Technology:']", "Technology:", "TitleText1");
            validateTitle(driver, "//p[contains(text(),'At Capermint, all working areas and servers are pr')]", "At Capermint, all working areas and servers are protected by software and hardware firewalls.", "Point1");
            validateTitle(driver, "//p[contains(text(),'We always do daily scanning of all workstations an')]", "We always do daily scanning of all workstations and servers.", "Point2");
            validateTitle(driver, "//p[contains(text(),'At Capermint, all communication is controlled by t')]", "At Capermint, all communication is controlled by the highest level of protection that is especially for client’s data and intellectual property.", "Point3");
            
            validateTitle(driver, "//h5[normalize-space()='Office:']", "Office:", "TitleText2");
            validateTitle(driver, "//p[normalize-space()='Fire alarms are set up across the office premises']", "Fire alarms are set up across the office premises", "Point1");
            validateTitle(driver, "//p[contains(text(),'24*7 CCTV cameras for safety and security of workf')]", "24*7 CCTV cameras for safety and security of workforce", "Point2");
            validateTitle(driver, "//p[contains(text(),'For communication, there is secure access for empl')]", "For communication, there is secure access for employees and guest.", "Point3");
            validateTitle(driver, "//p[contains(text(),'To access in office premises, use of an electronic')]", "To access in office premises, use of an electronic card and bio metric security system is must for each employee.", "Point4");
             
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
   		
        }
   	}