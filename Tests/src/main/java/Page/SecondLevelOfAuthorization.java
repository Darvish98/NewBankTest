package Page;

import org.openqa.selenium.By;

public class SecondLevelOfAuthorization extends BasePage {

    private static By Code = By.xpath("//input[@id='otp-code']");

    public static void verificationMessagesIsVisible(){

        isDisplayed(Code);

    }

}
