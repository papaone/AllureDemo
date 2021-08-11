import Steps.GooglePageSteps;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class DemoTest {
    @Test
    @AllureId("1")
    @Description("Go to Google page")
    public void goToGooglePage() throws IOException {
        GooglePageSteps googlePageSteps = new GooglePageSteps();
        googlePageSteps.goToGooglePage();
    }
}
