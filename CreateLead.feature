Feature: Leaftaps functionality

Scenario Outline: Create lead with mandatory functionality
Given Go to Lead button
And Click create lead
And Enter Company Name as <cname>
And Enter First Name as <fname>
And Enter Last Name as <lname>
And Enter mobile number as <mnum>
When Click Create Lead button
Then Exit browser

Examples:
|cname|fname|lname|mnum|
|'Testleaf'|'Saravanan'|'Suresh'|'9876543210'|
