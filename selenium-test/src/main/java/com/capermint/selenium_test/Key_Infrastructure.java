package com.capermint.selenium_test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Infrastructure extends CommanMathods{
	
		public Key_Infrastructure(WebDriver driver) {
			super(driver);
		}
		
		public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        try {
	            driver.get("https://www.capermint.com/infrastructure/");
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
	            
	            validateTitle(driver, "//h1[normalize-space()='Capermint Key Infrastructure']", "Capermint Key Infrastructure", "Title");
	            validateTitle(driver, "//div[contains(text(), 'Capermint has created such an ambience')]", "Delivering a perfect solution is a process that is possible only if certain factors are aligned together and a perfect infrastructure is one of the factors. Capermint has created such an ambience that can boost the efficiency of everyone.", "Title Text");
	            
	            validateLink(driver, "//a[contains(@href,'https://www.capermint.com/contact-us/')]", "https://www.capermint.com/contact-us/", "ContactUs button");
	            
	            checkBackgroundImage(driver, "//div[@class='elementor-widget-wrap']");
	            
	            // Page scrolling
	            
	            scrollToElementByXpath(driver, "//p[contains(text(),'Capermint Technologies understand the importance o')]");
	            Thread.sleep(2000);
	            
	            // Architecture Section
	            
	            printSectionHeader("Architecture Section");
	            
	            checkImageVisibility(driver, "//img[@alt='Best Tool']");
	            validateTitle(driver, "//h5[normalize-space()='Best Tools']", "Best Tools", "ImageTitle 1");
	            validateTitle(driver, "//p[contains(text(),'Looking to bring your high-quality Scalable apps i')]", "Looking to bring your high-quality Scalable apps in real life.", "ImageText 1");

	            checkImageVisibility(driver, "//img[@alt='Experienced Team']");
	            validateTitle(driver, "//h5[normalize-space()='Experienced Team']", "Experienced Team", "ImageTitle 2");
	            validateTitle(driver, "//p[contains(text(),'Reimagine your business with our Mobile App Develo')]", "Reimagine your business with our Mobile App Development Services.", "ImageText 2");
	            
	            checkImageVisibility(driver, "//img[@alt='Multiple Platforms']");
	            validateTitle(driver, "//h5[normalize-space()='Multiple Platforms']", "Multiple Platforms", "ImageTitle 3");
	            validateTitle(driver, "//p[contains(text(),'Building custom solutions across Android, iOS, and')]", "Building custom solutions across Android, iOS, and Native platforms.", "ImageText 3");
	            
	            validateTitle(driver, "(//h2[normalize-space()=\"Capermint's Amazing Architecture\"])[1]", "Capermint's Amazing Architecture", "Architecture Title");
	            validateTitle(driver, "//p[contains(text(),'The workplace should be such that motivates a pers')]", "The workplace should be such that motivates a person to push themselves and to achieve more and more. Capermint’s architecture is built with the same vision. Capermint’s motive is to go to the next level, and well-planned architecture is one small step towards this goal, as it creates such a climate that boosts the dedication of the whole Capermint family towards this goal.", "Architecture Text1");
	            validateTitle(driver, "//p[contains(text(),'Capermint Technologies understand the importance o')]", "Capermint Technologies understand the importance of technology and infrastructure when it comes to app development service. Therefore, Capermint has incorporated the world’s finest and technologically advanced, robust premises to provide the team with an environment that they can use to develop world-class apps.", "Architecture Text2");
	            
	            scrollToElementByXpath(driver, "//p[contains(text(),'The workplace should be such that motivates a pers')]");
	            
	            List<String> imageXpaths = List.of(
	            	    "(//img[@alt='Capermint Office Image 01'])[1]",
	            	    "(//img[@alt='Capermint Office Image 02'])[1]",
	            	    "(//img[@alt='Capermint Office Image 03'])[1]",
	            	    "(//img[@alt='Capermint Office Image 04'])[1]",
	            	    "(//img[@alt='Capermint Office Image 05'])[1]",
	            	    "(//img[@alt='Capermint Office Image 06'])[1]",
	            	    "(//img[@alt='Capermint Office Image 07'])[1]",
	            	    "(//img[@alt='Capermint Office Image 08'])[1]",
	            	    "(//img[@alt='Capermint Office Image 09'])[1]",
	            	    "(//img[@alt='Capermint Office Image 10'])[1]",
	            	    "(//img[@alt='Capermint Office Image 11'])[2]",
	            	    "(//img[@alt='Capermint Office Image 12'])[2]",
	            	    "(//img[@alt='Capermint Office Image 13'])[2]"
	            	);

	            	String nextButtonXpath = "(//button[@aria-label='slick-next'])[1]";

	            	checkMultipleImagesAndNavigate(driver, imageXpaths, nextButtonXpath);
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[contains(@alt,'Latest Custom Solution')]");
	            
	            // Architecture Section 1
	            
	            printSectionHeader("Architecture Section 1");
	            
	            checkImageVisibility(driver, "//img[contains(@alt,'Latest Custom Solution')]");
	            validateTitle(driver, "//h2[normalize-space()='CUSTOMIZED DEMAND SOLUTIONS']", "CUSTOMIZED DEMAND SOLUTIONS", "Architecture Title 1");
	            validateTitle(driver, "//p[contains(text(),'Custom app/game development is the process of desi')]", "Custom app/game development is the process of designing, developing, scaling, integrating, and upgrading solutions to meet the demand and the needs of your business. At Capermint, we have all the necessary tools to develop the most useful app/game powered with highly advanced features.", "Architecture Text 1");
	            validateTitle(driver, "//p[contains(text(),'We can handle the needs of businesses of all sizes')]", "We can handle the needs of businesses of all sizes, from a small startup, to fortune 500 companies, to mid-size businesses, to enterprise-level companies. Capermint Technologies can tailor app solutions according to your need, whether the app is for the management of B2B, B2C interactions, on-demand solution, internal operations, gaming apps, etc, Capermint is the one perfect stop for all your needs.", "Architecture Text 2");
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[@alt='Data Backup']");
	            
	            // Architecture Section 2
	            
	            printSectionHeader("Architecture Section 2");
	            
	            checkImageVisibility(driver, "//img[@alt='Data Backup']");
	            validateTitle(driver, "//h2[normalize-space()='RATIONAL DATA BACKUP FACILITY']", "RATIONAL DATA BACKUP FACILITY", "Architecture Title 2");
	            validateTitle(driver, "//p[contains(text(),'The user experience of any app is dependent upon t')]", "The user experience of any app is dependent upon the data backup. Users spend significant time and effort in creating an identity, adding data, and customizing settings and preferences on your app. A wise man is one with a back-up plan, similarly, a wise developer is one that has a data backup facility. The back-up facility lets the user enjoy a personalized experience across various devices.", "Architecture Text 1");
	            validateTitle(driver, "//p[contains(text(),'Capermint Technologies handles the data back-up of')]", "Capermint Technologies handles the data back-up of every product that they develop and thus, all their clients can count on them for their app’s data preservation. Capermint Technologies ensure regular data backup to prevent any accidental loss of your information or database.", "Architecture Text 2");
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[@alt='Project maintenance']");
	            
	            // Architecture Section 3
	            
	            printSectionHeader("Architecture Section 3");
	            
	            checkImageVisibility(driver, "//img[@alt='Project maintenance']");
	            validateTitle(driver, "//h2[normalize-space()='PROJECT MAINTENANCE']", "PROJECT MAINTENANCE", "Architecture Title 3");
	            validateTitle(driver, "//p[contains(text(),'Capermint Technologies is equipped with the latest')]", "Capermint Technologies is equipped with the latest technology and therefore the company can maintain all the versions of your files, be it present or the old ones. You can get all your files from the company.", "Architecture Text 1");
	            validateTitle(driver, "//p[contains(text(),'If there are any issues with the new files, at lea')]", "If there are any issues with the new files, at least you will have the backup of the old file. You can refer to the old file and therefore you don’t have to start everything from scratch. All the data is stored in the company’s servers systematically so that you can get whatever you want in just a few seconds.", "Architecture Text 2");
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[@alt='Priority checkup']");
	            
	            // Architecture Section 4
	            
	            printSectionHeader("Architecture Section 4");
	            
	            checkImageVisibility(driver, "//img[@alt='Priority checkup']");
	            validateTitle(driver, "//h2[normalize-space()='PRIORITY CHECK UP & DATA BACKUP']", "PRIORITY CHECK UP & DATA BACKUP", "Architecture Title 4");
	            validateTitle(driver, "//div[contains(text(),'The servers at Capermint Technologies can provide you with off-site backup')]", "The servers at Capermint Technologies can provide you with off-site backup in the event of a disaster. The company maintains priority data check-up and backup of the data for your app. All the data that enters the server is first checked and then it is saved. As a company, Capermint Technologies understand the importance and power of data in the technological world, and therefore, you don’t have to worry about the checking-up and data backup, leave this to Capermint and focus on other important tasks.", "Architecture Text 1");
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[@alt='Server Management']");
	            
	            // Architecture Section 5
	            
	            printSectionHeader("Architecture Section 5");
	            
	            checkImageVisibility(driver, "//img[@alt='Server Management']");
	            validateTitle(driver, "//h2[normalize-space()='SERVER MANAGEMENT']", "SERVER MANAGEMENT", "Architecture Title 5");
	            validateTitle(driver, "//div[contains(text(),'To improve the performance and for the data storage, servers are used')]", "To improve the performance and for the data storage, servers are used. But it is really important to manage and maintain the servers are they are too crucial to the performance of your apps. We want you to focus on your business and let us maintain the technological parts of the app. You are the best at maintaining your business processes and we are the best in maintaining everything related to the apps and maintaining and managing your servers is one such task.", "Architecture Text 1");
	            
	            // Page scroll
	            
	            scrollToElementByXpath(driver, "//img[@alt='Data Security']");
	            
	            // Architecture Section 6
	            
	            printSectionHeader("Architecture Section 6");
	            
	            checkImageVisibility(driver, "//img[@alt='Data Security']");
	            validateTitle(driver, "//h2[normalize-space()='24*7 CCTV OBSERVATION']", "24*7 CCTV OBSERVATION", "Architecture Title 6");
	            validateTitle(driver, "//p[contains(text(),'Our infrastructure is backed up with round the clo')]", "Our infrastructure is backed up with round the clock power back-up so that your apps can run seamlessly all the time. The infrastructure is equipped with 24*7 CCTV observations to ensure safety of the servers and other facilities. Capermint Technologies is a complete package for all your app-related needs and you can rely on us 24*7.", "Architecture Text 1");
	            validateTitle(driver, "//p[contains(text(),'Our goal is to deliver 100% satisfaction and there')]", "Our goal is to deliver 100% satisfaction and therefore we have equipped ourselves with world-class technologies so that we can serve you with the best solutions. Our IT tools are targeted towards filling all your needs.", "Architecture Text 2");
	            
	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	   		
	        }
	   	}