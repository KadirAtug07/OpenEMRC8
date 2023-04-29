package e2e.pages;

import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;
import e2e.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    private WebElement errorMessage;



    public String loginPageTitle() {
        return driver.getTitle();
    }
    public void setUserName() {
        userName.sendKeys(ConfigReader.getProperties("username"));
    }
    public void setPassword() {
        password.sendKeys(ConfigReader.getProperties("password"));
    }
    public void setLanguage(String selectLanguage) {
        Select select=new Select(language);
        select.selectByVisibleText(selectLanguage);
    }

    public void setLoginButton() {
        click(loginButton);
    }
    public void setInvalidUsername() {
        userName.sendKeys("");
    }
    public String setErrorMessage() {
        return errorMessage.getText();
    }
    public void setInvalidPassword() {
        password.sendKeys("");
    }




}
