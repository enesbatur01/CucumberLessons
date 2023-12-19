package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RobotPage {
    public RobotPage() {
        /*
        Bu kod bu classtaki ögeleri driver ile iliskilendirir
        Bu sayede classtaki webelementlere erisebilmek icin @FindBy gibi PageFactory ye yardimci olan
        notasyonlari kullanilabilir hale getirir
         */
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement searcBox;




}