package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DataTablesHerokuappPage;
import steps.DataTablesHerokuappSteps;

import static com.codeborne.selenide.CollectionCondition.allMatch;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class DataTablesHerokuappTest {

    private DataTablesHerokuappSteps dataTablesSteps;

    @BeforeEach
    void setUp() {
        dataTablesSteps = new DataTablesHerokuappSteps(new DataTablesHerokuappPage());

        dataTablesSteps.openDataTables();
    }

    @Test
    void smithEmailShouldExist() {
        SelenideElement email = dataTablesSteps.findSmithEmail();
        email.shouldBe(visible);
    }

    @Test
    void editButtonFor100DueShouldBeAvailable() {
        SelenideElement editButton = dataTablesSteps.findEditButtonFor100Due();
        editButton.shouldBe(visible).shouldBe(enabled);
    }

    @Test
    void httpWebsiteLinksShouldBeAvailable() {
        ElementsCollection links = dataTablesSteps.findHttpWebsiteLinks();

        links.shouldHave(size(8));
        links.shouldHave(allMatch("links should be visible and enabled", link -> link.isDisplayed() && link.isEnabled()));
    }
}