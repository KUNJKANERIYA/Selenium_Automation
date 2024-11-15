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

public class ECommerce_Gamification extends CommanMathods{
	
	public ECommerce_Gamification(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/ecommerce-gamification/");
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
            
            validateTitle(driver, "//h1[@class='elementor-heading-title elementor-size-default']", "Gamification in e-Commerce", "Title");
            validateTitle(driver, "//p[contains(text(),'Transform your E-Commerce App with Capermint’s Gam')]", "Transform your E-Commerce App with Capermint’s Gamification Service. We provide expert consultation, skilful gamified modifications, and top-notch integration to modify your traditional E-Commerce App to create a User-First Experience.", "Content");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[1]", "https://www.capermint.com/contact/", "Gamify your app now! Button");
            
            checkImageVisibility(driver, "(//img[@alt='eCommerce Gamification'])[2]");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[1]");
            
            // E-Commerce Gamification Service Section
            
            printSectionHeader("E-Commerce Gamification Service Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[1]", "E-Commerce Gamification Service", "Title");
            validateTitle(driver, "(//p[contains(text(),'Gamification in e-commerce refers to the process o')])[1]", "Gamification in e-commerce refers to the process of using game-design elements and mechanics to enhance the user experience and encourage engagement with an online shopping platform or app. ", "Paragraph 1");
            validateTitle(driver, "(//p[contains(text(),'This involves incorporating points, rewards, level')])[1]", "This involves incorporating points, rewards, levels, challenges, and feedback loops into the shopping process to make it more interactive, entertaining, and rewarding for the user. Gamification in e-commerce aims to increase customer loyalty, engagement, and satisfaction while driving sales and increasing brand recognition.", "Paragraph 2");
            
            checkImageVisibility(driver, "//img[@alt='E-Commerce Gamification']");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'][contains(text(),'Gamification In')])[1]");
            
            // Gamification In E-Commerce Section
            
            printSectionHeader("Gamification In E-Commerce Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'][contains(text(),'Gamification In')])[1]", "Gamification In E-Commerce Is Easy With Capermint Technologies", "Title");
            validateTitle(driver, "//p[contains(text(),'Capermint is a one-stop solution for all your mobi')]", "Capermint is a one-stop solution for all your mobile app and game development needs. Our Gamification experts will turn your E-Commerce app into the most engaging and interesting one. Being an industry leader, we have developed numerous gamified E-Commerce apps. Many of our apps have topped the charts of app stores too. Here are the traits that make us a top E-commerce app gamification company.", "Content");
            
            printSectionHeader("Check Hover Effect");
            
            List<String> cardXpaths = Arrays.asList(
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[6]",
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[7]",
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[8]",
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[9]",
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[10]",
                    "(//div[@class='elementor-widget-wrap elementor-element-populated'])[11]"
                );

                String expectedBorderColor = "rgb(252, 24, 90)";
                String expectedShadow = "rgba(255, 61, 61, 0.33) 0px 0px 50px 0px";

                for (String xpath : cardXpaths) {
                    validateCardHighlightAnimation(driver, xpath, expectedBorderColor, expectedShadow);
                }
                
            printSectionHeader("Check section Content");
            
            String[] EasyGamificationNames = {
            		"Customizable Solutions",
            		"User-Friendly Experience",
            		"Increased customer engagement",
            		"Increased sales and revenue",
            		"Cost-Effective Solutions",
            		"Transparent Communication"
            };
            
            String[] EasyGamificationContents = {
            	    "Capermint offers end-to-end customized Gamification solutions, from concept & strategy to system design & implementation. We architect the most effective gamified journey for E-Commerce apps that drives customer satisfaction and delivers your end goals.",
            	    "Our Gamification strategies focus on a user-first approach, so they deliver a user-friendly experience. From onboarding the gamification features to using them throughout the app, and finally getting the rewards, our Gamification modules perform impeccably.",
            	    "User engagement can also be improved through gamification by giving them a sense of control. Capermint utilizes strong game design in its gamification campaign, encouraging exploration and allowing users to determine their path and be more engaged.",
            	    "By creating a memorable experience for each visitor, Capermint helps your brand stand out from the crowd. We make gamification more than just a discount; we make it valuable and fulfilling with instant rewards that entice users to come back.",
            	    "Capermint can provide scalable solutions that can be customized based on the client's requirements and budget. This helps to keep the cost under control and reduces unnecessary expenses.",
            	    "The company provides comprehensive documentation to clients, including user guides and technical specifications, to ensure that they clearly understand the gamification solution."
            };
            
            String[] EasyGamificationImages = {
            		"//img[@class='attachment-full size-full wp-image-73767']",
            		"//img[@class='attachment-full size-full wp-image-73768']",
            		"//img[@class='attachment-full size-full wp-image-73657']",
            		"//img[@class='attachment-full size-full wp-image-73778']",
            		"//img[@class='attachment-full size-full wp-image-73666']",
            		"//img[@class='attachment-full size-full wp-image-73665']"
            };
            
            validateElements(driver, EasyGamificationNames, EasyGamificationContents, EasyGamificationImages, "EasyGamification");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[3]");
            
            // What Is Gamification In E-Commerce Section
            
            printSectionHeader("What Is Gamification In E-Commerce Section");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[3]", "What Is Gamification In E-Commerce?", "Title");
            validateTitle(driver, "(//p[contains(text(),'Gamification in e-commerce refers to the process o')])[2]", "Gamification in e-commerce refers to the process of using game-design elements and mechanics to enhance the user experience and encourage engagement with an online shopping platform or app. ", "Paragraph 1");
            validateTitle(driver, "(//p[contains(text(),'This involves incorporating points, rewards, level')])[2]", "This involves incorporating points, rewards, levels, challenges, and feedback loops into the shopping process to make it more interactive, entertaining, and rewarding for the user. Gamification in e-commerce aims to increase customer loyalty, engagement, and satisfaction while driving sales and increasing brand recognition.", "Paragraph 2");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[2]", "https://www.capermint.com/contact/", "Gamify your app now! Button");
            
            checkImageVisibility(driver, "(//img[@alt='Gamification E-Commerce'])[2]");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@alt='e-commerce app games']");
            
            // Benefits Of Gamification Section
            
            printSectionHeader("Benefits Of Gamification Section");
            
            checkImageVisibility(driver, "//img[@alt='e-commerce app games']");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[4]", "Benefits Of Gamification In E-commerce", "Title");
            validateTitle(driver, "//p[contains(text(),'Here are some benefits marketers should glance at ')]", "Here are some benefits marketers should glance at to make the best for their online business.", "Content");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73792']");
            
            checkImageVisibility(driver, "(//*[name()='rect'])[2]");
            validateTitle(driver, "//span[normalize-space()='Increased engagement and customer loyalty']", "Increased engagement and customer loyalty", "Text 1");
            validateTitle(driver, "//p[contains(text(),'Gamification elements such as rewards, challenges,')]", "Gamification elements such as rewards, challenges, and feedback loops can motivate users to engage more with the e-commerce platform and keep returning.", "Content 1");
            
            checkImageVisibility(driver, "(//*[name()='rect'])[2]");
            validateTitle(driver, "//span[normalize-space()='Improved user experience']", "Improved user experience", "Text 2");
            validateTitle(driver, "//p[contains(text(),'By adding game-like elements to the shopping proce')]", "By adding game-like elements to the shopping process, e-commerce platforms can make the experience more interactive, entertaining, and enjoyable.", "Content 2");
            
            checkImageVisibility(driver, "(//*[name()='rect'])[2]");
            validateTitle(driver, "//span[normalize-space()='Increased customer satisfaction']", "Increased customer satisfaction", "Text 3");
            validateTitle(driver, "//p[contains(text(),'Gamification can help e-commerce businesses better')]", "Gamification can help e-commerce businesses better understand their customers' needs and preferences, leading to more personalized and satisfying shopping experiences.", "Content 3");
            
            checkImageVisibility(driver, "(//*[name()='rect'])[2]");
            validateTitle(driver, "//span[normalize-space()='Enhanced brand recognition and marketing']", "Enhanced brand recognition and marketing", "Text 4");
            validateTitle(driver, "//p[contains(text(),'Gamification can also be used as a marketing tool ')]", "Gamification can also be used as a marketing tool to attract new customers, increase brand awareness, and promote products and services.", "Content 4");
            
            checkImageVisibility(driver, "(//*[name()='rect'])[2]");
            validateTitle(driver, "//span[normalize-space()='Boosted sales and revenue']", "Boosted sales and revenue", "Text 5");
            validateTitle(driver, "//p[contains(text(),'By engaging users and improving the shopping exper')]", "By engaging users and improving the shopping experience, gamification can drive sales and increase revenue for e-commerce businesses.", "Content 5");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73803']");
            
            // Features Of Gamification In E-Commerce Section
            
            printSectionHeader("Features Of Gamification In E-Commerce Section");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73803']");
            
            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[5]", "Features Of Gamification In E-Commerce", "Title");
            validateTitle(driver, "//p[contains(text(),'Gamification in e-commerce refers to the integrati')]", "Gamification in e-commerce refers to the integration of game-like elements into an online shopping experience. The following are some standard features of gamification in e-commerce", "Content");
            
            // Checking Features Section
            
            printSectionHeader("Checking Features Section");
            Thread.sleep(2000);
            
            String[] FeaturesNames = {
            	    "Rewards and incentives",
            	    "Point Tables",
            	    "Progress bars",
            	    "Quests and Challenges",
            	    "Badges & Trophies",
            	    "Leaderboard",
            	    "Virtual items"
            	};

            	String[] FeaturesContents = {
            	    "Rewards for playing the wheel game, for shopping, or for levelling up, loyalty points, discount vouchers, lucky draws, etc., can be used to attract new users and keep the existing users entertained",
            	    "Points will be the basic reward for the user's tasks via your app, whether a purchase or a goal is met. The users can then use these points to redeem them for some gift, prize, discount voucher, or reward",
            	    "The Progress Bar will showcase the daily progress of the users and how far they are from their goals or rewards. The progress bar will showcase the regular progress of the users and will motivate them to do better.",
            	    "Quests and challenges will work as missions. Setting a good goal for these quests and challenges can help you target your business outcome and increase your sales. Creative quests and challenges will keep the users engaged and your business booming.",
            	    "The badges and trophies will symbolise completing a milestone in the app. When the users complete the milestone, they will get the badge or trophy they can flaunt in their profile or use for exclusive rewards and benefits.",
            	    "The best motivation for the users to perform better is showcasing a leaderboard and letting them know how other users are performing. This will motivate the users to go that extra mile and be featured on the leaderboard",
            	    "Different virtual items, like exclusive avatars, trophies, achievements, etc., can be used to incentivise the user's progress. The more shopping they do, the better awards they will get, and the exclusivity of the rewards will make them even more meaningful."
            	};
            
            String[] FeaturesImages = {
            		"//img[@class='attachment-full size-full wp-image-73815']",
            		"//img[@class='attachment-full size-full wp-image-73814']",
            		"//img[@class='attachment-full size-full wp-image-73813']",
            		"//img[@class='attachment-full size-full wp-image-73812']",
            		"//img[@class='attachment-full size-full wp-image-73818']",
            		"//img[@class='attachment-full size-full wp-image-73817']",
            		"//img[@class='attachment-full size-full wp-image-73816']"
            };
            
            validateElements(driver, FeaturesNames, FeaturesContents, FeaturesImages, "Features");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@alt='amazon']");
            
            // Best E-commerce Gamification Examples Section
            
            printSectionHeader("Best E-commerce Gamification Examples Section");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73822']");
            
            validateTitle(driver, "//h2[contains(text(),'Best')]", "Best E-commerce Gamification Examples", "Title");
            
            // Checking Examples
            
            printSectionHeader("Checking Examples");
            
            String[] ExamplesNames = {
            	    "Amazon Rewards",
            	    "Duolingo - Educational Puzzle Games",
            	    "Starbucks - Loyalty Points Programme",
            	    "Nike - Run Club",
            	    "Flipkart - Supercoins",
            	    "BestBuy"
            };
            
            String[] ExamplesContents = {
            	    "Amazon boosts sales through gamification by offering actual games in a dedicated section. Players can win exciting prizes and vouchers, which can be redeemed for special discounts. A win guarantees a 5-20% discount on their next purchase, encouraging users to shop using the voucher and increasing sales on the platform.",
            	    "To help users break down the process, Duolingo asks them to set small, specific daily goals. Then, regular users are rewarded for completing smaller tasks each day. A progress bar allows you to compare your progress with that of other learners or your expectation and several external triggers to encourage lapsed users to return.",
            	    "The Starbucks app allows users to discover more than 100+ handcrafted beverages and 60+ food choices. However, this app is also the quickest way to Join the My Starbucks Rewards™ Program and be a part of the Starbucks family. Starbucks has added a loyalty program to the app.",  
            	    "The Nike Running Club app exemplifies the power of gamification in community building. The app's social aspect and rewards system increase users' loyalty and engagement, solidifying their dependence on the app and ensuring they stay loyal and entertained.",
            	    "This incentivizes users to continue shopping on Flipkart for their future purchases. Additionally, Flipkart offers a Gamezone feature where users can participate in various games and win Super Coins, coupons, and offers. Games such as spin the wheel and point-based challenges offer users discounts based on their game performance. Finally, Flipkart features a leaderboard system, where the users who make the largest purchases in a specified period are prominently displayed.",      	    
            	    "Best Buy is launching an innovative marketing campaign to showcase its recently redesigned loyalty program. The email also contained a link to a mobile and desktop game that offered a fun and interactive way for customers to stay connected to the My Best Buy loyalty program. In the game, players collect electronic gadgets and Best Buy logos, earning points along the way."
            };
            
            String[] ExamplesImages = {
               "//img[@alt='amazon']",
               "//img[@alt='Duolingo']",
               "//img[@alt='Starbucks']",
               "//img[@alt='Nike']",
               "//img[@alt='Flipkart']",
               "//img[@alt='BestBuy']"
            };
            
            validateElements(driver, ExamplesNames, ExamplesContents, ExamplesImages, "Examples");
            
            printSectionHeader("Contact Section");
            
            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73839']");
            
            validateTitle(driver, "//span[contains(text(),'GET A FREE E-COMMERCE APP GAMIFICATION CONSULTATIO')]", "GET A FREE E-COMMERCE APP GAMIFICATION CONSULTATION TODAY!", "Text");
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[3]", "https://www.capermint.com/contact/", "Contact Button");
                        
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-73640']");
            
            // Cost to Gamify an App Section
            
            printSectionHeader("Cost to Gamify an App Section");
            
            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-73640']");

            validateTitle(driver, "//h2[contains(text(),'How Much Does It Cost to')]", "How Much Does It Cost to Gamify an E-Commerce App?", "Title");
            validateTitle(driver, "//p[contains(text(),'E-Commerce App Gamification can cost around $35,00')]", "E-Commerce App Gamification can cost around $35,000 to $40,000 for a single platform with basic functionality. However, if you wish to add advanced gamification features and functionalities to your mobile app, with support for multiple platforms, it may cost up to $80,000. ", "Text");
            
            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73642']");
            validateTitle(driver, "//h4[normalize-space()='Charges of a small company']", "Charges of a small company", "Text1");
            validateTitle(driver, "(//p[@class='elementor-image-box-description'])[20]", " $15 - $40 / hour", "Price");
            
            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73643']");
            validateTitle(driver, "//h4[normalize-space()='Charges of an Intermediate company']", "Charges of an Intermediate company", "Text1");
            validateTitle(driver, "//p[normalize-space()='$50 - $100 / hour']", "$50 - $100 / hour", "Price");
            
            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-73644']");
            validateTitle(driver, "//h4[normalize-space()='Charges of an Enterprise-level company']", "Charges of an Enterprise-level company", "Text1");
            validateTitle(driver, "//p[normalize-space()='$100 - $300 / hour']", "$100 - $300 / hour", "Price");
            
            validateTitle(driver, "//p[contains(text(),'You can contact us if you are looking for an exper')]", "You can contact us if you are looking for an expert E-Commerce Gamification Company. We have solid technical gamification experts who can gamify and upgrade your app to provide the best user experience. Check out our portfolio to learn more about our E-Commerce App Gamification Service.", "Text");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[4]", "https://www.capermint.com/contact/", "Contact Button");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//img[@alt='Gamification in Healthcare']");
            
            // FAQs Section
            
            printSectionHeader("FAQs Section");
            
            List<String> faqQuestions = Arrays.asList(
            	    "What are the advantages of Gamification in E-Commerce?",
            	    "How can I gamify my eCommerce platform?",
            	    "How do I measure the success of gamification in eCommerce?",
            	    "How does gamification affect customer loyalty?",
            	    "What is gamification in e-commerce?",
            	    "How does gamification benefit e-commerce businesses?",
            	    "Can gamification be integrated into mobile e-commerce apps?"
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
