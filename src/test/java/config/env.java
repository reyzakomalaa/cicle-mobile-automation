package config;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {
    Faker faker = new Faker();
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;
    protected static DesiredCapabilities capabilities;
    public static String saveName;
    public static String saveDescription;
    public static String saveBoardName;
    public static String saveCardName;
    public static String verifyName;
    public static String verifyBoardList;
    public static String splitName;
    public static String splitDescription;
    public static String splitBoardName;
    public static String splitCardName;
    public String existingCompanyName;
    public String existingTeamName;
    public String fakerCompanyName(){
        String randomCompanyName = "Company" + faker.numerify("###");
        return randomCompanyName;
    }
    public String randomCompanyName = "Company" + faker.numerify("###");
    public String fakerCompanyDescription(){
        String randomCompanyDescription = faker.company().industry();
        return randomCompanyDescription;
    }
    public String fakerBoardName(){
        String randomBoardName = faker.name().title();
        return randomBoardName;
    }
}
