package object;

import config.env;
import org.openqa.selenium.By;

public class pageLogin {
    By btnSkip = By.xpath("//*[@content-desc = 'Skip']");

    public By getBtnSkip() {
        return btnSkip;
    }
    By onboardingLogo = By.xpath("//*[@content-desc = 'Sick of miscoordination?']");

    public By getOnboardingLogo() {
        return onboardingLogo;
    }
    By btnSignIn = By.xpath("//*[@content-desc = 'Go to Sign In']");

    public By getBtnSignIn() {
        return btnSignIn;
    }
    By btnSignInGoogle = By.xpath("//*[@content-desc = 'Sign in with Google Account']");

    public By getBtnSignInGoogle() {
        return btnSignInGoogle;
    }
    By btnSelectAccount = By.xpath("//*[@resource-id = 'com.google.android.gms:id/container'][1]");

    public By getBtnSelectAccount() {
        return btnSelectAccount;
    }
}
