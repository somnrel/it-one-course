package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import base.BaseTest;
import pages.LoginPage;

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

        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
}