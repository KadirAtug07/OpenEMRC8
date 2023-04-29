package e2e.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "e2e/stepDefinitions",
        tags = "@smoke",
        dryRun = false,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"
        }
)

public class RunnerClass {

}
