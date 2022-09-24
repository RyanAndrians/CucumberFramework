package core.utility;

import com.codeborne.selenide.Configuration;
import core.variables.GenericVariables;

public class SeleniumConfig implements GenericVariables {

    public static void initConfiguration() {
        Configuration.browser = browser;
        Configuration.startMaximized = Boolean.parseBoolean(maximizedWindow);
        Configuration.headless = Boolean.parseBoolean(headlessConfig);
        Configuration.screenshots = Boolean.parseBoolean(screenshotConfig);
        Configuration.savePageSource = Boolean.parseBoolean(pageSource);
        Configuration.timeout = Long.parseLong(timeout);
    }
}
