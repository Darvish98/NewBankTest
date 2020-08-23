package Page;

import org.openqa.selenium.By;

public class autotivicasionPage extends BasePage {
     private static String pageURL = "https://idemo.bspb.ru/";


    private static By UserName = By.xpath("//input[@placeholder='Логин']");
    private static By Passwor = By.xpath("//input[@placeholder='Пароль']");
    private static By Button = By.id("login-button");
    private static By Error = By.xpath("//div[@class='alert alert-error']");


    public static void start() {
        open(pageURL);

    }

    public static void clearUserName() {
        clear(UserName);
    }

    public static void clearPassword() {
        clear(Passwor);
    }


    public static void sendKeysUserName(String text) {

        sendKeys(UserName, text);
    }

    public static void sendKeysPassword(String text) {

        sendKeys(Passwor, text);
    }


    public static void clickButton() {
        click(Button);
    }


    public static void errorIsVisible() {
        isDisplayed(Error);
    }


}
