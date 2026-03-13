package pages.TopGo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.elements;

public class HomePageMediaLocator {


        ///  коллекция локаторов button media соцсетей и использование на всех них hover эффекта

    private final ElementsCollection CollectionItemsHeaderMediaLocator =
                Selenide.elements(By.cssSelector("a.header__media"));


    public void HoverEffectMediaButton()
    {

        CollectionItemsHeaderMediaLocator.asFixedIterable().forEach(SelenideElement::hover);


        ///  итерирование и парсирование коллекции для каждого элемента;
        ///  обращение к каждому элементу из коллекции с forEach и указание SelenideElement::hover (для применения к каждому)

    }

}
