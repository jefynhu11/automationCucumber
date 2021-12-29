package com.jeferson.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/features"},
        tags = {"@cadastrar-login"},
        glue = {"com/jeferson/tasks"}
)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("Iniciou");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Finalizou");
        driver.quit();
    }
}
