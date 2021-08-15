package Steps;

import Pages.MainPage;
import io.qameta.allure.Step;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Step("Login to otus.ru")
    public void login(String email, String pass) {
        mainPage.goToMainPage()
                .clickLoginButton()
                .enterEmail(email)
                .enterPassword(pass)
                .clickSubmitButton();
    }

    @Step("Check 'My Course' button is displayed ")
    public void checkUserNameButtonIsDisplayed() {
        mainPage.isUserNameButtonDisplayed();
    }

    @Step("Check 'Phone' value is displayed ")
    public void checkPhoneIsDisplayed() {
        mainPage.isPhoneDisplayed();
    }

    @Step("Go to otus.ru")
    public void goToMainPage() {
        mainPage.goToMainPage();
    }
}
