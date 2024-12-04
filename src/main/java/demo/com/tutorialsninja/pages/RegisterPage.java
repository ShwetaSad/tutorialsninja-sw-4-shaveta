package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By textRegisterAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By verifyTheText = By.xpath("//h2[normalize-space()='Returning Customer']");
    By enterFirstName = By.xpath("//input[@id='input-firstname']");
    By enterLastName = By.xpath("//input[@id='input-lastname']");
    By enterEmail = By.xpath("//input[@id='input-email']");
    By enterTelephone = By.xpath("//input[@id='input-telephone']");
    By enterPassword = By.xpath("//input[@id='input-password']");
    By enterConfirmPassword = By.xpath("//input[@id='input-confirm']");
    By selectRadioButton = By.cssSelector("input[value='1'][name='newsletter']");
    By clickOnPrivacyPolicy = By.xpath("//input[@name='agree']");
    By clickOnContinueButton = By.xpath("//input[@value='Continue']");
    By verifyTheMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By clickOnContinueButton2 = By.linkText("Continue");


    public String verifyTheRegisterText() {
        return getTextFromElement(textRegisterAccount);
    }

    public String verifyText() {
        return getTextFromElement(verifyTheText);
    }

    public void enterName(String firstname) {
        sendTextToElement(enterFirstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(enterLastName, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);
    }

    public void EnterTelephone(String phone) {
        sendTextToElement(enterTelephone, phone);
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    public void enterConfirmPassword(String Confirmpass) {
        sendTextToElement(enterConfirmPassword, Confirmpass);
    }

    public void SelectRadioButton() {
        clickOnElement(selectRadioButton);
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(clickOnPrivacyPolicy);
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinueButton);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyTheMessage);
    }

    public void clickOnContinueButtons() {
        clickOnElement(clickOnContinueButton2);
    }

}
