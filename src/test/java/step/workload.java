package step;

import config.env;
import object.pageWorkload;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workload extends env {
    pageWorkload elementWorkload = new pageWorkload();
    @Then("user will see Work Load page Empty State")
    public void userWillSeeWorkLoadPageEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementWorkload.getEmptyState()));
        driver.findElement(elementWorkload.getEmptyState()).isDisplayed();
    }
}
