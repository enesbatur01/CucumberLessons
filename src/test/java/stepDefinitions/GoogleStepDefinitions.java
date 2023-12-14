package stepDefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratir")
    public void googleAramaKutusundaAratir(String arg0) {
        googlePage.searchBox.sendKeys(arg0, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
       ReusableMethods.bekle(arg0);
    }


}
