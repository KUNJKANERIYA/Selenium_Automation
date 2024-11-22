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

public class Ludo_Game_Development extends CommanMathods{

	public Ludo_Game_Development(WebDriver driver) {	
		super(driver);			
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/ludo-game-development/");
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
        
        checkBackgroundColor(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-70fc9efe elementor-section-full_width new-gs-1 elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']", "rgba(32, 66, 174, 1)");
        
        validateTitle(driver, "//h1[normalize-space()='Ludo Game Development Company']", "Ludo Game Development Company", "Title");
        validateTitle(driver, "//div[contains(text(),'Capermint is a leading ludo game development compa')]", "Capermint is a leading ludo game development company. Capermint specializes in creating engaging Ludo games that deliver smooth gameplay and captivating graphics. Our team of skilled developers works closely with businesses to bring their game ideas to life, ensuring each project meets the highest standards. Whether you’re looking to launch a mobile Ludo game or expand your gaming portfolio, we provide tailored solutions to help you succeed.", "Content");
        
        // Link Pending
//        validateLink(driver, "//a[@href='#contact']", "ContactUs Link", "Contact Us! Button");

        checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap'])[1]");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//p[contains(text(),'At Capermint, we’ve successfully developed over 10')]");
        
        // Top Ludo Game Developers Section
        
        printSectionHeader("Top Ludo Game Developers Section");
        
        validateTitle(driver, "//h2[normalize-space()='Top Ludo Game Developers']", "Top Ludo Game Developers", "Title");
        validateTitle(driver, "//p[contains(text(),'At Capermint, we’ve successfully developed over 10')]", "At Capermint, we’ve successfully developed over 100 Ludo games, each tailored to deliver an exceptional player experience. As a trusted Ludo game development partner, we ensure your game stands out in a competitive market with unique features, smooth gameplay, and stunning visuals. Our expertise in crafting top-quality Ludo game apps guarantees your business a product that engages players and drives growth.", "Content");
        
        checkImageVisibility(driver, "//img[contains(@alt,'Ludo game example screen')]");
        
        List<String> imageXpaths = List.of(
        	    "(//img[@alt='Ludo game screen 1'])[2]",
        	    "(//img[@alt='Ludo game screen 2'])[2]",
        	    "(//img[@alt='Ludo game screen 3'])[2]",
        	    "(//img[@alt='Ludo game screen 4'])[2]",
        	    "(//img[@alt='Ludo game screen 5'])[2]",
        	    "(//img[@alt='Ludo game screen 6'])[2]"
        	);

        String nextButtonXpath = "(//button[@aria-label='slick-next'])[1]";

       	checkMultipleImagesAndNavigate(driver, imageXpaths, nextButtonXpath);
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='What is a Ludo Game?']");
       	
       	// About Game Section
       	
       	printSectionHeader("About Game Section");
       	
        checkBackgroundColor(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-4209683 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']", "rgba(32, 66, 174, 1)");
       	
       	validateTitle(driver,"//h2[normalize-space()='What is a Ludo Game?']", "What is a Ludo Game?", "Title");
       	validateTitle(driver,"//p[contains(text(),'Ludo is a strategic board game derived from the an')]", "Ludo is a strategic board game derived from the ancient Indian game Pachisi. It can be played between 2-4 players. A person gets 4 tokens and the goal is to get all the 4 tokens out of the base and then one by one, bring all the tokens to the home that is in the middle of the board, and is of the same color as the tokens. Whoever is the first one to put all the tokens in the home, wins. However, the game is not as simple as it looks.", "Content 1");
       	validateTitle(driver,"//p[contains(text(),'If someone steps on the tile in which your token i')]", "If someone steps on the tile in which your token is resting, they can kill your token, and then your token has to go back to the base. Therefore, it is not just a simple race, it is a race in which you have to save your tokens from being killed and you have to kill other player’s tokens to keep them from winning.", "Content 2");
       	
       	checkImageVisibility(driver, "//img[@alt='What is ludo game']");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Our Key Ludo Game Development Clients']");
       	
       	// Game Development Clients Section
       	
       	printSectionHeader("Game Development Clients Section");
       	
       	validateTitle(driver,"//h2[normalize-space()='Our Key Ludo Game Development Clients']", "Our Key Ludo Game Development Clients", "Text");
       	validateTitle(driver,"//p[contains(text(),'We are King in Ludo game development and have even')]", "We are King in Ludo game development and have even delivered excellence more than ever. Here are some of our top Ludo Game clients who have become gaming sensations with 500M+ downloads.", "Content");
       	
       	validateTitle(driver,"//span[normalize-space()='Ludo Empire']", "Ludo Empire", "Title 1");
       	validateTitle(driver,"//span[normalize-space()='LE Game Downloads: 500M+']", "LE Game Downloads: 500M+", "Text 1");
       	validateTitle(driver,"//p[contains(text(),'Ludo Empire is a game specifically developed for a')]", "Ludo Empire is a game specifically developed for all the dedicated Ludo players out there. The real money features add the much needed spark to the game. Now players can use their Ludo expertise to earn real money. The game has 5 Crore+ Downloads which is increasing at an exponential rate.", "Content 1");
       	checkImageVisibility(driver, "//img[@alt='Ludo Empire']");
       	validateLink(driver, "//a[@href='https://www.capermint.com/project/ludo-empire-case-study/']", "https://www.capermint.com/project/ludo-empire-case-study/", "Google Play Link");
       	checkImageVisibility(driver, "(//img[@alt='play-store'])[1]");
       	
       	validateTitle(driver,"//span[normalize-space()='Ludo Fantasy']", "Ludo Fantasy", "Title 2");
       	validateTitle(driver,"//span[normalize-space()='LF Game Downloads: 500M+']", "LF Game Downloads: 500M+", "Text 2");
       	validateTitle(driver,"//p[contains(text(),'Ludo Fantasy is a combination of the thrill of Lud')]", "Ludo Fantasy is a combination of the thrill of Ludo and the joy of winning real money. It comes with integrations like social media integration, real-time chat integration, and various payment integrations. Developed using Unity 3D, it is a visual treat to the eyes that have packed 5 Crore+ Downloads.", "Content 2");
       	checkImageVisibility(driver, "//img[@alt='Ludo-Fantasy']");
       	validateLink(driver, "//a[@href='https://ludofantasy.com/']", "https://ludofantasy.com/", "Google Play Link");
       	checkImageVisibility(driver, "(//img[@alt='play-store'])[2]");
       	
        // Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Customzied Ludo Game Development Services']");
       	
       	// Development Services Section
       	
       	printSectionHeader("Development Services Section");
       	
       	validateTitle(driver, "//h2[normalize-space()='Customzied Ludo Game Development Services']", "Customzied Ludo Game Development Services", "Ttile");
       	validateTitle(driver, "//h3[normalize-space()='One Stop Shop for Ludo Game App']", "One Stop Shop for Ludo Game App", "Text");
       	validateTitle(driver, "//p[contains(text(),'Redefine your gaming experience with Capermint’s C')]", "Redefine your gaming experience with Capermint’s Custom Ludo Game Development Services. Enjoy the classic fun of Ludo with our personalized solutions tailored to your unique preferences and needs. Capermint Technologies makes launching your first Ludo game effortless. Our expert team simplifies the development process, guiding you through every step to ensure a seamless experience from concept to launch. Ready to bring your Ludo game idea to life? Connect with us today and let’s create something extraordinary together.", "Content");
       	
       	checkImageVisibility(driver, "//img[@alt='launch real money ludo game']");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Online Ludo Game Features']");
       	
       	// Ludo Game Features Section
       	
       	printSectionHeader("Ludo Game Features Section");
       	
       	validateTitle(driver, "//h2[normalize-space()='Online Ludo Game Features']", "Online Ludo Game Features", "Title");
       	
       	String[] FeatureNames = {
       		    "Play online with real money",
       		    "Play with your friends",
       		    "Quick Deposit and Withdraw Money",
       		    "Game History",
       		    "Auto Move",
       		    "Withdraw History",
       		    "Buddy Live List and Invitation",
       		    "Live Support Feature",
       		    "Play as a guest feature",
       		    "Facebook/Google/E-mail Login",
       		    "Phone number and Email OTP configuration",
       		    "Daily Bonus Coins",
       		    "Serving Ads",
       		    "Smart Notifications",
       		    "Anti-Fraud System",
       		    "Chat & Voice Functionality",
       		    "Multiple Payment Options",
       		    "Refer & Earn Functionality",
       		    "RNG+ Technology Certification"
       	};

       	String[] FeatureContents = {
       		    "Play Ludo using your skills and win to earn real cash. Use your ludo expertise to earn real money instead of just using it to pass time.",
       		    "Add your friends to the buddy list and therefore play with them whenever you want. Sync your social media to add more friends.",
       		    "We want you to spend most of your time playing the game, and therefore we develop games that support quick deposit and money withdrawal.",
       		    "You will get a detailed history of all the games that you have played. It will also have details about the amount that you won/lost in each game.",
       		    "Ludo auto move refers to a feature in the game of Ludo where the computer automatically moves a player's token based on the roll of the dice.",
       		    "A detailed history of the money that you have withdrawn is available. You can refer the list to know when and where you have withdrawn the money.",
       		    "As you add friends, you can see them on the buddy list. You can also see who is online and you can also send them an invitation to play with them.",
       		    "The live support feature lets the players connect to you in just a few clicks. It can be used 24*7 by the players.",
       		    "You can also play the game as a guest if you do not wish to create an account using your email address or any social media account.",
       		    "You can simply sign up using your Facebook account/ Google account/ Email address. All your social media friends will be automatically added to your buddy list.",
       		    "In order to get only genuine players in the game, a player has to verify their phone number and email address. The verification would be done via OTP.",
       		    "Give the users a reason to use the app every day. What can be a better motivation than a bonus? Players will earn a bonus if they log in daily.",
       		    "Use Ads to earn more out of your game. Show an Advertisement that will provide the users with a bonus upon seeing the full advertisement. This way it’s a win-win situation.",
       		    "Smart Notifications allow you to send push notifications to all the users. You can target these notifications to motivate them to play the game now.",
       		    "We use state of the art security tools and protocols to ensure that the Ludo game that we develop is safe against online frauds.",
       		    "We can integrate real-time voice and chat functionality to make the game more exciting.",
       		    "We can integrat various payment Gateways includes various cards, Paytm, Gpay, Stripe, and many more.",
       		    "We have added the refer and earn functionality to the ludo game that provides a unique invite code to each user and provide easy to earn referral money.",
       		    "Random Number Generator technology means that whenever the dice is rolled, the number that shows up on the dice is a totally random number. RNG+ Certification ensures fair gameplay in our Ludo games."
       	};
       	
       	String[] FeatureImages = {
       			"//img[@alt='money']",
       			"//img[@alt='team']",
       			"//img[@alt='withdraw']",
       			"//img[@alt='clock']",
       			"//img[@alt='Auto-move']",
       			"//img[@alt='statement']",
       			"//img[@alt='friendship']",
       			"//img[@alt='customer-service']",
       			"//img[@alt='gameplay']",
       			"//img[@alt='Group 419']",
       			"//img[@alt='agenda']",
       			"//img[@alt='gift']",
       			"//img[@alt='ad']",
       			"//img[@alt='bell']",
       			"//img[@alt='Group 119']",
       			"//img[@alt='Group 121']",
       			"//img[@alt='Group 124']",
       			"//img[@alt='Group 207']",
       			"//img[@alt='Group 217']"
       	};
       	
       	validateElements(driver, FeatureNames, FeatureContents, FeatureImages, "Features");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Ludo Game Modes']");
       	
       	// Ludo Game Modes Section
       	
       	checkBackgroundColor(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-5a486e7a ludo-game-dev-features elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']", "rgba(32, 66, 174, 1)");
       	
       	printSectionHeader("Ludo Game Modes Section");
       	
       	validateTitle(driver, "//h2[normalize-space()='Ludo Game Modes']", "Ludo Game Modes", "Title");
       	validateTitle(driver, "//div[contains(text(),'To keep the game interesting, we have added various modes')]", "To keep the game interesting, we have added various modes to the Ludo games. The users can play different modes at different times to be entertained.", "Content");
       	
       	String[] GamemodeNames = {
       			"Classic Mode",
       			"Quick Mode",
       			"Practice Mode",
       			"Local Mode",
       			"Play with Friends (Online)",
       			"Multiplayer Global Mode"
       	};
       	
       	String[] GamemodeContents = {
       			"Classic Ludo is a timeless board game for 2-4 players, with 40 steps to reach the home area, involving strategic moves, dice rolls, and elimination of opponents’ tokens.",
       			"Ludo Quick mode is a challenging, fast-paced variant of the classic board game with two tokens per player, using dice rolls to move and block opponents.",
       			"Ludo Practice mode is a single-player option for the classic board game, allowing players to hone their skills and strategies against computer opponents.",
       			"Ludo Local Mode is a multiplayer option for the classic board game, played on the same device, where up to 4 players can challenge each other in a friendly competition.",
       			"It is a multiplayer option for the classic board game, allowing friends to challenge each other online and compete for victory.",
       			"Multiplayer Global Mode is an online option for the classic board game, enabling players from around the world to connect and compete in exciting matches."
       	};
       	
       	String[] GamemodeImages = {
       			"//img[@alt='Classic Ludo Mode']",
       			"//img[@alt='Quick Mode']",
       			"//img[@alt='Practice Mode']",
       			"//img[@alt='Local Mode']",
       			"//img[@alt='Play with friends']",
       			"//img[@alt='Multiplayer Global Mode']"
       	};
       	
       	validateElements(driver, GamemodeNames, GamemodeContents, GamemodeImages, "Elements");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Admin Control Features']");
       	
       	// Admin Control Features Section
       	
       	printSectionHeader("Admin Control Features Section");
       	
       	validateTitle(driver, "//h2[normalize-space()='Admin Control Features']", "Admin Control Features", "Title");
       	validateTitle(driver, "//p[contains(text(),'To make it easy and convenient for you to control ')]", "To make it easy and convenient for you to control and manage your game, we have added various features in the game. Here is a list of features that will help you in controlling and managing your application.", "Content");
       	
        String[] ControlFeatureNames = {
        	    "Dashboard",
        	    "Game settings and management",
        	    "User Management",
        	    "Leader Board Management",
        	    "Payment and wallet Management",
        	    "Chip Management",
        	    "Smart Notifications",
        	    "Manage Advertising",
        	    "Referral Management"
        };
        
        String[] ControlFeatureContents = {
        	    "Dashboard refers to a very important feature that shows you how your game is performing against other games.",
        	    "Various game settings are available like the language, sound option, two-factor authentication, game tutorials, notifications, etc, to change or edit the game’s experience.",
        	    "Manage and control the activity of all the users using the User Management feature. You can also remove a user if you sense something suspicious.",
        	    "Showcase the most skillful and earning players on the leaderboard to provide inspiration to others and to praise the top players of your game.",
        	    "Payment and wallet management feature will let you know how many coins have been bought and redeemed by the users.",
        	    "Manage the chips that are bought by the users or redeemed. You will also know what you have earned in the process.",
        	    "You can send smart mobile notifications to the players that can lure them into playing the game after seeing the notification.",
        	    "Add or remove advertisements in your game using this feature. You can also ask players to see the full advertisement against some rewards.",
        	    "The reach of the game can be easily increased providing rewards to players who refer their friends and family to download your game."
        };
        
        validateElements(driver, ControlFeatureNames, ControlFeatureContents, null, "Features");

        List<String> cardXpaths = Arrays.asList(
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[39]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[40]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[41]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[42]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[43]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[44]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[45]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[46]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[47]"
            );
        
        checkPseudoElementBackgroundImage(driver, cardXpaths, "before");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Why Capermint is the best ludo game maker company?']");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//h2[normalize-space()='Why Capermint is the best ludo game maker company?']", "Why Capermint is the best ludo game maker company?", "Title");
        validateTitle(driver, "//span[contains(text(),'We have delivered more than 100+ Ludo Games till n')]", "We have delivered more than 100+ Ludo Games till now.", "Text");
        validateTitle(driver, "//div[contains(text(),'At Capermint Technologies, we have a team of the best programmers who')]", "At Capermint Technologies, we have a team of the best programmers who work to create and enhance high-quality Ludo games. We understand the importance of graphics and interfaces that are not only splendid but also user-friendly for iOS and Android users. Our team’s main objective is to develop games that are technologically sound and can be played on all devices while supporting a large user base. With our cutting-edge technology and designs, our games are leaders in the industry on all app stores.  Here are some of the advantages of choosing Capermint.", "Content");
        
        String[] Names = {
        		"Multiplayer Gaming",
        		"Supports Cross-Platform Compatibility",
        		"Seamless gaming experience",
        		"Attractive Interface and User Experience",
        		"Expert 2D and 3D Game Designers",
        		"Expert Ludo Game Developers"
        };
        
        String[] Images = {
        		"//i[@class='fas fa-gamepad']",
        		"//i[@class='fas fa-mobile-alt']",
        		"//i[@class='fab fa-fantasy-flight-games']",
        		"//i[@class='fab fa-uikit']",
        		"//i[@class='fab fa-draft2digital']",
        		"//i[@class='fab fa-studiovinari']"
        };
        
        validateElements(driver, Names, null, Images, "New");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Ludo app development cost']");
        
        // Cost Section
        
        printSectionHeader("Cost Section");
        
        validateTitle(driver, "//h2[normalize-space()='Ludo app development cost']", "Ludo app development cost", "Title");

        // Strong tag validation pending
//        validateTitle(driver, "//p[contains(text(),'with basic functionalities. If you want to develop')]", " with basic functionalities. And if you want to develop a mobile snake & ladder game with all the advanced features and support multiple mobile platforms will cost higher based on functionalities.", "Content");
   
        validateLink(driver, "//a[@class='elementor-button elementor-button-link elementor-size-md']", "https://www.capermint.com/contact-us/", "Request a Demo Button");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "(//h2[normalize-space()=\"Ludo Game Development Faq's\"])[1]");
        
        // FAQ Section
        
        printSectionHeader("FAQ Section");
        
        validateTitle(driver, "(//h2[normalize-space()=\"Ludo Game Development Faq's\"])[1]", "Ludo Game Development Faq's", "Title");
        
        String[] faqQuestions = {
        	    "How to play a ludo game online?",
        	    "Which is the best Ludo game development company?",
        	    "How much time does it take to develop a Ludo game app?",
        	    "Do you provide continued maintenance support for Ludo mobile game development?",
        	    "What technologies are you using for developing Ludo games?",
        	    "Why should I choose Capermint as my Ludo app development company?",
        	    "Which Ludo Modes You can Expect From Us?"
        };
               
        hoverOverFaqs(driver, faqQuestions);
       	
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}