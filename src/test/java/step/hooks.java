package step;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import object.pageLogin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks extends env {
    pageLogin elementLogin = new pageLogin();
    @Before
    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "RYZ");
        capabilities.setCapability("udid", "c3b0b9c4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);

        //User is in onboarding page
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLogin.getOnboardingLogo()));
        driver.findElement(elementLogin.getOnboardingLogo()).isDisplayed();

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnSkip()));
        driver.findElement(elementLogin.getBtnSkip()).click();

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnSignIn()));
        driver.findElement(elementLogin.getBtnSignIn()).click();

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnSignInGoogle()));
        driver.findElement(elementLogin.getBtnSignInGoogle()).click();

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnSelectAccount()));
        driver.findElement(elementLogin.getBtnSelectAccount()).click();
    }


    @After
    public void after(){
//        driver.quit();
        System.out.println("Success!");
    }


}
