package com.jeferson.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void valideAccount() {
        Assert.assertEquals("MY ACCOUNT", driver.findElement(By.cssSelector("#center_column h1")).getText());
    }

    public void signOut() {
        driver.findElement(By.linkText("Sign out")).click();
    }
}
