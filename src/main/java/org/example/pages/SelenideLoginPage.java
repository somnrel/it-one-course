package org.example.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideLoginPage {

    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("#login-button");

    public void openLoginPage() {
        open("https://www.saucedemo.com/");
    }

    public void login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);

        loginButton.click();
    }
}
