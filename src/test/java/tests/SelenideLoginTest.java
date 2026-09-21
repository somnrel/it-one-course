package tests;

import config.TestConfig;
import steps.SelenideLoginSteps;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class SelenideLoginTest {

    private final SelenideLoginSteps loginSteps = new SelenideLoginSteps();

    @Test
    void userShouldBeAbleToLogin() {
        loginSteps.loginAsTestUser();
        webdriver().shouldHave(url(TestConfig.inventoryUrl()));
    }
}