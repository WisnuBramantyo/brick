package Runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@CucumberContextConfiguration
@Cucumber
@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"registerLogin.feature"},
        glue = {"StepDefinitions"},
        dryRun = false,
        monochrome = true
)

public class run {

}
