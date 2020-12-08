package runner;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
	
		features = "Feature"
		,glue={"stepDefinition"}
		,tags={"@FreeCRMTest"}
		//,monochrome=true //to display clear output on console in readable format
		//,dryRun=true //checks the mapping between feature file and stepDef file
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
