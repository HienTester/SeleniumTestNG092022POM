package hientester.com.testcases;

import hientester.com.common.BaseTest;
import hientester.com.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void loginTestSuccess() {
        //Khởi tạo đối tượng trang LoginPage
        //Truyền driver từ BaseTest
        loginPage = new LoginPage(driver);

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.login("admin@example.com","123456");

    }

    @Test
    public void loginTestTestInvalidEmail() {
        //Khởi tạo đối tượng trang LoginPage
        //Truyền driver từ BaseTest
        loginPage = new LoginPage(driver);

        //Gọi hàm "login" từ LoginPage để dùng
        loginPage.loginInvalidEmail("admin@example123.com", "123456");

    }
}
