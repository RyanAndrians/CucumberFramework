package pages;

import com.codeborne.selenide.Selenide;
import core.variables.Data;
import org.openqa.selenium.By;

public class books {
    private Data constant = new Data();
    String pathAuthor ="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[3]";
    String pathPublisher ="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[4]";
    String pathTitle ="//*[@id=\"see-book-Git Pocket Guide\"]/a";
    public void getDetailBook(String value){
        if(value.equals("Git Pocket Guide")) {
            constant.setAuthor(Selenide.$(By.xpath(pathAuthor)).getText());
            constant.setPublisher(Selenide.$(By.xpath(pathPublisher)).getText());
            constant.setTitle(Selenide.$(By.xpath(pathTitle)).getText());
            Selenide.$(By.xpath("//*[@id=\"see-book-"+value+"\"]")).click();
        }
    }

    public void setSearch(String value){
        Selenide.$(By.id("searchBox")).sendKeys(value);
    }

    public void verifyTable(String value){
        if(value.equals("No rows found")) {
            Selenide.$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[3]")).getText().equals(value);
        } else if (value.equals("Git Pocket Guide")) {
            constant.getTitle().equals("Git Pocket Guide");
            constant.getAuthor().equals("Richard E. Silverman");
            constant.getPublisher().equals("O'Reilly Media");
        }
    }
}
