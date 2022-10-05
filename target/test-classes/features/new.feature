#Login the application with customer credentials. https://www.bluerentalcars.com/
  @cust_log
  Feature: Customer_Login
    Scenario: CL01
  Given Go to BlueRentalCar website
  When click the login button
  Then send the username
  Then send the password
  Then click the login submit button
  Then verify logged in
  Then close driver