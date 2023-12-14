package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.DataTablePage;

public class DataTableStepDefinitions {
    DataTablePage dataTablePage = new DataTablePage();

    @When("sayfadaki new butonuna basar")
    public void sayfadakiNewButonunaBasar() {
        dataTablePage.newButton.click();

    }

    @And("verilen bilgileri girer {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void verilenBilgileriGirer(String name, String lastname, String position, String office, String extension, String date, String salary) {
        dataTablePage.firstName.sendKeys(name, Keys.TAB,
                lastname,Keys.TAB,
                position,Keys.TAB,
                office,Keys.TAB,
                extension,Keys.TAB,
                date,Keys.TAB,
                salary,Keys.TAB
        );
    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
    dataTablePage.createButton.click();
    }

    @And("kullanici search bolumune {string} bilgisiniz girer")
    public void kullaniciSearchBolumuneBilgisinizGirer(String name) {
        dataTablePage.searchName.sendKeys(name);

    }

    @Then("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablePage.firstCell.getText().contains(name));
    }
}
