package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaywrightIframePage extends BasePage {

    PlaywrightIframePage(WebDriver driver) {
        super(driver);
    }


    private By getLinkLocator(PlaywrightIframeLinks playwrightIframeLinks) {

        return By.cssSelector("a[href='"+ playwrightIframeLinks+"']");

    }
    public void clickOnLinkUsingAction(PlaywrightIframeLinks playwrightIframeLinks) {

        moveToElement(getLinkLocator( playwrightIframeLinks));
        clickOnElement(getLinkLocator( playwrightIframeLinks));
    }



}
