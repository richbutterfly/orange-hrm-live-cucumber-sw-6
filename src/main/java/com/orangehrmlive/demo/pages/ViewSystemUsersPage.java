package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
    List<WebElement> userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteSelected;

    @CacheLookup
    @FindBy(xpath = "//div[@role='document']")
    WebElement popUpDisplayed;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDelete;

    @CacheLookup
    @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement noRecordFound;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span']")
    WebElement recordFound;
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'Admin')])[2]")
    WebElement textAdmin;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement tickOnCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[normalize-space()='John Smith']")
    WebElement verifyUserName;

    public String verifyTextSystemUsers() {
        log.info("Getting text from : " + systemUsersText.toString());
        return getTextFromElement(systemUsersText);
    }

    public void enterUserName(String userName) {
        log.info("Entering username into : " + usernameField.toString());
        sendTextToElement(usernameField, userName);
    }

    public void selectUserRoleFromDropdown(String role) {
        for (WebElement userrole: userRole){
            if (userrole.getText().contains(role)){
                userrole.click();
                log.info("Selecting user role from : " + userRole.toString());
                break;
            }
        }
    }

    public void enterEmployeeName(String name) {
        log.info("Entering Employee name into : " + employeeName.toString());
        sendTextToElement(employeeName, name);
    }

    public void selectStatusFromDropdown() {
        log.info("Selecting status from : " + status.toString());
        sendTextToElement(status, "Enabled");
    }

    public void clickOnSearchButton() {
        log.info("Clicking on Search button : " + searchButton.toString());
        mouseHoverToElementAndClick(searchButton);
    }

    public void clickOnResetButton() {
        log.info("Clicking on Reset Button : " + resetButton.toString());
        clickOnElement(resetButton);
    }

    public void clickOnAddButton() {
        log.info("Clicking on Add button : " + addButton.toString());
        clickOnElement(addButton);
    }

    public void clickOnDeleteButton() {
        log.info("Clicking on Delete selected option : " + deleteSelected.toString());
        clickOnElement(deleteSelected);
    }
    public void popUpIsDisplayed(){
        popUpDisplayed.isDisplayed();
    }

    public void clickOnYesDelete() {
        log.info("Clicking on Yes Delete option : " + yesDelete.toString());
        clickOnElement(yesDelete);
    }


    public String getNoRecordFoundText() {
        log.info("Get No Record Found Text");
        return getTextFromElement(noRecordFound);
    }

    public String verifyTextRecordFound() {
        log.info("Getting text from : " + recordFound.toString());
        return getTextFromElement(recordFound);
    }

    public String verifyTextAdmin() {
        log.info("Getting text from : " + textAdmin.toString());
        return getTextFromElement(textAdmin);
    }

    public void tickOnCheckBox() {
        clickOnElement(tickOnCheckBox);
    }

    public String verifyUserName() {
        return getTextFromElement(verifyUserName);
    }

}
