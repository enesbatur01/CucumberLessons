package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinition {
    @Test
    public void name() throws AWTException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(3000);

    }
    @When("yuklenmek istenen dosyayi yukler")
    public void yuklenmek_istenen_dosyayi_yukler() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dosyanin basariyla yuklendigini test eder")
    public void dosyanin_basariyla_yuklendigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
