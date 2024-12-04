package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

    By pageTitle = By.xpath("(//h1)[2]");
    By mouseHoverOnLapTopAndClick = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopsAndNoteBooks = By.linkText("Show AllLaptops & Notebooks");
    By verifyTextLaptopsAndBooks = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    By selectSortOfBook = By.xpath("//select[@id='input-sort']");
    By verifyTheProductInOrder = By.xpath("//div[@id='content']//div//div[1]//div[2]//div[1]//p[2]");
    By selectProductMacBook = By.xpath("//a[normalize-space()='MacBook']");
    By verifyMacBookText = By.xpath("//h1[normalize-space()='MacBook']");
    By changeTheQty = By.cssSelector("input[value='1']");
    By clickOnUpdateTab = By.xpath("//button[@type='submit']");
    By clickOnAddToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTheSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnLink = By.xpath("//a[normalize-space()='shopping cart']");
    By listOfProductPrice = By.xpath("//p[@class ='price']");
    By verifyTheMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");
    By clickOnCheckOurButton = By.xpath("//a[@class='btn btn-primary']");
    By verifyTextCheckOut = By.xpath("//h1[normalize-space()='Checkout']");
    By verifyTextNewCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    By clickOnGuestCheckoutRadioButton = By.xpath("//input[@value='guest']");
    By clickOnContinueTab = By.xpath("//input[@id='button-account']");
    By Field1 = (By.xpath("//input[@id='input-payment-firstname']"));
    By Field2 = (By.xpath("//input[@id='input-payment-lastname']"));
    By Field3 = (By.xpath("//input[@id='input-payment-email']"));
    By Field4 = (By.xpath("//input[@id='input-payment-telephone']"));
    By Field5 = (By.xpath("//input[@id='input-payment-address-1']"));
    By Field6 = (By.xpath("//input[@id='input-payment-city']"));
    By Field7 = (By.xpath("//input[@id='input-payment-postcode']"));
    By clickOnContinueButton = By.xpath("//input[@id='button-guest']");
    By addCommentOnOrder = By.xpath("//textarea[@name='comment']");
    By clickOnShoppingCard = By.xpath("//input[@id='button-shipping-method']");
    By checkTheTermsConditionsOfCheckBox = By.xpath("//input[@name='agree']");
    By ClickOnContinueButton = By.xpath("//input[@id='button-payment-method']");


    public void mouseHoverOnLaptopAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnLapTopAndClick);

    }

    public void showAllLapTopAndBooks() {
        clickOnElement(showAllLaptopsAndNoteBooks);
    }

    public String verifyTextLaptopAndBooks() {
        return getTextFromElement(verifyTextLaptopsAndBooks);
    }

    public void selectSortOfBook() {
        selectByVisibleTextFromDropDown(selectSortOfBook, "Price (High > Low)");
    }

    public String verifyTheProDuctDesOrder() {
        return getTextFromElement(verifyTheProductInOrder);
    }

    public void selectProductMacBook() {
        clickOnElement(selectProductMacBook);
    }

    public String verifyMacBookTexts() {
        return getTextFromElement(verifyMacBookText);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);

    }

    public String verifyTheSuccessMassegees() {
        return getTextFromElement(verifyTheSuccessMessage);
    }

    public void clickOnLinkShoppingCardLink() {
        clickOnElement(clickOnLink);
    }

    public List<WebElement> getListsOfProductPrice() {
        return driver.findElements(listOfProductPrice);
    }

    public String getPageTitle() {
        return getTextFromElement(pageTitle);
    }

    public void changeTheQty() {
        driver.findElement(changeTheQty).clear();
        sendTextToElement(changeTheQty, "2");
    }

    public void clickOnUpdateLink() {
        clickOnElement(clickOnUpdateTab);
    }

    public String verifyMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public String verifyTheTotal() {
        return getTextFromElement(verifyTheTotal);
    }

    public void clickOnCheckOutButton() {

        clickOnElement(clickOnCheckOurButton);

    }

    public String verifyCheckOutText() {
        return getTextFromElement(verifyTextCheckOut);

    }

    public String verifyTextNewCustomers() {
        return getTextFromElement(verifyTextNewCustomer);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(clickOnGuestCheckoutRadioButton);
    }

    public void clickOnContinueTab() {
        clickOnElement(clickOnContinueTab);
    }

    public void fillTheFieldName(String name) {
        sendTextToElement(Field1, name);

    }

    public void fillTheFieldLastName(String lastname) {
        sendTextToElement(Field2, lastname);

    }

    public void fillTheFieldEmail(String email) {
        sendTextToElement(Field3, email);


    }

    public void fillTheFieldTelePhone(String Phonenumber) {
        sendTextToElement(Field4, Phonenumber);
    }

    public void fillTheFieldAddress(String address) {
        sendTextToElement(Field5, address);
    }

    public void fillTheCity(String city) {
        sendTextToElement(Field6, city);
    }

    public void fillThePostCode(String code) {
        sendTextToElement(Field7, code);
    }

    public void clickOnContinueButton2() {
        clickOnElement(clickOnContinueButton);
    }

    public void addComments() {
        sendTextToElement(addCommentOnOrder, "This is comment for test case");
        clickOnElement(clickOnShoppingCard);
    }

    public void CheckTheTermsConditionsOfCheckBox() {
        clickOnElement(checkTheTermsConditionsOfCheckBox);
    }

    public void ClickOnContinueButton() {
        clickOnElement(clickOnContinueButton);

    }


}