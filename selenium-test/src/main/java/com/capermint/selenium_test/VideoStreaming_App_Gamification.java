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

public class VideoStreaming_App_Gamification extends CommanMathods{
	
	public VideoStreaming_App_Gamification(WebDriver driver) {	
		super(driver);			
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/video-streaming-app-gamification/");
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
        
        validateTitle(driver, "//h1[normalize-space()='GAMIFICATION IN VIDEO STREAMING APP']", "GAMIFICATION IN VIDEO STREAMING APP", "Title");
        validateTitle(driver, "//div[contains(text(),'Netflix has recently launched mobile apps on the Netflix app an')]", "Netflix has recently launched mobile apps on the Netflix app and it is one of the best business moves by Netflix. Upgrade and launch your own mobile apps for your Video Streaming app and take your entertainment app to the next level. At Capermint, we provide video streaming app development service + Gamification service so that you can launch your own games that are exclusive to your Video Streaming Platform.", "Content");
        
        validateLink(driver, "//a[@target='_self']", "https://www.capermint.com/contact/", "Get quick assistance Button");
        
        checkImageVisibility(driver, "//img[@alt='video-streaming-n-right-img']");
        checkBackgroundImage(driver, "(//section[@class='elementor-section elementor-top-section elementor-element elementor-element-7655d9e0 elementor-section-full_width new-gs-1 elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no'])[1]");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Video Streaming App Development Solution']");
        
        // Video Streaming App Development Solution Section
        
        printSectionHeader("Video Streaming App Development Solution Section");
        
        validateTitle(driver, "//h2[normalize-space()='Video Streaming App Development Solution']", "Video Streaming App Development Solution", "Title");
        validateTitle(driver, "//div[contains(text(),'Harness the power of a custom video streaming app with Capermi')]", "Harness the power of a custom video streaming app with Capermint’s unique Video Streaming App Development Company. At Capermint, our developers are well-versed in developing apps with video on demand, OTT video solution, live streaming, content with interactive elements, e-commerce related videos, etc. Our apps stream high-quality videos that can be viewed on mobile devices, laptop, TV, and computer. From the app launch, to video streaming, our designer’s UI/UX will keep the users entertained and hooked to your video streaming app.", "Content");
        
        checkImageVisibility(driver, "//img[contains(@alt,'what-is-netflix')]");
        validateTitle(driver, "//h2[normalize-space()='What is Netflix Gaming?']", "What is Netflix Gaming?", "Title");
        
        By listLocator1 = By.xpath("(//ul)[64]/li");
        List<String> expectedTexts1 = Arrays.asList(
        	    "Netflix gaming is Netflix’s bold move to tap into the mobile gaming industry.",
        	    "Netflix has created a separate row for games, in which the company has added 5 games as of now, and is planning to add more games in the coming year.",
        	    "Whether the users want to enjoy a casual game from scratch, or if they wish to have an immersive experience that let’s them dig deep into their favourite stories, Netflix will build a library of games that will offer something to everyone.",
        	    "The users are likely to see games of their favourite series and movies, and there will also be some games that will work as a side story for the shows or as a more detailed version."
        );
        
        verifyTextInList(driver, listLocator1, expectedTexts1);
        
        checkImageVisibility(driver, "//img[contains(@alt,'how-can-one-play-right-img')]");
        validateTitle(driver, "//h2[normalize-space()='How can one play Netflix Games?']", "How can one play Netflix Games?", "Tilte");
        
        By listLocator2 = By.xpath("(//ul)[65]/li");
        List<String> expectedTexts2 = Arrays.asList(
        	    "Anyone with the Netflix Subscription can play these games.",
        	    "The users have to go to the games row, and from there, they can select and download the game.",
        	    "For now, there are only five games available, however, Netflix has promised that they will add more games soon, as this is just the initial stage of their entering the gaming industry.",
        	    "There will be no ads or in-app purchases in the games, as the company has plans to earn from the subscription model only.",
        	    "The company will not charge extra for the games as of now, however, nothing can be said for sure for the future. The addition of the games look like a great excuse to increase the subscription prices in the coming year."
        );
        
        verifyTextInList(driver, listLocator2, expectedTexts2);
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Video Streaming App Features']");
        
        // Video Streaming App Features Section
        
        printSectionHeader("Video Streaming App Features Section");
        
        validateTitle(driver, "//h2[normalize-space()='Video Streaming App Features']", "Video Streaming App Features", "Title");
        validateTitle(driver, "//div[contains(text(),'Netflix is the biggest name of video streaming apps and Netflix')]", "Netflix is the biggest name of video streaming apps and Netflix video streaming app is one of the most downloaded apps in the world. Using the Netflix app and watching movies or series on this app is a different experience altogether. Here is a list of features that makes the Netflix app such an awesome app", "Content");
        
        String[] FeaturesNames = {
        	    "User Registration",
        	    "Multiple Profiles",
        	    "Watch Multiple Shows",
        	    "Maturity Levels",
        	    "My List",
        	    "Rating Shows",
        	    "Turn off autoplay",
        	    "Skip Introductions"
        	};

        String[] FeaturesContents = {
        	    "Even the user registration of Netflix stands up to its name. It comes in a classy red color with the beautiful logo animation of Netflix. The user registration process is kept really easy.",
        	    "One Netflix account can have multiple profiles in it so that all users can have a personalized experience. Netflix also offers cool avatars that the users can select for their profile.",
        	    "Netflix’s account can be used on various devices and therefore you can watch different shows or movies at different devices. The shows will continue from where you left.",
        	    "While making profiles in Netflix, the user can set the maturity level of the profile so that shows and movies that fall under that category are only shown in that profile. Useful for kids.",
        	    "In Netflix, you can find and add as many shows and movies as you would like to watch later in your “My List”. A separate category of “My List” is offered for quick access.",
        	    "If you like a show or movie, you can like it and you can dislike it if you do not like it. Netflix will take that into consideration and will suggest you based on your likes/dislikes.",
        	    "If you do not want to binge watch the show and if you simply want to watch one or two episodes and you do not want Netflix to start the other episode, you can turn autoplay off.",
        	    "Watching the recap of the previous episode or watching the theme song of the show again and again can be quite frustrating, however, with Netflix’s skip button, you can skip them accurately."
        	};
        	
        String[] FeaturesImages = {
        		"//img[@alt='1 User Registration']",
        		"//img[@alt='2 Multiple Profiles']",
        		"//img[@alt='3 Watch Multiple Shows']",
        		"//img[@alt='4 Maturity Levels']",
        		"//img[@alt='5 My List']",
        		"//img[@alt='6 Rating Shows']",
        		"//img[@alt='7 Turn off autoplay']",
        		"//img[@alt='8 Skip Introductions']"
            };
        
        validateElements(driver, FeaturesNames, FeaturesContents, FeaturesImages, "Features");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='When did Netflix Games Launched?']");
        
        // Netflix Games Launch Section
        
        printSectionHeader("Netflix Games Launch Section");
        
        validateTitle(driver, "//h2[normalize-space()='When did Netflix Games Launched?']", "When did Netflix Games Launched?", "Title");
        validateTitle(driver, "//div[contains(text(),'Netflix Games observed a worldwide launch on Tuesday')]", "Netflix Games observed a worldwide launch on Tuesday, 2nd November.The first release is only for the Android users, however, the iOS users will be able to download and play the games in just a few months.", "Content");
        
        validateTitle(driver, "//h2[normalize-space()='Hire Video Streaming App Developers!']", "Hire Video Streaming App Developers!", "Text");
        validateTitle(driver, "//div[contains(text(),'We are providing a free consultation for video')]", "We are providing a free consultation for video streaming app gamification development services.", "Content");
        
        validateLink(driver, "//a[contains(@class,'elementor-button elementor-button-link elementor-size-md')]", "https://www.capermint.com/contact/", "Contact Us Button");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Why has Netflix added Games?']");
        
        // Netflix added Games Section
        
        printSectionHeader("Netflix added Games Section");
        
        validateTitle(driver, "//h2[normalize-space()='Why has Netflix added Games?']", "Why has Netflix added Games?", "Main Title");
        
        validateTitle(driver, "//h3[normalize-space()='To expand their services']", "To expand their services", "Title 1");
        validateTitle(driver, "//p[contains(text(),'Giants like Apple provide a wide range of services')]", "Giants like Apple provide a wide range of services like Apple Music , Apple TV +, Apple Arcade Games, and so on. Netflix has launched Netflix games to expand the Netflix universe and to add more entertainment sources on their platform.", "Content 1");
        
        validateTitle(driver, "//h3[normalize-space()='To be ahead of the competition']", "To be ahead of the competition", "Title 2");
        validateTitle(driver, "//p[contains(text(),'Netflix had marked a big move that no other direct')]", "Netflix had marked a big move that no other direct competition of Netflix (Disney+, HBO MAX, Hulu) had even thought of. Netflix has crossed the barrier of just being a video service app, and they have launched Netflix exclusive games after hiring former Electronic Arts Inc. and Facebook Inc. executive Mike Verdu to lead the effort.", "Content 2");
        
        validateTitle(driver, "//h3[normalize-space()='To attract more users']", "To attract more users", "Title 3");
        validateTitle(driver, "//p[contains(text(),'Netflix plan is to launch various mobile games in ')]", "Netflix plan is to launch various mobile games in the next year. As Netflix has copyrights of so many shows, they can develop a ton of games inspired by shows. On the brighter side, the users can also enjoy the game along with watching the show. Imagine watching the Squid game, and then playing the game on your mobile device while you wait for the second season of the show.As the users that have a Netflix subscription can only enjoy Netflix games, this will attract a lot of gaming users for Netflix.", "Content 3");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='What does Netflix offer in the Gaming Service?']");
        
        // What does Netflix offer Section
        
        printSectionHeader("What does Netflix offer Section");
        
        validateTitle(driver, "//h2[normalize-space()='What does Netflix offer in the Gaming Service?']", "What does Netflix offer in the Gaming Service?", "Title");
        validateTitle(driver, "//div[contains(text(),'Here are all the details of the revolutionary Netflix gaming')]", "Here are all the details of the revolutionary Netflix gaming", "Text");
        
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}
