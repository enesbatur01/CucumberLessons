package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-reports/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt"},
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@US001",
        dryRun = false
)
public class ParallelRunner1 {
}
/*
    Runner class body si içerisinde bir şey yazılmaz
    Runner classında önemli olan iki tane notasyon vardır
    1) @RunWith(Cucumber.class) ==> Runner classımıza calisma özelliği verir
    2) @CucumberOptions ==> parantezi içinde hangi testleri çalıştıracağımızı, hangi raporları alacağımızı,
    features ve glue parametrelerini ve diğer test e dair ayıntıları ve çeşitli plugin ekleyebiliriz
    dryRun == true => iken feature file daki test senaryolarını çalıştırmadan, eksik stepdefinitionları kontrol eder
    browser açmaz çalıştırır gibi yapar sadece kontrol yapar.

    //rerun plugin i ile fail olan scenarioları burada belirtmiş olduğumuz failed_scenario.txt dosyası içinde tutabiliriz
 */