package automationTask;

import org.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.HomePage;
import org.pages.HomePageLinks;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationTest {
    private  final WebDriver driver;
    private final HomePage homePage;
    private final IFramePage iframePage;


    public AutomationTest() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        iframePage = new IFramePage(driver);
    }

    @BeforeClass
    public void setUp() {

        driver.manage().window().maximize();
    }

    @Test
    public void automationTest() {

        driver.get( "https://practice-automation.com/");
        homePage.clickOnButton(HomePageLinks.IFRAMES);
        PlaywrightIframePage playwrightIframePage=iframePage.switchToPlayWriteIFrame();
        playwrightIframePage.clickOnLinkUsingAction(PlaywrightIframeLinks.GITHUB);
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);


        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/microsoft/playwright","match url failed");

    }

    @AfterTest
    public void afterTest() {
        driver.quit();

    }


}
