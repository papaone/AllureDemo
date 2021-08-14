import Steps.GooglePageSteps;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTest extends BaseTest {
    @Test
    @AllureId("1")
    @Description("Go to Google page")
    public void goToGooglePage(){
        GooglePageSteps googlePageSteps = new GooglePageSteps();

        googlePageSteps.goToGooglePage();
        googlePageSteps.errorStep();
    }
}
