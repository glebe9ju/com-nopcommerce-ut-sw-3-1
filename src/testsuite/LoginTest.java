package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find login link and click on login link
        clickOnElement(By.linkText("Log in"));
        //welcome page title by classname by locator
        String actualWelcomeMessage = getTextFromElement(By.className("page-title"));
        // ExpectedMessage
        String expectedMessage = "Welcome, Please Sign In!";
        //validate Actual and Expected Message
        Assert.assertEquals("Wrong Welcome Message", expectedMessage, actualWelcomeMessage);

    }
}