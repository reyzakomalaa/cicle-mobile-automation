package step;

import config.env;
import object.pageInbox;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inbox extends env {
    pageInbox elementInbox = new pageInbox();
    @Then("user will see Inbox page Empty State")
    public void userWillSeeInboxPageEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementInbox.getEmptyState()));
        driver.findElement(elementInbox.getEmptyState()).isDisplayed();
    }
}
