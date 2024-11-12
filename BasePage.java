package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final Actions actions;


    public BasePage(WebDriver driver) {

        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }


    public void moveToElement(By by){

        WebElement webElement = driver.findElement(by);
        actions.moveToElement(webElement).build().perform();

    }


    public  void clickOnElement(By by){

        WebElement webElement = driver.findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();    }
}
