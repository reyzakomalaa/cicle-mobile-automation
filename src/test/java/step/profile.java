package step;

import config.env;
import object.pageHome;
import object.pageProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class profile extends env {
    pageProfile elementProfile = new pageProfile();

    @And("user click Edit icon")
    public void userClickEditIcon() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementProfile.getBtnEdit()));
        driver.findElement(elementProfile.getBtnEdit()).click();
    }

    @And("user Change Name")
    public void userChangeName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementProfile.getFieldName()));
        driver.findElement(elementProfile.getFieldName()).click();
        driver.findElement(elementProfile.getFieldName()).sendKeys(userFullName);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/userFullName.txt", false);
            writer.write(userFullName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("user click Save icon")
    public void userClickSaveIcon() {
        driver.findElement(elementProfile.getBtnSave()).click();
    }

    @Then("user's name will be changed")
    public void userSNameWillBeChanged() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/userFullName.txt"));
            while (read.hasNextLine()) {
                userFullName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(elementProfile.editedFullName(userFullName)));
                driver.findElement(elementProfile.editedFullName(userFullName)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @And("user Change title")
    public void userChangeTitle() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementProfile.getFieldTitle()));
        driver.findElement(elementProfile.getFieldTitle()).click();
        driver.findElement(elementProfile.getFieldTitle()).sendKeys(userTitle);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/userTitle.txt", false);
            writer.write(userTitle + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("user's title will be changed")
    public void userSTitleWillBeChanged() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/userTitle.txt"));
            while (read.hasNextLine()) {
                userFullName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(elementProfile.editedTitle(userTitle)));
                driver.findElement(elementProfile.editedTitle(userTitle)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @And("user Change About Me")
    public void userChangeAboutMe() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementProfile.getFieldAboutMe()));
        driver.findElement(elementProfile.getFieldAboutMe()).click();
        driver.findElement(elementProfile.getFieldAboutMe()).clear();
        driver.findElement(elementProfile.getFieldAboutMe()).sendKeys(userAboutMe);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/userAboutMe.txt", false);
            writer.write(userAboutMe + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("user's About Me will be changed")
    public void userSAboutMeWillBeChanged() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/userAboutMe.txt"));
            while (read.hasNextLine()) {
                userFullName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(elementProfile.editedAboutMe(userAboutMe)));
                driver.findElement(elementProfile.editedAboutMe(userAboutMe)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    

    @And("user clear all field")
    public void userClearAllField() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementProfile.getFieldName()));
        driver.findElement(elementProfile.getFieldName()).click();
        driver.findElement(elementProfile.getFieldName()).clear();

        driver.findElement(elementProfile.getFieldTitle()).clear();
        driver.findElement(elementProfile.getFieldTitle()).click();

        driver.findElement(elementProfile.getFieldAboutMe()).click();
        driver.findElement(elementProfile.getFieldAboutMe()).clear();
    }

    @Then("show error toaster name must be filled")
    public void showErrorToasterNameMustBeFilled() {
        System.out.println("Name must be filled!");
    }
}
