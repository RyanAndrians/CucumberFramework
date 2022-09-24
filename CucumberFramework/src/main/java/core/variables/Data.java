package core.variables;

public class Data {

    // Verify Book
    private String Author;
    private String Title;
    private String Publisher;
    private String statusVerifyDropdownSelectValue;
    private String statusVerifyDropdownSelectOne;
    private String statusVerifyDropdownSelectMultiple;
    private String dropdownOldStyleSelectMenu;

    public String getStatusVerifyDropdownSelectValue() {
        return statusVerifyDropdownSelectValue;
    }

    public void setStatusVerifyDropdownSelectValue(String statusVerifyDropdownSelectValue) {
        this.statusVerifyDropdownSelectValue = statusVerifyDropdownSelectValue;
    }

    public String getStatusVerifyDropdownSelectOne() {
        return statusVerifyDropdownSelectOne;
    }

    public void setStatusVerifyDropdownSelectOne(String statusVerifyDropdownSelectOne) {
        this.statusVerifyDropdownSelectOne = statusVerifyDropdownSelectOne;
    }

    public String getStatusVerifyDropdownSelectMultiple() {
        return statusVerifyDropdownSelectMultiple;
    }

    public void setStatusVerifyDropdownSelectMultiple(String statusVerifyDropdownSelectMultiple) {
        this.statusVerifyDropdownSelectMultiple = statusVerifyDropdownSelectMultiple;
    }

    public String getDropdownOldStyleSelectMenu() {
        return dropdownOldStyleSelectMenu;
    }

    public void setDropdownOldStyleSelectMenu(String dropdownOldStyleSelectMenu) {
        this.dropdownOldStyleSelectMenu = dropdownOldStyleSelectMenu;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public String getPublisher() {
        return Publisher;
    }
    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
