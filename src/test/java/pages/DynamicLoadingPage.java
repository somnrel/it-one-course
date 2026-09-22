package pages;

import com.codeborne.selenide.SelenideElement;
import config.TestConfig;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingPage {

    private final SelenideElement startButton = $("#start button");
    private final SelenideElement helloWorldText = $("#finish h4");

    public void openPage() {
        open(TestConfig.dynamicLoadingUrl());
    }

    public void clickStart() {
        startButton.click();
    }

    public SelenideElement getHelloWorldText() {
        return helloWorldText;
    }
}