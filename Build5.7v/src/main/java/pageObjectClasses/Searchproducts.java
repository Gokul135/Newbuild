package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchproducts {

	@FindBy(linkText = "Women")
	public static WebElement women;
	
	@FindBy(xpath="//input[@id='ul_layered_category_0']")
	public static WebElement checklist1;
	
	
	@FindBy(xpath="//input[@id='ul_layered_category_0']")
	public static WebElement pricerange;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
	 public static WebElement size;
	
   @FindBy(xpath="//input[contains (@id,'layered_id_attribute_group_')]")
	public static WebElement colour;
	
	@FindBy (xpath = "//input[contains(@id,'layered_id_feature_')]")
    public static WebElement fabrictype;
	
	@FindBy(xpath = "//a[@style='left: 0%;']")
	public static WebElement prp1;
	
	@FindBy(xpath = "//a[@style='left: 15%;']")
	public static WebElement prp2;
	
	@FindBy(xpath = "//a[@style='left: 97%;']")
	public static WebElement prp3;
	
	@FindBy(xpath = "//a[@style='left: 90%;']")
	public static WebElement prp4;
	@FindBy(xpath = "//select[@id='selectProductSort']")
	public static WebElement sortby;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public static WebElement checkout;



}

