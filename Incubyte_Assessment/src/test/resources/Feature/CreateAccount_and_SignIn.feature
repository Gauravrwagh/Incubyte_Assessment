Feature: Create new customer account and sign in with that account

@smokeTest
  Scenario Outline: Create A New Account
    Given user launches the browser and navigates to the Magento homepage
    When user clicks the create account link
    Then user navigates to the account creation page
    When user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters email "<email>"
    And user enters password "<password>"
    And user confirms password "<confirmpassword>"
    And user submits the details
    Then user navigates to the My Account Dashboard and verifies the welcome message
    And user clicks on the customer menu toggle
    And user selects the sign out option
    And user should get sign out and navigates to the home page
    And user enters login email "<email>"
    And user enters login password "<password>"
    And user clicks on the sign in button
    Then user is signed in successfully

    Examples: 
      | firstname | lastname | email         | password   | confirmpassword |
      | Gaurav    | Wagh     | <randomEmail> | Rajesh@123 | Rajesh@123      |
