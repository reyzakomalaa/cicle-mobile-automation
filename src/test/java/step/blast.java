package step;

import config.env;
import io.cucumber.java.en.And;
import object.pageBlast;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blast extends env {
    pageBlast elementBlast = new pageBlast();
    @Then("user will see Blast page Empty State")
    public void userWillSeeBlastPageEmptyState() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getEmptyState()));
        driver.findElement(elementBlast.getEmptyState()).isDisplayed();
    }

    @And("user click dropwown")
    public void userClickDropwown() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnDropdown()));
        driver.findElement(elementBlast.getBtnDropdown()).click();
    }

    @And("user click Overview")
    public void userClickOverview() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnOverview()));
        driver.findElement(elementBlast.getBtnOverview()).click();
    }

    @And("user click Doc & Files")
    public void userClickDocFiles() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnDocAndFiles()));
        driver.findElement(elementBlast.getBtnDocAndFiles()).click();
    }

    @And("user click Group Chat")
    public void userClickGroupChat() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnGroupChat()));
        driver.findElement(elementBlast.getBtnGroupChat()).click();
    }

    @And("user click Schedule")
    public void userClickSchedule() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnSchedule()));
        driver.findElement(elementBlast.getBtnSchedule()).click();
    }
}
