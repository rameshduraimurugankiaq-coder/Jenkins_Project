Feature: 

Scenario: Validate the dynamic content
Given User is on home page
When User clicks on dynamic content
And  User clicks on click here button
Then User verify the changes after clicks on click here button

Scenario: validate the dynamic controls
Given User is on application home page
When User clicks on dynamic controls
Then  User validate checkbox is enable
When  User clicks on the check box
Then User validate check box been clicked
When User clicks on remove button
Then  User validate it,s gone is displayed
When User clicks on Add button
Then User validate it,s back is displayed after click the Add button