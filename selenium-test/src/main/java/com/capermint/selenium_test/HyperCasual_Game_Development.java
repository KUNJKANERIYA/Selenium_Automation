package com.capermint.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperCasual_Game_Development extends CommanMathods{
	
	public HyperCasual_Game_Development(WebDriver driver) {	
		super(driver);			
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    try {
        driver.get("https://www.capermint.com/hyper-casual-game-development/");
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
        
        checkBackgroundImage(driver, "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-ce83adf elementor-section-boxed elementor-section-height-default elementor-section-height-default exad-glass-effect-no exad-sticky-section-no']");
        
        validateTitle(driver, "//h1[normalize-space()='Hyper Casual Game Development Company']", "Hyper Casual Game Development Company", "Title");
        validateTitle(driver, "//h2[normalize-space()='Best Hyper Casual Mobile Game Developers']", "Best Hyper Casual Mobile Game Developers", "Text");
        validateTitle(driver, "//p[contains(.,'Craft engaging and captivating games with our trusted')]", "Craft engaging and captivating games with our trusted hyper casual game development services. Push the limits of unforgettable gameplay and deliver an exceptional gaming experience that stands out in the industry.", "Content");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]", "https://www.capermint.com/contact/", "Free Quote Button");
        
        String[] Images = {
        		"//img[@alt='expert-uno']",
        		"//img[@class='attachment-full size-full wp-image-104108']",
        		"//img[@alt='certified-dev']",
        		"//img[@alt='customizable-uno']"
        };
        
        checkMultipleImagesVisibility(driver, Images);
        
        validateTitle(driver, "//span[normalize-space()='Certified Developers']", "Certified Developers", "Text 1");
        validateTitle(driver, "//span[normalize-space()='Client Satisfaction']", "Client Satisfaction", "Text 2");
        validateTitle(driver, "//span[normalize-space()='NDA Signed']", "NDA Signed", "Text 3");
        validateTitle(driver, "//span[normalize-space()='Proactive Approach']", "Proactive Approach", "Text 4");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Top Hyper Casual Game Developers']");
        
        // Top Hyper Casual Game Developers Section
        
        printSectionHeader("Top Hyper Casual Game Developers Section");
        
        validateTitle(driver, "//h2[normalize-space()='Top Hyper Casual Game Developers']", "Top Hyper Casual Game Developers", "Title");
        validateTitle(driver, "//span[contains(text(),'We are known for developing the best Hyper Casual ')]", "We are known for developing the best Hyper Casual Mobile Games in the gaming industry. Our expert developers are specialized in developing addictive games that engage players globally.", "Content 1");
        validateTitle(driver, "//span[contains(text(),'Our team is dedicated to game development and we b')]", "Our team is dedicated to game development and we bring your gaming ideas into reality. We offer customized hyper casual game solutions to our clients. If you have a new idea for your next game then talk with our expert developers and start your gaming business with us. ", "Content 2");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]", "https://www.capermint.com/games-portfolio/", "Explore our games Button");
        checkImageVisibility(driver, "//img[@alt='expert_casual']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Hyper Casual Game Development Services']");
        
        // Game Development Services Section
        
        printSectionHeader("Game Development Services Section");
        
        validateTitle(driver, "//h2[normalize-space()='Hyper Casual Game Development Services']", "Hyper Casual Game Development Services", "Title");
        validateTitle(driver, "//span[contains(text(),'Capermint is a leading hyper casual game design an')]", "Capermint is a leading hyper casual game design and development company in the USA. We specialize in developing games that are quick and easy to play with high graphics that provide the best gaming experience to the user. Our hyper casual game development service is designed to be easily enjoyed by a wide range of players. Check out the below services for hyper casual mobile games:- ", "Content");
        
        checkImageVisibility(driver, "//img[@alt='casual-icon']");
        
        String[] ServiceNames = {
        		"One-stop shop for Hyper casual games",
        		"Hyper Casual Game Conceptualization",
        		"Hyper-Casual Game Design",
        		"Game Prototyping",
        		"Testing & Quality Assurance",
        		"Regular Updates"
        };
        
        String[] ServiceContents = {
        		"Capermint Technologies is a one-stop shop for all your hyper casual game design requirements. We guide you through every step from brainstorming to development & launch. Our expert team ensures a seamless process and delivers a game that engages the players.",
        		"Bring your game ideas to life with our hyper casual game conceptualization services. We create unique and engaging concepts that capture players' interest and stand out. Our team designs fresh & exciting gameplay experiences.",
        		"Let our designers craft engaging hyper-casual game designs with standout characters and immersive environments. We focus on creating visually appealing experiences that are intuitive and addictive.",
        		"Experience your game’s possibilities with our dynamic prototyping services. We quickly create interactive models to test and enhance gameplay ideas. Our team ensures each element is optimized before full development begins.",
        		"Ensure your game runs smoothly with our Testing & Quality Assurance services. We check every part of your game to find and fix any issues. This ensures a seamless and enjoyable experience for players.",
        		"Keep your hyper-casual game engaging with our Regular Updates service. We offer ongoing enhancements and quick fixes to ensure your game remains fresh, fun, and fully optimized for players."
        };
        
        String[] ServiceImages = {
        		"//img[@class='attachment-full size-full wp-image-105700']",
        		"//img[@alt='game-concep']",
        		"//img[@alt='hyper-casual-game']",
        		"//img[@alt='game-prototyping']",
        		"//img[@alt='testing-quality']",
        		"//img[@alt='Regular']"
        };
        
        validateElements(driver, ServiceNames, ServiceContents, ServiceImages, "Services");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[contains(text(),'Explore Our Expertise in Hyper Casual Game Develop')]");
        
        // Explore Section
        
        printSectionHeader("Explore Section");
        
        validateTitle(driver, "//h2[contains(text(),'Explore Our Expertise in Hyper Casual Game Develop')]", "Explore Our Expertise in Hyper Casual Game Development", "Text");
        validateTitle(driver, "//p[contains(text(),'Discover how our tailored solutions can elevate yo')]", "Discover how our tailored solutions can elevate your game concept into a market-leading hyper casual sensation. Partner with Capermint Technologies today to turn your vision into reality and engage players worldwide.", "Content");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]", "https://www.capermint.com/contact/", "Free Quote Button");
        
        checkImageVisibility(driver, "//img[@alt='casual_game_our']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Types of Hyper Casual Gameplay Mechanics']");
        
        // Gameplay Mechanics Section
        
        printSectionHeader("Gameplay Mechanics Section");
        
        validateTitle(driver, "//h2[normalize-space()='Types of Hyper Casual Gameplay Mechanics']", "Types of Hyper Casual Gameplay Mechanics", "Title");
        
        String[] MechanicsNames = {
        	    "Rise/Fall",
        	    "Tap/Timing",
        	    "Dexterity",
        	    "Merging",
        	    "Stacking",
        	    "Turning",
        	    "Growing",
        	    "Swerving",
        	    "Idle Mechanics",
        	    "Resizing",
        	    "Pushing",
        	    "Puzzle"
        	};
        
        String[] MechanicsContent = {
        	    "Control objects that rise and fall with simple taps. Master the timing to navigate through obstacles.",
        	    "Tap at the perfect moment to succeed. Balance precision and timing to achieve your goals.",
        	    "Challenge your coordination and reflexes with fast-paced actions. Quick, precise movements are key.",
        	    "Combine items to create new, upgraded objects. Unlock features and advance through levels.",
        	    "Build structures by stacking objects carefully. Balance stability and height to reach new levels.",
        	    "Rotate objects to solve puzzles or navigate paths. Adapt to dynamic challenges with precise turns.",
        	    "Manage objects as they grow. Adjust your strategy based on their changing size and function.",
        	    "Steer objects to avoid obstacles or navigate tight spaces. Agile movements are essential.",
        	    "Progress and earn rewards even when you’re not playing. Keep your game advancing while you’re away.",
        	    "Adjust object sizes to fit them into spaces or solve puzzles. Add strategy with resizing challenges.",
        	    "Move objects to clear paths or solve problems. Use strategic pushing to overcome obstacles.",
        	    "Solve puzzles that test your logic and creativity. Enjoy satisfying problem-solving experiences."
        	};
        
        validateElements(driver, MechanicsNames, MechanicsContent, null, "Mechanics");
        
        String[] MechanicsImages = {
        	    "(//div[@class='elementor-widget-container'])[27]",
        	    "(//div[@class='elementor-widget-container'])[28]",
        	    "(//div[@class='elementor-widget-container'])[29]",
        	    "(//div[@class='elementor-widget-container'])[30]",
        	    "(//div[@class='elementor-widget-container'])[31]",
        	    "(//div[@class='elementor-widget-container'])[32]",
        	    "(//div[@class='elementor-widget-container'])[33]",
        	    "(//div[@class='elementor-widget-container'])[34]",
        	    "(//div[@class='elementor-widget-container'])[35]",
        	    "(//div[@class='elementor-widget-container'])[36]",
        	    "(//div[@class='elementor-widget-container'])[37]",
        	    "(//div[@class='elementor-widget-container'])[38]"
        	};
        
        checkMultipleBackgroundImages(driver, MechanicsImages);
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//span[normalize-space()='We develop chart-topping hits']");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//span[normalize-space()='We develop chart-topping hits']", "We develop chart-topping hits", "Title");
        validateTitle(driver, "//p[contains(text(),'We produce games that are designed to become viral')]", "We produce games that are designed to become viral hits, capturing the attention of a global audience. Our hyper casual games consistently reach the top of the charts with engaging and fun mechanics.", "Content");
        checkImageVisibility(driver, "//img[@alt='chart-topping']");

        // Page Scrolling
        
        scrollToElementByXpath(driver, "//span[normalize-space()='Creating Fun and Unique Games']");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//span[normalize-space()='Creating Fun and Unique Games']", "Creating Fun and Unique Games", "Title");
        validateTitle(driver, "//p[contains(text(),'We develop unique gameplay mechanics that keep pla')]", "We develop unique gameplay mechanics that keep players coming back. Our team works hard to create simple, fun, and engaging games that stand out in the crowded market of hyper-casual games.", "Content");
        checkImageVisibility(driver, "//img[@class='attachment-medium_large size-medium_large wp-image-106494']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//span[normalize-space()='Games Built for Maximum Enjoyment']");
        
        // New Section
        
        printSectionHeader("New Section");
        
        validateTitle(driver, "//span[normalize-space()='Games Built for Maximum Enjoyment']", "", "Tilte");
        validateTitle(driver, "//p[contains(text(),'We focus on what players love. Our games are desig')]", "We focus on what players love. Our games are designed to be easy to pick up and hard to put down, ensuring a fun experience for everyone. We use feedback and data to continually improve our games.", "Content");
        validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[4]", "https://www.capermint.com/contact/", "Get a free quote Button");
        checkImageVisibility(driver, "//img[@class='attachment-medium_large size-medium_large wp-image-106499']");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Hyper Casual Game for Various Platforms']");
        
        // Hyper Casual Game for Various Platforms Section
        
        printSectionHeader("Hyper Casual Game for Various Platforms Section");
        
        validateTitle(driver, "//h2[normalize-space()='Hyper Casual Game for Various Platforms']", "Hyper Casual Game for Various Platforms", "Text");
        validateTitle(driver, "//p[contains(text(),'Expand your game’s reach across multiple platforms')]", "Expand your game’s reach across multiple platforms with Capermint Technologies. Our Hyper Casual Game Developers offer development services for games that are optimized for seamless performance and maximum engagement on all platforms.", "Content");
        
        checkImageVisibility(driver, "//img[@alt='various_game']");
        
        String[] PlatformNames = {
        		"Mobile",
        		"PC",
        		"Console",
        		"AR/VR"
        };
        
        String[] PlatformImages = {
        		"//img[@alt='hyper_mobile']",
        		"//img[@alt='hyper_PC']",
        		"//img[@alt='hyper_console']",
        		"//img[@alt='hyper_ar_vr']"
        };
        
        validateElements(driver, PlatformNames, null, PlatformImages, "Platform");
        
        // Page Scrolling
        
        scrollToElementByXpath(driver, "//h2[normalize-space()='Why Choose for Hyper Casual Game Development?']");
        
        // Why Choose Section
        
        printSectionHeader("Why Choose Section");
        
        validateTitle(driver, "//h2[normalize-space()='Why Choose for Hyper Casual Game Development?']", "Why Choose for Hyper Casual Game Development?", "Title");
        checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-106037']");
        
        String[] ReasonNames = {
        		"Hyper casual games offer streamlined development and production.",
        		"They are budget-friendly and cost-effective.",
        		"Free-to-play models attract a larger player base.",
        		"These games possess mass-market appeal.",
        		"Millions of downloads are within reach.",
        		"Enhanced situational awareness for players.",
        		"Refined hand-eye coordination for players.",
        		"Boost social interaction skills."
        };
        
        String[] CommanImages = {
        		"(//img[@alt='hyper-icon'])[1]",
        		"(//img[@alt='hyper-icon'])[2]",
        		"(//img[@alt='hyper-icon'])[3]",
        		"(//img[@alt='hyper-icon'])[4]",
        		"(//img[@alt='hyper-icon'])[5]",
        		"(//img[@alt='hyper-icon'])[6]",
        		"(//img[@alt='hyper-icon'])[7]",
        		"(//img[@alt='hyper-icon'])[8]"
        };
        
        validateElements(driver, ReasonNames, null, CommanImages, "ReasonList");
        
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    } finally {
        driver.quit();
    }
    }
	}