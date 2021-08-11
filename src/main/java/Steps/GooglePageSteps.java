package Steps;

import Pages.GooglePage;
import io.qameta.allure.Step;

import java.io.IOException;

public class GooglePageSteps extends BaseStep{

    GooglePage googlePage = new GooglePage();

    @Step("Go to Google page")
    public void goToGooglePage() throws IOException {
        googlePage.goToGooglePage();
        screenshot();
    }
}
