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
        
        validateTitle(driver, "//h1[@class='elementor-heading-title elementor-size-default']", "GAMIFICATION IN MOBILE APP", "Title");
        validateTitle(driver, "(//p[contains(text(),'Engaging your audiences with an out-of-the-box con')])[1]", "Engaging your audiences with an out-of-the-box concept is essential to achieving your business objectives and engaging your audiences. With Capermint’s Mobile App Gamification Service, you can transform your app into a more engaging and interesting app.", "Content");
        
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[1]", "https://www.capermint.com/contact/", "Get quick assistance Button");
        
        checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-52826']");
        
        String[] Images = {
        	"//img[@class='attachment-full size-full wp-image-52235']",
        	"//img[@class='attachment-full size-full wp-image-52218']",
        	"//img[@class='attachment-large size-large wp-image-52215']"
        };
        
        checkMultipleImagesVisibility(driver, Images);
        
        validateTitle(driver, "//span[contains(text(),'It’s Rare')]", "It’s Rare", "Text 1");
        validateTitle(driver, "//span[contains(text(),'It’s Exclusive')]", "It’s Exclusive", "Text 2");
        validateTitle(driver, "//span[contains(text(),'It’s Compelling')]", "It’s Compelling", "Text 3");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//p[@class='elementor-heading-title elementor-size-default']");
        
        // Upgrade Your Business Section
        
        printSectionHeader("Upgrade Your Business Section");
        
        validateTitle(driver, "//p[@class='elementor-heading-title elementor-size-default']", "10X Upgrade Your Business Efforts", "Title");
        validateTitle(driver, "//span[contains(text(),'First of a kind gamification service that lets you')]", "First of a kind gamification service that lets you integrate and play mobile games within your existing business mobile app.", "Content");
        
        validateTitle(driver, "//h2[normalize-space()='Mobile App Gamification Solutions']", "Mobile App Gamification Solutions", "Title");
        validateTitle(driver, "(//p[contains(text(),'Engaging your audiences with an out-of-the-box con')])[2]", "Engaging your audiences with an out-of-the-box concept is essential to achieving your business objectives and engaging your audiences. With Capermint’s Mobile App Gamification Service, you can transform your app into a more engaging and interesting app.", "Content 1");
        validateTitle(driver, "//p[contains(text(),'Mobile App Gamification will improve your user exp')]", "Mobile App Gamification will improve your user experience as well as the user engagement rate. Our team of Gamification experts will gamify your app and will help you in getting the best results with your mobile app.", "Content 2");
        
        checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-52233']");
        
        validateTitle(driver, "//h2[normalize-space()='What is Mobile App Gamification?']", "What is Mobile App Gamification?", "Title");
        validateTitle(driver, "//p[contains(text(),'Mobile app gamification refers to adding game comp')]", "Mobile app gamification refers to adding game components and contexts in the mobile app, to make the user experience of the app a fun-filled one. The fun features of the app help in increasing the traffic of the app. Moreover, this experience encourages the users to use the app again.", "Content 1");
        validateTitle(driver, "//p[contains(text(),'With points and level upgrades, the users will get')]", "With points and level upgrades, the users will get rewarded for using the app or purchasing from the app, and the app will be able to get loyal customers.", "Content 2");
        
        checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-52242']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Capermint Gamification Modules']");
        
        // Capermint Gamification Modules Section
        
        printSectionHeader("Capermint Gamification Modules Section");
        
        validateTitle(driver, "//h2[normalize-space()='Capermint Gamification Modules']", "Capermint Gamification Modules", "Title");
        validateTitle(driver, "//p[contains(text(),'Engaging your audience and providing them the best')]", "Engaging your audience and providing them the best possible experience is the oriented goal of Mobile App Gamification. This kind of innovation in your app will help you in providing a unique and fruitful experience, and will also gravely distinguish your app from the competitions’. Here are the Gamification models that you can integrate in your mobile app.", "Content");
        
        	String[] ModulNames = {
        	    "Level Integration",
        	    "Badge Integration",
        	    "Performance Charts",
        	    "Point Tables",
        	    "Leaderboard",
        	    "Social Integration",
        	    "Mobile Games Integration"
        	};

        	String[] ModulContents = {
        	    "After completing a certain task, the level of the users will increase. The better their level is, the more rewards they will get. This way, you can motivate the users to use your app more to upgrade their level and to get more benefits.",
        	    "The badges will be a trophy or a symbol of completing a milestone in the app. When the users complete the milestone, they will get the badge that they can flaunt in their profile and showcase to their friends and family.",
        	    "The performance chart will showcase the daily progress of the users and how far are they from their goals or from the rewards. The performance chart will showcase the daily progress of the users and will motivate them to do better.",
        	    "Points will be the basic reward for all the tasks that the user performs via your app, whether it is a purchase or a goal met. The users can then use these points to redeem them for some gift, prize, discount vouchers, or reward.",
        	    "The best motivation for the users to perform better is by showcasing a leaderboard and by letting them know how other users are performing. This will motivate the users to go that extra mile and be featured on the leaderboard.",
        	    "Having social integration in all the apps and games is a trend. With social integrations, the users can add their social media friends as in-app friends and then they can keep an eye on the progress of other players. They can share their achievements too.",
        	    "With mobile game integration, you can either add games of your content, or a separate game section with exciting and fun filled games. Our developers will co-relate the games with your app’s vision to improve your app’s performance and user experience."
        	};
        	
            String[] ModulImages = {
            	    "//img[@class='attachment-full size-full wp-image-52226']",
            	    "//img[@class='attachment-full size-full wp-image-52212']",
            	    "//img[@class='attachment-full size-full wp-image-52222']",
            	    "//img[@class='attachment-full size-full wp-image-52225']",
            	    "//img[@alt='mobile-leaderboard']",
            	    "//img[@class='attachment-full size-full wp-image-52236']",
            	    "//img[@class='attachment-full size-full wp-image-52243']"
            	};
            
            validateElements(driver, ModulNames, ModulContents, ModulImages, "Elements");
            
            
        // Page Scrolling
            
        scrollToElementByXpath(driver, "//h2[normalize-space()='App Gamification Services']");
        
        // App Gamification Services Section
        
        printSectionHeader("App Gamification Services Section");
        
        validateTitle(driver, "//h2[normalize-space()='App Gamification Services']", "App Gamification Services", "Title");
        validateTitle(driver, "//p[contains(text(),'An app is defined by the features that it offers, ')]", "An app is defined by the features that it offers, and as we want to develop only the best apps, we incorporate all the basic, advanced, and some new features to our apps that help them in standing out of the competition. Here is the list of features that we incorporate in our Fantasy Cricket App.", "Contect");
        
        String[] ServiceNames = {
        	    "Real Estate App Gamification",
        	    "Sports App Gamification",
        	    "Travel App Gamification",
        	    "Media & Entertainment App Gamification",
        	    "Food & Restaurant App Gamification",
        	    "Banking & Finance App Gamification",
        	    "E-commerce App Gamification",
        	    "Transport & Automotive App Gamification",
        	    "Gaming & Leisure App Gamification",
        	    "Event & Tickets App Gamification",
        	    "E-learning & Education App Gamification"
        	};
        
        String[] ServiceImages = {
        	    "(//img[@alt='Mobile Gamification Services'])[4]",
        	    "(//img[@alt='Game Integrations in Mobile App'])[5]",
        	    "//img[@alt='travel-app']",
        	    "//img[@alt='mobile-entertain-game-app']",
        	    "//img[@alt='food-gamification']",
        	    "//img[@alt='mobile-app-banking']",
        	    "//img[@alt='ecommerce-app']",
        	    "(//img[@alt='Gamification in Mobile App'])[6]",
        	    "//img[@alt='gaming-n-leisure']",
        	    "//img[@alt='event-ticket']",
        	    "//img[@alt='e-learning']"
        	};
        
        validateElements(driver, ServiceNames, null, ServiceImages, "Services");
        
        printSectionHeader("Flip animation validation");
        
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
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Advantages of Mobile App Gamification']");
            
            // Advantages of Mobile App Gamification Section
            
            printSectionHeader("Advantages of Mobile App Gamification Section");
            
            validateTitle(driver, "//h2[normalize-space()='Advantages of Mobile App Gamification']", "Advantages of Mobile App Gamification", "Title");
            
            String[] AdvantageNames = {
            		"Increased User Engagement",
            		"Better User Experience",
            		"Constant Social Media Presence",
            		"More positive reviews"
            };
            
            String[] AdvantageContents = {
            		"If the users will be rewarded or will get points for using your app, they will avoid using the competition apps and will use your app more, which will in turn increase the user engagement of your app.",
            		"By using your mobile app, the users can not only avail all your services from anywhere and at any time, they will also be rewarded for the same. All their progress and history will be stored in the app, and this will improve the user experience.",
            		"Users are into sharing their experiences on social media. With the progress chart feature and the rewards that the users will get for using your app, the users will be very happy and are likely to post or write about the same on social media.",
            		"The gamification of your app makes it more interesting and more profitable for the users to use. The in-app experience and the overall experience of the users with your brand will improve, and you will get a lot of positive reviews on the internet."
            };
            
            String[] AdvantageImages = {
            		"//img[@class='attachment-full size-full wp-image-52237']",
            		"//img[@class='attachment-full size-full wp-image-52213']",
            		"//img[@class='attachment-full size-full wp-image-52216']",
            		"//img[@class='attachment-full size-full wp-image-52221']"
            };
            
            validateElements(driver, AdvantageNames, AdvantageContents, AdvantageImages, "Gamification");
            
            // Pending Link
//            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[2]", "https://www.capermint.com/contact/", "So for what are you waiting for? Button");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[3]", "https://www.capermint.com/contact/", "Get a free consultation Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[contains(text(),'How much does it cost to')]");
            
            // cost to Gamify a Mobile App? Section
            
            printSectionHeader("cost to Gamify a Mobile App? Section");
            
            validateTitle(driver, "//h2[contains(text(),'How much does it cost to')]", "How much does it cost to Gamify a Mobile App?", "Title");
            validateTitle(driver, "//p[contains(text(),'Mobile App Gamification can cost around $35,000 to')]", "Mobile App Gamification can cost around $35,000 to $40,000 for a single platform with basic functionality. If you wish to add advanced gamification features and functionalities in your mobile app, with support for multiple platforms, it may cost up to $80,000.", "Content 1");
            validateTitle(driver, "//p[contains(text(),'The cost also depends on the company that you choo')]", "The cost also depends on the company that you choose.", "Content 2");
            
            checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap elementor-element-populated'])[31]");
            validateTitle(driver, "//h4[normalize-space()='Charges of a small company']", "Charges of a small company", "Text1");
            validateTitle(driver, "//div[contains(text(),'$15 – $40 / hour')]", "$15 – $40 / hour", "Price");
            
            checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap elementor-element-populated'])[32]");
            validateTitle(driver, "//h4[normalize-space()='Charges of an Intermediate company']", "Charges of an Intermediate company", "Text2");
            validateTitle(driver, "//div[contains(text(),'$50 – $100 / hour')]", "$50 – $100 / hour", "Price");
            
            checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap elementor-element-populated'])[33]");
            validateTitle(driver, "//h4[normalize-space()='Charges of an Enterprise-level company']", "Charges of an Enterprise-level company", "Text3");
            validateTitle(driver, "//div[contains(text(),'$100 – $300 / hour')]", "$100 – $300 / hour", "Price");
            
            validateTitle(driver, "//p[contains(text(),'If you are looking for an expert gamification comp')]", "If you are looking for an expert gamification company, you can contact us. We have solid technical gamification experts who have gamify and upgrade your app to provide the best user experience. To know more about our Mobile App Gamification Service, check out our portfolio.", "End Content");
            validateLink(driver, "//a[@href='https://www.capermint.com/our-portfolio/']", "https://www.capermint.com/our-portfolio/", "Check Out Our Portfolio Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[contains(text(),'Why Choose Capermint As Your Mobile App Gamificati')]");
            
            // Why Choose Capermint Section
            
            printSectionHeader("Why Choose Capermint Section");
            
            validateTitle(driver, "//h2[contains(text(),'Why Choose Capermint As Your Mobile App Gamificati')]", "Why Choose Capermint As Your Mobile App Gamification Company?", "Title");
            validateTitle(driver, "//p[contains(text(),'Capermint  is a one-stop solution for all your mob')]", "Capermint  is a one-stop solution for all your mobile app and game development needs. Our Gamification experts will turn your app into the most engaging and interesting one. Being an industry leader, we have developed numerous gamified apps. Many of our apps have topped the charts of app stores too. Here are the traits that make us a top mobile app gamification company.", "Content");
            
            checkBackgroundImage(driver, "//div[@class='elementor-widget-wrap']");
            
            String[] ReasonNames = {
            	    "Seamless Performing Apps",
            	    "Substantial Development process",
            	    "Detailed Analysis",
            	    "Immense Experience",
            	    "Transparent Communication",
            	    "End to End Support",
            	    "Cost-Effective Solutions",
            	    "Scheduled Delivery"
            	};
            
            String[] ReasonImages = {
            	    "(//img[@alt='double-check'])[1]",
            	    "(//img[@alt='double-check'])[2]",
            	    "(//img[@alt='double-check'])[3]",
            	    "(//img[@alt='double-check'])[4]",
            	    "(//img[@alt='double-check'])[5]",
            	    "(//img[@alt='double-check'])[6]",
            	    "(//img[@alt='double-check'])[7]",
            	    "(//img[@alt='double-check'])[8]"
            	};
 
            validateElements(driver, ReasonNames, null, ReasonImages, "Reason");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[5]", "https://www.capermint.com/contact/", "Let's Get Started Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='FAQs about Mobile App Gamification']");
            
            // FAQ Section
            
            printSectionHeader("FAQ Section");
            
            validateTitle(driver, "//h2[normalize-space()='FAQs about Mobile App Gamification']", "FAQs about Mobile App Gamification", "Title");
            validateTitle(driver, "//p[contains(text(),'We want to solve all the queries that you may have')]", "We want to solve all the queries that you may have and answer all the questions that may enter your mind. Therefore, here is a curated list of Frequently Asked Questions about Mobile App Gamification that most of the clients ask. If you have any questions other than these, you can drop a message below or call us.", "Content");
            
            List<String> faqQuestions = Arrays.asList(
            	    "How much time does it take to Gamify a Mobile App?",
            	    "Can any Mobile App be Gamified?",
            	    "Do you provide continuous maintenance and support for Mobile App Gamification?",
            	    "What is gamification in mobile apps?",
            	    "What are key elements of gamification in mobile apps?",
            	    "What are the benefits of incorporating gamification into mobile apps?"
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