package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {

    By listOfAccountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
    By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
    By login = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");
    By clickOnMyAccountLink1 = By.xpath("//span[normalize-space()='My Account']");
    By clickOnLogOut = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By verifyTextAccountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By clickOnContinueButtonThree = By.linkText("Continue");
    By verifyTextMyAccount = By.xpath("//h2[normalize-space()='My Account']");
    By clickOnLoginButtonlast = By.xpath("//input[@value='Login']");


    public List<WebElement> getListOfMyAccountOption() {
        return driver.findElements(listOfAccountOption);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void setClickOnRegister() {
        clickOnElement(register);
    }

    public void setClickOnLogin() {
        clickOnElement(login);
    }

    public void clickOnMyAccountLink1() {
        clickOnElement(clickOnMyAccountLink1);
    }

    public void clickOnLogOut() {
        clickOnElement(clickOnLogOut);
    }

    public String verifyTextAccountLogout() {
        return getTextFromElement(verifyTextAccountLogout);
    }

    public void clickOnContinueButtonThree() {
        clickOnElement(clickOnContinueButtonThree);
    }

    public void clickOnLoginButton4() {
        clickOnElement(clickOnLoginButtonlast);
    }

    public String verifyTextMyAccount() {
        return getTextFromElement(verifyTextMyAccount);
    }


}
