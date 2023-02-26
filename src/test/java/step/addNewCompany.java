package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.pageCompanyList;
import object.pageHome;
import object.reusableObject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;

public class addNewCompany extends env{
    pageCompanyList elementCompanyList = new pageCompanyList();
    pageHome elementHome = new pageHome();
    reusableObject element = new reusableObject();
    @Given("user in Company List page")
    public void user_in_company_list_page() {
        wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.elementToBeClickable(elementCompanyList.getBtnAddNewCompany()));
        driver.findElement(elementCompanyList.getBtnAddNewCompany()).isDisplayed();
    }
    @When("user click Create New Company")
    public void user_click_create_new_company() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(elementCompanyList.getBtnAddNewCompany()));
        driver.findElement(elementCompanyList.getBtnAddNewCompany()).click();
    }
    @Then("show toaster success create new Company")
    public void show_toaster_success_create_new_company() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.getToastSuccessCreateNewCompany()));
        driver.findElement(elementHome.getToastSuccessCreateNewCompany()).isDisplayed();
    }

    @And("user fill Company Name")
    public void userFillCompanyName() {
        wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getFieldName()));
        driver.findElement(element.getFieldName()).click();
        driver.findElement(element.getFieldName()).sendKeys(companyName);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/companyName.txt", false);
            writer.write(companyName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
