package object;

import org.openqa.selenium.By;

public class pageHome {
    By toastSuccessCreateNewCompany = By.xpath("//*[@content-desc = 'Successfully create company user']");

    public By getToastSuccessCreateNewCompany() {
        return toastSuccessCreateNewCompany;
    }
    By btnAdd = By.className("android.widget.Button");

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
}
