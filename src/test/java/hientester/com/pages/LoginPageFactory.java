package hientester.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    private String URL = "https://crm.anhtester.com/admin/authentication";
    private String PAGETEXT = "Login";

    //Khai báo object- là đối tượng WebElement
    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;


    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement buttonLogin;

    @FindBy(xpath = "/h1")
    private WebElement headerPage;

    //Khai báo hàm xây dựng
    private WebDriver driver;
    public LoginPageFactory(WebDriver _driver){
        driver = _driver;
        //Gọi hàm initElements của class PageFactory để khởi tạo các WebElement bên trên
        PageFactory.initElements(driver,this);
    }

    //Viết các hàm xử lý
    public void Login(String email, String password) {
        driver.get(URL);
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }
}
