package object;

import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pageHome {
    By toastSuccessCreateNewCompany = By.xpath("//*[@content-desc = 'Successfully create company user']");

    public By getToastSuccessCreateNewCompany() {
        return toastSuccessCreateNewCompany;
    }
    By btnAdd = By.xpath("//android.widget.Button[@index = '2']");

    public By getBtnAdd() {
        return btnAdd;
    }
    By btnAddNewHQ = By.xpath("//*[@content-desc = 'Add new HQ']");

    public By getBtnAddNewHQ() {
        return btnAddNewHQ;
    }
    By btnAddNewTeam = By.xpath("//*[@content-desc = 'Add new team']");

    public By getBtnAddNewTeam() {
        return btnAddNewTeam;
    }
    By btnAddNewProject = By.xpath("//*[@content-desc = 'Add new project']");

    public By getBtnAddNewProject() {
        return btnAddNewProject;
    }

    public By selectExistingCompany(String existingCompanyName){
        By companyList = By.xpath("//*[@content-desc = '" + existingCompanyName + "']");
        return companyList;
    }
    public By selectExistingTeam(String existingTeamName){
        By companyList = By.xpath("//*[contains(@content-desc, '" + existingTeamName + "')]");
        return companyList;
    }
}
