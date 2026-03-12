package TopGoPrimary;

import helpers.Attach;
import helpers.TestBase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.devtools.v142.page.Page;
import pages.HomePageMediaLocator;
import pages.SwitchPageValid;
import pages.VacationsButtonLocator;


public class GoTest extends TestBase {

    SwitchPageValid switchPageValid = new SwitchPageValid();
    HomePageMediaLocator homePageMediaLocator = new HomePageMediaLocator();
    VacationsButtonLocator vacationsButtonLocator = new VacationsButtonLocator();

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

        switchPageValid.
                ValidatorNameBrowser();
        homePageMediaLocator.
                HoverEffectMediaButton();
        vacationsButtonLocator.
                TeamConditionTextButton();
        vacationsButtonLocator.
                VacationsButtonClick();











    }
}

