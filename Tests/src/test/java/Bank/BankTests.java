package Bank;

import Page.SecondLevelOfAuthorization;
import Page.autotivicasionPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTests extends BaseTest {

    @BeforeMethod
    public void start() {

        autotivicasionPage.start();
    }

    @Test
    public void positiveTestAuthorization() {
        autotivicasionPage.clearUserName();
        autotivicasionPage.clearPassword();
        autotivicasionPage.sendKeysUserName("demo");
        autotivicasionPage.sendKeysPassword("demo");
        autotivicasionPage.clickButton();
        SecondLevelOfAuthorization.verificationMessagesIsVisible();

    }

    @Test
    public void negative() {
        autotivicasionPage.clearUserName();
        autotivicasionPage.clearPassword();
        autotivicasionPage.sendKeysUserName("qwer");
        autotivicasionPage.sendKeysPassword("qwer");
        autotivicasionPage.clickButton();
        autotivicasionPage.errorIsVisible();



    }

    @Test
    public void negativeSecond(){
        autotivicasionPage.clearUserName();
        autotivicasionPage.clearPassword();
        autotivicasionPage.sendKeysUserName("");
        autotivicasionPage.sendKeysPassword("");
        autotivicasionPage.clickButton();
        autotivicasionPage.errorIsVisible();

    }




}
