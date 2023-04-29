Feature: Logout Page

Background: Login with valid credentials
  Given User navigates to website and verify login page title as "OpenEMR Login"
  When User enters valid username
  Then User enters valid password
  And User selects language as "English (Australian)"
  Then User clicks login button
  And User verifies Home Page title as "OpenEMR"


  @smoke5
  Scenario: User able to logout after login
    Given User logouts when navigates to HomePage
    When User navigates to LoginPage and verify title as "OpenEMR Login"












