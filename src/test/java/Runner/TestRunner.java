package Runner;

import org.junit.runner.RunWith;

//In TestRunner.java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features= {"C:\\Users\\melav\\Downloads\\BDDFramework\\src\\test\\java\\FeatureFiles\\Login.feature"},
glue= {"StepDefinitions"},
dryRun=false
//monochrome=true
//plugin= {"pretty","json:Report/Cucumber.json",
//		"junit:Report/XMLCucucumber.xml",
//		"html:Report/cucumber-html-reports"
//		}
//strict=true
)
public class TestRunner {

}
