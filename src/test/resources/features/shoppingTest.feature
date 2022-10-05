@shopping_test
Feature: ShoppingTest
   #go to "http://automationexercise.com"
  # Verify that home page is visible successfully
  # Click Signup-Login button
  # Enter name and email and click on SignUp Button
  # Fill all details in Signup and create account
  # Verify ACCOUNT CREATED! and click Continue button
  # Verify  Logged in as username at top
  # Add products to cart
  # Click Cart button
  # Verify that cart page is displayed
  # Click Proceed To Checkout
  # Verify that the delivery address and billing address are same
  # Click logout button
  # Verify that user logged out
  # Close the application
  Scenario Outline:shopping
  Given user go to the automationexercise
  Then Verify that home page is visible successfully
  When Click Signup-Login button
  And Enter "<name>" and "<email>" and click on SignUp Button
  And Fill all details in Signup and create account
  Then Verify ACCOUNT CREATED! and click Continue button
  Then Verify  Logged in as "<name>" at top
  When Add products to cart
  And Click Cart button
  Then Verify that cart page is displayed
  When Click Proceed To Checkout
  Then Verify that the delivery address and billing address are same
  When Click logout button
  And Verify that user logged out
  And Close the application
    Examples:
      | name | email |
      | marry | marry5@gmail.com |
      | tomris | tomris5@gmail.com |





  #@shopping_test
  #Feature: Shopping_Test
  #
  #  Scenario Outline: Shopping_Scenario
  #  Given user opens the URL "http://automationexercise.com"
  #  Then Verify that home page is visible successfully
  #  When Click Signup-Login button
  #  And Enter name as "<name>" and email as "<email>" and click on SignUp Button
  #  And Fill all details in Signup and create account
  #  Then Verify ACCOUNT CREATED! and click Continue button
  #  And Verify  Logged in as username at top
  #  When Add products to cart
  #  And Click Cart button
  #  Then Verify that cart page is displayed
  #  When Click Proceed To Checkout
  #  Then Verify that the delivery address and billing address are same
  #  When Click logout button
  #  Then Verify that user logged out
  #  Then Close the application
  #    Examples:
  #      | name | email                   |
  #      | John | johndoe.1234@yahoo.com  |
  #      | John | johndoe.12346@yahoo.com |
  #
  #