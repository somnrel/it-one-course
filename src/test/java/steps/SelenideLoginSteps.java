package steps;

import config.Credentials;
import config.TestConfig;
import org.example.pages.SelenideLoginPage;

public class SelenideLoginSteps {

    private final SelenideLoginPage loginPage = new SelenideLoginPage();

    public void loginAsTestUser() {
        Credentials credentials = TestConfig.testUser();

        loginPage.openLoginPage();

        loginPage.login(
                credentials.username(),
                credentials.password()
        );
    }
}
