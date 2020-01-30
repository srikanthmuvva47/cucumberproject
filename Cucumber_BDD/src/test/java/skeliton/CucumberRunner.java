package skeliton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty","html:cucumber-reports"},
features= {"src/test/resources/skeliton/DemoWebshopLogin.feature"},
monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)
public class CucumberRunner {
	

}
