package hientester.com.pages.customers;

import hientester.com.keywords.WebUI;
import static hientester.com.keywords.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomersPage {
    //Các thuộc tính xác thực Customers Page
    private String PAGE_URL = "https://crm.anhtester.com/admin/clients";
    private String PAGE_TEXT = "Customers Summary";

    //Objects thuộc Customers Page
    private By headerPageCustomers = By.xpath("(//div[@class='panel-body']//h4)[1]");
    private By buttonAddCustomer = By.xpath("//a[normalize-space()='New Customer']");
    private By buttonImportCustomer = By.xpath("//a[normalize-space()='Import Customers']");
    private By buttonContacts = By.xpath("//div[@class='_buttons']//a[normalize-space()='Contacts']");
    private By inputSearch = By.xpath("//div[@id='DataTables_Table_0_filter']//input");
    private By tdCustomerName = By.xpath("//table[@id='DataTables_Table_0']//tbody//tr[1]//td[3]/a");


    //Các hàm xử lý cho chức năng thuộc Customers Page
    public void verifyCustomerPage() {
        Assert.assertEquals(getCurrentURL(), PAGE_URL, "URL chưa đúng trang Customers.");
        Assert.assertTrue(checkElementExist(headerPageCustomers), "Header Page Customers not existing.");
        Assert.assertEquals(getTextElement(headerPageCustomers),PAGE_TEXT, "Header Page of Customers page not match.");
    }

    public AddNewCustomerPage clickNewCustomerButton(){
       // waitForElementVisible(buttonAddCustomer,10);

        //driver.findElement(buttonAddCustomer).click();
        clickElement(buttonAddCustomer);

        return new AddNewCustomerPage();
    }

    public void searchCustomer(String companyName){
        waitForPageLoaded();
        //waitForElementVisible(inputSearch,10);

        //driver.findElement(inputSearch).sendKeys(companyName);
        setText(inputSearch,companyName);

        sleep(2);
    }

    public  CustomerDetailPage clickOnFirstRowCustomerName(){
        waitForPageLoaded();
        //waitForElementVisible(inputSearch,10);

        //driver.findElement(tdCustomerName).click(); (thay thế bằng hàm bên dưới)
        clickElement(tdCustomerName);

        return new CustomerDetailPage();
    }
}
