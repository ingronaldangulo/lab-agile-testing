Feature: Login into the application

  @RELEASE_1.0
  Scenario: Successful login
    Given Sergey has an active account
    When he sends their valid "username" and "password"
    Then he should have access to manage his account.