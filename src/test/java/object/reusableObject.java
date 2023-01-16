package object;

import org.openqa.selenium.By;

public class reusableObject {
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

//    public By getBtn_certainTeam(String teamName) {
//        By btn_certainTeam = By.xpath("//android.widget.Button[contains(@content-desc, '" + teamName + "')]");
//        return btn_certainTeam;
//    }
}
