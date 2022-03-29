package pageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuppageobject {

	
	@FindBy(xpath="//a[@class='login' and @title='Log in to your customer account']")
	public static WebElement signin;
	
	@FindBy(xpath="//input[@id='email_create']")
	public static WebElement emailbox;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	public static WebElement creatbutton;
	
	@FindBy(xpath="//label[@for='id_gender1']")
	public static WebElement genderSelect;
	
	@FindBy(xpath="	//input[@id='customer_firstname']")
	public static WebElement firstname;
	 
	@FindBy(xpath="	//input[@id='customer_lastname']")
	public static WebElement lastname;
    
	@FindBy(xpath="//input[@id='passwd']")
	public static WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	public static WebElement date;
	 
	@FindBy(xpath="//select[@id='months']")
	public static WebElement Month;
	
	@FindBy(xpath="//select[@id='years']")
	public static WebElement Years;
	
	@FindBy(xpath="//input[@id='company']")
	public static WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	public static WebElement address;
	
	@FindBy(xpath="	//input[@id='address2']")
	public static WebElement address2;
	
	@FindBy(xpath="	//input[@id='city']")
	public static WebElement city;
	
	@FindBy(xpath="//select[@name='id_state']")
	public static WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	public static WebElement postcode;
	
	@FindBy(xpath="//textarea[@id='other']")
	public static WebElement additionalinfo;
	
	@FindBy(xpath="//input[@id='phone']")
	public static WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	public static WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='alias']")
	public static WebElement allias;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	public static WebElement Submitbutton	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
