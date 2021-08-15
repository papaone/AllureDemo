package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final By
            loginButton = By.xpath("//button[contains(text(),'Вход')]"),
            emailField = By.xpath("//input[contains(@class,'js-email-input')]"),
            passwordField = By.xpath("//input[contains(@class,'js-psw-input')]"),
            submitButton = By.xpath("//div//button[contains(text(),'Войти')]"),
            userName = By.xpath("//p[contains(text(),'Test')]"),
            phoneValue = By.xpath("//header/div[1]/div[1]/a[2]");
    String url = "https://otus.ru/";

    public MainPage goToMainPage() {
        open(url);
        return page(MainPage.class);
    }

    public MainPage clickLoginButton() {
        $(loginButton).click();
        return page(MainPage.class);
    }

    public MainPage enterEmail(String email) {
        $(emailField).sendKeys(email);
        return page(MainPage.class);
    }

    public MainPage enterPassword(String password) {
        $(passwordField).sendKeys(password);
        return page(MainPage.class);
    }

    public MainPage clickSubmitButton() {
        $(submitButton).click();
        return page(MainPage.class);
    }

    public SelenideElement isUserNameButtonDisplayed() {
        return $(userName).should(Condition.visible);
    }

    public SelenideElement isPhoneDisplayed() {
        return $(phoneValue).should(Condition.have(Condition.text("+7 499 938-92-02")));
    }

}
