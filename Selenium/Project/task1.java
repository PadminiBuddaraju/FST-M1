package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;


public class task1 {
    public static void main(String[] args) {
        // Verify the website title
        // Goal: Read the title of the website and verify the text

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        // Navigate to ‘https://alchemy.hguy.co/lms’
        driver.get("https://alchemy.hguy.co/lms");

        // Get the title of the website
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is:" + pageTitle);

        // Make sure it matches "Alchemy LMS – An LMS Application" exactly
        // Assert.assertEquals(pageTitle,"Alchemy LMS – An LMS Application");

        assertTrue(pageTitle.contains("Alchemy LMS – An LMS Application"));

        // If it matches, close the browser
        driver.quit();

    }
}
