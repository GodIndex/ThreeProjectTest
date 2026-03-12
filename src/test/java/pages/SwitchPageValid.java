package pages;

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


//    /// Локатор и проверка ссылки обратно на главную страницу сайта
//
//    private final SelenideElement ShouldBeLinkNameCompanyLocator = Selenide.$x("//div[text() = 'https://topgo.group/']");
//
//    void ValidatorLinkReverseTransitionHomePage()
//    {
//        ShouldBeLinkNameCompanyLocator.shouldBe((Condition.text("https://topgo.group/")));
//    }
//
//    /// Локатор и проверка действия hover при наведении на рейтинг, клик на рейтинг для открытия выборки
//
//    private final SelenideElement HoverForRatimgJob = Selenide.$("a.link-to-settings--eFyJRA6gx4F1Wwkd");
//    void OpenHoverEffectRating() { HoverForRatimgJob.hover(); }
//
//    private final  SelenideElement FormForVariationsJob = Selenide.$("a.link-to-settings--eFyJRA6gx4F1Wwkd");
//    void OpenNewFormVariationsJobs() { FormForVariationsJob.click(); }


