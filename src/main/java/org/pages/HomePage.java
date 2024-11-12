package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);

    }

    private By getLinkLocator(HomePageLinks homePageLink) {

        return By.cssSelector("a[href='https://practice-automation.com/" + homePageLink + "/']");

    }


    public void clickOnButton(HomePageLinks homePageLink) {
        moveToElement(getLinkLocator(homePageLink));
        clickOnElement(getLinkLocator(homePageLink));
    }
}
