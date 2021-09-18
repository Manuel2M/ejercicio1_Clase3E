package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    //inicializar el driver
    public WebDriver driver;

    public void setupTesting(){
    //configurar el tipo de driver que se manejara
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    public void finishingTesting(){
        if (driver !=null){
            driver.quit();
        }
    }
}
