package object;

import org.openqa.selenium.By;

public class pageProfile {
    By btnEdit = By.xpath("//android.view.View/android.widget.Button[@index = '2']");

    public By getBtnEdit() {
        return btnEdit;
    }
    By fieldName = By.xpath("//android.view.View/android.widget.EditText[@index = '3']");

    public By getFieldName() {
        return fieldName;
    }
    By fieldTitle = By.xpath("//android.view.View/android.widget.EditText[@index = '4']");

    public By getFieldTitle() {
        return fieldTitle;
    }
    By fieldAboutMe = By.xpath("//android.view.View/android.widget.EditText[@index = '6']");

    public By getFieldAboutMe() {
        return fieldAboutMe;
    }
    By btnSave = By.xpath("//android.view.View/android.widget.Button[@index = '2']");

    public By getBtnSave() {
        return btnSave;
    }

    public By editedFullName(String userFullName){
        By companyList = By.xpath("//*[contains(@content-desc, '" + userFullName + "')]");
        return companyList;
    }

    public By editedTitle(String userTitle){
        By companyList = By.xpath("//*[contains(@content-desc, '" + userTitle + "')]");
        return companyList;
    }

    public By editedAboutMe(String userAboutMe){
        By companyList = By.xpath("//*[contains(@content-desc, '" + userAboutMe + "')]");
        return companyList;
    }
}
