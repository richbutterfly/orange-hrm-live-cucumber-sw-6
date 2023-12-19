package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    WebElement textSuccessfullySaved;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement textAddUser;


    public void selectUserRole() {
        log.info("Selecting status from : " + status.toString());
        selectByVisibleTextFromDropDown(userRole, "Admin");
    }

    public void enterUserName(String userName) {
        log.info("Entering Username into : " + usernameField.toString());
        sendTextToElement(usernameField, userName);
    }

    public void enterEmployeeName(String name) {
        log.info("Entering Employee name into : " + employeeName.toString());
        sendTextToElement(employeeName, name);
    }

    public void SelectStatusFromDropdown() {
        log.info("Selecting status from : " + status.toString());
        selectByVisibleTextFromDropDown(status, "Enabled");
    }

    public void enterPassword(String passWord) {
        log.info("Entering password into : " + password.toString());
        sendTextToElement(password, passWord);
    }

    public void enterConfirmPassword(String confirmPassWord) {
        log.info("Entering Confirm Password into : " + confirmPassword.toString());
        sendTextToElement(confirmPassword, confirmPassWord);
    }

    public void clickOnSaveButton() {
        log.info("Clicking on Save button : " + saveButton.toString());
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton() {
        log.info("Clicking on Cancel button : " + cancelButton.toString());
        clickOnElement(cancelButton);
    }

    public String verifyTextSuccessfullySaved() {
        log.info("Getting text from : " + textSuccessfullySaved.toString());
        return getTextFromElement(textSuccessfullySaved);
    }

    public String verifyTextAddUser() {
        log.info("Getting text from : " + textAddUser.toString());
        return getTextFromElement(textAddUser);
    }

}
