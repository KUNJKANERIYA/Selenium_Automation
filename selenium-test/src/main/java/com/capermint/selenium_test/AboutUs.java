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

public class AboutUs extends CommanMathods {
	
    public AboutUs(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/about-us/");
            Thread.sleep(10000);

            Actions hoverActions = new Actions(driver);
            WebElement AnythingToHover = findElementByXpath(driver, "//span[normalize-space()='Why Capermint']");
            hoverActions.moveToElement(AnythingToHover).perform();
            Thread.sleep(2000);
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            
            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='cp-close-btn cp-callback-widget__close-btn cp-close-btn--mobile-friendly']")));
            closeButton.click();        
            Thread.sleep(2000);
                   
            WebElement Callclosebutton = driver.findElement(By.xpath("(//button[@class='cp-close-btn cp-tooltip__close-btn cp-close-btn--round cp-close-btn--offset cp-close-btn--mobile-friendly'])[1]"));
            Callclosebutton.click();        
            Thread.sleep(2000);

            // Testing main section
            
            printSectionHeader("Our main Section");
            
            validateTitle(driver, "//span[normalize-space()='About us']", "About us", "AboutUsTitle");

            validateTitle(driver, "//h1[contains(text(),'Capermint Technologies - Your Strategic Partner in')]",
                    "Capermint Technologies - Your Strategic Partner in Game Innovation", "AboutUsText");

            validateTitle(driver, "//p[contains(text(),'We go beyond traditional boundaries, redefining ga')]",
                    "We go beyond traditional boundaries, redefining gaming experiences. Discover how we blend creativity, technology, and expertise to craft exceptional game solutions that elevate your vision. Join us in the journey of transforming concepts into captivating Gaming Realities.", "AboutUsContent");

            // Validate the contact button link
            
            validateLink(driver, "//a[normalize-space()='Contact Us Now']", "https://www.capermint.com/contact/", "ContactButtonLink");

            // Check visibility of the banner image
            
            checkImageVisibility(driver, "//section[@class='about-banner']");
            
            // Scroll Page
            
            scrollToElementByXpath(driver, "//h3[normalize-space()='Transparent and controlled process']");

            // Our Thought Section
            
            printSectionHeader("Our Thought Section");
            
            validateTitle(driver, "//span[normalize-space()='Our Thought']", "Our Thought", "OurThoughtTitle");

            validateTitle(driver, "//h2[contains(text(),'Individual commitment to a group effort—that is wh')]",
                    "Individual commitment to a group effort—that is what makes the perfect teamwork and helps a company grow.", "OurThoughtText");

            validateTitle(driver, "//p[contains(text(),'At Capermint Technologies, we are passionate creat')]",
                    "At Capermint Technologies, we are passionate creators of captivating game experiences. With a global presence and ISO 9001:2015 Certification, we harness cutting-edge technologies to deliver exceptional mobile games. Our skilled team ensures quality solutions, transparency, and a controlled process, making us a trusted leader in the industry.", "OurThoughtContent");

            checkImageVisibility(driver, "//img[@alt='Professional team with profound expertise']");
            validateTitle(driver, "//h3[normalize-space()='Professional team with profound expertise']", "Professional team with profound expertise", "Img1Text");

            checkImageVisibility(driver, "//img[@title='Quality solutions at every scale']");
            validateTitle(driver, "//h3[normalize-space()='Quality solutions at every scale']", "Quality solutions at every scale", "Img2Text");

            checkImageVisibility(driver, "//img[@title='Transparent and controlled process']");
            validateTitle(driver, "//h3[normalize-space()='Transparent and controlled process']", "Transparent and controlled process", "Img3Text");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h3[normalize-space()='What We Believe']");
            
            // Our Values Section
            
            printSectionHeader("Our Values Section");
            
            checkImageVisibility(driver, "//img[@title='What We Do']");
            validateTitle(driver, "(//span[contains(text(),'Our Values')])[1]", "Our Values", "OurValuesTitle1");
            validateTitle(driver, "//h3[normalize-space()='What We Do']", "What We Do", "WhatWeDoText1");
            validateTitle(driver, "//p[contains(text(),'Capermint Technologies is a global leader in mobil')]", "Capermint Technologies is a global leader in mobile game design and development. We create comprehensive games and applications for startups, businesses, and enterprises across various platforms such as Android and iOS. Our vision is to develop mobile apps and games in a constant manner and grow as a major mobile app and game development company.", "WhatWeDoContent1");

            checkImageVisibility(driver, "//img[@title='What We Believe']");
            validateTitle(driver, "(//span[contains(text(),'Our Values')])[2]", "Our Values", "OurValuesTitle2");
            validateTitle(driver, "//h3[normalize-space()='What We Believe']", "What We Believe", "WhatWeDoText2");
            validateTitle(driver, "//p[contains(text(),'We believe in providing excellent services that ar')]", "We believe in providing excellent services that are backed with international standards of coding. With our deep analysis and market research, we blend the perfect plan for your project that guarantees an accurate outcome. We also conduct a number of workshops and programs to update our employees and keep support in their self-growth.", "WhatWeDoContent2");
            
            // Page Section
            
            scrollToElementByXpath(driver, "//h4[normalize-space()='Effective Tactical Approaches']");
            
            // Process Section
            
            printSectionHeader("Process Section");
            
            checkImageVisibility(driver, "//img[@title='Evaluate']");
            checkImageVisibility(driver, "//img[@title='Goal Setting']");
            checkImageVisibility(driver, "//img[@title='Full Spectrum Strategy']");
            checkImageVisibility(driver, "//img[@title='Tactics']");
            
            validateTitle(driver, "//h4[normalize-space()='Understanding Your Vision']", "Understanding Your Vision", "UnderstandingYourVisionTitle");
            validateTitle(driver, "//h4[normalize-space()='Strategic Goal Setting']", "Strategic Goal Setting", "StrategicGoalSettingTitle");
            validateTitle(driver, "//h4[normalize-space()='Holistic Marketing Strategies']", "Holistic Marketing Strategies", "HolisticMarketingStrategiesTitle");
            validateTitle(driver, "//h4[normalize-space()='Effective Tactical Approaches']", "Effective Tactical Approaches", "EffectiveTacticalApproachesTitle");
            
            validateTitle(driver, "//p[contains(text(),'We dive into understanding your unique requirement')]", "We dive into understanding your unique requirements, conducting thorough market research to formulate a tailored development process that aligns with your goals.", "UnderstandingYourVisioncontent");
            validateTitle(driver, "//p[contains(text(),'Breaking down the project into clear, achievable g')]", "Breaking down the project into clear, achievable goals allows for easy tracking throughout the development journey, ensuring transparency and progress.", "StrategicGoalSettingcontent");
            validateTitle(driver, "//p[contains(text(),'Our seasoned marketing experts craft comprehensive')]", "Our seasoned marketing experts craft comprehensive strategies designed to resonate with your core audience, driving substantial downloads and engagement.", "HolisticMarketingStrategiescontent");
            validateTitle(driver, "//p[contains(text(),'Informed by market insights, our team provides str')]", "Informed by market insights, our team provides strategic tactics to maintain audience engagement, ensuring sustained interest and success in the competitive landscape.", "EffectiveTacticalApproachescontent");
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "//img[@title='ISO']");
            
            // We're changing the game, just like you Section
            
            printSectionHeader("We're changing the game, just like you Section");
            
            validateTitle(driver, "//section[@class='changing-game']//h2[1]", "We're changing the game, just like you", "ChangingGameTitle");
            validateTitle(driver, "//p[contains(text(),'We nourish the needs of our clients with the best ')]", "We nourish the needs of our clients with the best team distribution. In addition, our pool of talent helps us achieve outstanding and astonishing results in each project that we undertake.", "ChangingGameContent");
            
            validateLink(driver, "//a[normalize-space()='Know More']", "https://www.capermint.com/contact/", "Knowmore	ButtonLink");
            
            checkImageVisibility(driver, "//img[@title='ITFirms']");
            checkImageVisibility(driver, "//img[@title='TopDeveloper']");
            checkImageVisibility(driver, "//img[@title='goodfirms']");
            checkImageVisibility(driver, "//img[@title='appfutura']");
            checkImageVisibility(driver, "//img[@title='Clutch']");
            checkImageVisibility(driver, "//img[@title='igda']");
            checkImageVisibility(driver, "//img[@title='ISO']");
            
            validateLink(driver, "//a[img[@alt='ITFirms']]", "https://www.itfirms.co/top-mobile-app-development-companies-in-canada/", "ITFirmsImage");
            validateLink(driver, "//a[img[@alt='TopDeveloper']]", "https://www.topdevelopers.co/profile/Capermint-Technologies", "TopDeveloperImage");
            validateLink(driver, "//a[img[@alt='goodfirms']]", "https://www.goodfirms.co/company/capermint-technologies-pvt-ltd", "goodfirmsImage");
            validateLink(driver, "//a[img[@alt='appfutura']]", "https://www.appfutura.com/developers/capermint-technologies-", "appfuturaImage");
            validateLink(driver, "//a[img[@alt='Clutch']]", "https://clutch.co/profile/capermint-technologies#summary", "ClutchImage");
            validateLink(driver, "//a[img[@alt='igda']]", "#", "igdaImage");
            validateLink(driver, "//a[img[@alt='ISO']]", "https://bc3-production-blobs-us-east-2.s3.us-east-2.amazonaws.com/0b33e288-4e52-11eb-a03f-ecf4bbd6f9d0?response-content-disposition=inline%3B%20filename%3D%22IN91172A-Capermint%20Technologi...pdf%22%3B%20filename%2A%3DUTF-8%27%27IN91172A-Capermint%2520Technologi...pdf&response-content-type=application%2Fpdf&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAS5PME4CT5QW2PJJU%2F20210824%2Fus-east-2%2Fs3%2Faws4_request&X-Amz-Date=20210824T112408Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=107c47a4d143f2117bb39a387072bdcc341df830fe1b57244d4da0d954162888", "ISOImage");

            checkImageVisibility(driver, "//img[@title=\"We're changing the game, just like you\"]");
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "//span[normalize-space()='MD and CEO']");
            
            // About Company`s CEO Section
            
            printSectionHeader("About Company`s CEO Section");
            
            checkBackgroundImage(driver, "//div[@class='md-ceo-part']");
            
            validateTitle(driver, "//p[contains(text(),'“Crafting games isn')]", "“Crafting games isn't just about code and pixels; it's about understanding players' desires. By blending creativity and technology, we aim to forge gaming experiences that stick with players, offering joy with every click.”", "EffectiveTacticalApproachescontent");
            validateTitle(driver, "//p[text()='Vivek Shah']", "Vivek Shah", "CEOName");
            validateTitle(driver, "//span[normalize-space()='MD and CEO']", "MD and CEO", "MDandCEO");
            
            // Page Scroll
            
            scrollToElementByXpath(driver, "//span[normalize-space()='MD and CEO']");
            
            // TESTIMONIALS Section
            
            printSectionHeader("TESTIMONIALS Section");
            
            validateTitle(driver, "//p[@class='elementor-heading-title elementor-size-default']", "TESTIMONIALS", "SectionTitle");
            validateTitle(driver, "//h2[normalize-space()='What Clients Say About Us']", "What Clients Say About Us", "AboutUsTitle");
            validateTitle(driver, "//p[contains(text(),'Capermint team understands the seriousness of qual')]", "Capermint team understands the seriousness of quality work, timely manner delivery of project and being responsive to our client as and when required.", "AboutUs");

            checkImageVisibility(driver, "(//img[@alt='Mingeli Palata'])[1]");
            validateTitle(driver, "(//h5[@class='testimonial-text'][contains(text(),'The app has received over 100,000 downloads, excee')])[1]", "The app has received over 100,000 downloads, exceeding the expectations of the internal team. Capermint Technologies Pvt Ltd establishes a seamless workflow through clear and open communication. The team is hard-working, personable, and fun to work with.", "ClientReview1");
            validateTitle(driver, "(//h6[normalize-space()='Mingeli Palata'])[1]", "Mingeli Palata", "ClientName");
            validateTitle(driver, "(//div[normalize-space()='CEO, MPTV'])[1]", "CEO, MPTV", "ClientPost");
            
            scrapeReviews(driver, 7, 200);
    
            // Page Scrolling    
                
            scrollToElementByXpath(driver, "(//a[normalize-space()='Contact Us'])[8]");
            
            // Let`s Talk Section
            
            printSectionHeader("Let`s Talk Section");
                
            validateTitle(driver, "//section[@class='know-more']//h2[1]", "Let's Talk!", "Let`sTalkTitle");
            validateTitle(driver, "//section[@class='know-more']//p[1]", "Let's Create Amazing Games Together.", "Let`sTalkText");
            validateLink(driver, "(//a[normalize-space()='Contact Us'])[8]", "https://www.capermint.com/contact/", "ContactUsButtonLink	");
            checkImageVisibility(driver, "//img[@title=\"It's time to know more about you.\"]");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h4[normalize-space()='Cost Effective Solutions']");
            
            // About Us Section
            
            printSectionHeader("About Us Section");
            
            validateTitle(driver, "(//span[contains(text(),'About Us')])[2]", "About Us", "AboutUsTitle1");
            validateTitle(driver, "//h2[normalize-space()='Why Choose Capermint ?']", "Why Choose Capermint ?", "AboutUsTitle2");

            checkImageVisibility(driver, "//img[@title='Result oriendted Approach']");
            
            validateTitle(driver, "//h4[normalize-space()='Result oriented Approach']", "Result oriented Approach", "Content1 Title");
            validateTitle(driver, "//p[contains(text(),'We do not believe in quantity. Instead, we believe')]", "We do not believe in quantity. Instead, we believe in Quality and results. Client focus is our main goal. Therefore, we analyzed and followed the structured guideline.", "Content1");

            checkImageVisibility(driver, "//img[@title='Cost Effective Solutions']");
            
            validateTitle(driver, "//h4[normalize-space()='Cost Effective Solutions']", "Cost Effective Solutions", "Content2 Title");
            validateTitle(driver, "//p[contains(text(),'We carefully follow the budget and time estimation')]", "We carefully follow the budget and time estimations. We try to provide the best optimal solution within the budget. Our recommendations are always growth-oriented.", "Content2");

            checkImageVisibility(driver, "(//img[@title='Result oriented Approach'])[1]");
            checkImageVisibility(driver, "(//img[@title='Result oriented Approach'])[2]");
            
            checkImageVisibility(driver, "//img[@title='Professional & Experienced Team']");
            
            validateTitle(driver, "//h4[normalize-space()='Professional & Experienced Team']", "Professional & Experienced Team", "Content1 Title");
            validateTitle(driver, "//p[contains(text(),'We are a highly professional group of team which a')]", "We are a highly professional group of team which always ready to work on new challenges. In addition, our developers are passionate about developing next-gen solutions.", "Content1");

            checkImageVisibility(driver, "//img[@title='Best Practices Beyond the Limits']");
            
            validateTitle(driver, "//h4[normalize-space()='Best Practices Beyond the Limits']", "Best Practices Beyond the Limits", "Content2 Title");
            validateTitle(driver, "//p[contains(text(),'We follow the standard architectural practice with')]", "We follow the standard architectural practice with skills, high-graphical art, animation, and advanced tools & technologies. However, our creative idea is not ordinary but just beyond the ordinary.", "Content2");

            Thread.sleep(5000);
        
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
