package pageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageObject {

	@FindBy(xpath="//a[@class='login' and @title='Log in to your customer account']")
	public static WebElement signin;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="passwd")
	public static WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public static WebElement signinSubmit;
	
	
	
	
	
	
	
	
	
	
	
	
}
