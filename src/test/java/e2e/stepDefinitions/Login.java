package e2e.stepDefinitions;

import e2e.pages.HomePage;
import e2e.pages.LoginPage;
import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login extends CommonMethods {


    @Given("User navigates to website and verify login page title as {string}")
    public void user_navigates_to_website_and_verify_login_page_title_as(String loginPageTitle) {
        Assert.assertEquals(loginPageTitle,loginPage.loginPageTitle());
    }
    @When("User enters valid username")
    public void user_enters_valid_username() {
        loginPage.setUserName();

    }
    @Then("User enters valid password")
    public void user_enters_valid_password() {
         loginPage.setPassword();
    }
    @Then("User selects language as {string}")
    public void user_selects_language_as(String selectedLanguage) {
        loginPage.setLanguage(selectedLanguage);
    }
    @Then("User clicks login button")
    public void user_clicks_login_button() {
       loginPage.setLoginButton();
    }
    @Then("User verifies Home Page title as {string}")
    public void user_verifies_home_page_title_as(String homePageTitle) {
       Assert.assertEquals(homePageTitle,homePage.homePageTitle());
    }
}
