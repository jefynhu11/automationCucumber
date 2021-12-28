package com.jeferson.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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

//    public static WebDriver driver;
//
//    @BeforeEach
//    public static void setUp() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    public static void tearDown() {
//        driver.quit();
//    }
}
