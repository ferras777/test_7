package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    void GoogleSearchTest() {
        open("https://google.com");

        $(byName("q")).val("selenide").submit();

        $("body").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
