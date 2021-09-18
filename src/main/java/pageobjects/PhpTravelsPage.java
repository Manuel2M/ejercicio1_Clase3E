package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsPage {
    //define para esta clase el driver y wait
    private final WebDriver driver;
    private final WebDriverWait wait;

    //estableciendo identificadores
    private String url = "https://phptravels.com/demo";
    private final By clickOne = By.xpath("//*[contains(text(),'Product')]");
    private final By linkProvider = By.linkText("Providers");
    private final By firstScreen = By.id("header-title");

    private final By showDemo = By.linkText("Demo");
    private final By secondLogo = By.id("header-title");



    public PhpTravelsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver,5);
    }

    public void productClic(){
        driver.get(url);

    }
    public void providersClic(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOne));
        driver.findElement(clickOne).click();
        driver.findElement(linkProvider).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstScreen));


    }
    public void demoClic(){
        driver.findElement(showDemo).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondLogo));

    }
}
