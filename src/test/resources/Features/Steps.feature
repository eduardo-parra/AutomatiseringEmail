Feature:Mail Testning
Background:
  Given i am on the email regrestration page
  @mytag
  Scenario Outline:Skapande av användare
    Given I have entered <email>
    And I have also entered <username>
    And I have also entered <password>
    When I press signup
    Then the result should be <message> on the screen
    Examples:
      |email|username|password|message |
      |     |        |        |        |
      |     |        |        |        |
      |     |        |        |        |
