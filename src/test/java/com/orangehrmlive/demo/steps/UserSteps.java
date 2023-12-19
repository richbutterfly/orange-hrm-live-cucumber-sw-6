package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter username {string}")
    public void iEnterUsername(String arg0) {
        new LoginPage().enterUsername("Admin");
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        new LoginPage().enterPassword("admin123");
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I click on tab {string}")
    public void iClickOnTab(String arg0) {
        new HomePage().clickOnAdmin();
    }

    @Then("I verify Text {string}")
    public void iVerifyText(String arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextSystemUsers(), "System Users");
    }

    @When("I click on Add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();
    }

    @When("I select User Role {string}")
    public void iSelectUserRole(String arg0) {
        new AddUserPage().selectUserRole();
    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String arg0) {
        new AddUserPage().enterEmployeeName("John  Smith");
    }

    @And("I enter Username {string} into username Field")
    public void iEnterUsernameIntoUsernameField(String arg0) {
        new AddUserPage().enterEmployeeName("Cheek");
    }

    @And("I select status {string}")
    public void iSelectStatus(String arg0) {
        new AddUserPage().SelectStatusFromDropdown();
    }

    @And("I enter password {string} into password Field")
    public void iEnterPasswordIntoPasswordField(String arg0) {
        new AddUserPage().enterPassword("prime123");
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String arg0) {
        new AddUserPage().enterConfirmPassword("prime123");
    }

    @And("I click On save Button")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("I verify message for saving adding details successfully {string}")
    public void iVerifyMessageForSavingAddingDetailsSuccessfully(String arg0) {
        new AddUserPage().verifyTextSuccessfullySaved();
    }


    @When("I enter Username{int}")
    public void iEnterUsername(int arg0) {
        new ViewSystemUsersPage().enterUserName("Cheeku");
    }

    @And("I select User Role")
    public void iSelectUserRole() {
        new ViewSystemUsersPage().selectUserRoleFromDropdown("Admin");
    }

    @And("I select Status")
    public void iSelectStatus() {
        new ViewSystemUsersPage().selectStatusFromDropdown();
    }

    @And("I click on Search Button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I Verify the User should be in Result list")
    public void iVerifyTheUserShouldBeInResultList() {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextRecordFound(), "(1) Record Found");
    }

    @When("I click on Check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().tickOnCheckBox();
    }

    @And("Click on Delete Button")
    public void clickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @Then("Popup will display")
    public void popupWillDisplay() {
        new ViewSystemUsersPage().popUpIsDisplayed();

    }

    @When("I click on Ok Button on Popup")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDelete();
    }


    @Then("I verify message {string} on screen")
    public void iVerifyMessageOnScreen(String arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().getNoRecordFoundText(), "No Records Found", "Error message");
    }

    @When("Enter Username {string}")
    public void enterUsername(String userName) {
        new ViewSystemUsersPage().enterUserName(userName);
    }

    @And("I select {string} in User Role field")
    public void iSelectInUserRoleField(String userRole) {
        new ViewSystemUsersPage().selectUserRoleFromDropdown(userRole);
    }

    @And("I enter EmployeeName {string} in employee name field")
    public void iEnterEmployeeNameInEmployeeNameField(String employeeName) {
        new ViewSystemUsersPage().enterEmployeeName(employeeName);
    }

    @And("I select Status {string} in status field")
    public void iSelectStatusInStatusField(String status) {
        new ViewSystemUsersPage().selectStatusFromDropdown();
    }

    @And("I click on {string} Button")
    public void iClickOnButton(String arg0) {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("verify message {string}")
    public void verifyMessage(String arg0) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyTextRecordFound(),"(1) Record Found","Record not found");
    }

    @And("I verify username {string}")
    public void iVerifyUsernameUsername(String userName) {
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserName(),userName);
    }
    @And("I click on Reset Tab")
    public void iClickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}
