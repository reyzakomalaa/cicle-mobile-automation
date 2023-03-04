package object;

import org.openqa.selenium.By;

public class pageTeamDetail {
    By btnSetting = By.xpath("//android.view.View[1]/android.widget.Button[3]");

    public By getBtnSetting() {
        return btnSetting;
    }

    By btnEditMenu = By.xpath("//*[@content-desc = 'Edit Menu']");

    public By getBtnEditMenu() {
        return btnEditMenu;
    }

    By btnEditTeam = By.xpath("//*[@content-desc = 'Edit Team']");

    public By getBtnEditTeam() {
        return btnEditTeam;
    }

    By toggleGroupChat = By.xpath("//android.widget.Switch[1]");

    public By getToggleGroupChat() {
        return toggleGroupChat;
    }

    By toggleBlast = By.xpath("//android.widget.Switch[2]");

    public By getToggleBlast() {
        return toggleBlast;
    }

    By toggleSchedule = By.xpath("//android.widget.Switch[3]");

    public By getToggleSchedule() {
        return toggleSchedule;
    }

    By toggleBoard = By.xpath("//android.widget.Switch[4]");

    public By getToggleBoard() {
        return toggleBoard;
    }

    By toggleCheckIns = By.xpath("//android.widget.Switch[5]");

    public By getToggleCheckIns() {
        return toggleCheckIns;
    }

    By toggleDocAndFiles = By.xpath("//android.widget.Switch[6]");

    public By getToggleDocAndFiles() {
        return toggleDocAndFiles;
    }

    By btnSave = By.xpath("//android.widget.Button[@content-desc = 'Save']");

    public By getBtnSave() {
        return btnSave;
    }
}
