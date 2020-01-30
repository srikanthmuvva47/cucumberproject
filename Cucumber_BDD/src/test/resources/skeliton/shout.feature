Feature: Shout Feature
@dry @valid
Scenario: Persons are with in the range
Given Shan is 10 meters away from Lucia
When shan shouts "Free Coffee"
Then Lucia hears the message "Free Coffee"
@DRY
Scenario: Persons are not in the range
Given Shan is 100 meters away from Lucia
When shan shouts "Free Coffee"
Then Lucia hears No Message