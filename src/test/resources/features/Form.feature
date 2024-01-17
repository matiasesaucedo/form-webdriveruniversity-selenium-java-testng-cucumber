Feature: Complete the form
  Scenario: As user i want to complete the "Contact Us" Form
    Given the user clicks on homepage
    When the user clicks on Contact Us link
    And the user complete the form and clicks on submit button
    Then the form is sent