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

public class Snake_Ladder_Game extends CommanMathods{

	public Snake_Ladder_Game(WebDriver driver) {	
		super(driver);			
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/snake-ladder-game-development/");
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
        
//        checkfontStyle(driver, "(//div[@class='elementor elementor-17768'])[1]", "Nunito, Arial, \"Helvetica");
        
        validateTitle(driver, "//h1[normalize-space()='Snake & Ladder Game Development Company']", "Snake & Ladder Game Development Company", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint is a leading snake & ladder game develop')]", "Capermint is a leading snake & ladder game development company. With our help of expert game developers, we are providing top-notch snake & ladder game app and website development services.", "Content");
        
        validateLink(driver, "//a[@target='_self']", "https://www.capermint.com/contact/", "Contact Us Button");
        
        checkBackgroundImage(driver, "(//div[@class='elementor-widget-wrap'])[1]");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-23837de9 elementor-section-full_width new-gs-1 elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(4, 154, 254, 1)");
        
        // Page Scroll
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Snake & Ladder Game Development Services']");
        
        // Development Services Section
        
        printSectionHeader("Development Services Section");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-9b976bb elementor-section-full_width elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(255, 195, 9, 1)");
        
        validateTitle(driver, "//h2[normalize-space()='Snake & Ladder Game Development Services']", "Snake & Ladder Game Development Services", "Title");
        validateTitle(driver, "//p[contains(text(),'Capermint Technologies is among the leading snake ')]", "Capermint Technologies is among the leading snake and ladder board game app & website development companies with a dedicated team that ensures to meet all the requirements and needs of the clients by offering amazing game development services. Our developers are game addicts and therefore they know what the audience expects from your game and which features can help in making your game a chartbuster.\r\n"
        		+ "Our games are powered to provide an excellent gaming experience. Once engaged with the game, you can never get enough. We use the latest and advanced technologies to make amazing games that can be easily downloaded and installed from various app stores.", "Content");
        
        checkImageVisibility(driver, "//img[@alt='Snake and ladder game Development company']");
        
        scrollToElementByXpath(driver, "//img[@alt='Snake and ladder game Development company']");
        
        List<String> imageXpaths = List.of(
        	    "(//img[@alt='snake and ladder game screen 1'])[1]",
        	    "(//img[@alt='snake and ladder game screen 2'])[2]",
        	    "(//img[@alt='snake and ladder game screen 3'])[2]",
        	    "(//img[@alt='snake and ladder game screen 4'])[2]",
        	    "(//img[@alt='snake and ladder game screen 5'])[2]",
        	    "(//img[@alt='snake and ladder game screen 6'])[2]",
        	    "(//img[@alt='snake and ladder game screen 7'])[2]"
        	);

        	String nextButtonXpath = "(//button[@aria-label='slick-next'])[1]";

        	checkMultipleImagesAndNavigate(driver, imageXpaths, nextButtonXpath);
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//img[@alt='snake-and-ladder-game']");
        
        // About Game Section
        
        printSectionHeader("About Game Section");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-3781e60b elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(4, 154, 254, 1)");
        
        checkImageVisibility(driver, "//img[@alt='snake-and-ladder-game']");
        
        validateTitle(driver, "//h2[normalize-space()='What is a Snake & Ladder Game?']", "What is a Snake & Ladder Game?", "Text");
        validateTitle(driver, "//span[contains(text(),'Snake and Ladder is an Indian board game that was ')]", "Snake and Ladder is an Indian board game that was originally known as “Moksha Patam”. The game can be played between two or more people and is considered a classic game worldwide. The board is covered with 100 numbered and gridded squares, which in turn have numerous snakes and ladders on them.", "Content");
        validateTitle(driver, "//span[contains(text(),'The goal is to reach the 100th box from the 1st bo')]", "The goal is to reach the 100th box from the 1st box. A dice is used to move ahead in this game. The player will be helped by the ladder and hindered by the snake.", "Content");
        
        validateTitle(driver, "//h3[normalize-space()='Hire Snakes & Ladders Game Developers']", "Hire Snakes & Ladders Game Developers", "Text");
        validateTitle(driver, "//div[contains(text(),'Why Wait? We are providing a free consultation ')]", "Why Wait? We are providing a free consultation for snake and ladder game development. Get your own fully customized snakes and ladders game. Contact us now for game requirements.", "Content");

        // Pending Link
//        validateLink(driver, "//a[@href='#get-in-touch']", "Contact Us link", "Click here Button");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Real Money Snake & Ladder Game']");
        
        // Launch Game Section
        
        printSectionHeader("Launch Game Section");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-3685da69 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(167, 200, 89, 1)");
        
        validateTitle(driver, "//h2[normalize-space()='Real Money Snake & Ladder Game']", "Real Money Snake & Ladder Game", "Text 1");
        validateTitle(driver, "//h3[normalize-space()='Launch Your Own Real Money Snakes & Ladders Game!']", "Launch Your Own Real Money Snakes & Ladders Game!", "Text 2");
        validateTitle(driver, "//span[contains(text(),'Rewards are a motivation to play the game again an')]", "Rewards are a motivation to play the game again and again. And what is a better reward than money? Therefore, Capermint Technologies bring real money snake and ladder solutions so that you can provide your audience with an amazing snake and ladder game in which they can use their snake and ladder skills to earn real money.​", "Content");
        
        checkfontColor(driver, "//h2[normalize-space()='Real Money Snake & Ladder Game']", "rgba(255, 255, 255, 1)");        
        checkfontStyle(driver, "//h2[normalize-space()='Real Money Snake & Ladder Game']", "Poppins, sans-serif");
        
        checkImageVisibility(driver, "//img[@alt='Real-money-snake-ladder-game']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Snake and Ladder Game Development Features']");
        
        // Development Features Section
        
        printSectionHeader("Development Features Section");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-3ef5b185 elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(18, 35, 47, 1)");
        
        validateTitle(driver, "//h2[normalize-space()='Snake and Ladder Game Development Features']", "Snake and Ladder Game Development Features", "Title");
        
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
        	    "Play Snake & Ladder using your skills and win to earn real cash. Use your Snake & Ladder expertise to earn real money instead of just using it to pass time.",
        	    "Add your friends to the buddy list and therefore play with them whenever you want. Sync your social media to add more friends.",
        	    "We want you to spend most of your time playing the game, and therefore we develop games that support quick deposit and money withdrawal.",
        	    "You will get a detailed history of all the games that you have played. It will also have details about the amount that you won/lost in each game.",
        	    "A detailed history of the money that you have withdrawn is available. You can refer the list to know when and where you have withdrawn the money.",
        	    "As you add friends, you can see them on the buddy list. You can also see who is online and you can also send them an invitation to play with them.",
        	    "The live support feature lets the players connect to you in just a few clicks. It can be used 24*7 by the players.",
        	    "You can also play the game as a guest if you do not wish to create an account using your email address or any social media account.",
        	    "You can simply sign up using your Facebook account/ Google account/ Email address. All your social media friends will be automatically added to your buddy list.",
        	    "In order to get only genuine players in the game, a player has to verify their phone number and email address. The verification would be done via OTP.",
        	    "Give the users a reason to use the app every day. What can be a better motivation than a bonus? Players will earn a bonus if they log in daily.",
        	    "Use Ads to earn more out of your game. Show an Advertisement that will provide the users with a bonus upon seeing the full advertisement. This way it’s a win-win situation.",
        	    "Smart Notifications allow you to send push notifications to all the users. You can target these notifications to motivate them to play the game now.",
        	    "We use state of the art security tools and protocols to ensure that the Snake & Ladder game that we develop is safe against online frauds.",
        	    "We can integrate real-time voice and chat functionality to make the game more exciting.",
        	    "We can integrat various payment Gateways includes various cards, Paytm, Gpay, Stripe, and many more.",
        	    "We have added the refer and earn functionality to the snake & ladder game that provides a unique invite code to each user and provide easy to earn referral money.",
        	    "Random Number Generator technology means that whenever the dice is rolled, the number that shows up on the dice is a totally random number. RNG+ Certification ensures fair gameplay in our Snake & Ladder games."
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
            	"//img[@alt='Group 207']",
            	"//img[@alt='Group 217']"
            };
        
        validateElements(driver, FeatureNames, FeatureContents, FeatureImages, "Features");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Snake & Ladder Admin Control Features']");
        
        // Admin Control Features Section
        
        printSectionHeader("Admin Control Features Section");
        
        checkBackgroundColor(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-4d975c85 ludo-game-dev-features snake-ladder-dev-feature elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]", "rgba(167, 200, 89, 1)");
        
        validateTitle(driver, "//h2[normalize-space()='Snake & Ladder Admin Control Features']", "Snake & Ladder Admin Control Features", "Title");
        validateTitle(driver, "//p[contains(text(),'Controlling and maintaining the app should be easy')]", "Controlling and maintaining the app should be easy and achievable for the admin. To make all the controls of the game easy and accessible, we add the below-mentioned features in the game.", "Content");
        
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
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[28]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[29]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[30]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[31]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[32]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[33]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[34]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[35]",
        		"(//div[@class='elementor-widget-wrap elementor-element-populated'])[36]"
            );
        
        checkPseudoElementBackgroundImage(driver, cardXpaths, "before");
   
        Map<String, String> cssProperties = new HashMap<>();
        cssProperties.put("background-image", "linear-gradient(0deg, rgb(255, 206, 10) 0%, rgb(255, 195, 9) 100%)");
        cssProperties.put("box-shadow", "rgba(255, 119, 0, 0.5) 0px 15px 30px 0px");

        validateHoverEffects(driver, cardXpaths, cssProperties);
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[contains(text(),'How much does it cost to develop a snake & ladder ')]");
        
        // Cost Section
        
        printSectionHeader("Cost Section");
        
        validateTitle(driver, "//h2[contains(text(),'How much does it cost to develop a snake & ladder ')]", "How much does it cost to develop a snake & ladder game?", "Text");

        // Strong tag validation pending
//        validateTitle(driver, "//p[contains(text(),'with basic functionalities. And if you want to dev')]", " with basic functionalities. And if you want to develop a mobile snake & ladder game with all the advanced features and support multiple mobile platforms will cost higher based on functionalities.", "Content");
       
        validateTitle(driver, "//h3[normalize-space()='Check Our Live Demo!']", "Check Our Live Demo!", "Text");
        
        validateLink(driver, "//a[@href='http://staging-server.in/gamesnew/snakes-and-ladders/']", "http://staging-server.in/gamesnew/snakes-and-ladders/", "Snakes & Ladders Demo Button");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[contains(text(),'Why Capermint is the best snake and ladder')]");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//h2[contains(text(),'Why Capermint is the best snake and ladder')]", "Why Capermint is the best snake and ladder game development company?", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint Technologies is among the leading snake ')]", "Capermint Technologies is among the leading snake and ladder game development companies. We have a team of dedicated developers who ensure to meet all your snake and ladder requirements and needs to deliver to you the best possible game. Here are some of the advantages of choosing Capermint Technologies as your snake and ladder game development company.", "Content");
        
        String[] Names = {
        		"Multiplayer Gaming",
        		"Supports Cross-Platform Compatibility",
        		"Seamless gaming experience",
        		"Attractive Interface and User Experience",
        		"Expert 2D and 3D Game Designers",
        		"Expert Real Money Game Developers"
        };
        
        String[] Images = {
        		"//i[@class='fas fa-gamepad']",
        		"//i[@class='fas fa-mobile-alt']",
        		"//i[@class='fab fa-fantasy-flight-games']",
        		"//i[@class='fab fa-uikit']",
        		"//i[@class='fab fa-draft2digital']",
        		"//i[@class='fab fa-studiovinari']"
        };
        
        validateElements(driver, Names, null, Images, "Benefits");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "(//h2[normalize-space()=\"Snake & Ladder Game Development FAQ's\"])[1]");
        
        // FAQ Section
        
        printSectionHeader("FAQ Section");
        
        validateTitle(driver, "(//h2[normalize-space()=\"Snake & Ladder Game Development FAQ's\"])[1]", "Snake & Ladder Game Development FAQ's", "Title");
        
        String[] faqQuestions = {
        	    "How much time does it take to develop a real money mobile Snake and Ladder game?",
        	    "Do you provide continued maintenance support for Snake and Ladder mobile game development?",
        	    "What technologies are you using for developing real money Snake and Ladder games?"
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