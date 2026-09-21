package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SelenideCartPage {

    private final SelenideElement checkoutButton = $("#checkout");

    public void clickCheckout() {
        checkoutButton.shouldBe(visible).click();
    }
}