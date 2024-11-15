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

public class Gamification extends CommanMathods{
		
		public Gamification(WebDriver driver) {
			super(driver);
		}
		
		public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        try {
	            driver.get("https://www.capermint.com/gamification/");
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
	            
	            String Title = driver.findElement(By.xpath("//h1[contains(text(),'Gamification Solutions')]")).getText();
	            System.out.print(Title);

	            validateTitle(driver, "//h1[contains(text(),'Gamification Solutions')]", "GAMIFICATION SOLUTIONS FOR BUSINESS GROWTH", "TitleText");
	            validateTitle(driver, "//p[contains(text(),'At Capermint, our experienced gamification team de')]", "At Capermint, our experienced gamification team designs gamified systems tailored to your business goals, helping drive user engagement, increase retention, and boost overall productivity.", "Content");
	            
	            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[1]", "https://www.capermint.com/contact/", "Get a Qaote Button");
	            
	            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-113284']");
	            
	            // Information Section
	            
	            printSectionHeader("Information Section");
	            
	            checkImageVisibility(driver, "//img[@alt='expert-uno']");
	            checkImageVisibility(driver, "//img[@alt='unique']");
	            checkImageVisibility(driver, "//img[@alt='player']");
	            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-104108']");
	            
	            validateTitle(driver, "//span[normalize-space()='20+ Successful Gamification Projects']", "20+ Successful Gamification Projects", "Image1 Title");
	            validateTitle(driver, "//span[normalize-space()='500,000+ Users Engaged with Gamified Solutions']", "500,000+ Users Engaged with Gamified Solutions", "Image2 Title");
	            validateTitle(driver, "//span[normalize-space()='150% Increase in Customer Retention Rates']", "150% Increase in Customer Retention Rates", "Image3 Title");
	            validateTitle(driver, "//span[normalize-space()='5 Star Rating from Satisfied Clients Worldwide']", "5 Star Rating from Satisfied Clients Worldwide", "Image4 Title");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//h3[normalize-space()='Increased Retention']");
	            
	            // gamification section
	            
	            printSectionHeader("gamification section");
	            
	            validateTitle(driver, "//h2[normalize-space()='What is Gamification?']", "What is Gamification?", "Title");
	            validateTitle(driver, "//p[contains(text(),'Gamification is the strategic application of game ')]", "Gamification is the strategic application of game design elements in non-gaming contexts to encourage engagement, increase motivation, and drive specific user actions. By incorporating elements like points, rewards, challenges, and leaderboards into business systems, gamification transforms ordinary experiences into more dynamic and rewarding interactions, making tasks more engaging for users and employees alike.", "Content");
	            validateTitle(driver, "(//h3[normalize-space()=\"Here's how it works:\"])[1]", "Here's how it works:", "Sub-Title");
	            
	            checkImageVisibility(driver, "//img[@alt='Motivation']");
	            validateTitle(driver, "//h3[normalize-space()='Motivation and Engagement']", "Motivation and Engagement", "Image Title 1");
	            validateTitle(driver, "//p[contains(text(),'Incentivize users to participate and stay active t')]", "Incentivize users to participate and stay active through rewards, challenges, and fun elements.", "Image Text 1");
	            
	            checkImageVisibility(driver, "//img[@alt='Ddesired']");
	            validateTitle(driver, "//h3[normalize-space()='Desired Actions']", "Desired Actions", "Image Title 2");
	            validateTitle(driver, "//p[contains(text(),'Guide users towards completing specific tasks or b')]", "Guide users towards completing specific tasks or behaviors that align with your business goals.", "Image Text 2");
	            
	            checkImageVisibility(driver, "//img[@alt='increased-ret']");
	            validateTitle(driver, "//h3[normalize-space()='Increased Retention']", "Increased Retention", "Image Title 3");
	            validateTitle(driver, "//p[contains(text(),'Create enjoyable experiences that keep users engag')]", "Create enjoyable experiences that keep users engaged and coming back over time.", "Image Text 3");
	            
	            // New Section
	            
	            printSectionHeader("New Section");
	            
	            validateTitle(driver, "//h2[contains(text(),'Boost Business Performance with Tailored Gamificat')]", "Boost Business Performance with Tailored Gamification Solutions", "Section Title");
	            validateTitle(driver, "//p[contains(text(),'Achieving business objectives and optimizing team ')]", "Achieving business objectives and optimizing team performance requires the right tools and strategies. With Capermint’s gamification solutions, you can effectively communicate goals, track progress, and motivate users to perform at their best, all while keeping engagement levels high.", "Section Content");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@class='attachment-large size-large wp-image-113344']");
	            
	            // Topic 1
	            
	            printSectionHeader("Topic 1");
	            
	            checkImageVisibility(driver, "//img[@class='attachment-large size-large wp-image-113344']");
	            validateTitle(driver, "//h3[normalize-space()='Provides Real-time Feedback & Notifications']", "Provides Real-time Feedback & Notifications", "Topic 1 Title");
	            validateTitle(driver, "//p[contains(text(),'Real-time feedback and notifications are vital for')]", "Real-time feedback and notifications are vital for maintaining user engagement in a gamified environment. They help users understand their performance and guide them toward their goals, fostering a sense of achievement.", "Topic 1 Content");
	            
	            By listLocator1 = By.xpath("(//ul)[64]/li");
	            List<String> expectedTexts1 = Arrays.asList(
	                "Deliver immediate feedback to users based on their actions, reinforcing positive behaviors.",
	                "Send notifications about completed tasks, upcoming challenges, and achievements to keep users informed.",
	                "Highlight peer accomplishments through notifications to encourage a supportive community."
	            );
	            
	            verifyTextInList(driver, listLocator1, expectedTexts1);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='increases']");
	            
	            // Topic 2
	            
	            printSectionHeader("Topic 2");
	            
	            checkImageVisibility(driver, "//img[@alt='increases']");
	            validateTitle(driver, "//h3[contains(text(),'Increases Engagement & Awareness Using Activity St')]", "Increases Engagement & Awareness Using Activity Streams", "Topic 2 Title");
	            validateTitle(driver, "//p[contains(text(),'Activity streams play a crucial role in enhancing ')]", "Activity streams play a crucial role in enhancing user engagement and awareness within gamified systems. By showcasing real-time updates on user actions, these streams create an interactive environment that keeps users connected and motivated.", "Topic 2 Content");
	            
	            By listLocator2 = By.xpath("(//ul)[65]/li");
	            List<String> expectedTexts2 = Arrays.asList(
	                "Engage users by highlighting their achievements and activities.",
	                "Encourage friendly competition by allowing users to compare their performance with others.",
	                "Provide regular updates on progress to keep users informed and involved."
	            );
	            
	            verifyTextInList(driver, listLocator2, expectedTexts2);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='track-user']");
	            
	            // Topic 3
	            
	            printSectionHeader("Topic 3");
	            
	            checkImageVisibility(driver, "//img[@alt='track-user']");
	            validateTitle(driver, "//h3[normalize-space()='Define and Track User Behaviors']", "Define and Track User Behaviors", "Topic 3 Title");
	            validateTitle(driver, "//p[contains(text(),'Defining and tracking user behaviors is crucial fo')]", "Defining and tracking user behaviors is crucial for understanding how users interact with your platform. This data-driven approach allows businesses to tailor their strategies to enhance user experience.", "Topic 3 Content");
	            
	            By listLocator3 = By.xpath("(//ul)[66]/li");
	            List<String> expectedTexts3 = Arrays.asList(
	                "Monitor user interactions to identify patterns and trends that inform your gamification strategy.",
	                "Establish clear behavior metrics that help track user engagement and participation levels.",
	                "Utilize analytics to assess the impact of gamification on user behaviors and adjust strategies accordingly."
	            );
	            
	            verifyTextInList(driver, listLocator3, expectedTexts3);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='sets-key']");
	            
	            // Topic 4
	            
	            printSectionHeader("Topic 4");
	            
	            checkImageVisibility(driver, "//img[@alt='sets-key']");
	            validateTitle(driver, "//h3[normalize-space()='Sets Key Performance Indicators (KPIs)']", "Sets Key Performance Indicators (KPIs)", "Topic 4 Title");
	            validateTitle(driver, "//p[contains(text(),'Setting Key Performance Indicators (KPIs) is essen')]", "Setting Key Performance Indicators (KPIs) is essential for measuring the success of gamification efforts. These metrics help organizations determine whether their strategies are effectively driving user engagement and achieving business goals.", "Topic 4 Content");
	            
	            By listLocator4 = By.xpath("(//ul)[67]/li");
	            List<String> expectedTexts4 = Arrays.asList(
	                "Define specific, measurable KPIs that align with your business objectives to track gamification effectiveness.",
	                "Utilize gamification tools to visualize KPI progress, making it easy for users to see how they contribute to overall goals.",
	                "Regularly review and adjust KPIs based on performance data to ensure continuous improvement and relevance."
	            );
	            
	            verifyTextInList(driver, listLocator4, expectedTexts4);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='gain-insights']");
	            
	            // Topic 5
	            
	            printSectionHeader("Topic 5");
	            
	            checkImageVisibility(driver, "//img[@alt='gain-insights']");
	            validateTitle(driver, "//h3[normalize-space()='Gain Insights & Measure Performance']", "Gain Insights & Measure Performance", "Topic 5 Title");
	            validateTitle(driver, "//p[contains(text(),'Gaining insights into user behavior and performanc')]", "Gaining insights into user behavior and performance is crucial for optimizing gamification strategies. By analyzing data, organizations can make informed decisions to enhance user experience and engagement.", "Topic 5 Content");
	            
	            By listLocator5 = By.xpath("(//ul)[68]/li");
	            List<String> expectedTexts5 = Arrays.asList(
	                "Utilize analytics tools to track user interactions and behaviors within the gamified system, providing valuable insights for improvement.",
	                "Measure performance against established KPIs to assess the effectiveness of gamification strategies and identify areas for enhancement.",
	                "Generate detailed reports that highlight user engagement trends and performance metrics, aiding in strategic decision-making."
	            );
	            
	            verifyTextInList(driver, listLocator5, expectedTexts5);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='creates']");
	            
	            // Topic 6
	            
	            printSectionHeader("Topic 6");
	            
	            checkImageVisibility(driver, "//img[@alt='creates']");
	            validateTitle(driver, "//h3[normalize-space()='Creates Leaderboards for Motivation']", "Creates Leaderboards for Motivation", "Topic 6 Title");
	            validateTitle(driver, "//p[contains(text(),'Leaderboards are powerful tools that foster compet')]", "Leaderboards are powerful tools that foster competition and motivation among users. By showcasing user achievements, organizations can encourage healthy competition and drive engagement.", "Topic 6 Content");
	            
	            By listLocator6 = By.xpath("(//ul)[69]/li");
	            List<String> expectedTexts6 = Arrays.asList(
	                "Display real-time rankings to motivate users by showing how they stack up against their peers, fostering a sense of accomplishment.",
	                "Encourage continuous participation by resetting leaderboard rankings regularly, maintaining user interest and engagement.",
	                "Reward top performers with badges, certificates, or other incentives to reinforce their efforts and encourage others to improve."
	            );
	            
	            verifyTextInList(driver, listLocator6, expectedTexts6);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='reward']");
	            
	            // Topic 7
	            
	            printSectionHeader("Topic 7");
	            
	            checkImageVisibility(driver, "//img[@alt='reward']");
	            validateTitle(driver, "//h3[normalize-space()='Reward Systems for Milestone Achievements']", "Reward Systems for Milestone Achievements", "Topic 7 Title");
	            validateTitle(driver, "//p[contains(text(),'Reward systems are vital in gamification, providin')]", "Reward systems are vital in gamification, providing users with incentives for achieving specific goals. By recognizing user efforts, organizations can boost motivation and engagement.", "Topic 7 Content");
	            
	            By listLocator7 = By.xpath("(//ul)[70]/li");
	            List<String> expectedTexts7 = Arrays.asList(
	                "Offer tangible rewards for achieving milestones, such as discounts, gift cards, or exclusive content, to enhance user satisfaction.",
	                "Create a points system that allows users to accumulate points for completing tasks, which can be redeemed for rewards, encouraging ongoing participation.",
	                "Recognize and celebrate achievements publicly, fostering a sense of community and encouraging others to strive for similar accomplishments."
	            );
	            
	            verifyTextInList(driver, listLocator7, expectedTexts7);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='learning']");
	            
	            // Topic 8
	            
	            printSectionHeader("Topic 8");
	            
	            checkImageVisibility(driver, "//img[@alt='learning']");
	            validateTitle(driver, "//h3[normalize-space()='Learning and Training Programs']", "Learning and Training Programs", "Topic 8 Title");
	            validateTitle(driver, "//p[contains(text(),'Gamified learning transforms traditional training ')]", "Gamified learning transforms traditional training into engaging experiences, making it easier for users to absorb information and retain skills.", "Topic 8 Content");
	            
	            By listLocator8 = By.xpath("(//ul)[71]/li");
	            List<String> expectedTexts8 = Arrays.asList(
	                "Use game mechanics, such as challenges and quests, to make learning enjoyable and encourage participation in training programs.",
	                "Incorporate progress tracking and achievements to motivate users to complete courses and enhance their skills continuously.",
	                "Offer a blend of competition and collaboration through team-based challenges, fostering teamwork and knowledge sharing among participants."
	            );
	            
	            verifyTextInList(driver, listLocator8, expectedTexts8);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='strengthen']");
	            
	            // Topic 9
	            
	            printSectionHeader("Topic 9");
	            
	            checkImageVisibility(driver, "//img[@alt='strengthen']");
	            validateTitle(driver, "//h3[normalize-space()='Strengthen User Engagement']", "Strengthen User Engagement", "Topic 9 Title");
	            validateTitle(driver, "//p[contains(text(),'Peer-to-peer recognition fosters a sense of commun')]", "Peer-to-peer recognition fosters a sense of community and belonging within the organization. It empowers users to take an active role in supporting each other’s growth and achievements.", "Topic 9 Content");
	            
	            By listLocator9 = By.xpath("(//ul)[72]/li");
	            List<String> expectedTexts9 = Arrays.asList(
	                "Encourage users to acknowledge and appreciate each other’s contributions, promoting a positive and collaborative work environment.",
	                "Create platforms for sharing achievements and successes, allowing team members to celebrate milestones together.",
	                "Implement reward systems that incentivize recognition, reinforcing a culture of appreciation and motivating users to engage more actively."
	            );
	            
	            verifyTextInList(driver, listLocator9, expectedTexts9);
	            
	            // Industries For Gamification Service
	            
	            printSectionHeader("Industries For Gamification Service");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//p[contains(text(),'Gamification can be tailored to meet the unique ne')]");
	            
	            validateTitle(driver, "//h2[normalize-space()='Industries We Provide Gamification Services For']", "Industries We Provide Gamification Services For", "Image Slider Title");
	            validateTitle(driver, "//p[contains(text(),'Gamification can be tailored to meet the unique ne')]", "Gamification can be tailored to meet the unique needs of various industries, enhancing user engagement and driving positive outcomes. Here are some key sectors where our gamification strategies can make a significant impact:", "Image Slider Content");
	            
	            printSectionHeader("Image Slider");
	            
	            checkImageAndNavigate(driver, "(//img[@alt='Entertainment'])[1]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Real Estate'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Finance'])[1]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Education'])[3]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Gaming'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Medical'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Logistic'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Social network'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='Saas'])[2]", "(//button[@aria-label='slick-next'])[1]");
	            checkImageAndNavigate(driver, "(//img[@alt='E-Commerce'])[1]", "(//button[@aria-label='slick-next'])[1]");
	            
	            // New Div Section
	            
	            printSectionHeader("New Div Section");
	            
	            validateTitle(driver, "//h2[normalize-space()='Transform Your Business with Gamification']", "Transform Your Business with Gamification", "New Section Title");
	            validateTitle(driver, "//p[contains(text(),'Capermint specializes in building gamification str')]", "Capermint specializes in building gamification strategies that cater to the unique needs of your industry. Our customized solutions help increase engagement, improve productivity, and boost overall performance. Let us create a gamification plan that aligns perfectly with your business goals.", "New Section Content");

	            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[2]", "https://www.capermint.com/contact/", "Free Demo Button");
	            
	            checkImageVisibility(driver, "(//img[@alt='Gamification'])[2]");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//h2[normalize-space()='Gamification Platforms']");
	            
	            // Gamification Platform Section
	            
	            printSectionHeader("Gamification Platform Section");
	            
	            validateTitle(driver, "//h2[normalize-space()='Gamification Platforms']", "Gamification Platforms", "Section Title");
	            validateTitle(driver, "//p[contains(text(),'Our gamification solutions are versatile and can b')]", "Our gamification solutions are versatile and can be integrated across a wide range of platforms. This ensures that we can enhance user engagement and drive results wherever your audience interacts with your brand. Here are the platforms we support:", "Section Content");
	            
	            checkImageVisibility(driver, "//img[@class='attachment-full size-full wp-image-100267']");
	            validateTitle(driver, "//h3[normalize-space()='Simulations']", "Simulations", "Image 1 Title");
	            
	            checkImageVisibility(driver, "//img[@alt='software']");
	            validateTitle(driver, "//h3[normalize-space()='Software']", "Software", "Image 2 Title");
	            
	            checkImageVisibility(driver, "//img[@alt='application']");
	            validateTitle(driver, "//h3[normalize-space()='Application']", "Application", "Image 3 Title");
	            
	            checkImageVisibility(driver, "//img[@alt='arvrg']");
	            validateTitle(driver, "//h3[normalize-space()='AR/VR']", "AR/VR", "Image 4 Title");
	            
	            checkImageVisibility(driver, "//img[@alt='gameg']");
	            validateTitle(driver, "//h3[normalize-space()='Games']", "Games", "Image 5 Title");
	            
	            checkImageVisibility(driver, "//img[@alt='websites']");
	            validateTitle(driver, "//h3[normalize-space()='Websites']", "Websites", "Image 6 Title");
	            
	            // Gamification Element Section
	            
	            printSectionHeader("Gamification Element Section");
	            
	            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[6]", "Gamification Elements We Implement", "Gamification Element Title");
	            validateTitle(driver, "//p[contains(text(),'Gamification is not just about adding game-like fe')]", "Gamification is not just about adding game-like features; it’s about incorporating specific elements that enhance user experience and engagement. Here are the key elements we implement to create effective gamified solutions:", "Gamification Element Text");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//img[@alt='process-bars']");
	            
	            // Testing All the Elements
	            
	            printSectionHeader("Elements");
	            
	            String[] ElementsNames = {
	            	    "Points, Badges, Leaderboards",
	            	    "Progress Bars",
	            	    "Levels and Challenges",
	            	    "Reward Systems",
	            	    "Achievement Unlocks",
	            	    "Quests and Missions",
	            	    "Feedback Mechanisms",
	            	    "Social Interaction",
	            	    "Storytelling",
	            	    "Custom Avatars"
	            	};

	            String[] ElementsContents = {
	            		"Points are awarded for completing tasks, badges signify achievements, and leaderboards foster competition among users, driving engagement.",
	                    "Visual representations of progress help users track their journey, providing motivation to complete tasks and reach their goals.",
	               	    "Introducing levels and challenges allows users to unlock new experiences as they progress, maintaining interest and encouraging continued participation.",
	               	    "Tangible rewards incentivize users to engage with the system, reinforcing positive behaviors and boosting satisfaction.",
	               	    "Unlocking achievements creates a sense of accomplishment, motivating users to reach higher goals and explore the platform further.",
	               	    "Structured tasks in the form of quests make the experience more engaging, allowing users to explore and accomplish objectives at their own pace.",
	               	    "Continuous feedback keeps users informed about their performance, guiding them toward improvement and maintaining motivation.",
	               	    "Incorporating social features allows users to connect, collaborate, and compete with each other, enhancing the overall experience.",
	               	    "Engaging narratives make gamified experiences more immersive, allowing users to relate to the content and feel more invested in their progress.",
	               	    "Personalized avatars increase user investment in the gamified experience, allowing for a unique identity within the platform."
	            	};

	            String[] imageXpaths = {
	           		   "//img[@class='attachment-full size-full wp-image-100281']",
	           		   "//img[@alt='process-bars']",
	           		   "//img[@alt='Mobile game']",
	            	    "//img[@alt='Gift box']",
	            	    "//img[@alt='achievement']",
	           		    "//img[@alt='Dart']",
	           		    "//img[@alt='Chat']",
	           		    "//img[@alt='social-inter']",
	           		    "//img[@alt='storytelling']",
	           		    "//img[@alt='boy']"
	            	};

	            validateElements(driver, ElementsNames, ElementsContents, imageXpaths, "Elements");
	            
	            // Page Scroling
	            
	            scrollToElementByXpath(driver, "//h2[normalize-space()='Benefits of Implementing Gamification']");
	            
	            // Benefits of Gamification Section
	            
	            printSectionHeader("Benefits of Gamification Section");
	            
	            validateTitle(driver, "//h2[normalize-space()='Benefits of Implementing Gamification']", "Benefits of Implementing Gamification", "Main Title");
	            validateTitle(driver, "//p[contains(text(),'Gamification offers a range of advantages that can')]", "Gamification offers a range of advantages that can significantly impact your business and its users. By integrating game-like elements into your processes, you can unlock new levels of engagement and performance. Here are some of the key benefits:", "Content");
	            
	            validateTitle(driver, "//span[normalize-space()='#1. Enhanced User Engagement']", "#1. Enhanced User Engagement", "Benefit 1");
	            validateTitle(driver, "//p[contains(text(),'Gamification transforms mundane tasks into interac')]", "Gamification transforms mundane tasks into interactive experiences, capturing user attention and encouraging active participation.", "Content");

	            validateTitle(driver, "//span[normalize-space()='#2. Improved Learning Outcomes']", "#2. Improved Learning Outcomes", "Benefit 2");
	            validateTitle(driver, "//p[contains(text(),'Incorporating gamification in training programs bo')]", "Incorporating gamification in training programs boosts retention and understanding, making learning more enjoyable and effective.", "Content");

	            validateTitle(driver, "//span[normalize-space()='#3. Increased Productivity and Motivation']", "#3. Increased Productivity and Motivation", "Benefit 3");
	            validateTitle(driver, "//p[contains(text(),'By setting clear goals and rewarding achievements,')]", "By setting clear goals and rewarding achievements, gamification motivates users to perform at their best and complete tasks efficiently.", "Content");

	            validateTitle(driver, "//span[normalize-space()='#4. Better Customer Retention']", "#4. Better Customer Retention", "Benefit 4");
	            validateTitle(driver, "//p[contains(text(),'Engaging users through gamified experiences foster')]", "Engaging users through gamified experiences fosters loyalty, keeping customers coming back for more.", "Content");

	            validateTitle(driver, "//span[normalize-space()='#5. Real-time Performance Monitoring']", "#5. Real-time Performance Monitoring", "Benefit 5");
	            validateTitle(driver, "//p[contains(text(),'Gamification provides insights into user behavior ')]", "Gamification provides insights into user behavior and performance, allowing businesses to adjust strategies on the fly for optimal results.", "Content");

	            validateTitle(driver, "//span[normalize-space()='#6. Data-Driven Insights']", "#6. Data-Driven Insights", "Benefit 6");
	            validateTitle(driver, "//p[contains(text(),'Collecting data through gamified systems helps org')]", "Collecting data through gamified systems helps organizations analyze user interactions, leading to better decision-making and improved strategies.", "Content");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[8]");

	            // Technologies For Gamification
	            
	            printSectionHeader("Technologies For Gamification Section");
	            
	            validateTitle(driver, "(//h2[@class='elementor-heading-title elementor-size-default'])[8]", "Technologies We Use For Gamification", "Technology Section Title");
	            
	            String[] Technologiesimage = {
		           		   "//img[@alt='unity_gamefication']",
		           		   "//img[@alt='unreal_gamefication']",
		           		   "//img[@alt='autodesk_gamefication']",
		            	   "//img[@alt='pixi_gamefication']",
		            	   "//img[@alt='adobe_gamefication']",
		           		   "(//img[@alt='sketch_gamefication'])[2]",
		           		   "//img[@alt='blender_gamefication']",
		           		   "//img[@alt='roblox_gamefication']",
		           		   "//img[@alt='figma_gamefication']",
		           		   "(//img[@alt='construct_gamefication'])[1]"
		            	};
	            
	            checkMultipleImagesVisibility(driver, Technologiesimage);
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//h2[normalize-space()='Our Gamification Portfolio']");
	            
	            // Our Gamification Portfolio Section
	            
	            printSectionHeader("Our Gamification Portfolio");
	            
	            validateTitle(driver, "//h2[normalize-space()='Our Gamification Portfolio']", "Our Gamification Portfolio", "Title");
	            validateTitle(driver, "//p[contains(text(),'Explore our diverse portfolio of successful gamifi')]", "Explore our diverse portfolio of successful gamification projects that showcase our expertise and innovative approach to driving user engagement and business growth. Here are some highlights:", "Content");
	            
	            String[] PortfolioNames = {
	            	    "Tata 1mg",
	            	    "IndicAI Sign App - Designed for Hearing Impaired Users",
	            	    "Tailory Partner",
	            	    "MPTV",
	            	    "My Golf Pro",
	            	    "Empire Games",
	            	    "BasketG",
	            	    "Angola Experiences",
	            	    "HungryJi"
	            	};
	            
	            String[] Portfolioimages = {
	           		   "(//img[@class='gallery-item-thumbnail'])[1]",
	           		   "//img[@alt='indic-thumbnail']",
	           		   "(//img[@class='gallery-item-thumbnail'])[3]",
	            	   "//img[@alt='mptv-thumbnail']",
	            	   "//img[@alt='my-golf-pro-thumbnail-2-768x571']",
	           		   "//img[@alt='Empire-games']",
	           		   "//img[@alt='basketg case study thumbnail']",
	           	       "//img[@alt='Angola-thumbnail']",
	           	       "//img[@alt='hungryji-thumbnail']"
	            	};
	            
	            validateElements(driver, PortfolioNames, null, Portfolioimages, "Portfolio");
	            
	            // Page Scrolling
	            
	            scrollToElementByXpath(driver, "//h2[normalize-space()='Why Choose Capermint for Gamification Solutions?']");
	            
	            // Gamification Solutions Section
	            
	            printSectionHeader("Gamification Solutions Section");
	            
	            validateTitle(driver, "//h2[normalize-space()='Why Choose Capermint for Gamification Solutions?']", "Why Choose Capermint for Gamification Solutions?", "Section Title");
	            validateTitle(driver, "//p[contains(text(),'At Capermint, we specialize in delivering gamifica')]", "At Capermint, we specialize in delivering gamification solutions that drive user engagement, boost performance, and transform the way your business interacts with its audience. Here’s why we’re the right choice for your gamification needs:", "Section Content");
	            
	            String[] Solutiontitles = {
	            	    "Seamless Performing Apps",
	            	    "Immense Experience",
	            	    "Cost-Effective Solutions",
	            	    "Pioneering Technologies",
	            	    "Substantial Development Process",
	            	    "Transparent Communication",
	            	    "Scheduled Delivery",
	            	    "Effective Interactivity",
	            	    "Detailed Analysis",
	            	    "End-to-End Support",
	            	    "High-Level Expertise",
	            	    "Crystal-Clear Cooperation"
	            	};

	            	String[] Solutioncontents = {
	            	    "We deliver high-quality, optimized apps that run flawlessly across various platforms, ensuring a smooth user experience.",
	            	    "Our team boasts extensive experience in gamification design and development, guaranteeing successful implementation and a proven track record.",
	            	    "We prioritize delivering exceptional value while remaining mindful of your budget constraints, offering competitive and transparent pricing.",
	            	    "We leverage cutting-edge technologies to create innovative and engaging gamified experiences, keeping your app ahead of the curve.",
	            	    "We follow a meticulous development process, with each step carefully considered and executed, guaranteeing a successful outcome.",
	            	    "We believe in clear and consistent communication, keeping you informed throughout the entire process, and fostering a strong partnership.",
	            	    "We adhere to strict deadlines, ensuring your project is completed on time and within budget, delivering results as promised.",
	            	    "We design interactive elements that foster user engagement and keep them coming back for more, driving long-term app usage.",
	            	    "We conduct in-depth research and user analysis to tailor the gamification elements perfectly to your target audience, maximizing engagement.",
	            	    "We offer comprehensive support, from initial ideation to post-launch maintenance and optimization, ensuring a long-lasting successful app.",
	            	    "Our team comprises highly skilled professionals with a deep understanding of gamification principles and user psychology, guaranteeing the best possible results.",
	            	    "We prioritize building strong partnerships based on open communication and mutual trust, ensuring a collaborative and successful journey."
	            	};
	            	
	            	String[] SolutionImages = {
	            		"//img[@class='attachment-full size-full wp-image-100334']",
	            		"//img[@alt='immense']",
	            		"//img[@alt='cost-effective']",
	            		"//img[@alt='pioneering']",
	            		"//img[@alt='substantial']",
	            		"//img[@alt='transparent_gamefication']",
	            		"//img[@alt='Scheduled']",
	            		"//img[@alt='Effective']",
	            		"//img[@alt='Detailed_gamefication']",
	            		"//img[@alt='End gamification']",
	            		"//img[@alt='High_gamefication']",
	            		"//img[@alt='crystal']"
	            	};
	            
		            validateElements(driver, Solutiontitles, Solutioncontents, SolutionImages, "Solutions");
		            
		            // Page Scrolling
		            
		            scrollToElementByXpath(driver, "//h2[normalize-space()='Increase User Engagement by 80%']");
		            
		            // Increase User Engagement Section
		            
		            validateTitle(driver, "//h2[normalize-space()='Increase User Engagement by 80%']", "Increase User Engagement by 80%", "Section Title");
		            validateTitle(driver, "//p[contains(text(),'Enhance your app with gamification and see user ac')]", "Enhance your app with gamification and see user activity soar. Gamification for apps drives deeper user interaction, leading to longer sessions and a more active user base.", "Section Text1");
		            validateTitle(driver, "//p[normalize-space()='Experience the impact of gamification for apps.']", "Experience the impact of gamification for apps.", "Section Text2");
		            
		            validateLink(driver, "(//a[@class='elementor-button elementor-button-link elementor-size-sm'])[3]", "https://www.capermint.com/contact/", "Schedule call Button");
		            
		            checkImageVisibility(driver, "//img[@alt='increase']");
		            
		            // Page Scrolling
		            
		            scrollToElementByXpath(driver, "//span[normalize-space()='FAQS']");
		            
		            // FAQ Section
		            
		            validateTitle(driver, "//span[normalize-space()='FAQS']", "FAQS", "FAQ Text");
		            validateTitle(driver, "//p[contains(text(),'Explore the frequently asked questions about gamif')]", "Explore the frequently asked questions about gamification services", "FAQ Content");
		            
		            Thread.sleep(5000);
		            
		            List<String> faqQuestions = Arrays.asList(
		            	    "How can gamification benefit my mobile app",
		            	    "Is gamification right for every app?",
		            	    "What are some common gamification elements?",
		            	    "How can I measure the success of my gamification strategy?",
		            	    "What types of gamification solutions do you offer?",
		            	    "What is your development process for gamifying an app?",
		            	    "What kind of support do you offer after the gamification features are implemented?",
		            	    "How long does it typically take to implement gamification in an app?",
		            	    "How much does it typically cost to implement gamification in an app?",
		            	    "Can I get a free consultation to discuss my specific gamification needs?"
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