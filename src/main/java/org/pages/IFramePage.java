package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class IFramePage extends BasePage {

    private final By playWriteIFrame = By.id("iframe-1");

    public IFramePage(WebDriver driver) {


        super(driver);

    }

    private void switchToInnerIFrame(By by) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));

    }


    public PlaywrightIframePage switchToPlayWriteIFrame() {
        switchToInnerIFrame(playWriteIFrame);
        return new PlaywrightIframePage(driver);
    }

}
