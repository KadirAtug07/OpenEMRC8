package e2e.stepDefinitions;

import e2e.pages.AdminPage;
import e2e.pages.HomePage;
import e2e.pages.LoginPage;

public class PageInitializer {


    public static LoginPage loginPage;
    public static HomePage homePage;
    public static AdminPage adminPage;





    public  static void initializePAgeObjects() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        adminPage = new AdminPage();
    }
}
