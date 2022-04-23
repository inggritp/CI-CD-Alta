Feature: Book
  As an Admin
  I have to be able to access BookStore feature
  So that I can use all the features

  Scenario: GET - As a user I have to be able to see all the books in the list
    Given I set an endpoint for GET all the books
    When I request GET all the books
    Then I validate the status code is 200
    And I get isbn data for other request
#
#  Scenario: POST - As a user i want to add new book in the list
#    Given I set an endpoint for POST new book
#    When I request POST new book
#    And I input valid userId and valid isbn
#    Then I validate  status code is 201
#    And I validate the book detail
#
#  Scenario: GET - As a user i can not  see specific book in the list
#    Given I set an endpoint for see the specific book in the list
#    When I request GET specific book with invalid isbn
#    Then I validate the status code for fail is 400
#    And I validate the data detail after request

#  Scenario: DELETE - As a user i want to delete specific book in the list
#    Given I set an endpoint for Delete specific book
#    When I request Delete specific book
#    Then I validate delete status code is 204
#    And validate the after delete detail
#
#  Scenario: DELETE - As a user i can not delete specific book in the list
#    Given I set an endpoint for Delete specific book
#    When I request Delete specific book with invalid isbn and userId
#    Then I validate fail to delete status code is 401
#    And validate the after fail delete detail




