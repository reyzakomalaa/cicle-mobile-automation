package step;

import config.env;
import object.pageGroupChat;
import object.reuseableObject;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class groupChat extends env {
    pageGroupChat elementGroupChat = new pageGroupChat();
    reuseableObject element = new reuseableObject();
    @Then("user will see Group Chat page Empty State")
    public void userWillSeeGroupChatPageEmptyState() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementGroupChat.getEmptyState()));
        driver.findElement(elementGroupChat.getEmptyState()).isDisplayed();
    }

    @Then("user is in Group Chat page")
    public void userIsInGroupChatPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getBtnGroupChat()));
        driver.findElement(element.getBtnGroupChat()).isDisplayed();
    }
}
