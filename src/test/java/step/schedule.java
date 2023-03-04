package step;

import config.env;
import object.reuseableObject;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class schedule extends env {
    reuseableObject element = new reuseableObject();

    @Then("user is in Schedule page")
    public void userIsInSchedulePage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnSchedule()));
        driver.findElement(element.getBtnSchedule()).isDisplayed();
    }
}
