package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"},
        features = "@TestOutput/failed_scenario.txt",
        glue = {"stepDefinitions","hooks"},
        dryRun = false
)
public class FailedRunner {
}
/*
    //rerun plugin i ile fail olan scenarioları burada belirtmiş olduğumuz failed_scenario.txt dosyası içinde tutabiliriz

    Bu classda sadece fail olan test scenariolarını çalıştıracağız
    Sadece txt dosyasında ki fail olan scenariolar çalıştırılacağı için tags parametresine gerek yoktur
 */