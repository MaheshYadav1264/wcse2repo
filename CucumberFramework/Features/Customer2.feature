Feature: Customer

Scenario: Search customer by Name
    Given User Launch Chrome browser 
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
    Then User can view Dashboard
    When User click on customer menu
    And Click on customer menu item
    And Enter user Firstname
    And Enter user Lastname
    When click on search button
    Then User should found email in search table
    And Close browser