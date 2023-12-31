package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class BlueRentalCarPage {
    public BlueRentalCarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="formBasicEmail")
    public WebElement email;

    @FindBy(id="formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//li//a[@role='button']")
    public WebElement loginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement loginVerify;
    @FindBy(xpath = "//*[contains(text(), 'User with email fake@bluerentalcars.com not found')]")
    public WebElement failLoginMessage;
    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profile;
    @FindBy(xpath = "//em")
    public WebElement profileEmail;
    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;

}
