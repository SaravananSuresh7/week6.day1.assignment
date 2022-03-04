Feature: Leaftaps functionality

Scenario Outline: Create lead with mandatory functionality
Given click contacts button
And Click create contacts
And Enter FirstName as <fsname>
And Enter LastName as <lsname>
And Enter Description
And Email address
When Click Create conact button
Then Exit browser

Examples:
|fsname|lsname|
|'Saravanan'|'Suresh'|
