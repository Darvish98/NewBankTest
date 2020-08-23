package Page;

import Driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;


public class BasePage {

    protected static WebDriver webDriver = DriverSingleton.getDriver();

    protected static WebDriverWait wait;

    protected static WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    protected static void clear(By element){
        findElement(element).clear();
    }

    protected static void sendKeys(By element, String text) {
        findElement(element).sendKeys(text);
    }

    protected static void click(By element){
        findElement(element).click();
    }

    protected static void isDisplayed(By element){
        assertTrue (webDriver.findElement (element).isDisplayed ());
    }

    protected static void open(String text){
        webDriver.get(text);

    }



}






