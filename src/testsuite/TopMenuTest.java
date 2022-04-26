package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //click on the ‘Computers’ Tab
        clickOnElement(By.partialLinkText("Computers"));
        //actual tab
        String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']"));
        //expected tab
        String expectedPageTitle = "Computers";
        //Verify the text ‘Computers’
        Assert.assertEquals("Incorrect tab display", expectedPageTitle, actualPageTitle);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        // click on the ‘Electronics’ Tab
        clickOnElement(By.partialLinkText("Electronics"));
        //actual value came from webelement by getText method
        String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']"));
        //expected tab value
        String expectedPageTitle = "Electronics";
        //* Verify the text ‘Electronics’
        Assert.assertEquals("Incorrect tab display", expectedPageTitle, actualPageTitle);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        clickOnElement(By.partialLinkText("Apparel"));
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='page-title']"));
        //actual value came from webelement by getText method
        String actualPageTitle = pageTitle.getText();
        //expected tab value
        String expectedPageTitle = "Apparel";
        // Verify the text ‘Apparel’
        Assert.assertEquals("Incorrect tab spelling", expectedPageTitle, actualPageTitle);

    }

    //click on the ‘Digital downloads’ Tab
    // Verify the text ‘Digital downloads’
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDown = driver.findElement(By.partialLinkText("Digital downloads"));
        digitalDown.click();
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualPageTitle = pageTitle.getText();
        String expectedPageTitle = "Digital downloads";
        Assert.assertEquals("incorrect Page Title", expectedPageTitle, actualPageTitle);

    }

    /*

     * click on the ‘Books’ Tab
     * Verify the text ‘Books’
     */
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement books = driver.findElement(By.partialLinkText("Books"));
        books.click();
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualPageTitle = pageTitle.getText();
        String expectedPageTitle = "Books";
        Assert.assertEquals("Incorrect Page Title", expectedPageTitle, actualPageTitle);
    }

    /*
    userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
     */
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        clickOnElement(By.partialLinkText("Jewelry"));
        String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']"));
        String expectedPageTitle = "Jewelry";
        Assert.assertEquals("Incorrect Page Title", expectedPageTitle, actualPageTitle);
    }

    /*
    userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’
     */
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.partialLinkText("Gift Cards"));
        String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']"));
        String expectedPageTitle = "Gift Cards";
        Assert.assertEquals("Incorrect Page Title", expectedPageTitle, actualPageTitle);
    }
    @Test
    public void verifyAllTabsAndPageTitleUsingForEach() {
        //array list for all tabs
        String allTabs[] = {"Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"};
        //created For Each Loop
        for (String tab : allTabs) {
            System.out.println(tab);
            //Single WebElement created  for all Tabs
            clickOnElement(By.partialLinkText(tab));
            //WebElement and Xpath to get page Title
            //Actual page tile from WebElement
            String actualPageTitle = getTextFromElement(By.xpath("//div[@class='page-title']"));
           //Expected page tile from allTabs Array
            String expectedPageTitle = tab;
            //verify Actual Vs Expected
            Assert.assertEquals(tab + " Incorrect Page Title " ,expectedPageTitle,actualPageTitle);
        }
    }

    @After
    public void tearDown() {
        closeBrowsers();
    }
}


