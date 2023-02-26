package object;

import org.openqa.selenium.By;

public class pageNotification {
    By btnHome = By.xpath("//android.view.View/android.view.View[@index = '5']/android.view.View[@index = '0']");

    public By getBtnHome() {
        return btnHome;
    }

    By emptyState = By.xpath("//android.view.View[3]/android.view.View/android.widget.ImageView");

    public By getEmptyState() {
        return emptyState;
    }
}
