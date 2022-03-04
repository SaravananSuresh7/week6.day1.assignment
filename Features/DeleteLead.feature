Feature: Leaftaps functionality

Scenario Outline: Delete lead with mandatory functionality
Given Go to Lead button
And Click Find lead
And Click on Phone
And Enter PhoneNumber as <mnum>
When Click Find Lead button
And click on the first resulting lead
And click delete
Then Exit browser

Examples:
|mnum|
|'9876543210'|