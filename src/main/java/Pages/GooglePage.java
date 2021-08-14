package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {
    String url = "https://google.com";

    public GooglePage goToGooglePage() {
        open(url);
        return page(GooglePage.class);
    }

    public GooglePage clickError() {
        $(By.xpath("test")).click();
        return page(GooglePage.class);
    }
}
