package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import object.pageTeam;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class team extends env {
    pageTeam elementTeam = new pageTeam();
    @And("user click Blast")
    public void userClickBlast() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeam.getBtnBlast()));
        driver.findElement(elementTeam.getBtnBlast()).click();
    }

    @And("user click Board")
    public void userClickBoard() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeam.getBtnBoard()));
        driver.findElement(elementTeam.getBtnBoard()).click();
    }

    @Then("user is in Team Detail page")
    public void userIsInTeamDetailPage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeam.getBtnBlast()));
        driver.findElement(elementTeam.getBtnBlast()).isDisplayed();
        driver.findElement(elementTeam.getBtnBoard()).isDisplayed();
    }
}
