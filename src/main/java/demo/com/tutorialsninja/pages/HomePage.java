package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By mouseHoverOnDeskTopAndClick = By.linkText("Desktops");
    By laptopAndNotBook = By.linkText("Laptops & Notebooks");
    By topMenuList = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    public void MouseHoverOnDeskTopAndClick() {
        mouseHoverToElement(mouseHoverOnDeskTopAndClick);
    }

    public void mouseHoverOnLaptopAndNotBook() {
        mouseHoverToElement(laptopAndNotBook);
    }

    public List<WebElement> getTopMenuList() {
        return driver.findElements(topMenuList);
    }


}
