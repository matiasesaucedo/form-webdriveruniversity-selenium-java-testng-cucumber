package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinitions", "hooks"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
