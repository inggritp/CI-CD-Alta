#Feature: User
#  As an admin I have to be able create new user
#  So that I can update user data
#
#  Scenario Outline: POST - As an admin i want to create new user
#    Given I set an endpoint for POST new user
#    When  I enter "<username>" with "<password>"
#    Then I validate the status code for POST new user  is <status_code>
#    And I validate the "<message>" after create user
#    Examples:
#    |username|password|status_code|message|
#    |new     |Rubyjanee!1617 |201        |success|
#    |        |Rubyjanee!1617|400        |required|
#    |Jenjenn67|       |400|required|
#    |         |       |400|required|
#    |same     |Rubyjanee!1617|406        |existed |
#


#  Scenario: POST - As an admin i can't create new user and password
#    Given I set an endpoint for POST new user
#    When I request POST detail user with exist username
#    Then I validate POST exist status code is 406
#    And I validate the data detail after failed create user
#
#  Scenario: POST - As a user I have to be able generate token
#    Given I set an endpoint for POST generate token
#    When I request POST generate token
#    Then I validate generate status code is 200
#    And I validate the data after generate token

#  Scenario: POST - As a user i can't generate token
#    Given I set an endpoint for POST generate token
#    When I request POST generate token with invalid username and password
#    Then I validate generate status code still 200
#    And I validate the data after fail to generate token
