package object;

import org.openqa.selenium.By;

public class pageCheckIns {
    By emptyState = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Remove')]");

    public By getEmptyState() {
        return emptyState;
    }
}
