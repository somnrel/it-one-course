package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.DataTablesHerokuappPage;
import steps.DataTablesHerokuappSteps;

import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class DataTablesHerokuappTest {

    private DataTablesHerokuappSteps dataTablesSteps;

    @BeforeEach
    void setUp() {
        dataTablesSteps = new DataTablesHerokuappSteps(
                new DataTablesHerokuappPage()
        );

        dataTablesSteps.openDataTables();
    }

    static Stream<Arguments> tableElements() {
        return Stream.of(
                Arguments.of("email"),
                Arguments.of("edit"),
                Arguments.of("website")
        );
    }

    @ParameterizedTest
    @MethodSource("tableElements")
    void tableElementsShouldExistAndBeAvailable(String elementType) {
        switch (elementType) {
            case "email" -> {
                SelenideElement email = dataTablesSteps.findSmithEmail();
                System.out.println(email);
                email.shouldBe(visible);
            }

            case "edit" -> {
                SelenideElement editButton = dataTablesSteps.findEditButtonFor100Due();
                editButton.shouldBe(visible).shouldBe(enabled);
            }

            case "website" -> {
                ElementsCollection links = dataTablesSteps.findHttpWebsiteLinks();
                links.shouldHave(size(8));
                links.forEach(link -> link.shouldBe(visible).shouldBe(enabled));
            }
        }
    }
}