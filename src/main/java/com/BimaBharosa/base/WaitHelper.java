package com.BimaBharosa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper extends Main {



    public WaitHelper(WebDriver driver){

    }

    public void WaitForElement(WebElement element, long timeOutInSeconds){
        logger.info("waiting for element visibilityOf..");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.info("element is visible..");
    }

}
