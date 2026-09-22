package tests;

import steps.SelenideLoginSteps;
import steps.SelenideShopSteps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelenideShopTest {

    private final SelenideShopSteps shopSteps = new SelenideShopSteps();
    private final SelenideLoginSteps loginSteps = new SelenideLoginSteps();

    @Test
    void userShouldBeAbleToCompletePurchase() {

        loginSteps.loginAsTestUser();

        shopSteps.addItemsToCart();
        shopSteps.openCart();
        shopSteps.completeCheckout("Mikhail", "Koinov", "666666");
        assertEquals("Thank you for your order!", shopSteps.checkoutPage().getCompleteHeader().getText());
    }
}