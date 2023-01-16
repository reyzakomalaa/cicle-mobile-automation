package object;

import org.openqa.selenium.By;

public class pageCompanyList {
    By logoCicle = By.xpath("//*[@content-desc = 'Text Logo']");

    public By getLogoCicle() {
        return logoCicle;
    }
    By btnAddNewCompany = By.xpath("//*[@content-desc = 'Create New Company']");

    public By getBtnAddNewCompany() {
        return btnAddNewCompany;
    }
}
