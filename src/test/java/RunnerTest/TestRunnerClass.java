package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"StepDefination"},
		dryRun=false,
		tags="@EndToEndTesting",
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		
		
		)


public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
