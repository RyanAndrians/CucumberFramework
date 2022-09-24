package cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.books;

public class booksStepDef {
    private final pages.books books = new books();
    @And("User search book {string}")
    public void userSearchBook(String value) {
        books.setSearch(value);
    }

    @Then("User see {string}")
    public void userSee(String value) {
        books.verifyTable(value);
    }

    @And("User click book {string}")
    public void userClickBook(String value) {
        books.getDetailBook(value);
    }
}
