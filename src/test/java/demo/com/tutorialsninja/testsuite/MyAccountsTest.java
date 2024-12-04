package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.MyAccountPage;
import demo.com.tutorialsninja.pages.RegisterPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyAccountsTest extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterPage registerPage = new RegisterPage();

    public void selectMyAcccountOptions(String option) {
        List<WebElement> myAccountList = myAccountPage.getListOfMyAccountOption();
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = myAccountPage.getListOfMyAccountOption();
        }

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // 1.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 1.2 Call the method “selectMyAccountOptions()” method and pass the   parameter “Register”
        selectMyAcccountOptions("Register");

        //1.3 Verify the text “Register Account”.
        String expectedText = "Register Account";
        String actualText = registerPage.verifyTheRegisterText();
        Assert.assertEquals(actualText, expectedText, "InvalidText");
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        //2.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 2.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Login”
        selectMyAcccountOptions("Login");

        //  2.3 Verify the text “Returning Customer"
        String expectedText = "Returning Customer";
        String actualText = registerPage.verifyText();
        Assert.assertEquals(actualText, expectedText, "invalid text");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        // 3.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 3.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Register”
        myAccountPage.setClickOnRegister();

        // 3.3 Enter the First Name
        registerPage.enterName("Shaveta");

        // 3.4 enterLast Name
        registerPage.enterLastName("Sethi");

        // 3.5 Enter the Email
        registerPage.enterEmail("sethis@gmail.com");

        // 3.6 Enter the Telephone
        registerPage.EnterTelephone("079375864");

        // 3.7 Enter the Password
        registerPage.enterPassword("Prime123");


        // 3.8 Enter the Password Confirm
        registerPage.enterConfirmPassword("prime123");

        // 3.9 Select Subscribe Yes radio button
        registerPage.SelectRadioButton();

        // 3.10 Click on the Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();

        //  3.11 Click on the Continue button
        registerPage.clickOnContinueButton();

        // 3.12 Verify the message “Your Account Has Been Created!”
        registerPage.verifyTheMessage();
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = registerPage.verifyTheMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Invalid Message");

        // 3.13 Click on the Continue button
        registerPage.clickOnContinueButtons();

        // 3.14 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink1();

        // 3.15 Call the method “selectMyAccountOptions()” method and pass the    parameter “Logout”
        selectMyAcccountOptions("Logout");

        // 3.16 Verify the text “Account Logout”
        String actualMessage1 = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessage1, "Account Logout", "invalid message");

        //  3.17 Click on the Continue button
        myAccountPage.clickOnContinueButtonThree();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 4.2 Call the method “selectMyAccountOptions()” method and pass the parameter “Login”
        myAccountPage.setClickOnLogin();
        // 4.3 Enter the Email address
        registerPage.enterEmail("ss@gmail.com");

        // 4.5 Enter the Password
        registerPage.enterPassword("Prime123");

        // 4.6 Click on the Login button
        myAccountPage.clickOnLoginButton4();

        // 4.7 Verify text “My Account”
        myAccountPage.verifyTextMyAccount();
        String actualText = myAccountPage.verifyTextMyAccount();
        Assert.assertEquals(actualText, "My Account", "Invalid Text");

        // 4.8 Click on the My Account Link.
        myAccountPage.clickOnMyAccountLink();

        // 4.9 Call the method “selectMyAccountOptions()” method and pass the   parameter “Logout”
        myAccountPage.clickOnLogOut();

        // 4.10 Verify the text “Account Logout”
        String actualMessage1 = myAccountPage.verifyTextAccountLogout();
        Assert.assertEquals(actualMessage1, "Account Logout", "invalid message");

        // 4.11 Click on the Continue button
        myAccountPage.clickOnContinueButtonThree();
    }

}

