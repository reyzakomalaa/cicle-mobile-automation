package object;

import org.openqa.selenium.By;

public class pageBlast {
    By emptyState = By.xpath("//android.widget.ImageView[@content-desc = 'No blasts here yet...']");

    public By getEmptyState() {
        return emptyState;
    }
    By btnDropdown = By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[@index = '2']");

    public By getBtnDropdown() {
        return btnDropdown;
    }

    By btnOverview = By.xpath("//android.view.View[@content-desc = 'Overview']");

    public By getBtnOverview() {
        return btnOverview;
    }

    By btnDocAndFiles = By.xpath("//android.view.View[@content-desc = 'Doc & Files']");

    public By getBtnDocAndFiles() {
        return btnDocAndFiles;
    }

    By btnGroupChat = By.xpath("//android.view.View[@content-desc = 'Group Chat']");

    public By getBtnGroupChat() {
        return btnGroupChat;
    }

    By btnSchedule = By.xpath("//android.view.View[@content-desc = 'Schedule']");

    public By getBtnSchedule() {
        return btnSchedule;
    }
}
