package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productText = By.xpath("//span[@class='title']");
    By listOfProducts = By.xpath("//div[@class='inventory_item']");

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);

    }

    public String getDisplayMessage() {
        return getTextFromElement(productText);

    }

    public int getListOfProducts() {
        List<WebElement> count = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int listOfProducts = count.size();
        System.out.println(" Total Products are: " + listOfProducts);
        return listOfProducts;
    }

}
