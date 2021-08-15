import Steps.GooglePageSteps;
import Steps.MainPageSteps;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;


public class DemoTest extends BaseTest {
    @Test
    @AllureId("1")
    @Description("Always error test")
    public void errorTest(){
        GooglePageSteps googlePageSteps = new GooglePageSteps();

        googlePageSteps.goToGooglePage();
        googlePageSteps.errorStep();
    }

    @Test
    @AllureId("2")
    @Description("Check User logged in to otus.ru")
    public void loginToOtus(){
        MainPageSteps mainPageSteps = new MainPageSteps();

        mainPageSteps.login("vitaliybugayev+1@gmail.com","Rbuga41010!");
        mainPageSteps.checkUserNameButtonIsDisplayed();
    }

    @Test
    @AllureId("3")
    @Description("Check 'Phone' value in otus.ru")
    public void checkPhoneValue(){
        MainPageSteps mainPageSteps = new MainPageSteps();

        mainPageSteps.login("vitaliybugayev+1@gmail.com","Rbuga41010!");
        mainPageSteps.checkPhoneIsDisplayed();
    }
}
