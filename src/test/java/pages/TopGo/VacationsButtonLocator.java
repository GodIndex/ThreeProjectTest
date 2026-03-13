package pages.TopGo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationsButtonLocator {

    private final ElementsCollection HeaderLiThreeElement =
            Selenide.elements(By.cssSelector("li.header__li"));

    public VacationsButtonLocator VacationsButtonClick() {
//        HeaderLiThreeElement.asFixedIterable().stream()
//                        .filter(selenideElement -> selenideElement.text()
//                       .equals("Вакансии")).findFirst().get().click(); /// Stream вариант

        HeaderLiThreeElement.find(Condition.text("Вакансии")).click(); /// Find вариант

        /// возвращаем самого себя для продолжения


        return this;
    }

    public VacationsButtonLocator TeamConditionTextButton() {
        final String result = HeaderLiThreeElement.stream()
                .filter(selenideElement -> selenideElement.text()
                        .equals("Команда")).findFirst().get().getOwnText();

        assertEquals("Команда", result);

        return this;


    }
}
