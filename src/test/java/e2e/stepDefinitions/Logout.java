package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout extends CommonMethods {


    @Given("User logouts when navigates to HomePage")
    public void user_logouts_when_navigates_to_home_page() throws InterruptedException {
        logOutPage.setLogOut();
        Thread.sleep(3000);
    }
    @When("User navigates to LoginPage and verify title as {string}")
    public void user_navigates_to_login_page_and_verify_title_as(String loginPageTitle) {
        Assert.assertEquals(loginPageTitle,loginPage.loginPageTitle());
    }
}
