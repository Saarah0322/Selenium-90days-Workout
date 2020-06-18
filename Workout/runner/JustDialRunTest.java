package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/main/java/feature/justdial.feature",
                 glue = "steps",
                 dryRun = false,snippets = SnippetType.CAMELCASE,
                 monochrome = true, plugin = {"pretty","html:target/cucumber"})
               
                  
public class JustDialRunTest extends AbstractTestNGCucumberTests {

}
