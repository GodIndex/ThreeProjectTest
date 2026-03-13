package UpLvlSimpleWine;

import helpers.Attach;
import helpers.WineTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SinpleWine.AgeButtonLocator;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class PrimarySimpleWineTest extends WineTestBase {

AgeButtonLocator ageButtonLocator = new AgeButtonLocator();



    @Tag
            ("WineCollection")
    @DisplayName
            ("SimpleWineTests")
    @Test

    public void WineSimplePrimaryTests()
    {
        ageButtonLocator
               .Headless_BaseUrl();
        ageButtonLocator
                .ValidatorWineURLPage();
        ageButtonLocator
                .ClickAgeVerification();




    }


}
