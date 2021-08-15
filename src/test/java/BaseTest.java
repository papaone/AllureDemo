import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @BeforeAll
    public static void openApp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.browserVersion = "88";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.pageLoadStrategy = PageLoadStrategy.NONE.toString();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
