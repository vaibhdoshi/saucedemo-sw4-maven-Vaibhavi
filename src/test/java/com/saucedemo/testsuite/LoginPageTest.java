package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        String actualText = loginPage.getDisplayMessage();
        Assert.assertEquals(actualText, expectedText, "correct text");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        loginPage.getListOfProducts();

    }
}
