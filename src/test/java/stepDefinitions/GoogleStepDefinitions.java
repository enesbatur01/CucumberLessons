package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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


    @When("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {

        for (int i = 0; i <data.asList().size() ; i++) {
            googlePage.searchBox.sendKeys(data.asList().get(i),Keys.ENTER);
            ReusableMethods.bekle(2);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            googlePage.searchBox.clear();
        }
    }

    @When("kullanici verilen bilgiler ile arama yapar ikinci yol")
    public void kullaniciVerilenBilgilerIleAramaYaparIkinciYol(List<String> list) {
        for (String w : list){
            googlePage.searchBox.sendKeys(w+Keys.ENTER);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
            googlePage.searchBox.clear();
        }
    }
}
