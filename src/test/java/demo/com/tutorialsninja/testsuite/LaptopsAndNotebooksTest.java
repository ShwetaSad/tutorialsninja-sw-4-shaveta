package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DesktopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage notebooksPage = new LaptopsAndNotebooksPage();
    ShoppingCartPage cartPage = new ShoppingCartPage();
    TopMenuTest test = new TopMenuTest();
    DesktopPage desktopsPage = new DesktopPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        //1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        homePage.mouseHoverOnLaptopAndNotBook();

        //1.2 Click on “Show AllLaptops & Notebooks”
        test.selectMenu("Show AllLaptops & Notebooks");

        //1.3 Select the Sort By "Price (High > Low)"
        notebooksPage.selectSortOfBook();

        //1.4 Verify the Product price will be arranged in High to Low orders.
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : notebooksPage.getListsOfProductPrice()) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);

        notebooksPage.selectSortOfBook();

        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : notebooksPage.getListsOfProductPrice()) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

        Assert.assertEquals(afterSortByPrice, originalProductsPrice,
                "Product not sorted by price High to Low");
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse hover on the Laptops & Notebooks Tab and click
        notebooksPage.mouseHoverOnLaptopAndClick();

        //2.2 Click on the “Show AllLaptops & Notebooks”
        test.selectMenu("Show AllLaptops & Notebooks");

        //1.3 Select the Sort By "Price (High > Low)"
        desktopsPage.selectSortByZToA("Price (High > Low)");

        //2.4 Select Product “MacBook”
        test.selectMenu("MacBook");

        //2.5 Verify the text “MacBook”
        Assert.assertEquals(notebooksPage.getPageTitle(), "MacBook",
                "Product not display");

        Thread.sleep(200);

        //2.6 Click on the ‘Add To Cart’ button
        notebooksPage.clickOnAddToCartButton();
        Thread.sleep(200);

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        Assert.assertTrue(notebooksPage.verifyTheSuccessMassegees()
                        .contains("Success: You have added MacBook to your shopping cart!"),
                "Product not added to cart");
        Thread.sleep(5000);

        //2.8 Click on the link “shopping cart” display into the success message
        notebooksPage.clickOnLinkShoppingCardLink();
        Thread.sleep(5000);

        //2.9 Verify the text "Shopping Cart"
        Assert.assertEquals(cartPage.verifyTheTextOfShopping(), "Shopping Cart  (0.00kg)",
                "Product name not matched");

        //2.10 Verify the Product name "MacBook"
        Assert.assertEquals(notebooksPage.verifyMacBookTexts(), "MacBook", "Product name not matched");

        //2.11 Change the Quantity "2"
        notebooksPage.changeTheQty();

        //2.12 Click on the “Update” Tab
        notebooksPage.clickOnUpdateLink();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        notebooksPage.verifyMessage();
        String expectedMessage1 = "Success: You have modified your shopping cart!";
        String actualMessage2 = notebooksPage.verifyMessage();
        Assert.assertEquals(actualMessage2, expectedMessage1, "InvalidMessage");

        //  2.14 Verify the Total £737.45
        notebooksPage.verifyTheTotal();
        String expectedTotal = "£737.45";
        String actualTotal = notebooksPage.verifyTheTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Invalid Total");

        //  2.15 Click on the “Checkout” button
        notebooksPage.clickOnCheckOutButton();


        //  2.16 Verify the text “Checkout”
        notebooksPage.verifyCheckOutText();


        //  2.17 Verify the Text “New Customer”
        notebooksPage.verifyTextNewCustomers();

        //  2.18 Click on the “Guest Checkout” radio button
        notebooksPage.clickOnGuestCheckoutRadioButton();

        //  2.19 Click on “Continue” tab
        notebooksPage.clickOnContinueTab();

        // 2.20 Fill the mandatory fields
        notebooksPage.fillTheFieldName("Shaveta");
        notebooksPage.fillTheFieldLastName("sethi");
        notebooksPage.fillTheFieldEmail("ss@gmail.com");
        notebooksPage.fillTheFieldTelePhone("576598968");
        notebooksPage.fillTheFieldAddress("1,Lytham Close");
        notebooksPage.fillTheCity("Reading");
        notebooksPage.fillThePostCode("400101");

        //  2.21 Click on “Continue” Button
        notebooksPage.clickOnContinueButton2();

        // 2.22 Add Comments About your order into the text area
        notebooksPage.addComments();

        // 2.23 Check the Terms & Conditions check box
        notebooksPage.CheckTheTermsConditionsOfCheckBox();

        //  2.24 Click on the “Continue” button
        notebooksPage.ClickOnContinueButton();


    }


}
