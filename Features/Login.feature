Feature: Login 


Scenario: Successful Login Functionality with Valid Credentials

   Given User Launch Chrome Browser
   When User opens URL "https://opensource-demo.orangehrmlive.com/"
   And User enters Username as "Admin"  and Password as "admin123"
   And Click on Login
   Then Page Title should be "OrangeHRM"
   When User click on LogOut Link
   Then Page Title Should be "OrangeHRM"
   And close browser