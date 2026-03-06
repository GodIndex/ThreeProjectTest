import helpers.Attach;
import org.junit.jupiter.api.*;

public class GoTest extends PreTestBase {






    @Tag("Attach Params")
    @AfterEach
    void addAttachment() {
        Attach.screenshotAs("Last Screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }


    @Disabled
    @Tag("TogGo Collection")
    @DisplayName("TopGo Tests")
    @Test
    void FirstUnTest() {

        BrowserCongiureValidatorOpenPage();
        HoverEffectMediaButton();
        VacantionsButtonClick();



    }
}
