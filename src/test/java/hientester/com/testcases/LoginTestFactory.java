package hientester.com.testcases;

import hientester.com.common.BaseTest;
import hientester.com.pages.LoginPageFactory;
import org.testng.annotations.Test;

public class LoginTestFactory extends BaseTest {

    LoginPageFactory loginPageFactory;

    @Test
    public void testLoginSuccess(){
        loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.Login("admin@example.com","123456");
    }
}
