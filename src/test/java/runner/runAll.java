package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "step",
        plugin = "html:target/PositiveCase_report.html",
        tags = "@Test"
)
public class runAll {
}
