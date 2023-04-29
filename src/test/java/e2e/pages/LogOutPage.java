package e2e.pages;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends CommonMethods {


    public LogOutPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "userData")
    private WebElement userHead;
    @FindBy(css = "[data-bind='click: logout']")
    private WebElement logOut;

    public void setLogOut() {
        Actions actions = new Actions(driver);
        actions.moveToElement(userHead).click(logOut).build().perform();
    }


}
