package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.ComponentsPage;
import demo.com.tutorialsninja.pages.DesktopPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopsPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();


    //1.1 create a method with the name "selectMenu" It has one parameter named "menu" of
    //type string
    //1.2 This method should click on the menu whatever name is passed as a parameter.
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        // 1.1 Mouse hover on the “Desktops” Tab and click
        homePage.MouseHoverOnDeskTopAndClick();

        //1.2 call the selectMenu() method and pass the menu = “Show AllDesktops”
        selectMenu("Show AllDesktops");


        //1.3 Verify the text ‘Desktops’
        desktopsPage.verifyDeskTop();
        String expectedText = "Desktops";
        String actualText = desktopsPage.verifyDeskTop();
        Assert.assertEquals(actualText, expectedText, "invalid text");

    }

    //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        //2.1 Mouse hover on the “Laptops & Notebooks” Tab and click
        laptopsAndNotebooksPage.mouseHoverOnLaptopAndClick();
        //2.2 call selectMenu() method and pass the menu = “Show AllLaptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopsAndNotebooksPage.verifyTextLaptopAndBooks();
        String expectedText = "Laptops & Notebooks";
        String actualText = laptopsAndNotebooksPage.verifyTextLaptopAndBooks();
        Assert.assertEquals(actualText, expectedText, "Invalid Text");

    }

    //3. verifyUserShouldNavigateToComponentsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //3.1 Mouse hover on the “Components” Tab and click
        componentsPage.mouseHoverAndClickOnComponents();
        //3.2 call the selectMenu() method and pass the menu = “Show AllComponents”
        selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualTet = componentsPage.verifyTextComponents();
        Assert.assertEquals(expectedText, actualTet, "Invalid Text");


    }
}