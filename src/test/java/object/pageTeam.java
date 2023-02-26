package object;

import org.openqa.selenium.By;

public class pageTeam {
    By btnBoard = By.xpath("//*[@content-desc = 'Board']");

    public By getBtnBoard() {
        return btnBoard;
    }

    By btnBlast = By.xpath("//*[@content-desc = 'Blast']");

    public By getBtnBlast() {
        return btnBlast;
    }
}
