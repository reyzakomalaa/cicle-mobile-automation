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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class board extends env {
    pageBoard elementBoard = new pageBoard();

    @Then("user is in Board page")
    public void userIsInBoardPage() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/teamName.txt"));
            while (read.hasNextLine()) {
                existingTeamName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(elementBoard.verifyBoardPage(existingTeamName)));
                driver.findElement(elementBoard.verifyBoardPage(existingTeamName)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBoard.verifyBoardName(splitBoardName)));
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
        driver.findElement(elementBoard.getFieldCardName()).sendKeys(cardName);
        saveCardName = driver.findElement(elementBoard.getFieldCardName()).getText();
        String[] result = saveCardName.split(",", 2);
        splitCardName = result[0];

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/cardName.txt", false);
            writer.write(cardName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementBoard.getBtnRestore()));
        driver.findElement(elementBoard.getBtnRestore()).click();
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

    @Then("Board will not be created")
    public void boardWillNotBeCreated() {
        driver.findElement(elementBoard.getBtnSubmit()).isDisplayed();
    }

    @Then("card will not be created")
    public void cardWillNotBeCreated() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/cardName.txt"));
            while (read.hasNextLine()) {
                cardName = read.nextLine();

                wait = new WebDriverWait(driver, 10);
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
