package com.jeferson.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcessLoginPage {

    WebDriver driver;

    public AcessLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessWindowLogin() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public void createEmailField(String valor) {
        driver.findElement(By.id("email")).sendKeys(valor);
    }
}
