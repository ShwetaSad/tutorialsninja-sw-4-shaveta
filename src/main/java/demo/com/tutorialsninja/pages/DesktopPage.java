package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    By showAllDeskTops = By.linkText("Show AllDesktops");
    By verifyTextDeskTop = By.xpath("//h2[normalize-space()='Desktops']");
    By verifyDeskTop = By.xpath("//h2[normalize-space()='Desktops']");
    By selectPosition = (By.xpath("//select[@id=\"input-sort\"]"));
    By listOfProduct = By.xpath("//h4/a");
    By productSorting = By.id("input-sort");

    By mouseHoverOnCurrencyAndClick = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    By mouseHoverOnPoundAndClick = By.cssSelector("button[name='GBP']");
    By mouseHoverOnDeskTopTab = By.linkText("Desktops");

    By selectProductHP = By.linkText("HP LP3065");
    By verifyTheTextHP = By.xpath("//h1[normalize-space()='HP LP3065']");
    By selectDate = By.xpath("//div[@class='input-group date']//button[@type='button']");
    By enterQty = By.xpath("//input[@id='input-quantity']");
    By AddToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTheMessage = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
    By ShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    public void showAllDeskTops() {
        clickOnElement(showAllDeskTops);

    }

    public String verifyDeskTop() {
        return getTextFromElement(verifyTextDeskTop);

    }
    public void selectOnPositionOnDeskTops() {
        selectByVisibleTextFromDropDown(productSorting, "Name (Z - A)");
    }
    public List<WebElement> getListsOfProduct(){
        return driver.findElements(listOfProduct);
    }

    public void selectSortByZToA(String option){
        selectByVisibleTextFromDropDown(productSorting, option);
    }

    public void mouseHoverOnCurrencyAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnCurrencyAndClick);
    }

    public void mouseHoverOnPoundAndClick() {
        mouseHoverToElementAndClick(mouseHoverOnPoundAndClick);
    }

    public void mouseHoverOnDeskTopTab() {
        mouseHoverToElement(mouseHoverOnDeskTopTab);

    }

    public void selectProductHP() {
        clickOnElement(selectProductHP);
    }

    public String verifyTheTextHp() {
        return getTextFromElement(verifyTheTextHP);
    }
    public void clearDate() {
    //    driver.findElement(selectDate).clear();
    }
    public void selectDate(){
        sendTextToElement(selectDate,"2024-11-27");
    }


    public void enterQty() {
        driver.findElement(enterQty).clear();
        sendTextToElement(enterQty, "1");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(AddToCartButton);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public void clickOnShoppingCardLik() {
        clickOnElement(ShoppingCart);
    }


}
