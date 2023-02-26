package object;

import org.openqa.selenium.By;

public class pageInbox {
    By emptyState = By.xpath("//android.view.View/android.view.View/android.view.View[@index = '3']");

    public By getEmptyState() {
        return emptyState;
    }
}
