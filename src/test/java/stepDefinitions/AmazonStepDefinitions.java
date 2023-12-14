package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
    amazonPage.searcBox.sendKeys("iphone", Keys.ENTER);
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
      Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        amazonPage.searcBox.sendKeys("samsung", Keys.ENTER);
    }

    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.searcBox.sendKeys("nokia", Keys.ENTER);
    }

    @And("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String arg0) {
        amazonPage.searcBox.sendKeys(arg0, Keys.ENTER);
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }
}
