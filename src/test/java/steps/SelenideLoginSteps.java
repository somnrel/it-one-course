package steps;

import config.Credentials;
import config.TestConfig;
import pages.SelenideLoginPage;

public class SelenideLoginSteps {

    private final SelenideLoginPage loginPage = new SelenideLoginPage();

    public void loginAsTestUser() {
        Credentials credentials = TestConfig.testUser();

        loginPage.openLoginPage();

        loginPage.enterUsername(credentials.username());
        loginPage.enterPassword(credentials.password());
        loginPage.clickLogin();
    }
}
