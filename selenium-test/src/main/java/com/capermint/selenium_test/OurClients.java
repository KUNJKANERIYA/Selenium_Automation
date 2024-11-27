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

public class OurClients extends CommanMathods{
	
	public OurClients(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/our-clients/");
            Thread.sleep(10000);

            Actions hoverActions = new Actions(driver);
            WebElement ContactUS = findElementByXpath(driver, "//a[@class='elementor-button elementor-button-link elementor-size-md']");
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
            
            validateTitle(driver, "//h1[normalize-space()='Our Clients']", "Our Clients", "Main Section Title");
            validateTitle(driver, "//span[@class='elementor-heading-title elementor-size-default']", "We have the privilege of working with some fantastic clients!", "Main Section Text");
            validateTitle(driver, "//div[@class='elementor-element elementor-element-dabf282 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-text-editor']//div[1]", "Capermint Technologies was born out of a desire to help our customers to grow, whether that was to increase visibility, gain more enquiries, grow their business, provide amazing games – our purpose has always been clear – help our clients to achieve their goals. We are proud of our reputation for quality. While our team has grown, this focus remains unchanged and is the driving force behind everything we do.", "Main Section Content");
            
            validateLink(driver, "//a[@class='elementor-button elementor-button-link elementor-size-md']", "https://www.capermint.com/contact/", "ContactUs Button Link");
            
            checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-f02836c elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-sticky-section-no']");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='We Help 650+ Customers Worldwide']");
            
            // About Customers Section
            
            printSectionHeader("About Customer Section");
            
            validateTitle(driver, "//h2[normalize-space()='We Help 650+ Customers Worldwide']", "We Help 650+ Customers Worldwide", "About Customer Text");
            validateTitle(driver, "//div[@class='elementor-element elementor-element-caf9946 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-text-editor']//div[1]", "Since the beginning, we’ve represented small businesses to Fortune 500 companies with the same commitment to partnerships and devotion to each engagement.", "About Customer Content");
            
            // Checking All the client`s list

            String[] clientNames = {
            	    "Nostragamus",
            	    "A23",
            	    "Ludo Empire",
            	    "Khiladi Adda",
            	    "Jio Glass",
            	    "Glenmark",
            	    "Glance",
            	    "Winzo",
            	    "Ludo Fantasy",
            	    "Shivalik",
            	    "Keffys",
            	    "Sikandarji",
            	    "MyByk",
            	    "MyGolfPro",
            	    "MPTV",
            	    "Chess Castle",
            	    "SuperStyle Chess",
            	    "Indic AI",
            	    "Expedition",
            	    "Real11",
            	    "Tata 1mg",
            	    "Plan India"
            	};

            	String[] clientContents = {
            			"Nostragamus is a leading real money gaming platform offering the best fantasy sports, card games & casual games.",
                	    "A23 is a multi-gaming platforms that offers Online Rummy, Cricket, and other Online Cash Games.",
                	    "Ludo Empire is a real money Ludo game packed with amazing features and smooth gameplay.",
                	    "Khiladi Adda is India’s largest micro eSports tournament platform for Free Fire Max and other games.",
                	    "Experience the Power of Mixed Reality and get immersed in innovative Display Technology by Jio.",
                	    "Glenmark is a multinational pharmaceutical company with the goal of enriching lives across the globe.",
                	    "A consumer internet company that has created two of the most disruptive digital platforms – Glance and Roposo.",
                	    "Winzo is the largest social gaming and interactive entertainment platform with fair gameplay experince.",
                	    "Ludo Fantasy is an online multiplayer version of the classic and beloved board game with the amazing Real Money Feature.",
                	    "SHIVALIK is a leading Real Estate Developer Group renowned for it’s overall quality across all the projects, based on a prime location.",
                	    "An online grocery shopping app to get all the grocery delivered at your door step within 24 hours.",
                	    "Sikandarji is a multi-gaming platform that offers a handpicked collection of games that range from world-famous titles to newly developed original titles.",
                	    "Experience Biking in Virtual Reality. MyByk provides a cutting edge biking experience by combing real world terrains and realistic graphics.",
                	    "My Golf Pro is a Golf Coaching Platform used by Golf Professionals to upload content and take online golf classes.",
                	    "MPTV is a revolutionary pan-African multi-platform television mobile and web application that allows users to watch video content on the go.",
                	    "Chess Castle is the best 3D realistic chess game. Play Chess in the most surreal and amazing castle themed Chess game.",
                	    "SuperStyle Chess offers the most unique and stylish version of the classic board game – chess.",
                	    "A Specialized app for hearing-impaired users. Communication made simpler with Indic AI.",
                	    "A 3D Battle Royal and Tower Defense Game with a unique, thrilling, and strategic gameplay experience.",
                	    "Real11 is India’s most authentic and trusted fantasy sports platform. It is the fastest growing fantasy sports platform where you get the best fantasy games at your fingertips.",
                	    "Tata 1mg is a healthcare platform that provides accurate, authoritative & trustworthy information on medicines and helps people use their medicines effectively and safely.",
                	    "Plan India is a nationally registered NGO that aims to advance children’s rights and equality for girls, thus creating a lasting impact in the lives of vulnerable and excluded children."
            	};

            	String[] imageXpaths = {
            		    "//img[@alt='nostro-logo-transparent']",
            		    "//img[@alt='a-23']",
            		    "//img[@alt='Ludo Empire Logo']",
            		    "//img[@alt='khiladi-adda']",
            		    "//img[@alt='jio-class']",
            		    "//img[@alt='glenmark']",
            		    "//img[@alt='Glance-Logo']",
            		    "//img[@alt='winzo-banner']",
            		    "//img[@alt='ludo-fantasy-logo']",
            		    "//img[@class='attachment-full size-full wp-image-66946']",
            		    "//img[@class='attachment-full size-full wp-image-66928']",
            		    "//img[@alt='Sikandarji logo']",
            		    "//img[@class='attachment-full size-full wp-image-66934']",
            		    "//img[@alt='Mygolfpro logo']",
            		    "//img[@alt='mptv-logo']",
            		    "//img[@alt='chess-castle-logo']",
            		    "//img[@alt='super-style-logo']",
            		    "//img[@class='attachment-full size-full wp-image-66936']",
            		    "//img[@alt='exp-logp']",
            		    "//img[@class='attachment-full size-full wp-image-70017']",
            		    "//img[@class='attachment-full size-full wp-image-70016']",
            		    "//img[@class='attachment-full size-full wp-image-70008']"
            		};

            	validateElements(driver, clientNames, clientContents, imageXpaths, "client");


            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
		
        }
	}
