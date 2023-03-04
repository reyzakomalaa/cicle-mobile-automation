package object;

import org.openqa.selenium.By;

public class pageBlast {
    By emptyState = By.xpath("//android.widget.ImageView[@content-desc = 'No blasts here yet...']");

    public By getEmptyState() {
        return emptyState;
    }
}
