package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {


     @Before
    public void initialize() {
         InitializeAndLunchDriver();
     }

     @After
    public void tearDown() {

         //closeBrowser();
     }
}
