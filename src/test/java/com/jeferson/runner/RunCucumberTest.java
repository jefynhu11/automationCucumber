package com.jeferson.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/features"},
        tags = {"@cadastrar-login"},
        glue = {"com/jeferson/tasks"}
)
public class RunCucumberTest {
}
