package Steps;

import Pages.GooglePage;
import io.qameta.allure.Step;

public class GooglePageSteps {

    GooglePage googlePage = new GooglePage();

    @Step("Go to Google page")
    public void goToGooglePage() {
        googlePage.goToGooglePage();
    }
}
