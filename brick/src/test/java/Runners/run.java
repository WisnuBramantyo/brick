package Runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"Features"},
        glue = {"StepDefinitions"},
        dryRun = false,
        monochrome = true
)

public class run {

}
