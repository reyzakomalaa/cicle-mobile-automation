package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.reusableObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reusableStep extends env {
    reusableObject element = new reusableObject();
    @And("user fill Name")
    public void userFillName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getFieldName()));
        driver.findElement(element.getFieldName()).click();
        driver.findElement(element.getFieldName()).sendKeys(fakerCompanyName());

        saveName = driver.findElement(element.getFieldName()).getText();
        String[] result = saveName.split(",", 2);
        splitName = result[0];
    }
    @And("user fill Description")
    public void userFillDescription() {
        driver.findElement(element.getFieldDescription()).click();
        driver.findElement(element.getFieldDescription()).sendKeys(fakerCompanyDescription());

        saveDescription = driver.findElement(element.getFieldDescription()).getText();
        String[] result = saveDescription.split(",", 2);
        splitDescription = result[0];
    }
    @And("user click Create")
    public void user_click_create() {
        driver.findElement(element.getBtnCreate()).click();
    }
    @Then("show error toaster must be filled name and description")
    public void showErrorToasterMustBeFilledNameAndDescription() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getToastError()));
        driver.findElement(element.getToastError()).isDisplayed();
    }
    @Then("show Company Home")
    public void showCompanyHome() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/companyName.txt"));
            while (read.hasNextLine()) {
                existingCompanyName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(element.selectExistingCompany(existingCompanyName)));
                driver.findElement(element.selectExistingCompany(existingCompanyName)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @And("user click Back to previous page")
    public void userClickBackToPreviousPage() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getBtnBackToPrevious()));
        driver.findElement(element.getBtnBackToPrevious()).click();
    }
}
