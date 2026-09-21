package tests;

import steps.SelenideLoginSteps;
import steps.SelenideShopSteps;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class SelenideShopTest {

    private final SelenideShopSteps shopSteps = new SelenideShopSteps();
    private final SelenideLoginSteps loginSteps = new SelenideLoginSteps();

    @Test
    void userShouldBeAbleToCompletePurchase() {

        loginSteps.loginAsTestUser();

        shopSteps.addItemsToCart();
        shopSteps.openCart();
        shopSteps.completeCheckout("Mikhail", "Koinov", "666666");
        shopSteps.checkoutPage().getCompleteHeader().shouldHave(text("Thank you for your order!"));
    }
}