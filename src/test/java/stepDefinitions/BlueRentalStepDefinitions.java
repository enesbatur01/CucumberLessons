package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
}
