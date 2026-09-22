package tests;

import conditions.TextColorCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DynamicLoadingPage;
import steps.DynamicLoadingSteps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;

public class DynamicLoadingTest {

    private DynamicLoadingSteps dynamicLoadingSteps;

    @BeforeEach
    void setUp() {
        dynamicLoadingSteps = new DynamicLoadingSteps(new DynamicLoadingPage());

        dynamicLoadingSteps.openPage();
    }

    @Test
    void helloWorldShouldAppearWithBlackText() {
        dynamicLoadingSteps.startLoading();

        dynamicLoadingSteps.page().getHelloWorldText()
                .should(new TextColorCondition("rgba(34, 34, 34, 1)"), Duration.ofSeconds(10))
                .shouldHave(text("Hello World!"));
    }
}