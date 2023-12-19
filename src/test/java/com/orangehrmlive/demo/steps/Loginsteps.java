package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Loginsteps {
    @When("I enter username")
    public void iEnterUsername() {
        new LoginPage().enterUsername("Admin");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new LoginPage().enterPassword("admin123");
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should log in successfully")
    public void iShouldLogInSuccessfully() {
        Assert.assertEquals(new DashboardPage().verifyTextDashboard(), "Dashboard", "Error message");
    }

    @Then("I should see the logo of orange hrm live demo")
    public void iShouldSeeTheLogoOfOrangeHrmLiveDemo() {
        new HomePage().verifyOrangeHrmLogo();
    }

    @When("I click on User profile logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("I mouse hover on {string} and click")
    public void iMouseHoverOnAndClick(String arg0) {
        new DashboardPage().clickOnLogout();
    }

    @Then("I should verify the text {string} is displayed on Homepage")
    public void iShouldVerifyTheTextIsDisplayedOnHomepage(String arg0) {
        Assert.assertEquals(new LoginPage().verifyTextLogin(), "Login", "Error message");
    }

    @When("I enter {string} in username field")
    public void iEnterInUsernameField(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("I enter {string} in password field")
    public void iEnterInPasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on Login button{int}")
    public void iClickOnLoginButton(int arg0) {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String arg0) {

    }
}
