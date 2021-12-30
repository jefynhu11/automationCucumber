package com.jeferson.pages;

import com.jeferson.framework.support.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcessLoginPage {

    WebDriver driver;

    public AcessLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessWindowLogin() {
        driver.get(Property.get("url"));

    }

    public void createEmailField(String valor) {
        driver.findElement(By.id("email_create")).sendKeys(valor);
    }

    public void createAnAccountButton(){
        driver.findElement(By.id("SubmitCreate")).click();
    }
}
