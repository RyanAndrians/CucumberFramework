package helper;

import core.variables.GenericVariables;
import org.openqa.selenium.Keys;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;

public class SeleniumHelper implements GenericVariables {
    // Logger
    protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void writeLog(String message) {
        LOGGER.info(message);
    }

    public void escape() {
        $("body").sendKeys(Keys.ESCAPE);
    }

}