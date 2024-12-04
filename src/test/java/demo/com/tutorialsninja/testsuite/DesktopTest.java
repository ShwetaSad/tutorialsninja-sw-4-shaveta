package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DesktopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopTest extends BaseTest {

    DesktopPage desktopsPage = new DesktopPage();
    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        // 1.1 Mouse hover on the Desktops Tab. and click
        homePage.MouseHoverOnDeskTopAndClick();

        // 1.2 Click on “Show AllDesktops”
        desktopsPage.showAllDeskTops();
/*
        // 1.3 Select Sort By position "Name (Z to A)"
        desktopsPage.selectOnPositionOnDeskTops();
        // 1.4 Verify the Product will be arranged in Descending order.
        //desktopsPage.verifyProductsInDescendingOrder();
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : desktopsPage.getListsOfProduct()) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

        desktopsPage.selectSortByZToA("Name (Z - A)");

        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : desktopsPage.getListsOfProduct()) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

        Assert.assertEquals(afterSortByZToAProductsName, originalProductsName,
                "Product not sorted into Z to A order");
    }
*/
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        // 2.1 Mouse hover on the Currency Dropdown and click
        desktopsPage.mouseHoverOnCurrencyAndClick();

        // 2.2 Mouse hover on the £Pound Sterling and click
        desktopsPage.mouseHoverOnPoundAndClick();

        // 2.3 Mouse hover on the Desktops Tab.
        desktopsPage.mouseHoverOnDeskTopTab();

        // 2.4 Click on the “Show AllDesktops”
        desktopsPage.showAllDeskTops();

        // 2.5 Select the Sort By position "Name: A to Z"
        desktopsPage.selectSortByZToA("Name (A - Z)");

        //  2.6 Select product “HP LP3065”
        desktopsPage.selectProductHP();

        // 2.7 Verify the Text "HP LP3065"
        desktopsPage.verifyTheTextHp();
        String expectedText = "HP LP3065";
        String actualText = desktopsPage.verifyTheTextHp();
        Assert.assertEquals(expectedText, actualText, "InvalidText");

        // 2.8 Select Delivery Date "2024-11-27"
        // desktopsPage.clearDate();
        desktopsPage.selectDate();

        // 2.9.Enter Qty "1” using Select class.
        desktopsPage.enterQty();

        // 2.10 Click on the “Add to Cart” button
        desktopsPage.clickOnAddToCartButton();

        //  2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        //  String actualMessage = desktopsPage.verifyTheMessage();
        //   Assert.assertEquals(expectedMessage, actualMessage, "Invalid Message");


        // 2.12 Click on the link “shopping cart” displayed in a success message
        Thread.sleep(3000);
        desktopsPage.clickOnShoppingCardLik();


        // 2.13 Verify the text "Shopping Cart"
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = shoppingCartPage.verifyTheTextOfShopping();
        Assert.assertEquals(expectedShoppingCartText, actualShoppingCartText, "Ivalid");


        //2.14 Verify the Product name "HP LP3065"
        String expectedProductName = "HP LP3065";
        String actualProductName = shoppingCartPage.VerifyTheProductNameHp();
        Assert.assertEquals(actualProductName, expectedProductName, "Invalid ProductName");

        // 2.15 Verify the Delivery Date "2024-11-27"
        String expectedDeliveryDate = "2024-11-27";
        String actualDeliveryDate = shoppingCartPage.verifyTheDeliveryDate1();
        Assert.assertEquals(expectedDeliveryDate, actualDeliveryDate, "Invalid Date");

        // 2.16 Verify the Model "Product21"
        String expectedModel = "Product 21";
        String actualModel = shoppingCartPage.verifyTheModel();
        Assert.assertEquals(actualModel, expectedModel, "Invalid Model");

        //  2.17 Verify the Total "£74.73"
        String expectedTotal = "£74.73";
        String actualTotal = shoppingCartPage.verifyTheTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Invalid Total");
    }
}

