package pages;

import com.codeborne.selenide.SelenideElement;
import config.TestConfig;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HerokuappLoginPage {

    private final SelenideElement usernameInput = $("#username");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $(".radius");
    private final SelenideElement errorMessage = $("#flash");

    public void openPage() {
        open(TestConfig.loginUrl());
        usernameInput.shouldBe(visible);
    }

    public void login(String username, String password) {
        usernameInput.shouldBe(visible).setValue(username);
        passwordInput.shouldBe(visible).setValue(password);
        loginButton.shouldBe(visible).click();
    }

    public SelenideElement getErrorMessage() {
        return errorMessage;
    }
}
