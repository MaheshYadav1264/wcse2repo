Feature: Customer

Scenario: Add New Customer
Given User Launch Chrome browser 
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
    Then User can view Dashboard
    When User click on customer menu
    And Click on customer menu item
    And Click on add new customer button
    Then User can view add new customer page
    When user enter customer info
    And Click on save Button
    Then user can view confiermation message "The new customer has been added successfully"
    And close browser


Scenario: Search customer by email
    Given User Launch Chrome browser 
	When User opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
    Then User can view Dashboard
    When User click on customer menu
    And Click on customer menu item
    And Enter customer email
    When click on search button
    Then User should found email in search table
    And Close browser
    
    
