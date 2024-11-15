package com.capermint.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepagetest {
    private WebDriver driver;
    
    private void assertTextEquals(By locator, String expectedText, String errorMessage) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText, errorMessage);
    }

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.capermint.com");
    }

    @Test
    public void validateHomePageText() {
        assertTextEquals(By.xpath("//h1"), "We grow your Business through Gamification", "We grow your Business through Gamification");
        assertTextEquals(By.xpath("//span[text()='Leading App & Game Development Agency']"), "Leading App & Game Development Agency", "Text 2 does not match!");
        assertTextEquals(By.xpath("//div[text()='Engage your audience & achieve your goals with Capermint’s innovative & engaging AI-based App & Gaming solutions.']"), "Engage your audience & achieve your goals with Capermint’s innovative & engaging AI-based App & Gaming solutions.", "Text 3 does not match!");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
