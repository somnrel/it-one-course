package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SelenideProductsPage {

    private final SelenideElement backpackButton = $("#add-to-cart-sauce-labs-backpack");

    private final SelenideElement bikeLightButton = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement cartButton = $(".shopping_cart_link");

    public void addBackpack() {
        backpackButton.shouldBe(visible).click();
    }

    public void addBikeLight() {
        bikeLightButton.shouldBe(visible).click();
    }

    public void openCart() {
        cartButton.shouldBe(visible).click();
    }
}