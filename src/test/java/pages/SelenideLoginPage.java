package pages;

import com.codeborne.selenide.SelenideElement;
import config.TestConfig;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideLoginPage {

    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("#login-button");

    public void openLoginPage() {
        open(TestConfig.baseUrl());
        usernameInput.shouldBe(visible);
    }

    public void enterUsername(String username) {
        usernameInput.shouldBe(visible).setValue(username);
    }

    public void enterPassword(String password) {
        passwordInput.shouldBe(visible).setValue(password);
    }

    public void clickLogin() {
        loginButton.shouldBe(visible).click();
    }
}