package object;

import org.openqa.selenium.By;

public class pageGroupChat {
    By emptyState = By.xpath("//android.view.View[@content-desc = 'No messages here yet']");

    public By getEmptyState() {
        return emptyState;
    }
}
