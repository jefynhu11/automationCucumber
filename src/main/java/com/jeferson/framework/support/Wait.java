package com.jeferson.framework.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    WebDriver driver;

    public Wait(WebDriver driver){
        this.driver = driver;
    }

    WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

//    public WebElement elementWait (By by) {
//        new WebDriverWait(driver, Duration.ofSeconds(10));
//        return wait.until(ExpectedConditions.elementToBeClickable(by));
//    }

    public WebElement waitVisibilityElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitLoadElement(WebElement element){
        try {
            return new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            return element;
        }
    }

}
