package object;

import org.openqa.selenium.By;

public class pageWorkload {
    By emptyState = By.xpath("//android.view.View/android.view.View[@index = '2']");

    public By getEmptyState() {
        return emptyState;
    }
}
