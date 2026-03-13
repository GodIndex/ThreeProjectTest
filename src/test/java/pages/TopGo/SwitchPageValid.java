package pages.TopGo;

import com.codeborne.selenide.Selenide;
import helpers.TestBase;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class SwitchPageValid extends TestBase {

    ///  Проверка на указаннее корректного браузера для открытия

    public void ValidatorNameBrowser() {
        switch (browser) {
            case ("Chrome"), ("Firefox"), ("Edge") ->
            {
                System.out.println("Указан корректный браузер");
                ValidatorURLPage();
            }

        }

    }

    public void ValidatorURLPage() {
        switch (baseUrl) {
            case "https://topgo.group/" ->
            {
                System.out.println("URL открылся");
                Selenide.open(baseUrl);
            }

        }
    }
}




