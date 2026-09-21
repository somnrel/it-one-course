package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import config.TestConfig;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class DataTablesHerokuappPage {

    private final SelenideElement smithEmail = $x("//td[normalize-space()='Smith']/following-sibling::td[contains(normalize-space(), '@')]");
    private final SelenideElement editButtonFor100Due = $x("//td[contains(normalize-space(), '$100.00')]/ancestor::tr//a[normalize-space()='edit']");
    private final ElementsCollection httpWebsiteLinks = $$x("//td[starts-with(normalize-space(), 'http://')]");

    public void openDataTables() {
        open(TestConfig.dataTablesHerokuappUrl());
        smithEmail.shouldBe(visible);
    }

    public SelenideElement getSmithEmail() {
        return smithEmail.shouldBe(visible);
    }

    public SelenideElement getEditButtonFor100Due() {
        return editButtonFor100Due.shouldBe(visible);
    }

    public ElementsCollection getHttpWebsiteLinks() {
        return httpWebsiteLinks;
    }
}
