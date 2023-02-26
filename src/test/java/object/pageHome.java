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

    By btnMenu = By.xpath("//android.view.View/android.view.View[3]/android.view.View[@index = '3']");

    public By getBtnMenu() {
        return btnMenu;
    }

    By btnMyAccount = By.xpath("//android.view.View/android.widget.ImageView[@index = '0']");

    public By getBtnMyAccount() {
        return btnMyAccount;
    }

    By btnNotification = By.xpath("//android.view.View/android.view.View[3]/android.view.View[@index = '1']");

    public By getBtnNotification() {
        return btnNotification;
    }

    By btnInbox = By.xpath("//android.view.View[@content-desc = 'Inbox']");

    public By getBtnInbox() {
        return btnInbox;
    }

    By emptyStateHQ = By.xpath("//android.view.View[@content-desc = 'Headquarter']/android.view.View/android.view.View/android.view.View'");

    public By getEmptyStateHQ() {
        return emptyStateHQ;
    }

    By emptyStateTeam = By.xpath("//android.view.View[@content-desc = 'Team']/android.view.View/android.view.View/android.view.View'");

    public By getEmptyStateTeam() {
        return emptyStateTeam;
    }

    By emptyStateProject = By.xpath("//android.view.View[@content-desc = 'Team']/android.view.View/android.view.View/android.view.View'");

    public By getEmptyStateProject() {
        return emptyStateProject;
    }

    By btnWorkload = By.xpath("//android.view.View[@content-desc = 'Workload']");

    public By getBtnWorkload() {
        return btnWorkload;
    }
}