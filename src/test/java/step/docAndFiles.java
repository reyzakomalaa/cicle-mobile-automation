package step;

import config.env;
import object.pageDocAndFiles;
import object.reuseableObject;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class docAndFiles extends env {
    pageDocAndFiles elementDocAndFiles = new pageDocAndFiles();
    reuseableObject element = new reuseableObject();

    @Then("user will see Doc & Files page Empty State")
    public void userWillSeeDocFilesPageEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementDocAndFiles.getEmptyState()));
        driver.findElement(elementDocAndFiles.getEmptyState()).isDisplayed();
    }

    @Then("user is in Doc & Files page")
    public void userIsInDocFilesPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnDocAndFiles()));
        driver.findElement(element.getBtnDocAndFiles()).isDisplayed();
    }
}
