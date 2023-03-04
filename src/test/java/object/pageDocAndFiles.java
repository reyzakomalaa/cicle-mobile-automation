package object;

import org.openqa.selenium.By;

public class pageDocAndFiles {
    By emptyState = By.xpath("//android.widget.ImageView[@content-desc = 'No data here yet...']");

    public By getEmptyState() {
        return emptyState;
    }
}
