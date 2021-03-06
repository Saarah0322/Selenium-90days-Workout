package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/main/java/feature/bigbasket.feature",
                 glue = "steps",
                 dryRun = false,snippets = SnippetType.CAMELCASE,
                 monochrome = true, plugin = {"pretty","html:target/cucumber"})
               
                  
public class BigbasketRunTest extends AbstractTestNGCucumberTests {

}
