package steps;

import pages.SelenideCartPage;
import pages.SelenideCheckoutPage;
import pages.SelenideProductsPage;

public class SelenideShopSteps {

    private final SelenideProductsPage productsPage = new SelenideProductsPage();
    private final SelenideCartPage cartPage = new SelenideCartPage();
    private final SelenideCheckoutPage checkoutPage = new SelenideCheckoutPage();

    public void addItemsToCart() {
        productsPage.addBackpack();
        productsPage.addBikeLight();
    }

    public void openCart() {
        productsPage.openCart();
    }

    public void completeCheckout(String firstName, String lastName, String postalCode) {
        cartPage.clickCheckout();

        checkoutPage.enterFirstName(firstName);
        checkoutPage.enterLastName(lastName);
        checkoutPage.enterPostalCode(postalCode);

        checkoutPage.clickContinue();
        checkoutPage.clickFinish();
    }

    public SelenideCheckoutPage checkoutPage() {
        return checkoutPage;
    }
}