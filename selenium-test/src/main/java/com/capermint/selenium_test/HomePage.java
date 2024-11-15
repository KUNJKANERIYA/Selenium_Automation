package com.capermint.selenium_test;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage extends CommanMathods{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        try {
        driver.get("https://www.capermint.com");
        Thread.sleep(15000);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Drift Widget Chat Controller']")));
        driver.findElement(By.cssSelector(".drift-widget-controller-icon.circle")).click();  
        driver.switchTo().defaultContent();
        
//        Test Header Menu
        
        WebElement CompanyLogo = driver.findElement(By.xpath("(//a[@class='full-block-link'])[2]"));
        checkImageVisibility(CompanyLogo);
        
//        Checking all the menu hover Effect
        
        Actions hoverActions = new Actions(driver);
        
        WebElement WhyCapermint = driver.findElement(By.xpath("(//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only'])[1]"));
        hoverActions.moveToElement(WhyCapermint).perform();
        Thread.sleep(2000);
        
        WebElement Gamification = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/gamification/']"));
        hoverActions.moveToElement(Gamification).perform();
        Thread.sleep(2000);
        
        WebElement EnterpriseGaming = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/customized-gaming-solutions/']"));
        hoverActions.moveToElement(EnterpriseGaming).perform();
        Thread.sleep(2000);
        
        WebElement Services = driver.findElement(By.xpath("(//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only'])[4]"));
        hoverActions.moveToElement(Services).perform();
        Thread.sleep(2000);
        
        WebElement Outstaffing = driver.findElement(By.xpath("(//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only'])[81]"));
        hoverActions.moveToElement(Outstaffing).perform();
        Thread.sleep(2000);
        
        WebElement OurWork = driver.findElement(By.xpath("(//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only'])[82]"));
        hoverActions.moveToElement(OurWork).perform();
        Thread.sleep(2000);
        
        WebElement Resources = driver.findElement(By.xpath("(//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only'])[83]"));
        hoverActions.moveToElement(Resources).perform();
        Thread.sleep(2000);
        
        String InquiryButton = driver.findElement(By.xpath("//a[normalize-space()='INQUIRE NOW']")).getAttribute("href");
        System.out.println(InquiryButton.equals("https://www.capermint.com/contact/") ? "InquiryButton is correct" : "InquiryButton is incorrect");

//        WebElement elementToHover = driver.findElement(By.xpath("//a[normalize-space()='Turn Your Idea Into Reality!']"));
//        Thread.sleep(5000);
//        
//        Actions actions = new Actions(driver);
//        actions.moveToElement(elementToHover).perform();
//        Thread.sleep(2000);
//        
//        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cp-close-btn cp-callback-widget__close-btn cp-close-btn--mobile-friendly']")));
//        closeButton.click();        
//        Thread.sleep(2000);
//               
//        WebElement Callclosebutton = driver.findElement(By.xpath("(//button[@class='cp-close-btn cp-tooltip__close-btn cp-close-btn--round cp-close-btn--offset cp-close-btn--mobile-friendly'])[1]"));
//        Callclosebutton.click();        
//        Thread.sleep(2000);

//        Page Title Section
        
        validateTitle(driver, "//h1[contains(text(),'We grow your')]", "We grow your", "Header text");
        
        boolean isLinkPresent = driver.findElements(By.xpath("//a[text()='Turn Your Idea Into Reality!']")).size() > 0;
        System.out.println(isLinkPresent ? "Link is present." : "Link is not present.");

        String linkHref = driver.findElement(By.xpath("//a[text()='Turn Your Idea Into Reality!']")).getAttribute("href");
        System.out.println(linkHref.equals("https://www.capermint.com/contact/") ? "Link href is correct." : "Link href is incorrect.");

        String buttonColor = driver.findElement(By.xpath("//a[text()='Turn Your Idea Into Reality!']")).getCssValue("background-color");
        System.out.println(buttonColor.equals("rgba(17, 17, 17, 1)") ? "Button color is correct." : "Button color is incorrect.");
        
//        Page Scroll
        
        WebElement Scroll1 = driver.findElement(By.xpath("(//img[@alt='App Development'])[2]"));
        JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
        scroll1.executeScript("arguments[0].scrollIntoView(true);", Scroll1);
    
        WebElement contentTitle = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-cba1f52 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-text-editor']"));
        String ActualText1 = contentTitle.getText();
        System.out.println(ActualText1.equals("The Next Level of AI Enterprise Agency") ? "contentTitle text is correct." : "contentTitle text is incorrect.");
        
        WebElement contentText = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-cae9445 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-heading']"));
        String ActualText2 = contentText.getText();
        System.out.println(ActualText2.equals("Leading App & Game Development Company") ? "contentText is correct." : "contentText is incorrect.");
        
        WebElement content1 = driver.findElement(By.xpath("//p[contains(text(),'Capermint Technologies is your trusted partner in ')]"));
        String Actualcontent1 = content1.getText();
        System.out.println(Actualcontent1.equals("Capermint Technologies is your trusted partner in turning ideas into powerful digital products. Whether you’re a startup or an established enterprise, we help you bring your vision to life by designing and developing top-tier apps and games that captivate users and deliver exceptional experiences.") ? "content1 text is correct." : "content1 text is incorrect.");
        
        WebElement content2 = driver.findElement(By.xpath("//p[contains(text(),'We don’t just build apps and games; we create expe')]"));
        String Actualcontent2 = content2.getText();
        System.out.println(Actualcontent2.equals("We don’t just build apps and games; we create experiences that resonate with your audience and drive your business forward. Let us help you turn your vision into a reality with our comprehensive, user-centric approach to development.") ? "content2 text is correct." : "content2 text is incorrect.");
        
//        All Images Section
        
        WebElement Image1 = driver.findElement(By.xpath("(//img[@alt='App Development'])[2]"));
        WebElement Image2 = driver.findElement(By.xpath("(//img[@alt='ISO'])[2]"));
        WebElement Image3 = driver.findElement(By.xpath("(//img[@alt='itfirms app'])[2]"));
        WebElement Image4 = driver.findElement(By.xpath("(//img[@alt='top-app-developers-2022'])[2]"));
        WebElement Image5 = driver.findElement(By.xpath("(//img[@alt='nsw logo'])[2]"));
        WebElement Image6 = driver.findElement(By.xpath("(//img[@alt='Goodfirms'])[2]"));
        WebElement Image7 = driver.findElement(By.xpath("(//img[@alt='clutch-logo'])[2]"));
        WebElement Image8 = driver.findElement(By.xpath("(//img[@alt='igda'])[2]"));
        WebElement Image9 = driver.findElement(By.xpath("(//img[@alt='appfutura'])[2]"));

        checkImageVisibility(Image1);
        checkImageVisibility(Image2);
        checkImageVisibility(Image3);
        checkImageVisibility(Image4);
        checkImageVisibility(Image5);
        checkImageVisibility(Image6);
        checkImageVisibility(Image7);
        checkImageVisibility(Image8);
        checkImageVisibility(Image9);
        
//        Page Scroll
        
        WebElement Scroll2 = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[5]"));
        JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
        scroll2.executeScript("arguments[0].scrollIntoView(true);", Scroll2);
        
//        New Div Section
        
        String LatestLaunchText = driver.findElement(By.xpath("//span[normalize-space()='Our Latest Launches For']")).getText();
        System.out.println(LatestLaunchText.equals("Our Latest Launches For") ? "Header text is correct." : "Header text is incorrect.");
        
        WebElement Logo = driver.findElement(By.xpath("//img[@alt='Meta_Quest_logo']"));
        checkImageVisibility(Logo);
        
        WebElement MetaQuest = driver.findElement(By.xpath("//img[@alt='Meta-Quest']"));
        checkImageVisibility(MetaQuest);
        
//        Meta Game 1
        
        WebElement GameImage1 = driver.findElement(By.xpath("//img[@alt='STFR logo']"));
        checkImageVisibility(GameImage1);
        
        String GameText1 = driver.findElement(By.xpath("//span[normalize-space()='Sightline: The Firing Range']")).getText();
        System.out.println(GameText1.equals("SIGHTLINE: THE FIRING RANGE") ? "GameImage1 Text is correct." : "GameImage1 Text is incorrect.");       
        
        boolean Gamelink1 = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]")).size() > 0;
        System.out.println(Gamelink1 ? "Link is present." : "Link is not present.");
        
        String Gamelink1Href = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]")).getAttribute("href");
        System.out.println(Gamelink1Href.equals("https://www.meta.com/en-gb/experiences/7422825877805832/") ? "Link href is correct." : "Link href is incorrect.");
        
//        Meta Game 2
        
        WebElement GameImage2 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-102226']"));
        checkImageVisibility(GameImage2);
        
        String GameText2 = driver.findElement(By.xpath("//span[normalize-space()='Vintage Dinosaur Museum']")).getText();
        System.out.println(GameText2.equals("VINTAGE DINOSAUR MUSEUM") ? "GameImage1 Text is correct." : "GameImage1 Text is incorrect.");       
        
        boolean Gamelink2 = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]")).size() > 0;
        System.out.println(Gamelink2 ? "Link is present." : "Link is not present.");
        
        String Gamelink2Href = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]")).getAttribute("href");
        System.out.println(Gamelink2Href.equals("https://www.meta.com/en-gb/experiences/25371052729205620/") ? "Link href is correct." : "Link href is incorrect.");
                
//        Meta Game 3
        
        WebElement GameImage3 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-107538']"));
        checkImageVisibility(GameImage3);
        
        String GameText3 = driver.findElement(By.xpath("//span[normalize-space()='Escape morgue']")).getText();
        System.out.println(GameText3.equals("ESCAPE MORGUE") ? "GameImage1 Text is correct." : "GameImage1 Text is incorrect.");       
        
        boolean Gamelink3 = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]")).size() > 0;
        System.out.println(Gamelink3 ? "Link is present." : "Link is not present.");
        
        String Gamelink3Href = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]")).getAttribute("href");
        System.out.println(Gamelink3Href.equals("https://www.meta.com/en-gb/experiences/7525110784263586/") ? "Link href is correct." : "Link href is incorrect.");
                
//        Meta Game 4
        
        WebElement GameImage4 = driver.findElement(By.xpath("//img[@alt='SA 1']"));
        checkImageVisibility(GameImage4);
        
        String GameText4 = driver.findElement(By.xpath("//span[normalize-space()='Stone Age']")).getText();
        System.out.println(GameText4.equals("STONE AGE") ? "GameImage1 Text is correct." : "GameImage1 Text is incorrect.");       
        
        boolean Gamelink4 = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[4]")).size() > 0;
        System.out.println(Gamelink4 ? "Link is present." : "Link is not present.");
        
        String Gamelink4Href = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[4]")).getAttribute("href");
        System.out.println(Gamelink4Href.equals("https://www.meta.com/en-gb/experiences/25817381664573173/") ? "Link href is correct." : "Link href is incorrect.");
                
//        Meta Game 5
        
        WebElement GameImage5 = driver.findElement(By.xpath("//img[@alt='VF']"));
        checkImageVisibility(GameImage5);
        
        String gameText5 = driver.findElement(By.xpath("(//span[normalize-space()='Virtual Fitness Gym'])")).getText();
        System.out.println(gameText5.equals("VIRTUAL FITNESS GYM") ? "GameText5 is correct." : "GameText5 is incorrect.");       
        
        boolean Gamelink5 = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[5]")).size() > 0;
        System.out.println(Gamelink5 ? "Link is present." : "Link is not present.");
        
        String Gamelink5Href = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[5]")).getAttribute("href");
        System.out.println(Gamelink5Href.equals("https://www.meta.com/en-gb/experiences/8248598078520406/") ? "Link href is correct." : "Link href is incorrect.");
        
//        New Div
        
        WebElement ControllerImage = driver.findElement(By.xpath("//img[@alt='Touch-Plus']"));
        checkImageVisibility(ControllerImage);
        
        String TitleText = driver.findElement(By.xpath("//span[normalize-space()='Explore our Meta Quest Games Collection']")).getText();
        System.out.println(TitleText.equals("Explore our Meta Quest Games Collection") ? "TitleText Text is correct." : "TitleText Text is incorrect.");
        
        String Text = driver.findElement(By.xpath("//p[contains(text(),'Experience Capermint’s Official Meta Quest titles.')]")).getText();
        System.out.println(Text.equals("Experience Capermint’s Official Meta Quest titles. From intense shooting simulations to immersive dinosaur adventures and spine-chilling horror experiences, Capermint Technologies brings you a diverse range of VR games. Take a look at our catalog and discover your next favorite game.") ? "Text Text is correct." : "Text Text is incorrect.");
        
        boolean Trylink = driver.findElements(By.xpath("//span[contains(text(),'Try Our Meta Games Now!')]")).size() > 0;
        System.out.println(Trylink ? "Link is present." : "Link is not present.");
        
        String TrylinkHref = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/meta/']")).getAttribute("href");
        System.out.println(TrylinkHref.equals("https://www.capermint.com/meta/") ? "Link href is correct." : "Link href is incorrect.");
        
//        Page Scrolling
        
        WebElement ScrollToYouTubeVideo = driver.findElement(By.xpath("(//iframe[@title='Metacrick Trailer - Meta VR Simulation Trailer - Play, Practice & learn Cricket Virtually'])[1]"));
        JavascriptExecutor ScrollToVideo = (JavascriptExecutor) driver;
        ScrollToVideo.executeScript("arguments[0].scrollIntoView(true);", ScrollToYouTubeVideo);
        Thread.sleep(2000);
        
//      YouTube video section.

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='widget2']")));

        WebDriverWait waitforYTvideoplay = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement playButton = waitforYTvideoplay.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ytp-large-play-button")));

        playButton.click();
        Thread.sleep(5000);
        
        JavascriptExecutor YTpause = (JavascriptExecutor) driver;
        YTpause.executeScript("document.querySelector('.ytp-play-button').click();");    
        Thread.sleep(5000);
        
        driver.switchTo().defaultContent();
    
        Thread.sleep(5000);
                
//        Page Scrolling
        
        WebElement Scroll3 = driver.findElement(By.xpath("//p[contains(text(),'Capermint Technologies provides a wide range of Ap')]"));
        JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
        scroll3.executeScript("arguments[0].scrollIntoView(true);", Scroll3);
        
//        Our Services
        
        String ServicesTitle = driver.findElement(By.xpath("//span[normalize-space()='Our Services']")).getText();
        System.out.println(ServicesTitle.equals("Our Services") ? "ServicesTitle is correct." : "ServicesTitle is incorrect.");
        
        String ServicesText = driver.findElement(By.xpath("//p[contains(text(),'Capermint Technologies provides a wide range of Ap')]")).getText();
        System.out.println(ServicesText.equals("Capermint Technologies provides a wide range of App & Game Development Services at optimal cost to help you accomplish your goals. Here’s a list of our services that we offer.") ? "ServicesText is correct." : "ServicesText is incorrect.");
        
//        Wait Function
        
        WebElement WaitElement = driver.findElement(By.xpath("//li[@id='aiml']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (true) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(WaitElement));
                WaitElement.click();
                break;
            } catch (Exception e) {
                js.executeScript("window.scrollBy(0, 100);");
                Thread.sleep(1000);
            }
        }       
        
//        Gamification Section
        
        WebElement gamificationtbutton = driver.findElement(By.xpath("//li[@id='gamification']"));
        gamificationtbutton.click();
        
        Thread.sleep(2000);

        String gamificationTitle = driver.findElement(By.xpath("//h3[normalize-space()='Gamification']")).getText();
        System.out.println(gamificationTitle.equals("Gamification") ? "gamificationTitle is correct." : "gamificationTitle is incorrect.");
        
        String gamificationText = driver.findElement(By.xpath("//p[contains(text(),'Supercharge engagement with playful experiences. M')]")).getText();
        System.out.println(gamificationText.equals("Supercharge engagement with playful experiences. Motivate users, boost loyalty, and drive results through custom gamification solutions for any industry.") ? "gamificationText is correct." : "gamificationText is incorrect.");
        
//        Game Development Section
               
        WebElement gamedevelopmentbutton = driver.findElement(By.xpath("//li[@id='game-development']"));
        gamedevelopmentbutton.click();
        
        Thread.sleep(2000);
        
        String gamedevelopmentTitle = driver.findElement(By.xpath("//h3[normalize-space()='Game Development']")).getText();
        System.out.println(gamedevelopmentTitle.equals("Game Development") ? "gamedevelopmentTitle is correct." : "gamedevelopmentTitle is incorrect.");
        
        String gamedevelopmentText = driver.findElement(By.xpath("//p[contains(text(),'Craft captivating games across all platforms. Brin')]")).getText();
        System.out.println(gamedevelopmentText.equals("Craft captivating games across all platforms. Bring your vision to life, from engaging mobile experiences to immersive PC and console titles.") ? "gamedevelopmentText is correct." : "gamedevelopmentText is incorrect.");
                
//        App Development Section
        
        WebElement appdevelopmetButton = driver.findElement(By.xpath("//li[@id='app-development']"));
        appdevelopmetButton.click();
        
        Thread.sleep(2000);
        
        String appdevelopmentTitle = driver.findElement(By.xpath("//h3[normalize-space()='App Development']")).getText();
        System.out.println(appdevelopmentTitle.equals("App Development") ? "appdevelopmentTitle is correct." : "appdevelopmentTitle is incorrect.");
        
        String appdevelopmentText = driver.findElement(By.xpath("//p[contains(text(),'Transform your ideas into intuitive apps. We build')]")).getText();
        System.out.println(appdevelopmentText.equals("Transform your ideas into intuitive apps. We build exceptional mobile, web, and AR/VR apps that enhance your brand and engage your audience.") ? "appdevelopmentText is correct." : "appdevelopmentText is incorrect.");
        
//        Casino & Fantasy Apps Section

        WebElement CasinoandFantacyButton = driver.findElement(By.xpath("//li[@id='casino-fantasy-apps']"));
        CasinoandFantacyButton.click();
        
        Thread.sleep(2000);
        
        String CasinoandFantacyTitle = driver.findElement(By.xpath("//h3[normalize-space()='Casino & Fantasy Apps']")).getText();
        System.out.println(CasinoandFantacyTitle.equals("Casino & Fantasy Apps") ? "CasinoandFantacyTitle is correct." : "CasinoandFantacyTitle is incorrect.");
        
        String CasinoandFantacyText = driver.findElement(By.xpath("//p[contains(text(),'Feel the thrill of competition. Develop engaging c')]")).getText();
        System.out.println(CasinoandFantacyText.equals("Feel the thrill of competition. Develop engaging casino-style games, fantasy sports apps, and more, catering to a diverse range of player interests.") ? "CasinoandFantacyText is correct." : "CasinoandFantacyText is incorrect.");
        
//        Design & Art Services Section
        
        WebElement DesignandArtButton = driver.findElement(By.xpath("//li[@id='design-art-services']"));
        DesignandArtButton.click();
        
        Thread.sleep(2000);
        
        String DesignandArtTitle = driver.findElement(By.xpath("//h3[normalize-space()='Design & Art Services']")).getText();
        System.out.println(DesignandArtTitle.equals("Design & Art Services") ? "DesignandArtTitle is correct." : "DesignandArtTitle is incorrect.");
        
        String DesignandArtText = driver.findElement(By.xpath("//p[contains(text(),'From concept to creation, we craft captivating vis')]")).getText();
        System.out.println(DesignandArtText.equals("From concept to creation, we craft captivating visuals. Our skilled artists create stunning mobile interfaces, captivating characters, and immersive game worlds.") ? "DesignandArtText is correct." : "DesignandArtText is incorrect.");
        
//        Virtual Games Section
        
        WebElement virtualgamesButton = driver.findElement(By.xpath("//li[@id='virtual-games']"));
        virtualgamesButton.click();
        
        Thread.sleep(2000);
        
        String virtualgamesTitle = driver.findElement(By.xpath("//h3[normalize-space()='Virtual Games']")).getText();
        System.out.println(virtualgamesTitle.equals("Virtual Games") ? "virtualgamesTitle is correct." : "virtualgamesTitle is incorrect.");
        
        String virtualgamesText = driver.findElement(By.xpath("//p[contains(text(),'Push the boundaries of gaming. We develop cutting-')]")).getText();
        System.out.println(virtualgamesText.equals("Push the boundaries of gaming. We develop cutting-edge AR/VR/MR games, alongside NFT, Web3, and Metaverse experiences, for the future of interactive entertainment.") ? "virtualgamesText is correct." : "virtualgamesText is incorrect.");
        
//        Artificial Intelligence/Machine Learning
        
        WebElement AIMLButton = driver.findElement(By.xpath("//li[@id='aiml']"));
        AIMLButton.click();
        
        Thread.sleep(2000);
        
        String AIMILTitle = driver.findElement(By.xpath("//h3[normalize-space()='Artificial Intelligence/Machine Learning']")).getText();
        System.out.println(AIMILTitle.equals("Artificial Intelligence/Machine Learning") ? "AIMILTitle is correct." : "AIMILTitle is incorrect.");
        
        String AIMLText = driver.findElement(By.xpath("//p[contains(text(),'Make the most of next-gen technologies. We integra')]")).getText();
        System.out.println(AIMLText.equals("Make the most of next-gen technologies. We integrate AI and Machine Learning to create smarter, more efficient solutions for your business.") ? "AIMLText is correct." : "AIMLText is incorrect.");
        
//        Scrolling Page
        
        WebElement Scroll4 = driver.findElement(By.xpath("//h3[normalize-space()='Nintendo Games']"));
        JavascriptExecutor scroll4 = (JavascriptExecutor) driver;
        scroll4.executeScript("arguments[0].scrollIntoView(true);", Scroll4);
                
//        New Div Section
        
        String TitleText1 = driver.findElement(By.xpath("//div[contains(@class, 'elementor-element-f2b4dbe')]")).getText();
        System.out.println(TitleText1.equals("We've built game for these platforms") ? "TitleText1 is correct." : "TitleText1 is incorrect.");
        
        String NormalText1 = driver.findElement(By.xpath("(//div[@class='chat-line__body formatted_content'])[2]")).getText();
        System.out.println(NormalText1.equals("From native mobile to immersive realities, we craft cutting-edge applications for all platforms.") ? "NormalText1 is correct." : "NormalText1 is incorrect.");
        
//        Checking all 8 Images

        WebElement Img1 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88128'])[1]"));
        WebElement Img2 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88129'])[1]"));
        WebElement Img3 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88131'])[1]"));
        WebElement Img4 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88132'])[1]"));
        WebElement Img5 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88137']"));
        WebElement Img6 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88136']"));
        WebElement Img7 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88135']"));
        WebElement Img8 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88134']"));

        checkImageVisibility(Img1);
        checkImageVisibility(Img2);
        checkImageVisibility(Img3);
        checkImageVisibility(Img4);
        checkImageVisibility(Img5);
        checkImageVisibility(Img6);
        checkImageVisibility(Img7);
        checkImageVisibility(Img8);
        
//        Checking all the Image Text
        
        String Txt1 = driver.findElement(By.xpath("//h3[normalize-space()='Mobile Games']")).getText();
        System.out.println(Txt1.equals("Mobile Games") ? "Txt1 is correct." : "Txt1 is incorrect.");
        
        String Txt2 = driver.findElement(By.xpath("//h3[normalize-space()='PC Games']")).getText();
        System.out.println(Txt2.equals("PC Games") ? "Txt2 is correct." : "Txt2 is incorrect.");
        
        String Txt3 = driver.findElement(By.xpath("//h3[normalize-space()='VR Games']")).getText();
        System.out.println(Txt3.equals("VR Games") ? "Txt3 is correct." : "Txt3 is incorrect.");
        
        String Txt4 = driver.findElement(By.xpath("//h3[normalize-space()='Cloud Games']")).getText();
        System.out.println(Txt4.equals("Cloud Games") ? "Txt4 is correct." : "Txt4 is incorrect.");
        
        String Txt5 = driver.findElement(By.xpath("//h3[normalize-space()='Browser Games']")).getText();
        System.out.println(Txt5.equals("Browser Games") ? "Txt5 is correct." : "Txt5 is incorrect.");
        
        String Txt6 = driver.findElement(By.xpath("//h3[normalize-space()='Playstation Games']")).getText();
        System.out.println(Txt6.equals("Playstation Games") ? "Txt6 is correct." : "Txt6 is incorrect.");
        
        String Txt7 = driver.findElement(By.xpath("//h3[normalize-space()='Xbox Games']")).getText();
        System.out.println(Txt7.equals("Xbox Games") ? "Txt7 is correct." : "Txt7 is incorrect.");
        
        String Txt8 = driver.findElement(By.xpath("//h3[normalize-space()='Nintendo Games']")).getText();
        System.out.println(Txt8.equals("Nintendo Games") ? "Txt8 is correct." : "Txt8 is incorrect.");
        
//        Checking Div main Image
        
        WebElement MainImage = driver.findElement(By.xpath("//img[@alt='game_home']"));
        checkImageVisibility(MainImage);
        
//        AI Based Solution Section
//        Adding Pages in This buttons is Pending
        
        String MachinelearningText = driver.findElement(By.xpath("//span[normalize-space()='Machine learning']")).getText(); 
        System.out.println(MachinelearningText.equals("Machine learning") ? "MachinelearningText is correct" : "MachinelearningText is incorrect");
        
        String ArtificialIntelligenceText = driver.findElement(By.xpath("//span[normalize-space()='Artificial Intelligence']")).getText(); 
        System.out.println(ArtificialIntelligenceText.equals("Artificial Intelligence") ? "ArtificialIntelligenceText is correct" : "ArtificialIntelligenceText is incorrect");
        
        String BlockchainText = driver.findElement(By.xpath("//span[normalize-space()='Blockchain']")).getText(); 
        System.out.println(BlockchainText.equals("Blockchain") ? "BlockchainText is correct" : "BlockchainText is incorrect");
        
        String IoTText = driver.findElement(By.xpath("//span[normalize-space()='IoT']")).getText(); 
        System.out.println(IoTText.equals("IoT") ? "IoTText is correct" : "IoTText is incorrect");
        
        String AugmentedRealityText = driver.findElement(By.xpath("(//li[@class='elementor-icon-list-item elementor-inline-item'])[5]")).getText(); 
        System.out.println(AugmentedRealityText.equals("Augmented Reality") ? "AugmentedRealityText is correct" : "AugmentedRealityText is incorrect");
        
        String VirtualRealityText = driver.findElement(By.xpath("(//li[@class='elementor-icon-list-item elementor-inline-item'])[6]")).getText(); 
        System.out.println(VirtualRealityText.equals("Virtual Reality") ? "VirtualRealityText is correct" : "VirtualRealityText is incorrect");
        
        String GamificationText = driver.findElement(By.xpath("(//li[@class='elementor-icon-list-item elementor-inline-item'])[7]")).getText(); 
        System.out.println(GamificationText.equals("Gamification") ? "GamificationText is correct" : "GamificationText is incorrect");
        
        WebElement AIImage = driver.findElement(By.xpath("//img[@alt='AI-based-capermint']"));
        checkImageVisibility(AIImage);
        
        String AISectionTitle = driver.findElement(By.xpath("//span[contains(text(),'Do More With Capermint')]")).getText();
        System.out.println(AISectionTitle.equals("Do More With Capermint’s AI-based Solutions!") ? "AISectionTitle is correct" : "AISectionTitle is incorrect");
        
        String AISectionText = driver.findElement(By.xpath("//p[contains(text(),'Supercharge your business with cutting-edge AI sol')]")).getText();
        System.out.println(AISectionText.equals("Supercharge your business with cutting-edge AI solutions tailored to your specific needs. Automate tasks, optimize processes, and unlock new opportunities – all powered by AI.") ? "AISectionText is correct" : "AISectionText is incorrect");
                
        String ScheduleCallText = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[7]")).getText();
        System.out.println(ScheduleCallText.equals("Schedule A Call") ? "ScheduleCallText is correct." : "ScheduleCallText is incorrect.");       
        
        boolean ScheduleCallButton = driver.findElements(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[7]")).size() > 0;
        System.out.println(ScheduleCallButton ? "Link is present." : "Link is not present.");
        
        String ScheduleCallButtonHref = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[7]")).getAttribute("href");
        System.out.println(ScheduleCallButtonHref.equals("https://www.capermint.com/contact/") ? "Link href is correct." : "Link href is incorrect.");
        
//        We Build Apps for this platform Section
        
        String BuildAppSectionTitle = driver.findElement(By.xpath("//h2[normalize-space()='We Build Apps for These Platfoms']")).getText();
        System.out.println(BuildAppSectionTitle.equals("We Build Apps for These Platfoms") ? "BuildAppSectionTitle is correct." : "BuildAppSectionTitle is incorrect.");

        String BuildAppSectionText = driver.findElement(By.xpath("//p[contains(text(),'From native mobile to immersive realities, we craf')]")).getText();
        System.out.println(BuildAppSectionText.equals("From native mobile to immersive realities, we craft cutting-edge applications for all platforms.") ? "BuildAppSectionText is correct." : "BuildAppSectionText is incorrect.");        
        
//        Check All the Images
        
        WebElement img1 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88128'])[2]"));
        WebElement img2 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88129'])[2]"));
        WebElement img3 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-100637']"));
        WebElement img4 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-88132'])[3]"));
        WebElement img5 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-100638'])[1]"));
        WebElement img6 = driver.findElement(By.xpath("(//img[@class='attachment-full size-full wp-image-100639'])[1]"));

        checkImageVisibility(img1);
        checkImageVisibility(img2);
        checkImageVisibility(img3);
        checkImageVisibility(img4);
        checkImageVisibility(img5);
        checkImageVisibility(img6);
        
//        Check All the Image text
        
        String txt1 = driver.findElement(By.xpath("//span[normalize-space()='Mobile']")).getText();
        System.out.println(txt1.equals("Mobile") ? "txt1 is correct." : "txt1 is incorrect.");
        
        String txt2 = driver.findElement(By.xpath("//span[normalize-space()='PC/Desktop']")).getText();
        System.out.println(txt2.equals("PC/Desktop") ? "txt2 is correct." : "txt2 is incorrect.");
        
        String txt3 = driver.findElement(By.xpath("//span[normalize-space()='AR/VR']")).getText();
        System.out.println(txt3.equals("AR/VR") ? "txt3 is correct." : "txt3 is incorrect.");
        
        String txt4 = driver.findElement(By.xpath("(//span[normalize-space()='Cloud'])[2]")).getText();
        System.out.println(txt4.equals("Cloud") ? "txt4 is correct." : "txt4 is incorrect.");
        
        String txt5 = driver.findElement(By.xpath("//span[normalize-space()='Web/browser']")).getText();
        System.out.println(txt5.equals("Web/browser") ? "txt5 is correct." : "txt5 is incorrect.");
        
        String txt6 = driver.findElement(By.xpath("(//span[normalize-space()='Wearable'])[1]")).getText();
        System.out.println(txt6.equals("Wearable") ? "txt6 is correct." : "txt6 is incorrect.");
        
//        Check virtual-reality Image
        
        WebElement VRImage = driver.findElement(By.xpath("//img[@alt='virtual-reality']"));
        checkImageVisibility(VRImage);
        
//        Page Scroll
        
        WebElement Scroll5 = driver.findElement(By.xpath("//p[contains(text(),'Our mission at Capermint Technologies is to create')]"));
        JavascriptExecutor scroll5 = (JavascriptExecutor) driver;
        scroll5.executeScript("arguments[0].scrollIntoView(true);", Scroll5);
        
//        About Capermint Section
        
        String H3Text = driver.findElement(By.xpath("//h3[normalize-space()='We are Capermint']")).getText();
        System.out.println(H3Text.equals("We are Capermint") ? "H3Text is correct" : "H3 Text is incorrect");
        
        String SpanText = driver.findElement(By.xpath("(//span[normalize-space()=\"We're changing the game, just like you\"])[1]")).getText();
        System.out.println(SpanText.equals("We're changing the game, just like you") ? "SpanText is correct" : "SpanText is incorrect");

        String P1Text = driver.findElement(By.xpath("//p[contains(text(),'We nourish the needs of our clients with the best ')]")).getText();
        System.out.println(P1Text.equals("We nourish the needs of our clients with the best team distribution. In addition, our pool of talent helps us achieve outstanding and astonishing results in each project that we undertake.") ? "P1Text is correct" : "P1Text is incorrect");

        String P2Text = driver.findElement(By.xpath("//p[contains(text(),'Our mission at Capermint Technologies is to create')]")).getText();
        System.out.println(P2Text.equals("Our mission at Capermint Technologies is to create the most useful solutions for our clients and to help them achieve all their digital goals.") ? "P2Text is correct" : "P2Text is incorrect");
        
//        4 BOX section is pending
        
//        Featured Game Section
        
        String FeaturedGameTitle = driver.findElement(By.xpath("//span[normalize-space()='Featured Games']")).getText();
        System.out.println(FeaturedGameTitle.equals("Featured Games") ? "FeaturedGameTitle is correct" : "FeaturedGameTitle is incorrect");
        
        String FeaturedGameText = driver.findElement(By.xpath("//p[contains(text(),'Step into the World of Gaming Brilliance with Our ')]")).getText();
        System.out.println(FeaturedGameText.equals("Step into the World of Gaming Brilliance with Our Handpicked Selection of Featured Games, Each a Masterpiece of Innovation.") ? "FeaturedGameText is correct" : "FeaturedGameText is incorrect");

//        Check Button Link
        
        String ViewAllButtonLink = driver.findElement(By.xpath("//a[text()='View all']")).getAttribute("href");
        String expectedLink = "https://www.capermint.com/games-portfolio/";
        System.out.println(ViewAllButtonLink.equals(expectedLink) ? "The link is correct" : "The link is incorrect");
               
//        Page Scrolling
        
        WebElement Scroll6 = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/project/drop-master/']"));
        JavascriptExecutor scroll6 = (JavascriptExecutor) driver;
        scroll6.executeScript("arguments[0].scrollIntoView(true);", Scroll6);
        
//        Verify all 6 Game Boxs      
//        Racing Fantacy
        
        WebElement Game1bgImage = driver.findElement(By.xpath("//img[@alt='racingfantasy']"));
        checkImageVisibility(Game1bgImage);
        
        WebElement Game1Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-90514']"));
        checkImageVisibility(Game1Image);
        
        String Game1Name = driver.findElement(By.xpath("//h3[normalize-space()='Racing Fantasy']")).getText();
        System.out.println(Game1Name.equals("Racing Fantasy") ? "Game1Name is correct" : "Game1Name is incorrect");
        
        String Game1Description = driver.findElement(By.xpath("//p[contains(text(),'An adrenaline-pumping Racing Experience - Racing F')]")).getText();
        System.out.println(Game1Description.equals("An adrenaline-pumping Racing Experience - Racing Fantasy 2.0. Compete for real rewards while experiencing ...") ? "Game1Description is correct" : "Game1Description is incorrect");
        
        String Game1casestudyButton = driver.findElement(By.xpath("//a[@href='https://wp-racingfantasy.staging-server.in/']")).getAttribute("href");
        String Game1expectedLink = "https://wp-racingfantasy.staging-server.in/";
        System.out.println(Game1casestudyButton.equals(Game1expectedLink) ? "GameLink1 is correct" : "GameLink1 is incorrect");
        
//        Sikandarji
        
        WebElement Game2bgImage = driver.findElement(By.xpath("//img[@alt='sikandarji']"));
        checkImageVisibility(Game2bgImage);
        
        WebElement Game2Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88150']"));
        checkImageVisibility(Game2Image);
        
        String Game2Name = driver.findElement(By.xpath("//h3[normalize-space()='Sikandarji']")).getText();
        System.out.println(Game2Name.equals("Sikandarji") ? "Game2Name is correct" : "Game2Name is incorrect");
        
        String Game2Description = driver.findElement(By.xpath("//p[contains(text(),'Sikandarji is a multi-gaming platform that offers ')]")).getText();
        System.out.println(Game2Description.equals("Sikandarji is a multi-gaming platform that offers a handpicked collection of games that range from world-famous ...") ? "Game2Description is correct" : "Game2Description is incorrect");
        
        String Game2casestudyButton = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/project/sikandarji/']")).getAttribute("href");
        String Game2expectedLink = "https://www.capermint.com/project/sikandarji/";
        System.out.println(Game2casestudyButton.equals(Game2expectedLink) ? "GameLink2 is correct" : "GameLink2 is incorrect");
        
//        Drop master
        
        WebElement Game3bgImage = driver.findElement(By.xpath("//img[@alt='Drop master']"));
        checkImageVisibility(Game3bgImage);
        
        WebElement Game3Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88149']"));
        checkImageVisibility(Game3Image);
        
        String Game3Name = driver.findElement(By.xpath("//h3[text()='Drop master']")).getText();
        System.out.println(Game3Name.equals("Drop Master") ? "Game3Name is correct" : "Game3Name is incorrect");
        
        String Game3Description = driver.findElement(By.xpath("//p[contains(text(),'Designed and developed by Capermint, Jewel Slide: ')]")).getText();
        System.out.println(Game3Description.equals("Designed and developed by Capermint, Jewel Slide: Block Puzzle is the ultimate mobile game that challenges ...") ? "Game3Description is correct" : "Game3Description is incorrect");
        
        String Game3casestudyButton = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/project/drop-master/']")).getAttribute("href");
        String Game3expectedLink = "https://www.capermint.com/project/drop-master/";
        System.out.println(Game3casestudyButton.equals(Game3expectedLink) ? "GameLink3 is correct" : "GameLink3 is incorrect");
        
//        A23 carrom
        
        WebElement Game4bgImage = driver.findElement(By.xpath("//img[@alt='a23 carrom']"));
        checkImageVisibility(Game4bgImage);
        
        WebElement Game4Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88148']"));
        checkImageVisibility(Game4Image);
        
        String Game4Name = driver.findElement(By.xpath("//h3[text()='A23 carrom']")).getText();
        System.out.println(Game4Name.equals("A23 Carrom") ? "Game4Name is correct" : "Game4Name is incorrect");
        
        String Game4Description = driver.findElement(By.xpath("//p[contains(text(),'Inspired by the Classic Board Game, A23 Carrom Gam')]")).getText();
        System.out.println(Game4Description.equals("Inspired by the Classic Board Game, A23 Carrom Game is the best carrom game that the users get with the ...") ? "Game4Description is correct" : "Game4Description is incorrect");
        
        String Game4casestudyButton = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[11]")).getAttribute("href");
        String Game4expectedLink = "https://www.capermint.com/project/a23-carrom-case-study/";
        System.out.println(Game4casestudyButton.equals(Game4expectedLink) ? "GameLink4 is correct" : "GameLink4 is incorrect");
        
//        TATA 1mg game
        
        WebElement Game5bgImage = driver.findElement(By.xpath("//img[@alt='tata1mg game']"));
        checkImageVisibility(Game5bgImage);
        
        WebElement Game5Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88147']"));
        checkImageVisibility(Game5Image);
        
        String Game5Name = driver.findElement(By.xpath("//h3[text()='TATA 1mg game']")).getText();
        System.out.println(Game5Name.equals("TATA 1mg Game") ? "Game5Name is correct" : "Game5Name is incorrect");
        
        String Game5Description = driver.findElement(By.xpath("//p[contains(text(),'The term gamification refers to the process of int')]")).getText();
        System.out.println(Game5Description.equals("The term gamification refers to the process of integrating game mechanics into a pre-existing product ...") ? "Game5Description is correct" : "Game5Description is incorrect");
        
        String Game5casestudyButton = driver.findElement(By.xpath("(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[12]")).getAttribute("href");
        String Game5expectedLink = "https://www.capermint.com/project/tata-1mg/";
        System.out.println(Game5casestudyButton.equals(Game5expectedLink) ? "GameLink5 is correct" : "GameLink5 is incorrect");
        
//        Expedition
        
        WebElement Game6bgImage = driver.findElement(By.xpath("//img[@alt='expidition']"));
        checkImageVisibility(Game6bgImage);
        
        WebElement Game6Image = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-88146']"));
        checkImageVisibility(Game6Image);
        
        String Game6Name = driver.findElement(By.xpath("//h3[normalize-space()='Expedition']")).getText();
        System.out.println(Game6Name.equals("Expedition") ? "Game6Name is correct" : "Game6Name is incorrect");
        
        String Game6Description = driver.findElement(By.xpath("//p[contains(text(),'Lead your army and defend your tower in this fun-p')]")).getText();
        System.out.println(Game6Description.equals("Lead your army and defend your tower in this fun-packed 3D battle royal game. Expedition – Warrior ...") ? "Game6Description is correct" : "Game6Description is incorrect");
        
        String Game6casestudyButton = driver.findElement(By.xpath("//a[@href='https://www.capermint.com/project/expedition-warrior-of-steel/']")).getAttribute("href");
        String Game6expectedLink = "https://www.capermint.com/project/expedition-warrior-of-steel/";
        System.out.println(Game6casestudyButton.equals(Game6expectedLink) ? "GameLink6 is correct" : "GameLink6 is incorrect");
        
//        Client Section
        
        String ClientSectionTitle = driver.findElement(By.xpath("//h2[normalize-space()='Our Valuable Clients']")).getText();
        System.out.println(ClientSectionTitle.equals("Our Valuable Clients") ? "ClientSectionTitle is correct" : "ClientSectionTitle is incorrect");
        
        String ClientSectionText = driver.findElement(By.xpath("//p[contains(text(),'We are proud to work with a fantastic set of clien')]")).getText();
        System.out.println(ClientSectionText.equals("We are proud to work with a fantastic set of clients. We have worked with a number of Startups and Inc. 500 companies. We have provided them with the solutions that have helped them in growing their businesses. No matter what industry you work in, or how complex your work or your need is, if you are looking for a digital solution, we craft the best solutions ever.") ? "ClientSectionText is correct" : "ClientSectionText is incorrect");
        
//        Test All Client Images
        
        WebElement ClientImage1 = driver.findElement(By.xpath("//img[@alt='Nosta Pro Logo']"));
        WebElement ClientImage2 = driver.findElement(By.xpath("//img[@alt='A23 Logo']"));
        WebElement ClientImage3 = driver.findElement(By.xpath("//img[@alt='Ludo Empire Logo']"));
        WebElement ClientImage4 = driver.findElement(By.xpath("//img[@alt='Khiladi Adda Logo']"));
        WebElement ClientImage5 = driver.findElement(By.xpath("//img[@alt='Jio Glass Logo']"));
        WebElement ClientImage6 = driver.findElement(By.xpath("//img[@alt='Glenmark Logo']"));
        WebElement ClientImage7 = driver.findElement(By.xpath("//img[@alt='Glance Logo']"));
        WebElement ClientImage8 = driver.findElement(By.xpath("//img[@alt='Winzo Logo']"));
        WebElement ClientImage9 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-70009']"));
        WebElement ClientImage10 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-70016']"));
        WebElement ClientImage11 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-70016']"));
        WebElement ClientImage12 = driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-image-70008']"));
        
        checkImageVisibility(ClientImage1);
        checkImageVisibility(ClientImage2);
        checkImageVisibility(ClientImage3);
        checkImageVisibility(ClientImage4);
        checkImageVisibility(ClientImage5);
        checkImageVisibility(ClientImage6);
        checkImageVisibility(ClientImage7);
        checkImageVisibility(ClientImage8);
        checkImageVisibility(ClientImage9);
        checkImageVisibility(ClientImage10);
        checkImageVisibility(ClientImage11);
        checkImageVisibility(ClientImage12);
        
//        TESTIMONIALS Section
        
        String SectionTitle = driver.findElement(By.xpath("//p[@class='elementor-heading-title elementor-size-default']")).getText();
        System.out.println(SectionTitle.equals("TESTIMONIALS") ? "SectionTitle is correct" : "SectionTitle is incorrect");
        
        String SectionText = driver.findElement(By.xpath("//h2[normalize-space()='What Our Client Says']")).getText();
        System.out.println(SectionText.equals("What Our Client Says") ? "SectionText is correct" : "SectionText is incorrect");
        
//        Test All Reviews 
//        Need time to research on this
        
//        Page Scrolling
        
        WebElement Scroll7 = driver.findElement(By.xpath("//input[@value='Submit']"));
        JavascriptExecutor scroll7 = (JavascriptExecutor) driver;
        scroll7.executeScript("arguments[0].scrollIntoView(true);", Scroll7);
        
//        Test ContactUs form
        
        String ContactTitle = driver.findElement(By.xpath("//h2[contains(text(),'LET’S TALK')]")).getText();
        System.out.println(ContactTitle.equals("LET’S TALK") ? "ContactTitle is correct" : "ContactTitle is incorrect");
        
        String ContactText = driver.findElement(By.xpath("//p[contains(text(),'We understand that entrusting your ideas to a deve')]")).getText();
        System.out.println(ContactText.equals("We understand that entrusting your ideas to a development partner requires trust. At Capermint, we take information security very seriously. Here’s what you can expect when you contact us:") ? "ContactText is correct" : "ContactText is incorrect");
        
        WebElement CheckboxImage1 = driver.findElement(By.xpath("(//img[@alt='check-square'])[1]"));
        checkImageVisibility(CheckboxImage1);     
        String Textline1 = driver.findElement(By.xpath("//h3[normalize-space()='100% Secure Communication.']")).getText();
        System.out.println(Textline1.equals("100% Secure Communication.") ? "Textline1 is correct" : "Textline1 is incorrect");
        
        WebElement CheckboxImage2 = driver.findElement(By.xpath("(//img[@alt='check-square'])[2]"));
        checkImageVisibility(CheckboxImage2);
        String Textline2 = driver.findElement(By.xpath("//h3[normalize-space()='No Spam, Ever.']")).getText();
        System.out.println(Textline2.equals("No Spam, Ever.") ? "Textline2 is correct" : "Textline2 is incorrect");
        
        WebElement CheckboxImage3 = driver.findElement(By.xpath("(//img[@alt='check-square'])[3]"));
        checkImageVisibility(CheckboxImage3);
        String Textline3 = driver.findElement(By.xpath("//h3[normalize-space()='NDA available']")).getText();
        System.out.println(Textline3.equals("NDA available") ? "Textline3 is correct" : "Textline3 is incorrect");
        
        WebElement MailImage = driver.findElement(By.xpath("//img[@alt='mail-im']"));
        checkImageVisibility(MailImage);
        String MailText = driver.findElement(By.xpath("(//h3[@class='elementor-image-box-title'])[18]")).getText();
        System.out.println(MailText.equals("Master email: hello@capermint.com") ? "MailText is correct" : "MailText is incorrect");
        String MailLink = driver.findElement(By.xpath("(//a[@href='mailto:hello@capermint.com'])[1]")).getAttribute("href");
        String ExpectdMailLink = "mailto:hello@capermint.com";
        System.out.println(MailLink.equals(ExpectdMailLink) ? "MailLink is correct" : "MailLink is incorrect");
        
////        Contact input fields
//        
//        driver.findElement(By.xpath("//input[@placeholder='Your name*']")).sendKeys("Test");
//        driver.findElement(By.xpath("//input[@placeholder='Phone number*']")).sendKeys("1234567890");
//        driver.findElement(By.xpath("//input[@placeholder='Email*']")).sendKeys("test@gmail.com");
//        driver.findElement(By.xpath("//textarea[@placeholder='About your project']")).sendKeys("Automate Testing.");
//        
////        Captha
//
//        String captchaTextElement = driver.findElement(By.xpath("//p[@class='dscf7captcha']")).getText();
//        System.out.println(captchaTextElement);
//        WebElement answerInputField = driver.findElement(By.name("dscf7captcha-342"));
//
//        String formattedCaptcha = captchaTextElement.replace("\n", " ").trim();
//        String[] parts = formattedCaptcha.split(" ");
//        System.out.println("Formatted Captcha: " + formattedCaptcha);
//        System.out.println("Parts length: " + parts.length);
//        
//            int num1 = Integer.parseInt(parts[2]);
//            int num2 = Integer.parseInt(parts[4].replace("?", ""));
//            String operator = parts[3];
//
//            int answer = 0;
//            if (operator.equals("+")) {
//                answer = num1 + num2;
//            } else {
//                answer = num1 * num2;
//            }
//            answerInputField.sendKeys(String.valueOf(answer));
//            
//        WebElement SubmitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
//        SubmitButton.click(); 
//        Thread.sleep(10000);
//        
//        driver.navigate().back();
//        Thread.sleep(10000);
//        
//        WebElement closeButtonagain = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cp-close-btn cp-callback-widget__close-btn cp-close-btn--mobile-friendly']")));
//        closeButtonagain.click();        
//        Thread.sleep(2000);
//               
//        WebElement Callclosebuttonagain = driver.findElement(By.xpath("(//button[@class='cp-close-btn cp-tooltip__close-btn cp-close-btn--round cp-close-btn--offset cp-close-btn--mobile-friendly'])[1]"));
//        Callclosebuttonagain.click();        
//        Thread.sleep(2000);
        
//        Page Scrolling
        
        WebElement Scroll8 = driver.findElement(By.xpath("//a[contains(text(),'Develop Telegram Mini Games: Everything You Need t')]"));
        JavascriptExecutor scroll8 = (JavascriptExecutor) driver;
        scroll8.executeScript("arguments[0].scrollIntoView(true);", Scroll8);
        
//        Latest Insights Section
        
        String InsightsTitle = driver.findElement(By.xpath("//h2[normalize-space()='Latest Insights']")).getText();
        System.out.println(InsightsTitle.equals("Latest Insights") ? "InsightsTitle is correct" : "InsightsTitle is incorrect");
        
        String MoreArticlesBUtton = driver.findElement(By.xpath("//a[@class='elementor-button elementor-button-link elementor-size-md']")).getAttribute("href");
        String ExpectedLink = "https://www.capermint.com/blog/";
        System.out.println(MoreArticlesBUtton.equals(ExpectedLink) ? "MoreArticlesBUtton link is correct" : "MoreArticlesBUtton link is incorrect");

//        Testing 3 blogs
        
        WebElement Blog1Image = driver.findElement(By.xpath("//img[@alt='Gamification in Manufacturing']"));
        checkImageVisibility(Blog1Image);
        String Blog1Text = driver.findElement(By.xpath("//a[contains(text(),'Role of Gamification in Manufacturing: Unlocking 1')]")).getText();
        System.out.println(Blog1Text.equals("Role of Gamification in Manufacturing: Unlocking 10x Manufacturing Growth") ? "Blog1Text is correct" : "Blog1Text is incorrect");
        
        WebElement Blog2Image = driver.findElement(By.xpath("//img[@alt='How to increase In app purchase revenue']"));
        checkImageVisibility(Blog2Image);
        String Blog2Text = driver.findElement(By.xpath("//a[contains(text(),'How to Improve In-App Purchase in Games (IAP) and ')]")).getText();
        System.out.println(Blog2Text.equals("How to Improve In-App Purchase in Games (IAP) and Maximize Revenue in 2024") ? "Blog2Text is correct" : "Blog2Text is incorrect");
        
        WebElement Blog3Image = driver.findElement(By.xpath("//img[@alt='How to increase In app purchase revenue']"));
        checkImageVisibility(Blog3Image);
        String Blog3Text = driver.findElement(By.xpath("//a[contains(text(),'How to Improve In-App Purchase in Games (IAP) and ')]")).getText();
        System.out.println(Blog3Text.equals("How to Improve In-App Purchase in Games (IAP) and Maximize Revenue in 2024") ? "Blog3Text is correct" : "Blog3Text is incorrect");
        
//        Page Scrolling
        
        WebElement Scroll9 = driver.findElement(By.xpath("//u[normalize-space()='Terms of Use']"));
        JavascriptExecutor scroll9 = (JavascriptExecutor) driver;
        scroll9.executeScript("arguments[0].scrollIntoView(true);", Scroll9);        
        
//        Testing Footer
        
//        Section 1
        
        String Section1Title = driver.findElement(By.xpath("//h3[normalize-space()='Company']")).getText();
        System.out.println(Section1Title.equals("Company") ? "Section1Title is correct" : "Section1Title is incorrect");
        
        String AboutUs = driver.findElement(By.xpath("//a[normalize-space()='About Us']")).getAttribute("href");
        String ExpectedAboutUsLink = "https://www.capermint.com/about-us/";
        System.out.println(AboutUs.equals(ExpectedAboutUsLink) ? "link is correct" : "link is incorrect");
        
        String OurPortfolio = driver.findElement(By.xpath("//a[normalize-space()='Our Portfolio']")).getAttribute("href");
        String ExpectedOurPortfolioLink = "https://www.capermint.com/games-portfolio/";
        System.out.println(OurPortfolio.equals(ExpectedOurPortfolioLink) ? "link is correct" : "link is incorrect");
        
        String Blogs = driver.findElement(By.xpath("//a[normalize-space()='Blogs']")).getAttribute("href");
        String ExpectedBlogsLink = "https://www.capermint.com/blog/";
        System.out.println(Blogs.equals(ExpectedBlogsLink) ? "link is correct" : "link is incorrect");

        String ContactUs = driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).getAttribute("href");
        String ExpectedContactUsLink = "https://www.capermint.com/contact/";
        System.out.println(ContactUs.equals(ExpectedContactUsLink) ? "link is correct" : "link is incorrect");
        
        String Careers = driver.findElement(By.xpath("//a[normalize-space()='Careers']")).getAttribute("href");
        String ExpectedCareersLink = "https://www.capermint.com/careers/";
        System.out.println(Careers.equals(ExpectedCareersLink) ? "link is correct" : "link is incorrect");
        
//        Section 2
        
        String Section2Title = driver.findElement(By.xpath("(//h3[@class='elementor-heading-title elementor-size-default'][normalize-space()='Game Development'])[2]")).getText();
        System.out.println(Section2Title.equals("Game Development") ? "Section1Title is correct" : "Section1Title is incorrect");
        
        String Mobile = driver.findElement(By.xpath("//a[normalize-space()='Mobile Game Development']")).getAttribute("href");
        String ExpectedMobileLink = "https://www.capermint.com/mobile-game-development-services/";
        System.out.println(Mobile.equals(ExpectedMobileLink) ? "link is correct" : "link is incorrect");
        
        String HTML5 = driver.findElement(By.xpath("//a[normalize-space()='HTML5 Game Development']")).getAttribute("href");
        String ExpectedHTML5Link = "https://www.capermint.com/html5-game-development/";
        System.out.println(HTML5.equals(ExpectedHTML5Link) ? "link is correct" : "link is incorrect");
        
        String Unity = driver.findElement(By.xpath("//a[normalize-space()='Unity Game Development']")).getAttribute("href");
        String ExpectedUnityLink = "https://www.capermint.com/unity-game-development/";
        System.out.println(Unity.equals(ExpectedUnityLink) ? "link is correct" : "link is incorrect");

        String Unreal = driver.findElement(By.xpath("//a[normalize-space()='Unreal Game Development']")).getAttribute("href");
        String ExpectedUnrealLink = "https://www.capermint.com/unreal-game-development/";
        System.out.println(Unreal.equals(ExpectedUnrealLink) ? "link is correct" : "link is incorrect");
        
        String Buildbox = driver.findElement(By.xpath("//a[normalize-space()='Buildbox Game Development']")).getAttribute("href");
        String ExpectedBuildboxLink = "https://www.capermint.com/buildbox-game-development/";
        System.out.println(Buildbox.equals(ExpectedBuildboxLink) ? "link is correct" : "link is incorrect");
        
        String PC = driver.findElement(By.xpath("//a[normalize-space()='PC Game Development']")).getAttribute("href");
        String ExpectedPCLink = "https://www.capermint.com/pc-game-development/";
        System.out.println(PC.equals(ExpectedPCLink) ? "link is correct" : "link is incorrect");
        
        String MMORPG = driver.findElement(By.xpath("//a[normalize-space()='MMORPG Game Development']")).getAttribute("href");
        String ExpectedMMORPGLink = "https://www.capermint.com/mmorpg-game-development/";
        System.out.println(MMORPG.equals(ExpectedMMORPGLink) ? "link is correct" : "link is incorrect");
        
//        Section 3
        
        String Section3Title = driver.findElement(By.xpath("(//h3[@class='elementor-heading-title elementor-size-default'][normalize-space()='Virtual Games'])[2]")).getText();
        System.out.println(Section3Title.equals("Virtual Games") ? "Section3Title is correct" : "Section3Title is incorrect");
        
        String AR = driver.findElement(By.xpath("//a[normalize-space()='AR Game Services']")).getAttribute("href");
        String ExpectedARLink = "https://www.capermint.com/ar-game-development-company/";
        System.out.println(AR.equals(ExpectedARLink) ? "link is correct" : "link is incorrect");
        
        String VR = driver.findElement(By.xpath("(//a[normalize-space()='VR Game Services'])[3]")).getAttribute("href");
        String ExpectedVRLink = "https://www.capermint.com/vr-game-development/";
        System.out.println(VR.equals(ExpectedVRLink) ? "link is correct" : "link is incorrect");
        
        String MR = driver.findElement(By.xpath("//a[normalize-space()='MR Game Services']")).getAttribute("href");
        String ExpectedMRLink = "https://www.capermint.com/mixed-reality-game-development/";
        System.out.println(MR.equals(ExpectedMRLink) ? "link is correct" : "link is incorrect");

        String NFT = driver.findElement(By.xpath("//a[normalize-space()='NFT Game Development']")).getAttribute("href");
        String ExpectedNFTLink = "https://www.capermint.com/nft-game-development-company/";
        System.out.println(NFT.equals(ExpectedNFTLink) ? "link is correct" : "link is incorrect");
        
        String web3 = driver.findElement(By.xpath("//a[normalize-space()='Web3 Game Development']")).getAttribute("href");
        String Expectedweb3Link = "https://www.capermint.com/web3-game-development/";
        System.out.println(web3.equals(Expectedweb3Link) ? "link is correct" : "link is incorrect");
        
        String WebGL = driver.findElement(By.xpath("//a[normalize-space()='WebGL Game Development']")).getAttribute("href");
        String ExpectedWebGLLink = "https://www.capermint.com/webgl-game-development/";
        System.out.println(WebGL.equals(ExpectedWebGLLink) ? "link is correct" : "link is incorrect");
        
        String Metaverse = driver.findElement(By.xpath("//a[normalize-space()='Metaverse Game Development']")).getAttribute("href");
        String ExpectedMetaverseLink = "https://www.capermint.com/metaverse-game-development/";
        System.out.println(Metaverse.equals(ExpectedMetaverseLink) ? "link is correct" : "link is incorrect");
        
        String MetaverseEvent = driver.findElement(By.xpath("//a[normalize-space()='Metaverse Event Platform Development']")).getAttribute("href");
        String ExpectedMetaverseEventLink = "https://www.capermint.com/metaverse-event-platform-development/";
        System.out.println(MetaverseEvent.equals(ExpectedMetaverseEventLink) ? "link is correct" : "link is incorrect");
        
//        Section 4
        
        String Section4Title = driver.findElement(By.xpath("(//h3[@class='elementor-heading-title elementor-size-default'][normalize-space()='Gamification'])[2]")).getText();
        System.out.println(Section4Title.equals("Gamification") ? "Section4Title is correct" : "Section4Title is incorrect");
        
        String RealEstate = driver.findElement(By.xpath("//a[normalize-space()='Real Estate Gamification']")).getAttribute("href");
        String ExpectedRealEstateLink = "https://www.capermint.com/real-estate-app-gamification/";
        System.out.println(RealEstate.equals(ExpectedRealEstateLink) ? "link is correct" : "link is incorrect");
        
        String eCommerce = driver.findElement(By.xpath("//a[normalize-space()='eCommerce Gamification']")).getAttribute("href");
        String ExpectedeCommerceLink = "https://www.capermint.com/ecommerce-gamification/";
        System.out.println(eCommerce.equals(ExpectedeCommerceLink) ? "link is correct" : "link is incorrect");
        
        String Education = driver.findElement(By.xpath("//a[normalize-space()='Education Gamification']")).getAttribute("href");
        String ExpectedEducationLink = "https://www.capermint.com/blog/educational-game-development/";
        System.out.println(Education.equals(ExpectedEducationLink) ? "link is correct" : "link is incorrect");

        String Healthcare = driver.findElement(By.xpath("//a[normalize-space()='Healthcare Gamification']")).getAttribute("href");
        String ExpectedHealthcareLink = "https://www.capermint.com/healthcare-gamification/";
        System.out.println(Healthcare.equals(ExpectedHealthcareLink) ? "link is correct" : "link is incorrect");
        
        String FinTech = driver.findElement(By.xpath("//a[normalize-space()='FinTech Gamification']")).getAttribute("href");
        String ExpectedFinTechLink = "https://www.capermint.com/mobile-app-gamification/";
        System.out.println(FinTech.equals(ExpectedFinTechLink) ? "link is correct" : "link is incorrect");
        
        String Automobile = driver.findElement(By.xpath("//a[normalize-space()='Automobile Gamification']")).getAttribute("href");
        String ExpectedAutomobileLink = "https://www.capermint.com/mobile-app-gamification/";
        System.out.println(Automobile.equals(ExpectedAutomobileLink) ? "link is correct" : "link is incorrect");
        
        String VideoStreaming = driver.findElement(By.xpath("//a[normalize-space()='Video Streaming Gamification']")).getAttribute("href");
        String ExpectedVideoStreamingLink = "https://www.capermint.com/video-streaming-app-gamification/";
        System.out.println(VideoStreaming.equals(ExpectedVideoStreamingLink) ? "link is correct" : "link is incorrect");
        
//        Section 5
        
        String Section5Title = driver.findElement(By.xpath("//h3[normalize-space()='Contact Us']")).getText();
        System.out.println(Section5Title.equals("Contact Us") ? "Section5Title is correct" : "Section5Title is incorrect");
        
        String DropmailText = driver.findElement(By.xpath("//span[normalize-space()='Drop a Mail']")).getText();
        System.out.println(DropmailText.equals("Drop a Mail") ? "DropmailText is correct" : "DropmailText is incorrect");
        
        String DropMailLink = driver.findElement(By.xpath("(//a[@href='mailto:hello@capermint.com'])[2]")).getAttribute("href");
        System.out.println(DropMailLink.equals(ExpectdMailLink) ? "DropMailLink is correct" : "DropMailLink is incorrect");
        
        String OurAddressText = driver.findElement(By.xpath("//span[normalize-space()='Our Address']")).getText();
        System.out.println(OurAddressText.equals("Our Address") ? "OurAddressText is correct" : "OurAddressText is incorrect");
        
        String CapermintUSAText = driver.findElement(By.xpath("//span[normalize-space()='Capermint USA']")).getText();
        System.out.println(CapermintUSAText.equals("Capermint USA") ? "CapermintUSAText is correct" : "CapermintUSAText is incorrect");
        
        String CapermintUSAddressText = driver.findElement(By.xpath("//a[text()='210 Stonebrier ln, Alpharetta, GA 30004.']")).getText();
        System.out.println(CapermintUSAddressText.equals("210 Stonebrier ln, Alpharetta, GA 30004.") ? "CapermintUSAddressText is correct" : "CapermintUSAddressText is incorrect");
        
        String AddressLink = driver.findElement(By.xpath("//a[normalize-space()='210 Stonebrier ln, Alpharetta, GA 30004.']")).getAttribute("href");
        System.out.println(AddressLink.equals("https://www.google.com/maps/place/210+Stonebrier+Ln,+Alpharetta,+GA+30004,+USA/@34.1420206,-84.2369019,17z/data=!3m1!4b1!4m6!3m5!1s0x88f59dae6a52731d:0xe9d3d771a32dcdbf!8m2!3d34.1420162!4d-84.2343216!16s%2Fg%2F11c14l7ddy?entry=ttu") ? "AddressLink is correct" : "AddressLink is incorrect");
        
        String CallText = driver.findElement(By.xpath("//span[normalize-space()='Call / WhatsApp Us']")).getText();
        System.out.println(CallText.equals("Call / WhatsApp Us") ? "CallText is correct" : "CallText is incorrect");
        
        WebElement WhatsappImage = driver.findElement(By.xpath("//img[@alt='whatsapp-svg']"));
        checkImageVisibility(WhatsappImage);
        
        String ContactNumber = driver.findElement(By.xpath("//a[text()='+1 (470) 563-4813']")).getText();
        System.out.println(ContactNumber.equals("+1 (470) 563-4813") ? "ContactNumber is correct" : "ContactNumber is incorrect");
        
        String WhatsappLink = driver.findElement(By.xpath("//a[normalize-space()='+1 (470) 563-4813']")).getAttribute("href");
        System.out.println(WhatsappLink.equals("https://api.whatsapp.com/send?phone=14705634813") ? "WhatsappLink is correct" : "WhatsappLink is incorrect");
        
//        All the footer Images
        
        WebElement FooterImg1 = driver.findElement(By.xpath("//img[@alt='trustpoilot']"));
        WebElement FooterImg2 = driver.findElement(By.xpath("(//img[@alt='igda'])[3]"));
        WebElement FooterImg3 = driver.findElement(By.xpath("//img[@alt='Nasscom']"));
        WebElement FooterImg4 = driver.findElement(By.xpath("//img[@alt='Clutch']"));
        WebElement FooterImg5 = driver.findElement(By.xpath("(//img[@alt='Goodfirms'])[3]"));
        WebElement FooterImg6 = driver.findElement(By.xpath("//img[@alt='Iso']"));
        WebElement FooterImg7 = driver.findElement(By.xpath("//img[@alt='Google']"));
        WebElement FooterImg8 = driver.findElement(By.xpath("(//img[@alt='app'])[2]"));
                
        checkImageVisibility(FooterImg1);
        checkImageVisibility(FooterImg2);
        checkImageVisibility(FooterImg3);
        checkImageVisibility(FooterImg4);
        checkImageVisibility(FooterImg5);
        checkImageVisibility(FooterImg6);
        checkImageVisibility(FooterImg7);
        checkImageVisibility(FooterImg8);
        
//        Check CopyrightText
        
        String CopyrightText = driver.findElement(By.xpath("//p[text()='Copyright © 2014 – 2024 All Right Reserved.']")).getText();
        System.out.println(CopyrightText.equals("Copyright © 2014 – 2024 All Right Reserved.") ? "CopyrightText is correct" : "CopyrightText is incorrect");
        
//        Check all the social media Images and Links
        
        List<WebElement> icons = driver.findElements(By.xpath("//i[contains(@class, 'fab')]"));

        for (WebElement icon : icons) {
            if (icon.isDisplayed()) {
                System.out.println("Icon is visible: " + icon.getAttribute("class"));
            } else {
                System.out.println("Icon is NOT visible: " + icon.getAttribute("class"));
            }
        }

        Thread.sleep(5000);
        driver.quit();
        
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        e.printStackTrace();      
        driver.quit();
    }
    }
    
    private static void checkImageVisibility(WebElement image) {
        if (image.isDisplayed()) {
            System.out.println("Image is visible.");
        } else {
            System.out.println("Image is NOT visible.");
        }
    }
}