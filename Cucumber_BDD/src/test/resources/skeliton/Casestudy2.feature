Feature: TestMeApp Login Demo file

  Scenario Outline: Valid Login for TestMeApp
    Given The url ofthe TestMeApp "http://10.232.237.143:443/TestMeApp/"
    When user clicks SignIn button
    And user enter "<userName>" as username
    And User enters "<password>" as password
    And user clicks on Login button
    Then user is in validpage

    Examples: 
      | username | password |
      | AlexUser | Alex@123 |
      | srikanth | sri123   |
