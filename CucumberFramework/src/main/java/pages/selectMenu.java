package pages;

import com.codeborne.selenide.Selenide;
import core.variables.Data;
import helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class selectMenu {
    private Data data = new Data();
    String dropdownSelectMultiple = "#react-select-4-input";
    String dropdownSelectValue = "//*[@id=\"withOptGroup\"]/div/div[1]/div[1]";
    String dropdownSelectOne = "//*[@id=\"selectOne\"]/div";
    String dropdownOldStyleSelectMenu = "oldSelectMenu";

    public void setSelectValue(String value) {
        if (value.equals("Another root option")){
            Selenide.$(By.xpath(dropdownSelectValue)).click();
            Selenide.actions().sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
            data.setStatusVerifyDropdownSelectValue("OK");
        }else{data.setStatusVerifyDropdownSelectValue("NOK");}
    }
    public void setSelectOne(String value){
        if (value.equals("Other")) {
            Selenide.$(By.xpath(dropdownSelectOne)).scrollIntoView(true);
            Selenide.$(By.xpath(dropdownSelectOne)).click();
            Selenide.actions().sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
            data.setStatusVerifyDropdownSelectOne("OK");
        }else{data.setStatusVerifyDropdownSelectOne("NOK");}
    }
    public void setOldStyleSelectMenu(String value){
        if (value.equals("aqua")) {
            Selenide.$(By.id(dropdownOldStyleSelectMenu)).scrollIntoView(true);
            Selenide.$(By.id(dropdownOldStyleSelectMenu)).selectOptionByValue("10");
            data.setDropdownOldStyleSelectMenu("OK");
        }else{data.setDropdownOldStyleSelectMenu("NOK");}
    }
    public void setMultiSelect(String value){
        if (value.equals("all color")) {
            Selenide.$(dropdownSelectMultiple).scrollIntoView(true);
            Selenide.$(dropdownSelectMultiple).setValue("Green").pressEnter();
            Selenide.$(dropdownSelectMultiple).setValue("Blue").pressEnter();
            Selenide.$(dropdownSelectMultiple).setValue("Black").pressEnter();
            Selenide.$(dropdownSelectMultiple).setValue("Red").pressEnter();
            data.setStatusVerifyDropdownSelectMultiple("OK");
        }else{data.setStatusVerifyDropdownSelectMultiple("NOK");}
    }

    public void verifyStatusTest(){
        SeleniumHelper.writeLog("Verify DropdownSelectValue =" +data.getStatusVerifyDropdownSelectValue().equals("OK"));
        SeleniumHelper.writeLog("Verify DropdownSelectOne =" +data.getStatusVerifyDropdownSelectOne().equals("OK"));
        SeleniumHelper.writeLog("Verify DropdownOldStyleSelectMenu =" +data.getDropdownOldStyleSelectMenu().equals("OK"));
        SeleniumHelper.writeLog("Verify DropdownSelectMultiple =" +data.getStatusVerifyDropdownSelectMultiple().equals("OK"));
    }
}
