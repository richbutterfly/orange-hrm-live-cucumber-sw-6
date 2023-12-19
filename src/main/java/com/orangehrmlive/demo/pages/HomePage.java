package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement admin;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement pIM;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leave;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "(//img[@alt='orangehrm-logo'])[2]")
    WebElement orangeHrmLogo;
    @CacheLookup
    @FindBy()
    WebElement welcomeText;

    public void clickOnAdmin() {
        log.info("Clicking on Admin link : " + admin.toString());
        clickOnElement(admin);
    }

    public void clickOnPIM() {
        log.info("Clicking on PIM link : " + pIM.toString());
        clickOnElement(pIM);
    }

    public void clickOnLeave() {
        log.info("Clicking on Leave link : " + leave.toString());
        clickOnElement(leave);
    }

    public void clickOnDashboard() {
        log.info("Clicking on Dashboard link : " + dashboard.toString());
        clickOnElement(dashboard);
    }

    public void verifyOrangeHrmLogo() {
        boolean logoPresent = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.isTrue(true, "Error", logoPresent);
    }
}
