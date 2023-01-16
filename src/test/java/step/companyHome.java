package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.reusableObject;
import object.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class companyHome extends env {
    reusableObject element = new reusableObject();
    pageHome elementHome = new pageHome();
    @When("user click Add icon on Home page")
    public void userClickAddIconOnHomePage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAdd()));
        driver.findElement(elementHome.getBtnAdd()).click();
    }
    @And("user select Add new HQ")
    public void userSelectAddNewHQ() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddNewHQ()));
        driver.findElement(elementHome.getBtnAddNewHQ()).click();
    }
    @Then("show created HQ name")
    public void showCreatedHQName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.verifyNameAndDescription(splitName)));
        driver.findElement(element.verifyNameAndDescription(splitName)).isDisplayed();
    }
    @And("user select Add new Team")
    public void userSelectAddNewTeam() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddNewTeam()));
        driver.findElement(elementHome.getBtnAddNewTeam()).click();
    }
    @Then("show created Team name")
    public void showCreatedTeamName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.verifyNameAndDescription(splitName)));
        driver.findElement(element.verifyNameAndDescription(splitName)).isDisplayed();
    }
    @And("user select Add new Project")
    public void userSelectAddNewProject() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddNewProject()));
        driver.findElement(elementHome.getBtnAddNewProject()).click();
    }
    @Then("show created Project name")
    public void showCreatedProjectName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.verifyNameAndDescription(splitName)));
        driver.findElement(element.verifyNameAndDescription(splitName)).isDisplayed();
    }
}
