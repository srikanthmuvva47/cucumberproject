Feature: TestMeApp Registration Demo file
Scenario: valid Register for TestMeApp
Given The url of the TestMeApp "http://10.232.237.143:443/TestMeApp/"
When user clicks SignUp button
And User enters "<username>" as username
And User enters "<firstname>" as firstname
And user enters "<lastname>" as lastname 
And user enters "<password>" as password
And user enters "<confirmpassword>" as confirmpassword
And user enters "<gender>" as gender 
And user enters "<email>" as email
And user enters "<mobilenumber>" as mobilenumber
And user enters "<dateofbirth>" as dateofbirth
And user enters "<address>" as address
And user enters "<securityquestion>" as securityquestion
And user enters "<answer>" as answer
And user clicks Register button
Then user is in valid page




Scenario Outline: Valid Login for TestMeAp
 Given The url of the TestMeApp "http://10.232.237.143:443/TestMeApp/"
 When User clicks SignIn button
 And User enters "<username>" as username
 And user enters "<password>" as password
 And user clicks Login button
 And user search for product "<product>"
 And user clicks FindDetails
 And user clicks addtocart
 Then user is in valid page

    Examples: 
      | username | password |
      | AlexUser | Alex@123 |
      | srikanth | sri123   |
