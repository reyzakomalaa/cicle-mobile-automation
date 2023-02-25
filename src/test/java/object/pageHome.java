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

    By btnAddMember = By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");

    public By getBtnAddMember() {
        return btnAddMember;
    }

    By toastInvitationSuccess = By.xpath("//*[@content-desc = 'Invitation has been sent']");

    public By getToastInvitationSuccess() {
        return toastInvitationSuccess;
    }

    By fieldEmail = By.xpath("//android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");

    public By getFieldEmail() {
        return fieldEmail;
    }

    By btnSend = By.xpath("//android.widget.Button[@content-desc = 'Send']");

    public By getBtnSend() {
        return btnSend;
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
