package Steps;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class BaseStep {

    @Attachment(value = "result", type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile();
        FileUtils.copyFile(screenshot, new File("target\\allure-results\\screenshots\\" + screenshot.getName()));
        return Files.toByteArray(screenshot);
    }
}
