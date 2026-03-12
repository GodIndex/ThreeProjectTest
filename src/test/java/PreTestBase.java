import com.codeborne.selenide.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.sleep;



class PreTestBase {

    ///  пред-шаги
    @BeforeAll
    static void SetUpAll()
    {

        baseUrl = "https://topgo.group/";
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        pageLoadStrategy = "eager";
        headless = true;

    }


    ///  Проверка на указанние корректного браузера для открытия
    public void BrowserCongiureValidatorOpenPage() {
        switch (browser) {
            case ("Chrome"), ("Firefox"), ("Egde"):
                System.out.println("Указан корректный браузер");
                ValidatorURLPage();
                break;
        }
    }

    /// Проверка на совпадние URL
    public void ValidatorURLPage() {
        switch (baseUrl) {
            case ("https://topgo.group/"):
                System.out.println("URL открылся");
                Selenide.open(baseUrl);
                break;
        }
    }


    ///  Коллекция локаторов button media соцсетей и использование на всех них hover эффекта

    private final  ElementsCollection ItemsHeaderMediaLocatorThree = Selenide.$$("a.header__media");

    void HoverEffectMediaButton()
    {
        ItemsHeaderMediaLocatorThree.asFixedIterable().forEach(element -> element.hover());
    }



    /// Локатор и клик кнопки вакансии из списка 3 кнопок
    private final SelenideElement VacantionLocatorButtons = Selenide.$x("//a[@href =\"https://spb.hh.ru/employer/11013820?hhtmFrom=vacancy\" and @class =\"header__link\"]");

    void VacantionsButtonClick()
    {
        VacantionLocatorButtons.click();
    }

    /// Локатор и проверка первого слова в описании после нажатия вакансии
    private final  SelenideElement CompanyInfoClick = Selenide.$x("employer-page-tabs-desktop-go-DESCRIPTION employer-page-tabs-desktop-active");
    void InfoCompanyNextPage() {
        CompanyInfoClick.click();
    }

    /// Локатор и проверка ссылки обратно на главную страницу сайта

    private final SelenideElement ShouldBeLinkNameCompanyLocator = Selenide.$x("//div[text() = 'https://topgo.group/']");

    void ValidatorLinkReverseTransitionHomePage()
    {
        ShouldBeLinkNameCompanyLocator.shouldBe((Condition.text("https://topgo.group/")));
    }

    /// Локатор и проверка действия hover при наведении на рейтинг, клик на рейтинг для открытия выборки

    private final SelenideElement HoverForRatimgJob = Selenide.$("a.link-to-settings--eFyJRA6gx4F1Wwkd");
    void OpenHoverEffectRating() { HoverForRatimgJob.hover(); }

    private final  SelenideElement FormForVariationsJob = Selenide.$("a.link-to-settings--eFyJRA6gx4F1Wwkd");
    void OpenNewFormVariationsJobs() { FormForVariationsJob.click(); }


    ///  После шаги
    @AfterAll
    static void afterAll() {
        sleep(1_000);
    }

}
