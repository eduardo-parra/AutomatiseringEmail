Feature:Mail Testning
Background:
  Given i am on the email regrestration page in "chrome" https://login.mailchimp.com/signup/
  @mytag
  Scenario Outline:User sign up
    Given I have input <email>
    And I have also input <username>
    And I have also input pasword <password>
    When I press signup
    Then the result should be <message> on the screen
    Examples:
      |email|username|password|message |
      |"Gmail"|"validU"|"LöSen"|  "wow"      |


