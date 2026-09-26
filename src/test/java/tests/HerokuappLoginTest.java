package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import steps.HerokuappLoginSteps;

import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;

public class HerokuappLoginTest {

    private final HerokuappLoginSteps loginSteps = new HerokuappLoginSteps();

    @BeforeEach
    void setUp() {
        loginSteps.openPage();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("loginTestData")
    void invalidLoginShouldShowError(String testName, String username, String password) {
        loginSteps.login(username, password);

        loginSteps.page().getErrorMessage().shouldHave(text("Your username is invalid!"));
    }

    static Stream<Arguments> loginTestData() {
        return Stream.of(
                Arguments.of("Empty username", "", "password"),
                Arguments.of("Empty password", "username", ""),
                Arguments.of("One character", "a", "a"),
                Arguments.of("Special characters", "!@#$%^&*()", "!@#$%^&*()"),
                Arguments.of("SQL injection", "' OR 1=1 --", "' OR 1=1 --"));
    }
}
