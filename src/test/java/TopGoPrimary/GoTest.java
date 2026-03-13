package TopGoPrimary;

import helpers.Attach;
import helpers.TestBase;
import org.junit.jupiter.api.*;
import pages.TopGo.HomePageMediaLocator;
import pages.TopGo.HoverRatingLocator;
import pages.TopGo.SwitchPageValid;
import pages.TopGo.VacationsButtonLocator;

import static com.codeborne.selenide.Selenide.sleep;


public class GoTest extends TestBase {

    SwitchPageValid switchPageValid = new SwitchPageValid();
    HomePageMediaLocator homePageMediaLocator = new HomePageMediaLocator();
    VacationsButtonLocator vacationsButtonLocator = new VacationsButtonLocator();
    HoverRatingLocator hoverRatingLocator = new HoverRatingLocator();

    @AfterEach
    public void addAttachment() {
        Attach.screenshotAs("Last Screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }


    @Tag
            ("TogGo Collection")
    @DisplayName
            ("TopGo Tests")
    @Test

    public void FirstUnGoTest() {
        Headless_BaseUrl();

        switchPageValid
                .ValidatorNameBrowser();
        homePageMediaLocator
                .HoverEffectMediaButton();
        vacationsButtonLocator
                .TeamConditionTextButton();
        vacationsButtonLocator
                .VacationsButtonClick();

        sleep(3_000);

        hoverRatingLocator
                .OpenHoverEffectRating();
        hoverRatingLocator
                .OpenNewFormVariationsJobs();













    }
}

