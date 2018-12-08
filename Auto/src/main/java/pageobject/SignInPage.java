package pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	private WebDriver driver;
	
	@FindBy(css="div.mod-login-input-phone input")
	public WebElement txtNumber;
	
	@FindBy(css="div.mod-login-input-name input")
	public WebElement txtFullName;
	
	@FindBy (css="div.mod-login-input-email input")
	public WebElement txtEmail;
	
	@FindBy (css="div.mod-login-input-password input")
	public WebElement txtPass;
	
	@FindBy (css="div.slidetounlock span")
	public WebElement slide;
	
	@FindBy (css="div.mod-login-input-sms input")
	public WebElement txtSMSCode;
	
	@FindBy (css="span.mod-birthday-month>span>span")
	public WebElement cbMon;
	
	@FindBy (css="span.mod-birthday-day>span>span")
	public WebElement cbDay;
	
	@FindBy (css="span.mod-birthday-year>span>span")
	public WebElement cbYear;

	@FindBy (css="span.mod-gender-gender>span>span")
	public WebElement cbGender;
	
	@FindBy (css="div.mod-login-btn>button")
	public WebElement btnSignUp;
	
	public SignInPage ( WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		
	}
}
