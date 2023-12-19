package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement textDashboard;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy (linkText = "Logout")
    WebElement logout;


    public String verifyTextDashboard() {
        log.info("Getting text from : " + textDashboard.toString());
        return getTextFromElement(textDashboard);
    }

    public void clickOnUserProfileLogo() {
        log.info("Clicking on Profile logo : " + userProfileLogo.toString());
        clickOnElement(userProfileLogo);
    }

    public void clickOnLogout() {
        log.info("Clicking on Log out link : " + logout.toString());
        mouseHoverToElementAndClick(logout);
    }
}
