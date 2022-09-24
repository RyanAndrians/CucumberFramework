package core.variables;

import core.utility.PropertiesReader;

public interface GenericVariables {

    PropertiesReader propertiesReader = new PropertiesReader();

    // URL
    String homePageUrl = propertiesReader.getProperties("application.toolsQa.homePage.url");

    // Selenium Configuration
    String browser = propertiesReader.getProperties("selenium.browser");
    String maximizedWindow = propertiesReader.getProperties("selenium.maximized.window");
    String headlessConfig = propertiesReader.getProperties("selenium.headless");
    String screenshotConfig = propertiesReader.getProperties("selenium.failure.screenshot");
    String pageSource = propertiesReader.getProperties("selenium.failure.save.page.source");
    String timeout = propertiesReader.getProperties("selenium.timeout.milliseconds");
}
