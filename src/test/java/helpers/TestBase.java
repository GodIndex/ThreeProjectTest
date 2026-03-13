package helpers;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.sleep;



public class TestBase {

    ///
    @BeforeAll
    static void SetUpAll()
    {

        baseUrl = "https://topgo.group/";
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        pageLoadStrategy = "eager";
        headless = false;


    }

   public void Headless_BaseUrl()
    {
        System.out.println("Open_URL = " + baseUrl);
        System.out.println("Headless_Active = " + headless);
    }




















    ///
    @AfterAll
    static void afterAll() {
        sleep(1_000);
    }

}
