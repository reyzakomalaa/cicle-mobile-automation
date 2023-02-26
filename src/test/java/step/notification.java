package step;

import config.env;
import object.pageNotification;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class notification extends env {
    pageNotification elementNotification = new pageNotification();
    @Then("user will see Notification page Empty State")
    public void userWillSeeNotificationPageEmptyState() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementNotification.getEmptyState()));
        driver.findElement(elementNotification.getEmptyState()).isDisplayed();
    }

    @And("user click Home icon")
    public void userClickHomeIcon() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementNotification.getBtnHome()));
        driver.findElement(elementNotification.getBtnHome()).click();
    }
}
