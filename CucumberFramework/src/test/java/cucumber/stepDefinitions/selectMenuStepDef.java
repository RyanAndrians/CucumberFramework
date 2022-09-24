package cucumber.stepDefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.general;

import static com.codeborne.selenide.Selenide.open;

public class selectMenuStepDef {
    private final pages.selectMenu selectMenu = new pages.selectMenu();
    private final general general = new general();
    @Given("User go to {string}")
    public void userGoTo(String url){
        open(url);
    }

    @When("User in {string} page")
    public void userInPage(String value) {
        general.verifyPathAddress(value);
        Selenide.sleep(3000);
    }

    @And("User choose select value {string}")
    public void userChooseSelectValue(String value) {
        selectMenu.setSelectValue(value);
    }

    @And("User choose select one {string}")
    public void userChooseSelectOne(String value) {
        selectMenu.setSelectOne(value);
    }

    @And("User choose old style select menu {string}")
    public void userChooseOldStyleSelectMenu(String value){
        selectMenu.setOldStyleSelectMenu(value);
    }

    @And("User choose multi select drop down {string}")
    public void userChooseMultiSelectDropDown(String value) {
        selectMenu.setMultiSelect(value);
    }

    @Then("User success input all select menu")
    public void userSuccessInputAllSelectMenu() {
        selectMenu.verifyStatusTest();
    }


}
