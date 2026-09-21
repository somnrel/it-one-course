package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SelenideCheckoutPage {

    private final SelenideElement firstNameInput = $("#first-name");
    private final SelenideElement lastNameInput = $("#last-name");
    private final SelenideElement postalCodeInput = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement finishButton = $("#finish");
    private final SelenideElement completeHeader = $(".complete-header");

    public void enterFirstName(String firstName) {
        firstNameInput.shouldBe(visible).setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.shouldBe(visible).setValue(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeInput.shouldBe(visible).setValue(postalCode);
    }

    public void clickContinue() {
        continueButton.shouldBe(visible).click();
    }

    public void clickFinish() {
        finishButton.shouldBe(visible).click();
    }

    public SelenideElement getCompleteHeader() {
        return completeHeader;
    }
}