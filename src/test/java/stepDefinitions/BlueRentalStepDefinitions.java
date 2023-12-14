package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import page.BlueRentalCarPage;
import utilities.ConfigReader;
import utilities.Driver;

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
        blueRentalCarPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"),Keys.ENTER);
    }

    @Then("{string} ve {string} bilgileri ile manager olarak login olur")
    public void veBilgileriIleManagerOlarakLoginOlur(String email, String password) {
        blueRentalCarPage.email.sendKeys(email);
        blueRentalCarPage.password.sendKeys(password,Keys.ENTER);
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
}
