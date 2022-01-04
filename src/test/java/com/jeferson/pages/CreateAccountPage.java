package com.jeferson.pages;

import com.jeferson.framework.support.Fakers;
import com.jeferson.framework.support.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateAccountPage {

    WebDriver driver;
    WebDriverWait wait;
    Fakers fakers;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        fakers = new Fakers();
    }

    public void title(int value) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));

        if (1==value) {
            driver.findElement(By.id("id_gender1")).click();
        } else if (2==value){
            System.out.println("pegou feminino");
            driver.findElement(By.id("id_gender2")).click();
        } else {
            System.out.println("pegou nada");
        }
    }

    public void firstNameField() {
        driver.findElement(By.id("customer_firstname")).sendKeys(fakers.getFirstName());
    }
    public void lastNameField() {
        driver.findElement(By.id("customer_lastname")).sendKeys(fakers.getLastName());
    }
    public void passwordField() {
        driver.findElement(By.id("passwd")).sendKeys(fakers.getPassword());
    }
    public void dateSelect() {
        Select date = new Select(driver.findElement(By.id("days")));
        date.selectByValue("3");
    }
    public void monthSelect() {
        Select date = new Select(driver.findElement(By.id("months")));
        date.selectByValue("11");
    }
    public void yearSelect() {
        Select date = new Select(driver.findElement(By.id("years")));
        date.selectByValue("1992");
    }
    public void adressField() {
        driver.findElement(By.id("address1")).sendKeys(fakers.getAddress1());
    }
    public void cityField() {
        driver.findElement(By.id("city")).sendKeys(fakers.getCity());
    }
    public void stateSelect() {
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByVisibleText("Alaska");
    }
    public void codeField() {
        driver.findElement(By.id("postcode")).sendKeys("00000");
    }
    public void mobileField() {
        driver.findElement(By.id("phone_mobile")).sendKeys("986532741");
    }
    public void registerButton() {
        driver.findElement(By.id("submitAccount")).click();
    }
}
