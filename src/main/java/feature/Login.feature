Feature: Login functionlity

Scenario Outline:: ACME till companyname

Given Enter the userName as <email>
And Enter password as <password>
Then Click on login button

Examples:
|email|password|
|kumar.testleaf@gmail.com|leaf@12|