#Feature: User
#  As a User I want to access all the feature in account
#  So that i can manipulate some data
#
#  Scenario: GET- As a user i want to see account detail
#    Given I set an endpoint for GET account detail
#    When I request GET account detail
#    Then I validate GET account detail status code is 200
#    And I validate the data detail for specific account
#
#  Scenario: GET - As a user i can not GET account detail
#    Given I set an endpoint for GET account detail
#    When I request GET account detail with invalid userId
#    Then I validate status code for fail GET account is 401
#    And I validate the data after fail request


#  Scenario: DELETE - As an admin i want to delete User
#    Given I set DELETE endpoints
#    When I request DELETE endpoints with valid userId
#    Then I validate DELETE user code is 200
#    And I validate code and message
#
#  Scenario: DELETE - As an admin i can not delete user
#    Given I set DELETE endpoints
#    When I request Delete endpoints with invalid userId
#    Then I validate the Delete status code is 401
#    And I validate fail Delete data detail;