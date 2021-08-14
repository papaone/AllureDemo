package Steps;

import Pages.GooglePage;
import io.qameta.allure.Step;

public class GooglePageSteps {

    GooglePage googlePage = new GooglePage();

    @Step("Go to Google page")
    public GooglePageSteps goToGooglePage() {
        googlePage.goToGooglePage();
        return this;
    }

    @Step("Error step")
    public GooglePageSteps errorStep() {
        googlePage.clickError();
        return this;
    }
}
