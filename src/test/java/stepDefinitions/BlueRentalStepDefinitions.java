package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.BlueRentalCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.ReusableMethods;

import java.util.List;

public class BlueRentalStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalCarPage.loginButton.click();

    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalCarPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalCarPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }

    @Then("{string} ve {string} bilgileri ile manager olarak login olur")
    public void veBilgileriIleManagerOlarakLoginOlur(String email, String password) {
        blueRentalCarPage.email.sendKeys(email);
        blueRentalCarPage.password.sendKeys(password, Keys.ENTER);
    }

    @And("logout yapar")
    public void logoutYapar() {
        blueRentalCarPage.profile.click();
        blueRentalCarPage.logout.click();
    }

    @And("giriş yapildigini dogrular")
    public void girişYapildiginiDogrular() {

        //1.Assertion
        Assert.assertFalse(blueRentalCarPage.loginVerify.getText().equals("login"));

    }

    @And("verilen email ve password ile login olur")
    public void verilenEmailVePasswordIleLoginOlur(DataTable data) {

        List<List<String>> emailPassword = data.asLists();
        for (int i = 1; i < emailPassword.size(); i++) {
            String email = emailPassword.get(i).get(0);
            String password = emailPassword.get(i).get(1);
            blueRentalCarPage.email.sendKeys(email);
            blueRentalCarPage.password.sendKeys(password, Keys.ENTER);
            ReusableMethods.bekle(1);
            Driver.getDriver().navigate().back();
        }

    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sayfaIsmi) {
        String path="src/test/resources/adminTestData.xlsx";
        ExcelReader excelReader = new ExcelReader(path,sayfaIsmi);

        for (int i = 1; i <= excelReader.rowCount() ; i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);

            blueRentalCarPage.email.sendKeys(email);
            blueRentalCarPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }
    }
}
