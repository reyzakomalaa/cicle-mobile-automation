package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import object.reuseableObject;
import object.pageTeamDetail;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class team extends env {
    reuseableObject element = new reuseableObject();
    pageTeamDetail elementTeamDetail = new pageTeamDetail();

    @And("user click Blast")
    public void userClickBlast() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnBlast()));
        driver.findElement(element.getBtnBlast()).click();
    }

    @And("user click Board")
    public void userClickBoard() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnBoard()));
        driver.findElement(element.getBtnBoard()).click();
    }

    @And("user click Check Ins")
    public void userClickCheckIns() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnCheckIns()));
        driver.findElement(element.getBtnCheckIns()).click();
    }

    @Then("user is in Team Detail page")
    public void userIsInTeamDetailPage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnBlast()));
        driver.findElement(element.getBtnBlast()).isDisplayed();
        driver.findElement(element.getBtnBoard()).isDisplayed();
    }

    @And("user click Settings")
    public void userClickSettings() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getBtnSetting()));
        driver.findElement(elementTeamDetail.getBtnSetting()).click();
    }

    @And("user click Edit Menu")
    public void userClickEditMenu() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getBtnEditMenu()));
        driver.findElement(elementTeamDetail.getBtnEditMenu()).click();
    }

    @And("user click toggle Group Chat")
    public void userClickToggleGroupChat() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleGroupChat()));
        driver.findElement(elementTeamDetail.getToggleGroupChat()).click();
    }

    @And("user click Save")
    public void userClickSave() {
        driver.findElement(elementTeamDetail.getBtnSave()).click();
        driver.navigate().back();
    }

    @And("user click toggle Blast")
    public void userClickToggleBlast() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleBlast()));
        driver.findElement(elementTeamDetail.getToggleBlast()).click();
    }

    @Then("Group Chat will be disappear or appear from Team Detail page")
    public void groupChatWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnGroupChat()).size() > 0) {
            System.out.println("Group Chat is appear!");
        }
        else {
            System.out.println("Group Chat is disappear!");
        }
    }

    @Then("Blast will be disappear or appear from Team Detail page")
    public void blastWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnBlast()).size() > 0) {
            System.out.println("Blast is appear!");
        }
        else {
            System.out.println("Blast is disappear!");
        }
    }

    @And("user click toggle Schedule")
    public void userClickToggleSchedule() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleSchedule()));
        driver.findElement(elementTeamDetail.getToggleSchedule()).click();
    }

    @Then("Schedule will be disappear or appear from Team Detail page")
    public void scheduleWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnSchedule()).size() > 0) {
            System.out.println("Schedule is appear!");
        }
        else {
            System.out.println("Schedule is disappear!");
        }
    }

    @And("user click toggle Board")
    public void userClickToggleBoard() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleBoard()));
        driver.findElement(elementTeamDetail.getToggleBoard()).click();
    }

    @Then("Board will be disappear or appear from Team Detail page")
    public void boardWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnBoard()).size() > 0) {
            System.out.println("Board is appear!");
        }
        else {
            System.out.println("Board is disappear!");
        }
    }

    @And("user click toggle Check Ins")
    public void userClickToggleCheckIns() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleCheckIns()));
        driver.findElement(elementTeamDetail.getToggleCheckIns()).click();
    }

    @Then("Check Ins will be disappear or appear from Team Detail page")
    public void checkInsWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnCheckIns()).size() > 0) {
            System.out.println("Check Ins is appear!");
        }
        else {
            System.out.println("Check Ins is disappear!");
        }
    }

    @And("user click toggle Doc & Files")
    public void userClickToggleDocFiles() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeamDetail.getToggleDocAndFiles()));
        driver.findElement(elementTeamDetail.getToggleDocAndFiles()).click();
    }

    @Then("Doc & Files will be disappear or appear from Team Detail page")
    public void docFilesWillBeDisappearOrAppearFromTeamDetailPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnOverview()));

        if (driver.findElements(element.getBtnDocAndFiles()).size() > 0) {
            System.out.println("Doc & Files is appear!");
        }
        else {
            System.out.println("Doc & Files is disappear!");
        }
    }
}
