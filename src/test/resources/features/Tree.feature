Feature: Tree

  Background: Login to ds-algo
    Given User launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com"
    And Click on Sign in
    And User enters Username as "techtitans" and Password as "Time2fly$"
    And Click on Login
    Then User can view the Numpy Ninja Homepage

  Scenario: Overview of Tree
    When User click on Get Started under Tree block
    Then user can view Tree page
    When User click on Overview of Trees
    Then User can view Overview of Trees page
    When User click on Try here
    Then User can view text editor
    When User write some valid python code
    And click Run
    Then User can view message box
    When user enters the required value
    And clicks Ok
    Then User can view the result of the python code
    And close browser
