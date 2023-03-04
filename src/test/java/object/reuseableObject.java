package object;

import org.openqa.selenium.By;

public class reuseableObject {
    By fieldName = By.xpath("//*[contains(@text, 'type name...')]");

    public By getFieldName() {
        return fieldName;
    }
    By fieldDescription = By.xpath("//*[contains(@text, 'type description...')]");

    public By getFieldDescription() {
        return fieldDescription;
    }
    By btnCreate = By.xpath("//*[@content-desc = 'Create']");

    public By getBtnCreate() {
        return btnCreate;
    }
    By toastError = By.xpath("//*[@content-desc = 'Name and description fields must be filled']");

    public By getToastError() {
        return toastError;
    }
//    By txtName = By.xpath("//*[@content-desc = '" + splitName + "']");
//
//    public By getTxtName() {
//        return txtName;
//    }
    public By verifyCompanyName(String splitName) {
        By txtName = By.xpath("//*[@content-desc = '" + splitName + "']");
        return txtName;
    }
    public By verifyNameAndDescription(String splitName){
        By txtNameAndDescription = By.xpath("//*[contains(@content-desc, '" + splitName + "')]");
        return txtNameAndDescription;
    }
    public By selectExistingCompany(String existingCompanyName){
        By companyList = By.xpath("//*[@content-desc = '" + existingCompanyName + "']");
        return companyList;
    }
    public By selectExistingTeam(String existingTeamName){
        By teamList = By.xpath("//*[contains(@content-desc, '" + existingTeamName + "')]");
        return teamList;
    }
    By btnBackToPrevious = By.xpath("//*[@content-desc = 'Back']");

    public By getBtnBackToPrevious() {
        return btnBackToPrevious;
    }

    By btnDropdown = By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[@index = '2']");

    public By getBtnDropdown() {
        return btnDropdown;
    }

    By btnGroupChat = By.xpath("//*[@content-desc = 'Group Chat']");

    public By getBtnGroupChat() {
        return btnGroupChat;
    }

    By btnDocAndFiles = By.xpath("//*[@content-desc = 'Doc & Files']");

    public By getBtnDocAndFiles() {
        return btnDocAndFiles;
    }

    By btnSchedule = By.xpath("//*[@content-desc = 'Schedule']");

    public By getBtnSchedule() {
        return btnSchedule;
    }

    By btnOverview = By.xpath("//*[@content-desc = 'Overview']");

    public By getBtnOverview() {
        return btnOverview;
    }

    By btnBoard = By.xpath("//*[@content-desc = 'Board']");

    public By getBtnBoard() {
        return btnBoard;
    }

    By btnBlast = By.xpath("//*[@content-desc = 'Blast']");

    public By getBtnBlast() {
        return btnBlast;
    }

    By btnCheckIns = By.xpath("//*[@content-desc = 'Check-Ins']");

    public By getBtnCheckIns() {
        return btnCheckIns;
    }

//    public By getBtn_certainTeam(String teamName) {
//        By btn_certainTeam = By.xpath("//android.widget.Button[contains(@content-desc, '" + teamName + "')]");
//        return btn_certainTeam;
//    }
}
