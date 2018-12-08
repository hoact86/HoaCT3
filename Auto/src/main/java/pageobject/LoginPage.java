package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage{
	private WebDriver driver;
	
	@FindBy(css="div.mod-login-input-loginName>input")
	public WebElement txtUserName;
	@FindBy(css="div.mod-login-input-password>input[type=password]")
	public WebElement txtPassword;
	@FindBy(css="button.next-btn-primary")
	public WebElement btnSubmit;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
}
