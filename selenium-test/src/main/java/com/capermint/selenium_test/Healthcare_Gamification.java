package com.capermint.selenium_test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Healthcare_Gamification extends CommanMathods {

		public Healthcare_Gamification(WebDriver driver) {	
			super(driver);			
		}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/healthcare-gamification/");
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
            
            validateTitle(driver, "//h1[@class='elementor-heading-title elementor-size-default']", "Healthcare App Gamification", "Title");
            validateTitle(driver, "//h2[contains(text(),'Transforming Healthcare with Fun and Games: Unleas')]", "Transforming Healthcare with Fun and Games: Unleash the Power of Gamification!", "Text");
            validateTitle(driver, "//div[contains(text(),'At Capermint, we revolutionize healthcare experiences through gamifi')]", "At Capermint, we revolutionize healthcare experiences through gamification. Dive into a world where taking medication earns you points, adhering to dietary plans rewards you with badges, and every step towards better health is a thrilling competition. Our healthcare game apps are designed to enhance patient engagement and adherence, making treatment, prevention, and rehabilitation not just effective but enjoyable. Especially for children, our games turn daunting healthcare routines into exciting challenges. Join us in this innovative journey and see how gamification can change the face of healthcare!", "Content");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[1]", "https://www.capermint.com/contact/", "Get stated with gamified healthcare Button");
            
            checkImageVisibility(driver, "(//img[@alt='Gamification in Healthcare App'])[2]");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73338']");
            
            // Gamification Healthcare Services Section
            
            printSectionHeader("Gamification Healthcare Services Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[2]", "Gamification Healthcare Services For Boosting a Healthcare Industry!", "Title");
            validateTitle(driver, "//p[contains(text(),'Adopting healthy habits can often be challenging, ')]", "Adopting healthy habits can often be challenging, but gamification adds a fun, interactive, and rewarding element to the process. Additionally, not only can it enhance personal training outcomes, but healthcare companies that embrace gamification can also see positive results in their business outcomes.", "Content 1");
            validateTitle(driver, "//p[contains(text(),'Capermint is a professional company engaged in dev')]", "Capermint is a professional company engaged in developing innovative, creative & gamified Healthcare Apps. Our Healthcare App Gamification service helps enhance the health outcomes of apps for self-management, medical education, and medication intake control.", "Content 2");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73338']");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//img[@alt='Gamification in Healthcare App'])[5]");
            
            // What is Gamification? Section
            
            printSectionHeader("What is Gamification? Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[3]", "What is Gamification In Healthcare?", "Title");
            validateTitle(driver, "//p[contains(text(),'Research shows that incorporating gamified medicat')]", "Research shows that incorporating gamified medication apps results in higher medication adherence among patients compared to those who don’t use such apps.", "Content 1");
            validateTitle(driver, "//p[contains(text(),'Gamification has the potential to revolutionize th')]", "Gamification has the potential to revolutionize the healthcare industry. By infusing elements of fun and interactivity, patient engagement is heightened, leading to increased adherence to treatment plans and a boost in discipline for exercise routines. Gamification encourages healthy habits and empowers patients to manage chronic conditions by setting personal health goals, organizing medical information, and tracking progress through innovative healthcare applications.", "Content 2");
            
            checkImageVisibility(driver, "(//img[@alt='Gamification in Healthcare App'])[5]");
            
            validateTitle(driver, "//h2[normalize-space()='Revitalize Your Health: Game On with Capermint!']", "Revitalize Your Health: Game On with Capermint!", "Title");
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[2]", "https://www.capermint.com/contact/", "Contact Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73365']");
            
            // Transforming The Healthcare Services Section
            
            printSectionHeader("Transforming The Healthcare Services Section");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73365']");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[5]", "Transforming The Healthcare Services With Gamification", "Title");
            validateTitle(driver, "//p[contains(text(),'Gamification streamlines patient journey monitorin')]", "Gamification streamlines patient journey monitoring, from scheduling visits to maintaining medical data. Medical staff are also relieved of routine paperwork thanks to self-service, which helps them focus on helping more people instead of paperwork.", "Content 1");
            validateTitle(driver, "//p[contains(text(),'Healthcare employees get better training with gami')]", "Healthcare employees get better training with gamification, and it helps them improve their skills in a competitive and rewarding environment.", "Content 2");
            
            checkImageVisibility(driver, "//img[@alt='Healthcare Services']");
            
            String[] SVGImages1 = {
            		"(//*[name()='rect'])[1]",
            		"(//*[name()='rect'])[2]",
            		"(//*[name()='rect'])[3]",
            		"(//*[name()='rect'])[4]",
            		"(//*[name()='rect'])[5]",
            		"(//*[name()='rect'])[6]"
            };
            
            checkMultipleImagesVisibility(driver, SVGImages1);
                      
            By listLocator = By.xpath("(//ul[@class='elementor-icon-list-items'])[1]/li");
            List<String> expectedTexts = Arrays.asList(
                "Leveling Up Healthcare Education Programs",
                "Improved Surgical Precision",
                "Better Patient Behaviour",
                "Enhanced Physical Therapy",
                "Improved Health & Wellness of Employees",
                "Boosted Use Of Healthcare Apps"
            );
            
            verifyTextInList(driver, listLocator, expectedTexts);
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[6]");
            
            // New Section
            
            printSectionHeader("New Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[6]", "Gamification In Healthcare Is Mostly Focused On", "Title");
            validateTitle(driver, "//p[contains(text(),'Many challenges facing healthcare providers and me')]", "Many challenges facing healthcare providers and medical facilities can be overcome with gamification. The system simplifies patient care, engages patients in fun and engaging educational programs, and helps in many other ways. Gamification is improving  Healthcare services by focusing on the following:", "Content");
            
            String[] SVGImages2 = {
            		"(//*[name()='rect'])[7]",
            		"(//*[name()='rect'])[8]",
            		"(//*[name()='rect'])[9]",
            		"(//*[name()='rect'])[10]",
            		"(//*[name()='rect'])[11]",
            		"(//*[name()='rect'])[12]"
            };
            
            checkMultipleImagesVisibility(driver, SVGImages2);
            
            By listLocator1 = By.xpath("(//ul[@class='elementor-icon-list-items'])[2]/li");
            List<String> expectedTexts1 = Arrays.asList(
            	    "Patient Engagement",
            	    "Better Adherence To Schedule For Medication",
            	    "Improved Treatment Outcome"
            );
            
            verifyTextInList(driver, listLocator1, expectedTexts1);
            
            By listLocator2 = By.xpath("(//ul[@class='elementor-icon-list-items'])[3]/li");
            List<String> expectedTexts2 = Arrays.asList(
            	    "Patient Engagement",
            	    "Better Adherence To Schedule For Medication",
            	    "Improved Treatment Outcome"
            );
            
            verifyTextInList(driver, listLocator2, expectedTexts2);
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[7]");
            
            // Help From Gamification Section
            
            printSectionHeader("Help From Gamification Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[7]", "Gamification Can Help In Various Aspects Of Healthcare", "Title");
            
            validateTitle(driver, "//h3[normalize-space()='Fitness']", "Fitness", "Text 1");
            validateTitle(driver, "//h3[normalize-space()='Mental health']", "Mental health", "Text 2");
            validateTitle(driver, "//h3[normalize-space()='Chronic disease management']", "Chronic disease management", "Text 3");
            validateTitle(driver, "//h3[normalize-space()='Physical therapy']", "Physical therapy", "Text 4");
            validateTitle(driver, "//h3[normalize-space()='Improves engagement']", "Improves engagement", "Text 5");

            String[] BackgroungImages = {
            		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[15]",
            		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[16]",
            		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[17]",
            		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[18]",
            		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[19]"
            };
            
            checkMultipleBackgroundImages(driver, BackgroungImages);
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h3[normalize-space()='Improves engagement'])[1]");
            Thread.sleep(2000);
            
            // Features Of Healthcare In Gamification Section
            
            printSectionHeader("Features Of Healthcare In Gamification Section");

            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[8]", "Healthcare Gamification Features", "Title");
            validateTitle(driver, "//p[contains(text(),'Healthcare app gamification aims to engage audienc')]", "Healthcare app gamification aims to engage audiences and provide a unique and fruitful experience, setting it apart from the competition. Here are some healthcare gamification features –", "Content");
            
            String[] Images = {
            		"(//*[name()='circle'])[3]",
            		"(//*[name()='circle'])[4]",
            		"(//*[name()='circle'])[5]",
            		"(//*[name()='circle'])[6]",
            		"(//*[name()='circle'])[7]",
            		"(//*[name()='circle'])[8]",
            		"(//*[name()='circle'])[9]",
            		"(//*[name()='circle'])[10]",
            		"(//*[name()='circle'])[11]",
            		"(//*[name()='circle'])[12]",
            		"(//*[name()='circle'])[13]",
            		"(//*[name()='circle'])[14]"
            };
            
            String[] Titles = {
            	    "Level Integration",
            	    "Badge Integration",
            	    "Performance Charts",
            	    "Point Tables",
            	    "Leaderboard",
            	    "Social Integration",
            	    "Mobile Games Integration",
            	    "Personalized Feedback",
            	    "Remote Monitoring",
            	    "Virtual Training",
            	    "Medication Reminder",
            	    "Virtual Avatars"
            };
            
            validateElements(driver, Titles, null, Images, "Features");
            
            validateTitle(driver, "(//h2[contains(text(),\"Game On For Better Health - Let's Capermint Build \")])[1]", "Game On For Better Health - Let's Capermint Build Your Healthcare App Today!", "Title");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[3]", "https://www.capermint.com/contact/", "Talks with our experts! Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[10]");
            
            // Benefits Of Gamification Section
            
            printSectionHeader("Benefits Of Gamification Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[10]", "Benefits Of Gamification In The Healthcare Industry", "Title");
            validateTitle(driver, "//p[contains(text(),'There are several benefits of gamification in heal')]", "There are several benefits of gamification in healthcare. Gamification can help healthcare providers to", "Content");
            
            String[] BenefitTitles = {
            	    "Increase The Quality Of Care",
            	    "Improve Patient Outcomes",
            	    "Improve Patient Engagement",
            	    "Improve Access To Care",
            	    "Lower Healthcare Costs",
            	    "Reduce Patient Wait Times"
            	};

            	String[] BenefitContents = {
            	    "Gamification in healthcare manages and prevents diseases by supporting healthy behavior and controlling conditions like diabetes and blood pressure.",
            	    "Gamification in healthcare improves outcomes by incentivizing healthy habits & achievable goals through games, promoting positive changes in well-being.",
            	    "Gamification in healthcare can boost patient engagement, promote healthy behaviors, and increase adherence to treatment plans.",
            	    "Gamification encourages healthy behaviors and healthcare utilization, with the added benefit of suggesting doctor's visits if needed.",
            	    "Gamification in healthcare can cut costs by decreasing hospital stays and office visits while promoting healthy habits through games.",
            	    "Gamification improves scheduling, reduces wait times, and provides an organized medical history for more efficient and effective healthcare."
            	};
            	
                String[] BenefitImages = {
                	    "//img[@class='attachment-full size-full wp-image-73485']",
                	    "//img[@class='attachment-full size-full wp-image-73481']",
                	    "//img[@class='attachment-full size-full wp-image-73480']",
                	    "//img[@class='attachment-full size-full wp-image-73484']",
                	    "//img[@class='attachment-full size-full wp-image-73483']",
                	    "//img[@class='attachment-full size-full wp-image-73482']"
                	};
            
                validateElements(driver, BenefitTitles, BenefitContents, BenefitImages, "Benefits");
                
                // Page Scrolling
                
                scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[11]");
                
                // Trends in Healthcare Gamification Section
                
                printSectionHeader("Trends in Healthcare Gamification Section");
                
                validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[11]", "Trends in Healthcare Gamification", "Title");
                
                validateTitle(driver, "//h3[normalize-space()='Virtual Reality and Augmented Reality']", "Virtual Reality and Augmented Reality", "Text 1");
                validateTitle(driver, "//h3[normalize-space()='Wearable technology integration']", "Wearable technology integration", "Text 2");
                validateTitle(driver, "//h3[normalize-space()='Personalized and tailored experiences']", "Personalized and tailored experiences", "Text 3");
                validateTitle(driver, "//h3[normalize-space()='Gamified telemedicine']", "Gamified telemedicine", "Text 4");
                validateTitle(driver, "//h3[normalize-space()='Integration with electronic health records']", "Integration with electronic health records", "Text 5");
                
                String[] BackgroungImagesofTrends = {
                		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[42]",
                		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[43]",
                		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[44]",
                		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[45]",
                		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[46]"
                };
                
                checkMultipleBackgroundImages(driver, BackgroungImagesofTrends);
                
                // Page Scrolling
                
                scrollToElementByXpath(driver, "");
                
                // New Section
                
                printSectionHeader("New Section");
                
                validateTitle(driver, "", "", "");
                validateTitle(driver, "", "", "");
                
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
        }
   	}