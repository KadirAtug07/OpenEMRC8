package e2e.pages;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {



    public LoginPage( ) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "authUser")
    private WebElement userName;
    @FindBy(id = "clearPass")
    private WebElement password;
    @FindBy(css = "[name='languageChoice']:nth-child(1)")
    private WebElement language;
    @FindBy(id = "login-button")
    private WebElement loginButton;



    public String loginPageTitle() {
        return driver.getTitle();
    }




}
