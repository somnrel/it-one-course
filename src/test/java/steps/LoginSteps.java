package steps;

import config.Credentials;
import config.TestConfig;
import pages.LoginPage;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void loginAsTestUser() {

        Credentials credentials = TestConfig.testUser();

        loginPage.open();
        loginPage.login(credentials.username(), credentials.password());
    }
}