package com.capermint.selenium_test;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                
                scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[12]");
                
                // New Section
                
                printSectionHeader("New Section");
                
                validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[12]", "Gamification In Healthcare: How Can It Be Helpful?", "Tilte");
                validateTitle(driver, "//p[contains(text(),'Gamification can be helpful for the Healthcare ind')]", "Gamification can be helpful for the Healthcare industry in several ways. Our team of gamification experts have created a list of the most prominent ways Gamification in Healthcare can be helpful for different beneficiaries.", "Content");
                
                String[] BeneficiariesNames = {
                		"For Doctors",
                		"For Patients",
                		"For Medical Staff",
                		"For Admin",
                		"For Hospitals"
                };
                
                String[] BeneficiariesImages = {
                		"(//*[name()='path'])[24]",
                		"(//*[name()='path'])[25]",
                		"(//*[name()='path'])[26]",
                		"(//*[name()='path'])[27]",
                		"(//*[name()='path'])[28]"
                };
                
                validateElements(driver, BeneficiariesNames, null, BeneficiariesImages, "Benefits");
                
                List<By> locators = Arrays.asList(
                        By.xpath("(//ul)[67]/li"),
                        By.xpath("(//ul)[68]/li"),
                        By.xpath("(//ul)[69]/li"),
                        By.xpath("(//ul)[70]/li"),
                        By.xpath("(//ul)[71]/li")
                    );

                List<List<String>> expectedTextsLists = Arrays.asList(
                        Arrays.asList(
                        		"Improved Time Management & Regular Patient Updates",
                        		"More accurate and timely data on patient health behaviors",
                        		"Better training and education to improve skills and provide better care",
                        		"Improved patient outcomes & healthcare results"
                        	),
                        Arrays.asList(
                        		"More engaging and enjoyable healthcare experience",
                        		"Increased motivation & awareness for treatment",
                        		"Improved understanding of health conditions and treatment options",
                        		"Improved health outcomes and quality of life"
                        	),
                        Arrays.asList(
                                "Improved training and education to improve skills and provide better care",
                                "Increased motivation and engagement in the workplace",
                                "Better tracking and monitoring of medical equipment and supplies",
                                "Points & levels help them grow in their respective fields"
                        	),
                        Arrays.asList(
                                "Improved tracking and monitoring of patient health behaviors and outcomes",
                                "Improved efficiency and effectiveness of healthcare delivery",
                                "Better allocation of resources based on patient needs",
                                "Improved patient satisfaction and loyalty"
                            ),
                        Arrays.asList(
                                "Enhanced Healthcare Experience for patients",
                                "More efficient and effective healthcare delivery",
                                "Improved staff training and education to improve skills and provide better care",
                                "Improved tracking and monitoring of patient health behaviors and outcomes"
                            )
                    );

                    verifyMultipleLists(driver, locators, expectedTextsLists);
                    
                    // Page Scrolling
                    
                    scrollToElementByXpath(driver, "//span[normalize-space()='Case Study']");
                    
                    // Case Study Section
                    
                    printSectionHeader("Case Study Section");
                    
                    checkImageVisibility(driver, "(//img[@class='attachment-large size-large wp-image-73563'])[1]");
                    
                    validateTitle(driver, "//span[normalize-space()='Case Study']", "Case Study", "Title");
                    validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[4]", "https://www.capermint.com/contact/", "Tata 1MG Button");
                    validateTitle(driver, "//p[contains(text(),'One of the successfull gamification project of Cap')]", "One of the successfull gamification project of Capermint", "Content");
                    
                    checkImageVisibility(driver, "(//img[@class='attachment-large size-large wp-image-73563'])[2]");
                    
                    String[] CaseStudyNames = {
                    	    "Objective",
                    	    "Strategy",
                    	    "Conclusion",
                    	    "Implementation",
                    	    "Results"
                    	};
                    
                    String[] CaseStudyContents = {
                    	    "The objective is to enhance user engagement and awareness while encouraging healthy habits among participants of 1MG’s Grand Saving Days Sale.",
                    	    "1MG collaborated with Capermint to develop a gamification module for their campaign, with the aim of captivating Gen-Z and millennial users. The game’s objective was to encourage healthy lifestyle habits, promote awareness, and provide discounts and rewards for achieving high scores.",
                    	    "A gamification is an effective approach to engaging users and enhancing the impact of marketing campaigns and healthcare applications. Capermint healthcare gamification services provide an opportunity to elevate your campaigns, offering superior gamification strategies that will captivate and inspire your users, creating an unparalleled healthcare app experience.",
                    	    "From February 17 to 21, Tata1MG launched a game that allowed participants to win discount coupons, Apple iPads, and smartwatches. The game was designed to be both enjoyable and engaging, featuring interactive elements and challenges that encouraged healthy habits to sustain users’ interest.",
                    	    "The campaign’s success was a collective effort, and all involved parties contributed to its achievement. Impressions surpassed 1 million, with over 250k link clicks and 30k gameplays, making it a tremendous achievement. Tata1MG brand was viewed positively by users, with the gamification approach, and played a significant role in driving this outcome. Incorporating incentivization and social sharing aspects into the game proved instrumental in expanding the campaign’s reach and influence."
                    	};
                    
                    validateElements(driver, CaseStudyNames, CaseStudyContents, null, "Elements");
                    
                    checkImageVisibility(driver, "//img[@alt='Tata 1MG']");
                    
                    // Page Scrolling
                    
                    scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73640']");
                    
                    // Cost to Gamify a Healthcare App Section
                    
                    printSectionHeader("Cost to Gamify a Healthcare App Section");
                    
                    checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73640']");

                    validateTitle(driver, "//h2[contains(text(),'How Much Does It Cost to')]", "How Much Does It Cost to Gamify an E-Commerce App?", "Title");
                    validateTitle(driver, "//p[contains(text(),'Healthcare App Gamification can cost around $35,00')]", "Healthcare App Gamification can cost around $35,000 to $40,000 for a single platform with basic functionality. If you wish to add advanced gamification features and functionalities to your mobile app, with support for multiple platforms, it may cost up to $80,000.", "Text");
                    
                    checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73642']");
                    validateTitle(driver, "//h3[normalize-space()='Charges of a small company']", "Charges of a small company", "Text1");
                    validateTitle(driver, "(//p[@class='elementor-image-box-description'])[7]", " $15 - $40 / hour", "Price");
                    
                    checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73643']");
                    validateTitle(driver, "//h3[normalize-space()='Charges of an Intermediate company']", "Charges of an Intermediate company", "Text1");
                    validateTitle(driver, "(//p[@class='elementor-image-box-description'])[8]", "$50 - $100 / hour", "Price");
                    
                    checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73644']");
                    validateTitle(driver, "//h3[normalize-space()='Charges of an Enterprise-level company']", "Charges of an Enterprise-level company", "Text1");
                    validateTitle(driver, "(//p[@class='elementor-image-box-description'])[9]", "$100 - $300 / hour", "Price");
                    
                    validateTitle(driver, "//p[contains(text(),'If you are looking for an expert Healthcare Gamifi')]", "If you are looking for an expert Healthcare Gamification Company, you can contact us. We have solid technical gamification experts who can gamify and upgrade your app to provide the best user experience. Check out our portfolio to learn more about our Healthcare App Gamification Service. ", "Text");
                    
                    validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[5]", "https://www.capermint.com/contact/", "Contact Button");
                    
                    printSectionHeader("Check Hover Effect");
                    
                    List<String> cardXpaths = Arrays.asList(
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[61]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[62]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[63]"
                        );
                    	
                    Map<String, String> cssProperties = new HashMap<>();
                    cssProperties.put("border-color", "rgb(22, 180, 230)");
                    cssProperties.put("box-shadow", "rgba(61, 255, 255, 0.33) 0px 0px 50px 0px");
    
                    validateHoverEffects(driver, cardXpaths, cssProperties);
                    
                    // Page Scrolling
                    
                    scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73653']");
                    
                    // Why Capermint Section
                    
                    printSectionHeader("Why Capermint Section");
                    
                    checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73653']");
                    
                    validateTitle(driver, "//span[normalize-space()='Gamified Healthcare App']", "Why Choose Capermint As Your Gamified Healthcare App Development Company?", "Title");
                    validateTitle(driver, "//p[contains(text(),'Capermint is a one-stop solution for all your mobi')]", "Capermint is a one-stop solution for all your mobile app and game development needs. Our Gamification experts will turn your Healthcare app into the most captivating and motivational one. Our Gamification service will bring endless engagement to your app and completely transform the in-app experience into a more personalized and captivating experience. Get a healthcare app that emphasizes motivating users and engagingly improving their health. Being an industry leader, we have developed numerous gamified Healthcare apps. Here are the benefits of working with Capermint for Gamification In Healthcare:", "Content");
                    
                    String[] ReasonNames = {
                    		"Team of Experts",
                    		"Service Backed With Detailed Analysis",
                    		"Seamless Gamification Integration",
                    		"Best-in-class Support & Maintenance",
                    		"Cost-Effective Solutions",
                    		"Transparent Communication"
                    };
                    
                    String[] ReasonImages = {
                    		"//img[@class='attachment-full size-full wp-image-73655']",
                    		"//img[@class='attachment-full size-full wp-image-73656']",
                    		"//img[@class='attachment-full size-full wp-image-73657']",
                    		"//img[@class='attachment-full size-full wp-image-73667']",
                    		"//img[@class='attachment-full size-full wp-image-73666']",
                    		"//img[@class='attachment-full size-full wp-image-73665']"
                    };
                    
                    validateElements(driver, ReasonNames, null, ReasonImages, "Reasons");
                    
                    printSectionHeader("Check Hover Effect");
                    
                    hoverOverElement(driver, "(//div[@class='elementor-widget-wrap elementor-element-populated'])[65]");
                    Thread.sleep(2000);
                    
                    List<String> ReasoncardXpaths = Arrays.asList(
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[65]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[66]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[67]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[68]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[69]",
                            "(//div[@class='elementor-widget-wrap elementor-element-populated'])[70]"
                        );

                    validateHoverEffects(driver, ReasoncardXpaths, cssProperties);
                    
                    // Page Scrolling
                        
                    scrollToElementByXpath(driver, "//img[@alt='Gamification in Healthcare']");
                        
                    // FAQ Section
                        
                    printSectionHeader("FAQ Section");
                        
                    checkImageVisibility(driver, "//img[@alt='Gamification in Healthcare']");
                    validateTitle(driver, "//h2[contains(text(),'FAQs on')]", "FAQs on Gamification in Healthcare", "Title");
                        
                    List<String> faqQuestions = Arrays.asList(
                         "What are the best practices for gamification in healthcare?",
                         "How can healthcare providers incorporate gamification into their practice?",
                         "How can I evaluate the effectiveness of gamification in healthcare?",
                         "Are there any risks associated with gamification in healthcare?",
                         "How does healthcare gamification work?"
                     );
                        
                    hoverOverFaqs(driver, faqQuestions);
                
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
        }
   	}