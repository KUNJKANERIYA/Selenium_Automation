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

public class Certifications extends CommanMathods{
	
	public Certifications(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/certifications/");
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

            validateTitle(driver, "//h1[normalize-space()='Certifications']", "Certifications", "Main Section Title");
            validateTitle(driver, "//p[contains(text(),'We don’t just speak. But we value and try to achie')]", "We don’t just speak. But we value and try to achieve the best always. Here are some of our known achievements where we are proud of ourselves.", "Main Section Text1");
            
            checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-4496ae83 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
        
            // Checking All the certificates
            
            
            String[] certificateNames = {
            		"Best Innovative IT Solutions 2018",
            		"Best Software Development Company",
            		"Featured in Insights Success",
            		"Featured in Worldwide Featured Games",
            		"Good Firms",
            		"Clutch",
            		"ISO 9001:2015 Certificate",
            		"Startup India Recognization",
            		"App Futura",
            		"Nasscom Member",
            		"TiE Ahmedabad"
            };
    
            String[] certificateContents = {
            		"Because of our innovative skills and ability to provide best-in class solutions, we are announced as 'BEST INNOVATIVE IT SOLUTIONS 2018' at Vibrant Gujarat Summit - 2018.",
            		"Capermint Technologies Pvt. Ltd has achieved the crown of 'Best Software Development Company - Rising Star 2019' at Vibrant Gujarat Summit - 2019.",
            		"Because of the great vision and dedicated work the company is giving, our MD and CEO Mr Vivek Shah featured and interviewed at Best Online Business Magazine in the world - 'Insights Success'.",
            		"For one of our developed game 'Robomint' we are featured on worldwide gaming software platform - Buildbox.",
            		"Capermint Technologies got the certificate for providing high standards in the field of information technology.",
            		"Capermint Technologies Pvt. Ltd gained development certification from the Clutch.",
            		"Capermint Technologies Pvt Ltd is officially certified to the ISO 9001:2015 Quality Management System Standard.",
            		"Capermint Technologies has received recognition from Startup India and is now officially a Startup India Recognized company",
            		"We feel proud to announce that we are now a certified member of AppFutura.",
            		"Capermint Technologies Pvt. Ltd is a certified proud member of NASSCOM because of providing IT solutions and services.",
            		"We have also received a recognition certificate from TiE Ahmedabad as a growing startup in the field of IT solutions."
            };
            
            String[] certificateImageXpaths = {
            		"(//img[@title='logo_01'])[1]",
            		"(//img[@title='logo_01'])[2]",
            		"//img[@title='logo_07']",
            		"//img[@title='logo_03']",
            		"//img[@title='logo_08']",
            		"//img[@title='logo_04']",
            		"//img[@title='logo_09']",
            		"//img[@title='Startup-India']",
            		"//img[@title='logo_05']",
            		"//img[@title='logo_10']",
            		"//img[@title='logo_11']"
            };
            
            validateElements(driver, certificateNames, certificateContents, certificateImageXpaths, "certificate");
        
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
   		
        }
   	}

