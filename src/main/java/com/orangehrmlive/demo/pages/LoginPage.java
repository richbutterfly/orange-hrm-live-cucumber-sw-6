package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;
    @CacheLookup
    @FindBy(name = "username")
    WebElement username;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement textInvalidCredentials;


    public void enterUsername(String userId) {
        log.info("Entering username into : " + username.toString());
        sendTextToElement(username, userId);
    }

    public void enterPassword(String passWord) {
        log.info("Entering password into : " + password.toString());
        sendTextToElement(password, passWord);
    }

    public String verifyTextLogin() {
        log.info("Getting text from : "+loginText.toString());
        return getTextFromElement(loginText);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button : " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void loginSuccessfully(String userName, String passWord) {
        sendTextToElement(username, userName);
        sendTextToElement(password, passWord);
        clickOnElement(loginButton);
    }

    public String verifyTextInvalidCredentials() {
        log.info("Getting text from : "+textInvalidCredentials.toString());
        return getTextFromElement(textInvalidCredentials);
    }
}