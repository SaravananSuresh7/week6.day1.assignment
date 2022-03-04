Feature: Leaftaps functionality

Scenario Outline: Edit lead with mandatory functionality
Given Go to Lead button
And Click Find lead
And Enter first Name as <Fname>
And Enter last Name as <Lname>
When Click Find Lead button
And click on the first resulting lead
And click edit
And Enter new Company name as <Cname>
And click update button
Then Exit browser

Examples:
|Cname|Fname|Lname|
|'TCS'|'Saravanan'|'Suresh'|