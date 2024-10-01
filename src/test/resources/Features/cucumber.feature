Feature: Login functionality

  @Tag
  Scenario Outline: Login to the application using valid credentials

    Given Open the Browser and Enter the URL
    When User enters the valid username "<username>"
    And Enters the valid password "<password>"
    Then Verify user has successfully navigated to the home page

    Examples:
      | username | password |
      |    abc   |  abc@123 |