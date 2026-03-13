package pages.SinpleWine;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.WineTestBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.element;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeButtonLocator extends WineTestBase {


    public void ValidatorWineURLPage() {

        switch (baseUrl) {
            case "https://simplewine.ru/" ->
            {
                System.out.println("URL открылся");
                Selenide.open(baseUrl);
            }

        }
    }






private final SelenideElement ButtonAgeLocator = element
           (By.xpath("//button[@class=\"AgeConfirmModal_button__Kiyo1 Button_button__2-C6i simple-button Button_isStretched__8ZkTQ Button_primary__5PFMV Button_large__D1A28\"]"));

   public void ClickAgeVerification()
   {
       ButtonAgeLocator.click();

   }



}


