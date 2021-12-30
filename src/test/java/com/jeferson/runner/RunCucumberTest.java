package com.jeferson.runner;

import com.jeferson.framework.support.BaseTest;
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
public class RunCucumberTest extends BaseTest {

}
