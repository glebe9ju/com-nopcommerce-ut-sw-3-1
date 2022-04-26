package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

       // register.click();
         clickOnElement(By.className("ico-register"));
         // click on Register link
        String pageTitle = getTextFromElement(By.className("page-title"));
//      getTextFromElement(By.className("page-title"));

        //verify the text Resgister
        Assert.assertEquals("Text not Display", "Register",pageTitle);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
//        // Click on the ‘Register’ link
        clickOnElement(By.className("ico-register"));
        //Select gender radio button
        clickOnElement(By.id("gender-male"));
        //Enter First name
         sendTexttoElement(By.id("FirstName"),"Katy");
        //Enter Last name
        sendTexttoElement(By.id("LastName"),"Barrott");
        //Select Date of your Birthday
        sendTexttoElement(By.name("DateOfBirthDay"),"15");
        // Select Date of your Month
        sendTexttoElement(By.name("DateOfBirthMonth"),"September");
        // Select Year
       sendTexttoElement(By.name("DateOfBirthYear"),"1959");
        //Enter Email address
        sendTexttoElement(By.id("Email"),"Hey189h@yahoo.com");
        //Enter Password
        sendTexttoElement(By.id("Password"),"hey123");
        //Enter Confirm password
        sendTexttoElement(By.id("ConfirmPassword"),"hey123");
        //Click on REGISTER button
        clickOnElement(By.id("register-button"));
        //Verify the text 'Your registration completed’
        clickOnElement(By.className("result"));
    }
    @After
    public void tearDown() {
        closeBrowsers();
    }
}
