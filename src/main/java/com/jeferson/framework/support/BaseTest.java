package com.jeferson.framework.support;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("Iniciou");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        System.out.println("Finalizou");
        Thread.sleep(3000);
        driver.quit();
    }

}
