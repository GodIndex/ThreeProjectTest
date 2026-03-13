package pages.TopGo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HoverRatingLocator {

    /// Локатор и проверка действия hover при наведении на рейтинг, клик на рейтинг для открытия выборки

    private final SelenideElement HoverForRatimgJob;

    {
        HoverForRatimgJob =
                Selenide.element(By.cssSelector("a.link-to-settings--eFyJRA6gx4F1Wwkd"));
    }

    public void OpenHoverEffectRating()
    {
        HoverForRatimgJob.hover();
    }

    private final SelenideElement FormForVariationsJob =
            Selenide.element(By.cssSelector("a.link-to-settings--eFyJRA6gx4F1Wwkd"));


   public void OpenNewFormVariationsJobs()
    {
        FormForVariationsJob.click();
    }
}
