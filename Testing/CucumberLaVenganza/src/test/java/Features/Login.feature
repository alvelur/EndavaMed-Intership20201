Feature: LoginFeature
  This feature deals with the login functionality of the app
  Scenario: Login with correct username and password
    Given I navigate to the login page
 #   And I enter the users email address as Email:admin
    And I enter following for login
      | username | password     |
      | admin    | adminpasword |

    And I click login button
    Then I should see the userform page


#  Scenario Outline: Login with correct username and password using Scenario outline
#    Given I navigate to the login page
#    And I enter <username> and <password>
#    And I click login button
#    Then I should see the userform page
#    Examples:
#      | username | password   |
#      | execute  | automation |
#      | test     | sapo       |
#      | perro    | gato       |
