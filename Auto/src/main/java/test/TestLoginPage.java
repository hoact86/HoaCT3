package test;



 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import pageobject.LoginPage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestLoginPage 
{
    WebDriver driver;
    
    @Test
    public void firstTestCase()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\HoaCT\\Driver\\chromedriver.exe");
    	driver= new ChromeDriver();
    	
    	driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
    	
    	//Nhap Username
    	LoginPage lgPage = new LoginPage(driver);
    	lgPage.txtUserName.sendKeys("khanh.tx@live.com");
    	
        assertTrue( true );
    }
}
