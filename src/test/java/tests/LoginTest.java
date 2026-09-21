package tests;

import base.BaseTest;
import config.TestConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import steps.LoginSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    private LoginSteps loginSteps;

    @BeforeEach
    void setUpLogin() {
        loginSteps = new LoginSteps(new LoginPage(driver));
    }

    @Test
    void standardUserShouldBeAbleToLogin() {

        loginSteps.loginAsTestUser();

        assertEquals(TestConfig.inventoryUrl(), driver.getCurrentUrl());
    }
}