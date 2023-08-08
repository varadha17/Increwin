package demo.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/main/java/featureFile",
		glue= {"stepDef","AppHooks"},
		tags="@product or @login",
		monochrome=true,
		dryRun = false,
		plugin= {"rerun:output/rerun.txt"}
		
		)


public class TestRunner {


}
