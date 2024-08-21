Feature: Login

  Scenario: Login Functionality
    Given User launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com"
    And Click on Sign in
    And User enters Username as "techtitans" and Password as "Time2fly$"
    And Click on Login
    Then User can view the Numpy Ninja Homepage
