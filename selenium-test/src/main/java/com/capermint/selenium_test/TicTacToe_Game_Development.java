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

public class TicTacToe_Game_Development extends CommanMathods{
	public TicTacToe_Game_Development(WebDriver driver) {	
		super(driver);			
	}
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/tic-tac-toe-game-development/");
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
        
        validateTitle(driver, "//h1[normalize-space()='Tic Tac Toe Game Development Company']", "Tic Tac Toe Game Development Company", "Title");
        validateTitle(driver, "//h2[normalize-space()='Top Tic Tac Toe Game Developers']", "Top Tic Tac Toe Game Developers", "Text");
        checkfontColor(driver, "//h2[normalize-space()='Top Tic Tac Toe Game Developers']", "rgba(255, 183, 10, 1)");
        validateTitle(driver, "//span[contains(text(),'Capermint Technologies is a leading Tic Tac Toe Ga')]", "Capermint Technologies is a leading Tic Tac Toe Game Development Company with an expert team of game developers who have the best skills in developing Tic Tac Toe games with high-quality creative UI design.", "Content");
        validateLink(driver, "//a[@target='_self']", "https://www.capermint.com/contact/", "Contact Us");
        checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap'])[1]");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Tic Tac Toe Game Development Services']");
        
        // Game Development Services Section
        
        printSectionHeader("Game Development Services Section");
        
        validateTitle(driver, "//h2[normalize-space()='Tic Tac Toe Game Development Services']", "Tic Tac Toe Game Development Services", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint Technologies is among the top-rated Tic ')]", "Capermint Technologies is among the top-rated Tic Tac Toe game development company with a team of notable developers who have years of experience in developing interesting and fun real money games with rich functioning graphics and features.", "Content 1");
        validateTitle(driver, "//span[contains(text(),'Our team consists of dedicated game enthusiasts an')]", "Our team consists of dedicated game enthusiasts and therefore they know what the audience will expect from your game and which features can help in boosting the engagement rate of your game. They firmly understand your unique needs and use all the latest and advanced tools to provide you with a world-class solution. Get ready to have a game that is awesome and can deliver 100% satisfaction thanks to its graphics and functionality.", "Content 2");
        
        List<String> imageXpaths = List.of(
        	    "(//img[@alt='Tic Tac Toe Screen 1'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 2'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 3'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 4'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 5'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 6'])[2]",
        	    "(//img[@alt='Tic Tac Toe Screen 7'])[2]"
        	);

        String nextButtonXpath = "(//button[@aria-label='slick-next'])[1]";

       	checkMultipleImagesAndNavigate(driver, imageXpaths, nextButtonXpath);
        
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//span[normalize-space()='ABOUT GAME']");
       	
       	// About Game Section
       	
       	printSectionHeader("About Game Section");
       	
       	validateTitle(driver, "//span[normalize-space()='ABOUT GAME']", "ABOUT GAME", "Title");
       	checkfontColor(driver, "//span[normalize-space()='ABOUT GAME']", "rgba(172, 76, 253, 1)");
       	validateTitle(driver, "//h2[normalize-space()='What is a Tic Tac Toe Game?']", "What is a Tic Tac Toe Game?", "Text");
       	validateTitle(driver, "//span[contains(text(),'Tic Tac Toe also known as Noughts and Crosses, and')]", "Tic Tac Toe also known as Noughts and Crosses, and X’s and O’s is a 2 player game played on a 3*3 grid. The objective of this game is to mark three respective marks in a vertical, horizontal, or diagonal in a row. If no player is able to do so, then it is considered a draw.", "Content 1");
       	validateTitle(driver, "//span[contains(text(),'To win this game, one has to form strategies and t')]", "To win this game, one has to form strategies and tactics. One has to pay good attention to place three respective marks in a vertical, horizontal, or diagonal, and to block the other player from forming these patterns. ", "Content 2");
       	
       	checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-1d1063fc elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Game Development Company']");
       	
       	// Play Tic-Tac-Toe Online Section
       	
       	printSectionHeader("Play Tic-Tac-Toe Online Section");
       	
       	checkBackgroundColor(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-72b13f3b elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']", "rgba(167, 200, 89, 1)");
       	
       	validateTitle(driver, "//h2[normalize-space()='Game Development Company']", "Game Development Company", "Title");
       	checkfontColor(driver, "//h2[normalize-space()='Game Development Company']", "rgba(172, 76, 253, 1)");
       	validateTitle(driver, "//h2[normalize-space()='Play Tic-Tac-Toe Online']", "Play Tic-Tac-Toe Online", "Text 1");
       	validateTitle(driver, "//span[normalize-space()='Real Money Tic Tac Toe Game!']", "Real Money Tic Tac Toe Game!", "Text 2");
       	checkfontColor(driver, "//span[normalize-space()='Real Money Tic Tac Toe Game!']", "rgba(172, 76, 253, 1)");
       	validateTitle(driver, "//span[contains(text(),'Tic Tac Toe is a game of mind. You have to give yo')]", "Tic Tac Toe is a game of mind. You have to give your 100% to ensure that you mark three consecutive marks while blocking the other player, and therefore when you win the joy of the same is a next-level thing. To double this joy, we have added the real money feature and therefore if you win at Tic Tac Toe on apps developed by us, you will have the fun and joy of winning + the winning amount for your double celebration.", "Content");
       	validateLink(driver, "//a[@href='https://www.capermint.com/contact-us/']", "https://www.capermint.com/contact-us/", "CONTACT US Button");
       	
       	validateVideo(driver, "//video[@class='elementor-video']");
       	
       	Thread.sleep(5000);
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Tic Tac Toe Game App Features']");
       	
       	// Tic Tac Toe Game App Features Section
       	
       	printSectionHeader("Tic Tac Toe Game App Features Section");
       	
       	checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-4447b9e4 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
       	
       	validateTitle(driver, "//h2[normalize-space()='Tic Tac Toe Game App Features']", "Tic Tac Toe Game App Features", "Title");
       	validateTitle(driver, "//span[contains(text(),'Features are the spine of the game. These features')]", "Features are the spine of the game. These features are what make a game awesome or dull. Amazing features can improve the game’s performance 10x. At Capermint Technologies, we want your game to be a one-deal package that contains all the awesome games that can take the user experience to the next level.​", "Content");
       	
       	String[] FeatureNames = {
       		    "Play online with real money",
       		    "Play with your friends",
       		    "Quick Deposit and Withdraw Money",
       		    "Game History",
       		    "Withdraw History",
       		    "Buddy Live List and Invitation",
       		    "Live Support Feature",
       		    "Play as a guest feature",
       		    "Facebook/Google/E-mail Login",
       		    "Phone number and Email OTP configuration",
       		    "Welcome Bonus",
       		    "Serving Ads",
       		    "Smart Notifications",
       		    "Anti-Fraud System",
       		    "Chat & Voice Functionality",
       		    "Multiple Payment Options",
       		    "Refer & Earn Functionality"
       	};

       	String[] FeatureContents = {
       		    "Winning our games will not only make you happy but will also fill your pockets. You can play the game and by winning you can earn real money.",
       		    "Add your friends to the buddy list and therefore play with them whenever you want. Sync your social media to add more friends.",
       		    "We develop games that support quick deposit and money withdrawal so that you can play more and spend less time depositing or withdrawing money.",
       		    "You can use this feature to see when and to which account you have withdrawn your money and how much.",
       		    "You can use this feature to see when and to which account you have withdrawn your money and how much.",
       		    "All your added friends will be added to the buddy list. You can use the buddy list to see who is online and you can also invite them from there.",
       		    "Players can use the live support feature to contact the company for any problem. This will help the players can the company to connect easily.",
       		    "You can also play the game as a guest if you do not wish to create an account using your email address or any social media account.",
       		    "Users can use their Facebook/Google/E-mail account to sign in without entering any other information.",
       		    "In order to get only genuine players in the game, a player has to verify their phone number and email address. An OTP will be sent to do so.",
       		    "You will be rewarded as soon as you join the game. The welcome reward is waiting for you, so come and get it.",
       		    "Use Ads to earn more out of your game. Show an Advertisement that will provide the users with a bonus upon seeing the full advertisement. This way it’s a win-win situation.",
       		    "Smart Notifications allow you to send push notifications to all the users. You can target these notifications to motivate them to play the game now.",
       		    "We use state of the art security tools and protocols to ensure that the Ludo game that we develop is safe against online frauds.",
       		    "We can integrate real-time voice and chat functionality to make the game more exciting.",
       		    "We can integrate various payment Gateways including various cards, Paytm, Gpay, Stripe, and many more.",
       		    "Refer the game to your friends to play with them + you will also earn amazing rewards for inviting them to the game."
       		};
       	
       	String[] FeatureImages = {
       			"//img[@alt='money']",
       			"//img[@alt='team']",
       			"//img[@alt='withdraw']",
       			"//img[@alt='clock']",
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
       			"//img[@alt='Group 207']"
       	};
       	
       	validateElements(driver, FeatureNames, FeatureContents, FeatureImages, "Features");
       	
       	// Page Scrolling
       	
       	scrollToElementByXpath(driver, "//h2[normalize-space()='Tic Tac Toe Admin Control Features']");
       	
       	// Admin Control Features Section
       	
       	printSectionHeader("Admin Control Features Section");
       	
       	checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-5f0fa78 ludo-game-dev-features snake-ladder-dev-feature snake-ladder-features elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
       	
       	validateTitle(driver, "//h2[normalize-space()='Tic Tac Toe Admin Control Features']", "Tic Tac Toe Admin Control Features", "Title");
       	validateTitle(driver, "//div[contains(text(),'To create an awesome and easy interface for the admin')]", "To create an awesome and easy interface for the admin, we have added tons of control features for users that they can use to personalize their gameplay.", "Content");
       	
        String[] ControlFeatureNames = {
        	    "Tic Tac Toe Dashboard",
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
        	    "The Dashboard is the master control of the Tic Tac Toe game. Choose the color of the X’s and O’s, change the board, choose the theme, etc. can be done using the dashboard.",
        	    "Change and manage settings like language, sound options, notifications, two-factor authentication, etc to personalize your gaming experience.",
        	    "You can use various IDs and manage them easily in the app. You can easily and quickly switch between IDs according to your requirement.",
        	    "The Leader Board will show the leaders in two columns, global and country wise. You can check the top 100 global and top 100 local players.",
        	    "There will be a detailed history of all your payments in the payment option and the wallet can be used to deposit and withdraw money.",
        	    "You can easily manage the in-game money, which is chips using this feature. You have 100% control over all the chips around the game.",
        	    "You can send smart mobile notifications to the players that can lure them into playing the game after seeing the notification.",
        	    "Add or remove advertisements in your game using this feature. You can also ask players to see the full advertisement against some rewards.",
        	    "The reach of the game can be easily increased providing rewards to players who refer their friends and family to download your game."
        };
        
        validateElements(driver, ControlFeatureNames, ControlFeatureContents, null, "Features");
        
        List<String> cardXpaths = Arrays.asList(
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[25]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[26]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[27]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[28]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[29]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[30]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[31]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[32]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[33]"
            );
        
        checkPseudoElementBackgroundImage(driver, cardXpaths, "before");
        
        Map<String, String> cssProperties = new HashMap<>();
        cssProperties.put("background-image", "linear-gradient(0deg, rgb(141, 0, 255) 0%, rgb(0, 0, 0) 100%)");
        cssProperties.put("box-shadow", "rgba(172, 76, 253, 0.5) 0px 15px 30px 0px");

        validateHoverEffects(driver, cardXpaths, cssProperties);
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Our Tic Tac Toe Game Development Advantages']");
        
        // Development Advantages & Cost Section
        
        printSectionHeader("Development Advantages & Cost Section");
        
        validateTitle(driver, "//h2[normalize-space()='Our Tic Tac Toe Game Development Advantages']", "Our Tic Tac Toe Game Development Advantages", "Title");
        validateTitle(driver, "//p[contains(text(),'Our team of real money game development developers')]", "Our team of real money game development developers, designers, and programmers are experts in developing real money games and they strive to provide the best Tic Tac Toe game to you. Some of the advantages of choosing Capermint Technologies as your real money Tic Tac Toe game development company are as follows.", "Content");
        
        validateTitle(driver, "//h2[normalize-space()='How much does tic tac toe game development cost?']", "How much does tic tac toe game development cost?", "Title");

        // Strong tag validation pending
//        validateTitle(driver, "//p[contains(text(),'with basic functionalities. And if you want to dev')]", " with basic functionalities. And if you want to develop a mobile snake & ladder game with all the advanced features and support multiple mobile platforms will cost higher based on functionalities.", "Content");
        
        validateTitle(driver, "//span[normalize-space()='Looking for a Live Demo?']", "Looking for a Live Demo?", "Text");
        validateLink(driver, "(//a[contains(@class,'elementor-button elementor-button-link elementor-size-md')])[2]", "https://www.capermint.com/contact/", "Request a Demo Button");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Why Capermint For Tic Tac Toe Game Development ?']");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//h2[normalize-space()='Why Capermint For Tic Tac Toe Game Development ?']", "Why Capermint For Tic Tac Toe Game Development ?", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint Technologies ranks among the best Tic Ta')]", "Capermint Technologies ranks among the best Tic Tac Toe game development companies. We incorporate our games with advanced, special, and unique features and therefore the games that we develop are instant hits on the app stores.", "Content");
        
        String[] Names = {
        		"Multiplayer Gaming",
        		"Supports Cross-Platform Compatibility",
        		"Seamless gaming experience",
        		"Attractive Interface and User Experience",
        		"Expert 2D and 3D Game Developers",
        		"Experienced Real Money Game Developers"
        };
        
        String[] Images = {
        		"//i[@class='fas fa-gamepad']",
        		"//i[@class='fas fa-mobile-alt']",
        		"//i[@class='fab fa-fantasy-flight-games']",
        		"//i[@class='fab fa-uikit']",
        		"//i[@class='fab fa-draft2digital']",
        		"//i[@class='fas fa-money-bill-alt']"
        };
        
        validateElements(driver, Names, null, Images, "New");

    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}