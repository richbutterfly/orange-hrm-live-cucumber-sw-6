Feature: Login functionality
  As a user,
  I want to login successfully with valid credentials

  @sanity
  Scenario: Verify User Should Login SuccessFully()
    Given I am on Homepage
    When  I enter username
    And   I enter password
    And   I click on Login Button
    Then  I should log in successfully

  @sanity @smoke
  Scenario: Verify That The Logo Display On HomePage()
    Given I am on Homepage
    When  I enter username
    And   I enter password
    And   I click on Login Button
    Then I should see the logo of orange hrm live demo

  @regression
  Scenario: Verify User Should LogOut SuccessFully(
    Given I am on Homepage
    When  I enter username
    And   I enter password
    And   I click on Login Button
    When I click on User profile logo
    And I mouse hover on "Logout" and click
    Then I should verify the text "Login Panel" is displayed on Homepage

  @regression
  Scenario Outline: Verify Error Message With Invalid Credentials()
    Given I am on Homepage
    When  I enter "<username>" in username field
    And   I enter "<password>" in password field
    And   I click on Login button1
    Then  I should see the error message "<errorMessage>"
    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |









