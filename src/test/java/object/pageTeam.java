package object;

import org.openqa.selenium.By;

public class pageTeam {
    By btnBoard = By.xpath("//android.widget.ImageView[@content-desc = 'Board']");

    public By getBtnBoard() {
        return btnBoard;
    }
}
