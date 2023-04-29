package e2e.pages;

import e2e.utils.CommonMethods;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {


    public HomePage() {
        PageFactory.initElements(driver,this);
    }


    public String homePageTitle() {
        return driver.getTitle();
    }
}
