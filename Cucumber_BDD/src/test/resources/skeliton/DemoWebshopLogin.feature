Feature: Demo Web Shop Login feature file

  Scenario Outline: Valid Login for Demo Web Shop
    Given The url of the Demo Web Shop "http://demowebshop.tricentis.com/login"
    When User enters "<username>"
    And User entere "<password>" as password
    And User clicks Login button
    Then User is in valid page

    Examples: 
      | username          | password |
      | askmail@gmail.com | abc123   |
      | askmail@gmail.com | abc123   |
      | askmail@gmail.com | abc123   |

 
 
      