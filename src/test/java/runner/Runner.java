package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefs"},
        tags = "@InspiredTest",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report.html"})
//      plugin = { "pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class Runner {

}
