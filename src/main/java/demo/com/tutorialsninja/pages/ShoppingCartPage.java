package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage extends Utility {
    By clickOnShoppingCardLink = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyTheTextOfShopping = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTheProductNameHp = By.xpath("/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By verifyTheDeliveryDate = By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > small:nth-child(3)");
    By verifyTheModel = By.xpath("//td[normalize-space()='Product 21']");
    By verifyTheTotal = By.xpath("//tbody//tr//td[6]");


    public void clickOnShoppingCardLik() {
        clickOnElement(clickOnShoppingCardLink);
    }

    public String verifyTheTextOfShopping() {
        return getTextFromElement(verifyTheTextOfShopping);

    }

    public String VerifyTheProductNameHp() {
        return getTextFromElement(verifyTheProductNameHp);

    }

    public String verifyTheDeliveryDate1() {
        return getTextFromElement(verifyTheDeliveryDate);

    }

    public String verifyTheModel() {
        return getTextFromElement(verifyTheModel);
    }

    public String verifyTheTotal() {
        return getTextFromElement(verifyTheTotal);

    }

/*
    public void selectDate() {
        String day = "27";
        String month = "November";
        String year = "2024";


        clickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']"));
        while (true) {
            String monthYear = getTextFromElement(By.xpath("//div[@class='datepicker-days']//th[@class='picker-switch']")); //of Date and year element title in calender
            String[] a = monthYear.split(" "); //Splitting month and year
            String mon = a[0];
            String yer = a[1];
            if (mon.equals(month) && yer.equals(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        //Select date
        List<WebElement> dates = driver.findElements(By.xpath("//tbody/tr/td[@class='day']"));
        for (WebElement date : dates) {
            System.out.println(date.getText());
            if (date.getText().equals(day)) {
                date.click();
                break;
            }

*/
}

