package conditions;

import com.codeborne.selenide.CheckResult;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.WebElementCondition;
import org.jspecify.annotations.NullMarked;
import org.openqa.selenium.WebElement;

public class TextColorCondition extends WebElementCondition {

    private final String expectedColor;

    public TextColorCondition(String expectedColor) {
        super("text color: " + expectedColor);
        this.expectedColor = expectedColor;
    }

    @NullMarked
    @Override
    public CheckResult check(Driver driver, WebElement element) {
        return Condition.cssValue("color", expectedColor).check(driver, element);
    }
}
