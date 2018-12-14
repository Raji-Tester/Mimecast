
Feature: Clear score Task handle
 @Test3 @Clearscore_Saving_Calculator 
     
     Scenario: Check the clear score calculator
   
       Given I Navigate to webpage"https://www.clearscore.com/savings-calculator"
         When I update current score to 50 and score goal to 680
         Then I check potential saving is 384