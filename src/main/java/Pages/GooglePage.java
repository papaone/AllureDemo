package Pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
    String url = "https://google.com";

    public GooglePage goToGooglePage() {
        open(url);
        return page(GooglePage.class);
    }
}
