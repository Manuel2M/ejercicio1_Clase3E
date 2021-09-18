package travels;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.PhpTravelsPage;
import utilities.Base;

public class LoginTravelTest extends Base {

    //definiendo un objeto
    private PhpTravelsPage phpTravels;

    @BeforeMethod
    public void beforeMethod(){
        setupTesting();
    }


    @Test
    public void loginTravel(){

        //inicializando el objeto creado
        phpTravels = new PhpTravelsPage(driver);
        phpTravels.productClic();
        phpTravels.providersClic();
        phpTravels.demoClic();


    }

    @AfterMethod
    public void afterMethod(){
        finishingTesting();
    }
}
