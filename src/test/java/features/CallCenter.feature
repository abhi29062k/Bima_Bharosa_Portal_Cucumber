Feature: Call Center Page

  Background:
    Given I am on the login page
    When Enter Valid Username
    And Enter Valid Password
    And Enter Valid Captcha
    And Click on Login Button
    Then User should able login into next page
    And Click Complaints DropDown

  @Positive
  Scenario: Verify the Search and Clear Button
    Given I am on the Call Center page
    When Click on View Edit Dropdown Option
    Then Verify the Search and Clear Button


  @Positive
  Scenario: Validate Update Insurer
    Given I am on the Call Center page
    When Click on DoesNotPertain DropDown Option
    And Click on Edit Icon
    And Select the Insurance Company
    Then Verify the Update Button
