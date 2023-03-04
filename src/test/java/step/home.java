package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.reuseableObject;
import object.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class home extends env {
    reuseableObject element = new reuseableObject();
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

    @When("user click Existing Company")
    public void userClickExistingCompany() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/companyName.txt"));
            while (read.hasNextLine()) {
                existingCompanyName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.elementToBeClickable(element.selectExistingCompany(existingCompanyName)));
                driver.findElement(element.selectExistingCompany(existingCompanyName)).click();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @When("user click Existing Team")
    public void userClickExistingTeam() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/teamName.txt"));
            while (read.hasNextLine()) {
                existingTeamName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.elementToBeClickable(element.selectExistingTeam(existingTeamName)));
                driver.findElement(element.selectExistingTeam(existingTeamName)).click();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @And("user fill Team Name")
    public void userFillTeamName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getFieldName()));
        driver.findElement(element.getFieldName()).click();
        driver.findElement(element.getFieldName()).sendKeys(teamName);

        saveName = driver.findElement(element.getFieldName()).getText();
        String[] result = saveName.split(",", 2);
        splitName = result[0];

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/teamName.txt", false);
            writer.write(teamName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user click Add New Member icon on Home page")
    public void userClickAddNewMemberIconOnHomePage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddMember()));
        driver.findElement(elementHome.getBtnAddMember()).click();
    }

    @And("user fill Member Email")
    public void userFillMemberEmail() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getFieldEmail()));
        driver.findElement(elementHome.getFieldEmail()).sendKeys("dummy2.reyza@gmail.com");
    }

    @And("user click Send")
    public void userClickSend() {
        driver.findElement(elementHome.getBtnSend()).click();
    }

    @Then("show toaster success invitation has been sent")
    public void showToasterSuccessInvitationHasBeenSent() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getToastInvitationSuccess()));
        driver.findElement(elementHome.getToastInvitationSuccess()).isDisplayed();
    }

    @When("user click Menu")
    public void userClickMenu() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnMenu()));
        driver.findElement(elementHome.getBtnMenu()).click();
    }

    @And("user click Email")
    public void userClickEmail() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnMyAccount()));
        driver.findElement(elementHome.getBtnMyAccount()).click();
    }

    @And("user click Notification icon")
    public void userClickNotificationIcon() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnNotification()));
        driver.findElement(elementHome.getBtnNotification()).click();
    }

    @And("user click Inbox")
    public void userClickInbox() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnInbox()));
        driver.findElement(elementHome.getBtnInbox()).click();
    }

    @Then("user will see HQ section Empty State")
    public void userWillSeeHQSectionEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getEmptyStateHQ()));
        driver.findElement(elementHome.getEmptyStateHQ()).isDisplayed();
    }

    @Then("user will see Team section Empty State")
    public void userWillSeeTeamSectionEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getEmptyStateTeam()));
        driver.findElement(elementHome.getEmptyStateTeam()).isDisplayed();
    }

    @And("click Workload")
    public void clickWorkload() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getBtnWorkload()));
        driver.findElement(elementHome.getBtnWorkload()).click();
    }
}
