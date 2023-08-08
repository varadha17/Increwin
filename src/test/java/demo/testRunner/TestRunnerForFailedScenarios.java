package demo.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@output/rerun.txt", 
		glue= {"stepDef","AppHooks"}
		)

public class TestRunnerForFailedScenarios {

}
