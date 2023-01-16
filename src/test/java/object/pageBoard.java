package object;

import org.openqa.selenium.By;

public class pageBoard {
    By btnCreateList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");

    public By getBtnCreateList() {
        return btnCreateList;
    }
    By fieldListName = By.xpath("//*[contains(@text, 'Add new list...')]");

    public By getFieldListName() {
        return fieldListName;
    }
    public By verifyBoardName(String splitBoardName) {
        By txtBoardName = By.xpath("//*[@content-desc = '" + splitBoardName + "']");
        return txtBoardName;
    }
    By btnSubmit = By.xpath("//android.widget.Button[@content-desc= 'Submit']");

    public By getBtnSubmit() {
        return btnSubmit;
    }
    By btnAddCard = By.xpath("//android.widget.Button[@content-desc = 'Add new card']");

    public By getBtnAddCard() {
        return btnAddCard;
    }
    By fieldCardName = By.xpath("//*[contains(@text, 'Your card name')]");

    public By getFieldCardName() {
        return fieldCardName;
    }
    By btnChecklist = By.xpath("//android.view.View[@content-desc = 'Private Card']/android.widget.EditText/android.view.View");

    public By getBtnChecklist() {
        return btnChecklist;
    }
    public By verifyCardName(String splitCardName) {
        By txtCardName = By.xpath("//*[contains(@content-desc, '" + splitCardName + "')]");
        return txtCardName;
    }
    By togglePrivate = By.xpath("//android.view.View[@content-desc = 'Private Card']/android.widget.Switch");

    public By getTogglePrivate() {
        return togglePrivate;
    }
    By btnThreeDotsList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public By getBtnThreeDotsList() {
        return btnThreeDotsList;
    }
    By btnArchiveThisList = By.xpath("//android.view.View[@content-desc = 'Archive this list']");

    public By getBtnArchiveThisList() {
        return btnArchiveThisList;
    }
    By toastSuccessArchived = By.xpath("//android.view.View[@content-desc = 'List has been moved to archive']");

    public By getToastSuccessArchived() {
        return toastSuccessArchived;
    }
    By btnArchivedIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");

    public By getBtnArchivedIcon() {
        return btnArchivedIcon;
    }
    By btnNavBarIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");

    public By getBtnNavBarIcon() {
        return btnNavBarIcon;
    }
    By btnRestoreOk = By.xpath("//android.widget.Button[@content-desc = 'Ok']");

    public By getBtnRestoreOk() {
        return btnRestoreOk;
    }
    By toastSuccessUnarchived = By.xpath("//android.view.View[@content-desc = 'Unarchiving list with cards is success']");

    public By getToastSuccessUnarchived() {
        return toastSuccessUnarchived;
    }
}
