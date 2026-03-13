package helpers;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.headless;

public class WineTestBase {

    @BeforeAll
    static void SetUpWineAll()
    {
        baseUrl = "https://simplewine.ru/";
        Configuration.browser = "Chrome";
        pageLoadStrategy = "eager";
        headless = false;
    }

    public void Headless_BaseUrl()
    {
        System.out.println("Open_URL = " + baseUrl);
        System.out.println("Headless_Active = " + headless);
    }



}
