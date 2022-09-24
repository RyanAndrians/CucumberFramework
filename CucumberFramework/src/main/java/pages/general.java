package pages;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class general {
    String urlbase = "https://demoqa.com";
    String statusVerify=null;
    public void verifyPathAddress(String value) {
        if (value.equals("select menu")){
            webdriver().shouldHave(currentFrameUrl(urlbase + "/select-menu"));
            statusVerify = "OK";
        } else if(value.equals("Book Store")){
            webdriver().shouldHave(currentFrameUrl(urlbase + "/books"));
            statusVerify = "OK";
        }
    }
}
