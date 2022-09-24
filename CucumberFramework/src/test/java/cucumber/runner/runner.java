package cucumber.runner;

import core.utility.SeleniumConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"classpath:cucumber/stepDefinitions"},
        features = {"src/test/java/cucumber/features/"})
public class runner {
    @BeforeClass
    public static void seleniumInitialization(){
        SeleniumConfig.initConfiguration();
    }
}
