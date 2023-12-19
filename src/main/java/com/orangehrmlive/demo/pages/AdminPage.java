package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement userManagement;

    @CacheLookup
    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --parent']")
    WebElement job;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Organization']")
    WebElement organization;

    public void clickOnUserManagement() {
        log.info("Clicking on User Management : " + userManagement.toString());
        clickOnElement(userManagement);
    }

    public void clickOnJob() {
        log.info("Clicking on Job : " + job.toString());
        clickOnElement(job);
    }

    public void clickOnOrganization() {
        log.info("Clicking on Organization : " + organization.toString());
        clickOnElement(organization);
    }

}
