@regression
Feature: Admin functionality
  As a User
  I want to check admin functionality by adding and deleting users

  @sanity
  Scenario: Verify admin should Add User SuccessFully()
    Given I am on Homepage
    When I enter username " Admin"
    And  I enter password "admin123"
    And  I click on Login button
    And I click on tab "Admin"
    Then I verify Text "System Users"
    When I click on Add button
    Then I verify Text "Add User"
    When I select User Role "Admin"
    And I enter Employee Name "Goutam  Ganesh"
    And I enter Username "Cheek" into username Field
    And I select status "Enabled"
    And I enter password "prime123" into password Field
    And I enter Confirm Password "prime123"
    And I click On save Button
    Then I verify message for saving adding details successfully "Successfully Saved"

  @smoke
  Scenario: search The User Created And Verify It
    Given I am on Homepage
    When I enter username " Admin"
    And  I enter password "admin123"
    And  I click on Login button
    And  I click on tab "Admin"
    Then I verify Text "System Users"
    When I enter Username1
    And  I select User Role
    And  I select Status
    And  I click on Search Button
    Then I Verify the User should be in Result list

  @sanity @smoke
  Scenario: Verify That Admin Should Delete The User SuccessFully()
    Given I am on Homepage
    When I enter username " Admin"
    And  I enter password "admin123"
    And  I click on Login button
    And  I click on tab "Admin"
    Then I verify Text "System Users"
    When I enter Username1
    And  I select User Role
    And  I select Status
    And  I click on Search Button
    Then I Verify the User should be in Result list
    When I click on Check box
    And  Click on Delete Button
    Then Popup will display
    When I click on Ok Button on Popup
    Then I verify message "Successfully Deleted" on screen

  @regression
  Scenario Outline: search The User And Verify The Message Record Found()
    Given I am on Homepage
    When I enter username " Admin"
    And  I enter password "admin123"
    And  I click on Login button
    And  I click on tab "Admin"
    Then I verify Text "System Users"
    When Enter Username "<username>"
    And I select "<userRole>" in User Role field
    And I enter EmployeeName "<employeeName>" in employee name field
    And I select Status "<status>" in status field
    And I click on "Search" Button
    Then verify message "(1) Record Found"
    And I verify username 'username'
    And I click on Reset Tab
    Examples:
      | username     | userRole | employeeName  | status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |











