package step;

import config.env;
import object.pageCheckIns;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkIns extends env {
    pageCheckIns elementCheckIns = new pageCheckIns();

    @Then("user will see Check Ins page Empty State")
    public void userWillSeeCheckInsPageEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementCheckIns.getEmptyState()));
        driver.findElement(elementCheckIns.getEmptyState()).isDisplayed();
    }
}
