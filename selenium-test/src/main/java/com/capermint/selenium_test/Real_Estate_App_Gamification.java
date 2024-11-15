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

public class Real_Estate_App_Gamification extends CommanMathods{
	
	public Real_Estate_App_Gamification(WebDriver driver) {
		super(driver);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.capermint.com/real-estate-app-gamification/");
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
            
            // Main Section
            
            printSectionHeader("Main Section");
            Thread.sleep(2000);
            
            validateTitle(driver, "//h1[normalize-space()='Real Estate App Gamification & Development Company']", "Real Estate App Gamification & Development Company", "Main Title");
            
            validateTitle(driver, "(//span[contains(text(),\"Transform Your Real Estate Business with Capermint\")])[1]", "Transform Your Real Estate Business with Capermint's Gamified Solutions!", "Section Text");
            validateTitle(driver, "//p[contains(text(),'As a leading Real Estate App Gamification company,')]", "As a leading Real Estate App Gamification company, we leverage the real estate firms by providing them with industry-leading Gamification in Real Estate that will digitize and enhance real estates businesses.", "Content1");
            validateTitle(driver, "//p[contains(text(),'Explore')]", "Explore Interactive Property Tours, Reward-Based Challenges, and Personalized User Journeys. Our Real Estate Gamification Services enable builders, retailers, aggregators, and stakeholders to offer a digital solution to the customers that will help them buy, sell, find, and rent properties using their mobile devices.", "Content2");
            
            
            // Link is pending in website
//            validateLink(driver, "//a[@href='#contact']", "#contact", "Get quick assistence Button");
            
            checkImageVisibility(driver, "//img[@alt='Real-estate-App-Development-Company']");
            
            // Page scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Gamification in Real Estate']");
            
            // Gamification in Real Estate Section
            
            printSectionHeader("Gamification in Real Estate Section");
            
            validateTitle(driver, "//h2[normalize-space()='Gamification in Real Estate']", "Gamification in Real Estate", "Title");
            validateTitle(driver, "//span[contains(text(),'10X Boost your sales with advanced Real Estate Gam')]", "10X Boost your sales with advanced Real Estate Gamification", "Text");
            validateTitle(driver, "//p[contains(text(),'With Capermint’s Real Estate App Gamification serv')]", "With Capermint’s Real Estate App Gamification service, your app will become increasingly popular in the business world and will highly motivate your sales team and the users. Capermint’s Real Estate App Gamification service helps you in adding various gamification strategies to your app that will motivate and encourage the users to accomplish daily tasks.", "Content1");
            validateTitle(driver, "//p[contains(text(),'Gamification is the use of game mechanics in regul')]", "Gamification is the use of game mechanics in regular and simple apps to make the user experience better. It can be used in the real estate sales environment to improve the motivation and performance of the users. Our Gamification experts will transform your app into a much better and objective-oriented app that the users will love to use.", "Content2");
                        
            String[] GamificationTitles = {
            		"Setting Clear Goals and Objectives",
            		"Level Implementation",
            		"Points, Badges, and Unlocked Rewards",
            		"Dive into NFTs for Exclusive Real Estate Property",
            		"Creating Virtual Offices and Buildings"
            };
            
            String[] GamificationContent = {
            		"Every game has a definite objective. Without clear goals, the team will have nothing to be competitive about. Establishing common goals will motivate the team and the users to perform better and will lay the foundation for friendly competition.",
            		"Setting up the same objectives for the new and the established agents may not do good for their performance and motivation. Set different levels for different agents, higher the level, the more difficult the tasks, but at the same time, more lucrative the rewards.",
            		"There should be an award for achieving the goals. These micro-rewards provide additional motivation to help keep your players on track and continuing. You can add different prizes that can be redeemed against points and badges, and you can also add unlocked rewards.",
            		"Create NFTs of various buildings, floors, rooms, symbols, etc. and launch them in your app. You can also provide these NFTs to the app users as a reward for reaching new levels and completing their goals.",
            		"Showcase Real Estate Properties in Metaverse  Showcase your designed offices and buildings in a virtual worldand the Metaverse. Let the users have a live virtual tour via your app from anywhere. This will provide a much deeper and better experience to the users and will excite them more to buy your properties. You can even sell properties in the Metaverse too."
            };
            
            String[] GamificationImages = {
            		"//img[@alt='Setting Clear Goals']",
            		"//img[@alt='real estate Agent Level Implementation']",
            		"//img[@alt='Unlocked real estate Rewards']",
            		"//img[@alt='NFT Real Estate Property']",
            		"//img[@alt='Virtual office-building']"
            };
            
            validateElements(driver, GamificationTitles, GamificationContent, GamificationImages, "Gamification");
            
            // Exception Content
            
            validateTitle(driver, "(//p[@class='elementor-image-box-description'])[5]", "Showcase Real Estate Properties in Metaverse Showcase your designed offices and buildings in a virtual worldand the Metaverse. Let the users have a live virtual tour via your app from anywhere. This will provide a much deeper and better experience to the users and will excite them more to buy your properties. You can even sell properties in the Metaverse too.", "Text");

            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Real Estate App Development Services']");
            
            // Real Estate App Development Services Section
            
            printSectionHeader("Real Estate App Development Services Section");
            
            validateTitle(driver, "//h2[normalize-space()='Real Estate App Development Services']", "Real Estate App Development Services", "Title");
            
            String[] ServicesNames = {
            		"Real Estate Mobile Application",
            		"Property Renting Application",
            		"Property Brokerage Application",
            		"Real Estate Web Application",
            		"Lead Management Application"
            };
            
            String[] ServicesContents = {
            		"Real Estate App which is rich in advanced features and is compatible with AR/VR to provide the best user experience. The customers will enjoy High Definition property viewing experience, advanced filters, best suggestions, interest rate calculator, and many more features.",
            		"An app that will allow the users to post listings for properties up for rent, and at the same time, the users can use this application to find suitable properties for rent. This location-based app allows the users to find the right property for themselves, and also provides a virtual inspection.",
            		"A broker-centered app that helps the brokers to measure their marketing efforts and results on their mobile device. The app will help you calculate the brokerage that you have to collect and will also create a history of the brokerage that you have collected from all your projects.",
            		"Allow your users to access your service using all the internet-enabled devices with Real Estate Web Application. The web application will enable the users to see the live photos of the property and also 3D images to get a better understanding. The web application will be loaded with advanced features.",
            		"The Real Estate Lead Management App allows you to gather all the leads that are generated through various channels such as websites, social media, referrals, etc in one place. Categorize, arrange, assign, and manage all the leads from one place to convert them effectively."
            };
            
            validateElements(driver, ServicesNames, ServicesContents, null, "Services");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Real Estate App Development Solutions']");
            
            // Solution Section
            
            validateTitle(driver, "//h2[normalize-space()='Real Estate App Development Solutions']", "Real Estate App Development Solutions", "Title");
            validateTitle(driver, "//p[contains(text(),'Capermint is a leading Real Estate Mobile App Deve')]", "Capermint is a leading Real Estate Mobile App Development company in Australia, Canada, USA, Germany, & India. We provide white label Real Estate App solutions that help you expand, automate, optimize, and grow your Real Estate Service. The solutions developed by our developers possess cross-platform compatibility, they provide various customization options, and they are apt in facilitating all your business processes.", "Content");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Features of Real Estate Apps']");
            
            // Real Estate Apps Section
            
            printSectionHeader("Real Estate Apps Section");
            
            validateTitle(driver, "//h2[normalize-space()='Features of Real Estate Apps']", "Features of Real Estate Apps", "Title");
            validateTitle(driver, "//p[contains(text(),'The features that your app incorporates depict you')]", "The features that your app incorporates depict your app’s position in the market. The more and better features your app has, it will work better, and in turn, more users will download it, and it will rank higher in app stores. Here is a list of features for the apps.", "Content");
            
            String[] AppNames = {
            	    "User Onboarding",
            	    "User Profile",
            	    "Property Profile",
            	    "Interest Rate Calculator",
            	    "Property Listing",
            	    "Virtual Tours",
            	    "GPS Integration",
            	    "Lead Generation",
            	    "Advanced Search",
            	    "Multiple Payment Integrations",
            	    "Chat Feature",
            	    "Favorites",
            	    "Push Notifications",
            	    "Schedule Management",
            	    "Analytics"
            	};
            
            String[] Appcontents = {
            	    "This is the most basic feature of the real Estate App. The users can use their mobile number and email address to sign up, or they can sign up using their social media ID.",
            	    "The user profile will contain the user profile photo, their name, and their requirement. It will also feature their favorite properties or properties that are listed by them.",
            	    "The property profile will contain information of the property such as description, photos, videos, price details, valuation, neighborhood information, owner details, and so on.",
            	    "The Interest Rate Calculator allows the customers to calculate the interest rates on loans based on various durations of paying back the loan amount borrowed.",
            	    "The property listing feature allows the users to list their property up for rent or lease on your app. You can verify all the listings and then post the same to avoid fake listings.",
            	    "Equipped with the VR/AR technologies, the users can use the app to have a virtual tour of the properties that they are interested in to get the best user experience on your app.",
            	    "The GPS integration will help the users in finding the properties that are near them or they can enter any location and the app will show properties that are listed for that particular location.",
            	    "The app will collect and make a task of all the leads that are generated via ads, social media, website, and other sources. The tasks can be easily managed and assigned to representatives.",
            	    "The advanced search feature is filled with dozens of filters that will allow the users to find the best property for themselves. You can get customized filters based on your customer’s needs.",
            	    "The app is equipped with various payment getaways so that the users can use their desired method of payment. This feature will also contribute towards increasing customer satisfaction.",
            	    "The in-app chat feature will allow the users to talk to the listers directly or to your representatives to solve all or any doubts that pop-ups in their minds.",
            	    "The favorites feature allows the users to create a shortlist of all the properties that they are interested in. They can easily open this list by accessing the favorites option.",
            	    "Push Notification is a very useful marketing feature for your app. You can use them to showcase interesting properties to the users, or you can use them to attract the users back to your app.",
            	    "The schedule management feature is like a calendar that the users can use to schedule appointments or visits to the properties from within the app.",
            	    "The analytics feature is a very useful one for the listers. This feature will provide insight to the listers about the performance of their properties like interested users, views, etc."
            	};
            
            String[] Imagesxpaths = {
            	    "//img[@alt='User Onboarding']",
            	    "//img[@alt='User Profile']",
            	    "//img[@alt='Property Profile']",
            	    "//img[@alt='Interest Rate Calculator']",
            	    "//img[@alt='Property Listing']",
            	    "//img[@alt='Virtual Tours']",
            	    "//img[@alt='GPS Integration']",
            	    "//img[@alt='Lead Generation']",
            	    "//img[@alt='Advanced Search']",
            	    "//img[@alt='Multiple Payment Integrations']",
            	    "//img[@alt='Chat Feature']",
            	    "//img[@alt='Favorites']",
            	    "//img[@alt='Push Notifications']",
            	    "//img[@alt='Schedule Management']",
            	    "//img[@alt='Advertisement Management']"
            	};
            
            validateElements(driver, AppNames, Appcontents, Imagesxpaths, "Real Estate Apps");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Real Estate App Expanded Features']");
            
            // Real Estate App Expanded Features Section
            
            printSectionHeader("Real Estate App Expanded Features Section");
            
            validateTitle(driver, "//h2[normalize-space()='Real Estate App Expanded Features']", "Real Estate App Expanded Features", "Title");
            validateTitle(driver, "//p[contains(text(),'The Real Estate App development process is based o')]", "The Real Estate App development process is based on the real need of this billion-dollar industry. Our solutions are built around the problems that real estate businesses face and facilitate their day-to-day work. We understand your demand and what your customers want, and we develop the app around the same. Here is a list of expanded features of your Real Estate App.", "Content");
            
            String[] FeaturesNames = {
            		"Phone and email OTP Configuration",
            		"Live Chat Integration",
            		"API Integration",
            		"Payment Gateway Integration",
            		"Live Chat Integration",
            		"Google Maps & Apple Maps Integration with GPS"
            };
            
            String[] FeatureImages = {
            		"//img[@class='attachment-large size-large wp-image-108780']",
            		"//img[@alt='live-chat']",
            		"//img[@alt='API']",
            		"//img[@alt='gateway']",
            		"//img[@alt='notification']",
            		"//img[@alt='location']"
            };
            
            validateElements(driver, FeaturesNames, null, FeatureImages, "Features");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Custom Real Estate App Solutions']");
            
            // Custom Real Estate App Solutions Section
            
            printSectionHeader("Custom Real Estate App Solutions Section");
            
            validateTitle(driver, "//h2[normalize-space()='Custom Real Estate App Solutions']", "Custom Real Estate App Solutions", "Title");
            validateTitle(driver, "//p[contains(text(),'We at Capermint feel delighted to be among the top')]", "We at Capermint feel delighted to be among the top Real Estate App Development Companies. We develop feasible solutions by employing robust technologies. Our solutions are scalable and cost-effective and provide your customers with a user-friendly experience that makes interaction easy.", "Paragraph 1");
            validateTitle(driver, "//p[contains(text(),'In the competitive environment of the real estate ')]", "In the competitive environment of the real estate business, an end-to-end custom Real Estate App solution can help you in capitalizing the digital opportunities.", "Paragraph 2");
            
            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-md'])[2]", "https://www.capermint.com/contact/", "Let`s Get Connected Button");
            
            checkImageVisibility(driver, "//img[@alt='search-house']");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Capermint Real Estate App Development Process']");
            
            // Real Estate App Development Process Section
            
            // Validating title number is pending need time
            
            printSectionHeader("Real Estate App Development Process Section");
            
            validateTitle(driver, "//h2[normalize-space()='Capermint Real Estate App Development Process']", "Capermint Real Estate App Development Process", "Title");
            validateTitle(driver, "//p[contains(text(),'At Capermint, we follow a stepwise Agile approach ')]", "At Capermint, we follow a stepwise Agile approach to ensure speedy and qualitative development of your Real Estate App solution while eliminating the possibilities and chances of errors in the process. Our personalized approach is as follows", "Content");
            
            String[] ProcessNames = {
            		"Real Estate App Requirement Gathering",
            		"Competitor Analysis",
            		"Wireframe Creation",
            		"Real Estate App UI/UX Creation",
            		"Real Estate App Development",
            		"QA Check",
            		"Launching of the App"
            };
            
            String[] ProcessContents = {
            		"A small meeting for the requirement gathering of what you want to solve or achieve with the app.",
            		"A complete analysis of your competitors and their products so that we can incorporate better features.",
            		"After gathering the required information, we finalize the user journey and develop wireframes for the screens.",
            		"We develop various designs for UI/UX for the app, and when you approve the right wireframe, we start designing the UI & UX of the app.",
            		"After the UI & UX are finalized, we start the development process. Now the app will get all the needed features and functionalities.",
            		"No one wants to launch a buggy app, and therefore after the development is finished, we run a QA Test.",
            		"At last, we are here! As the app is up and ready, we launch it in the respective platform's app stores."
            };
            
            String[] ProcessImages = {
            		"//img[@alt='requirement']",
            		"//img[@alt='competitor-analytics']",
            		"//img[@alt='wireframe']",
            		"//img[@alt='ui-and-ux']",
            		"//img[@alt='coding']",
            		"//img[@alt='QA-check']",
            		"//img[@alt='launching-app']"
            };
            
            validateElements(driver, ProcessNames, ProcessContents, ProcessImages, "Process");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Technologies we use']");
            
            // Technologies we use Section
            
            printSectionHeader("Technologies we use Section");
            
            validateTitle(driver, "//h2[normalize-space()='Technologies we use']", "Technologies we use", "Title");
            validateTitle(driver, "//p[contains(text(),'These are the robust enterprise-grade technologies')]", "These are the robust enterprise-grade technologies that we use in developing your custom Real Estate App solution. These technologies help us in developing in-accordance to or sometimes even better products than what you imagined.", "Content");
            
            String[] TechnologiesImage = {
            		"//img[@alt='technologies-icon1']",
            		"//img[@alt='technologies-icon2']",
            		"//img[@alt='swift']",
            		"//img[@alt='Aws']",
            		"//img[@alt='azure']",
            		"//img[@alt='mysql']",
            		"//img[@alt='cassandra']",
            		"//img[@alt='stream-analytics']",
            		"//img[@alt='mongodb']",
            		"//img[@alt='google-api']",
            		"//img[@alt='socket']",
            		"//img[@alt='send-grid']"
            };
            
            checkMultipleImagesVisibility(driver, TechnologiesImage);
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Capermint Real Estate Gamification Advantages']");
            
            // Capermint Real Estate Gamification Advantages Section
            
            printSectionHeader("Capermint Real Estate Gamification Advantages Section");
            
            validateTitle(driver, "//h2[normalize-space()='Capermint Real Estate Gamification Advantages']", "Capermint Real Estate Gamification Advantages", "Title");
            validateTitle(driver, "//p[contains(text(),'We offer various advantages with our Real Estate A')]", "We offer various advantages with our Real Estate App Development Service that keeps us ahead of the competition and our clients happy. Advantages of Capermint Real Estate Apps are as follows", "Content");
            
            String[] AdvantagesNames = {
            	    "Robust Real Estate App Performance",
            	    "Expert Team of Real Estate App Developers",
            	    "Cost-Effective Solutions",
            	    "Transparent Communication",
            	    "End-to-End Support",
            	    "High-end security",
            	    "Real Estate App Maintenance & Support"
            };
            
            String[] AdvantagesContents = {
            	    "The work that we do defines us, and we want to be defined as the best; and therefore, our Real Estate app works seamlessly across all devices.",
            	    "Our team of dedicated developers is the most reliable team to develop the perfect Real Estate app solution for your Real Estate business.",
            	    "We understand the cut-throat competition that prevails in the market, and therefore we have kept our pricing policy highly flexible that can fit every budget.",
            	    "As soon as we start your game development, we assign a dedicated project manager to keep you in the loop of everything that is happening around your application.",
            	    "You just have to share your idea; the rest lies to us. From planning, design, development, deployment, testing, launching to after services, we will take care of it all.",
            	    "What most concerns the users about the app is secure and therefore we develop Real Estate solutions that are 100% SSL secure.",
            	    "We render support and maintenance to all the apps that we develop. We can also expand this service based on the client’s requirements."
            };
            
            String[] AdvantagesImages = {
            		"//img[@class='attachment-full size-full wp-image-108790']",
            		"//img[@alt='team']",
            		"//img[@alt='money-bag']",
            		"//img[@class='attachment-full size-full wp-image-108798']",
            		"//img[@alt='customer-service']",
            		"//img[@alt='high-end-communication']",
            		"//img[@alt='gear']"
            };
            
            validateElements(driver, AdvantagesNames, AdvantagesContents, AdvantagesImages, "Advantages");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[contains(text(),'Why is Capermint the best White Label Real Estate ')]");
            
            // Why is Capermint Section
            
            printSectionHeader("Why is Capermint Section");
            
            validateTitle(driver, "//h2[contains(text(),'Why is Capermint the best White Label Real Estate ')]", "Why is Capermint the best White Label Real Estate App Development Company?", "Title");
            validateTitle(driver, "//p[contains(text(),'Capermint  is a pioneer in the mobile app developm')]", "Capermint  is a pioneer in the mobile app development field. Being in this field for years has given us expertise that helps us in developing chartbuster mobile apps. We develop all the apps by keeping in mind two parties, you and the ultimate user of the app.", "Paragraph 1");
            validateTitle(driver, "//p[contains(text(),'We develop apps that facilitate your work and solv')]", "We develop apps that facilitate your work and solve your problem. On the other hand, our goal is to create an app a user wants and expects from you. The app is going to be the ultimate asset of your business, and therefore we want to provide you the best, and with the help of our expert developers and robust technology, we have been able to do so.", "Paragraph 2");
            validateTitle(driver, "//p[contains(text(),'We aim to develop a Real Estate App for you that c')]", "We aim to develop a Real Estate App for you that can acquire an astounding position in your market, as well as in the global market, and attract a remarkable number of customers. Our Real Estate App solution will definitely increase the profits of your business.", "Paragraph 3");
            
            // Page Scrolling
            
            scrollToElementByXpath(driver, "//h2[normalize-space()='Real Estate App Development FAQs']");
            
            // Real Estate App Development FAQs Section
            
            printSectionHeader("Real Estate App Development FAQs Section");
            
            validateTitle(driver, "//h2[normalize-space()='Real Estate App Development FAQs']", "Real Estate App Development FAQs", "Title");
            validateTitle(driver, "//p[contains(text(),'We want to solve all the queries that you may have')]", "We want to solve all the queries that you may have and answer all the questions that may enter your mind. Therefore, here is a curated list of Frequently Asked Questions about Real Estate App development that most of the clients ask. If you have any questions other than these, you can drop a message below or call us.", "Content");
            
            List<String> faqQuestions = Arrays.asList(
            	    "Do you provide post-sales support?",
            	    "How much does it cost for Real Estate app development?",
            	    "How much time does it take to develop a Real Estate mobile app?"
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
