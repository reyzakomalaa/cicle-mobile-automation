package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object.reusableObject;
import object.pageTeam;
import object.pageBoard;

public class board extends env {
    reusableObject element = new reusableObject();
    pageTeam elementTeam = new pageTeam();
    pageBoard elementBoard = new pageBoard();
    @When("user click Team")
    public void userClickTeam() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.verifyNameAndDescription(splitName)));
        driver.findElement(element.verifyNameAndDescription(splitName)).click();
    }

    @And("user click Board")
    public void userClickBoard() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementTeam.getBtnBoard()));
        driver.findElement(elementTeam.getBtnBoard()).click();
    }

    @Then("user is in Board page")
    public void userIsInBoardPage() {
        driver.findElement(element.verifyNameAndDescription(splitName)).isDisplayed();
    }

    @When("user click Create List")
    public void userClickCreateList() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBoard.getBtnCreateList()));
        driver.findElement(elementBoard.getBtnCreateList()).click();
    }

    @And("user fill List Name")
    public void userFillListName() {
        driver.findElement(elementBoard.getFieldListName()).sendKeys(fakerBoardName());
        saveBoardName = driver.findElement(elementBoard.getFieldListName()).getText();
        String[] result = saveBoardName.split(",", 2);
        splitBoardName = result[0];
    }

    @And("user click Submit")
    public void userClickSubmit() {
        driver.findElement(elementBoard.getBtnSubmit()).click();
    }

    @Then("show created List name")
    public void showCreatedListName() {
        driver.findElement(elementBoard.verifyBoardName(splitBoardName)).isDisplayed();
        verifyBoardList = driver.findElement(elementBoard.verifyBoardName(splitBoardName)).getAttribute("content-desc");
        Assert.assertEquals(verifyBoardList, splitBoardName);
    }

    @When("user click Add New Card")
    public void userClickAddNewCard() {
        driver.findElement(elementBoard.getBtnAddCard()).click();
    }

    @And("user fill Card Name")
    public void userFillCardName() {
        driver.findElement(elementBoard.getFieldCardName()).sendKeys(fakerBoardName());
        saveCardName = driver.findElement(elementBoard.getFieldCardName()).getText();
        String[] result = saveCardName.split(",", 2);
        splitCardName = result[0];
    }

    @And("user click Checklist button")
    public void userClickChecklistButton() {
        driver.findElement(elementBoard.getBtnChecklist()).click();
    }

    @Then("show created Card on Board")
    public void showCreatedCardOnBoard() {
        driver.findElement(elementBoard.verifyCardName(splitCardName)).isDisplayed();
    }

    @And("user enable Private toggle")
    public void userEnablePrivateToggle() {
        driver.findElement(elementBoard.getTogglePrivate()).click();
    }

    @When("user click three dots navigation on List")
    public void userClickThreeDotsNavigationOnList() {
        driver.findElement(elementBoard.getBtnThreeDotsList()).click();
    }

    @And("user click Archive this list")
    public void userClickArchiveThisList() {
        driver.findElement(elementBoard.getBtnArchiveThisList()).click();
    }

    @Then("show toaster List has been moved to Archived")
    public void showToasterListHasBeenMovedToArchived() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBoard.getToastSuccessArchived()));
        driver.findElement(elementBoard.getToastSuccessArchived()).isDisplayed();
    }

    @When("user click three dots navigation on Card")
    public void userClickThreeDotsNavigationOnCard() {
        
        
    }

    @Then("show toaster Card has been moved to Archived")
    public void showToasterCardHasBeenMovedToArchived() {
    }

    @When("user click Archived icon")
    public void userClickArchivedIcon() {
        driver.findElement(elementBoard.getBtnArchivedIcon()).click();
    }

    @And("user click navbar icon")
    public void userClickNavbarIcon() {
        driver.findElement(elementBoard.getBtnNavBarIcon()).click();
    }

    @And("user click Restore")
    public void userClickRestore() {
        
    }

    @And("user click Ok")
    public void userClickOk() {
        driver.findElement(elementBoard.getBtnRestoreOk()).click();
    }

    @Then("show toaster success Unarchiving List")
    public void showToasterSuccessUnarchivingList() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBoard.getToastSuccessUnarchived()));
        driver.findElement(elementBoard.getToastSuccessUnarchived()).isDisplayed();
    }
}
