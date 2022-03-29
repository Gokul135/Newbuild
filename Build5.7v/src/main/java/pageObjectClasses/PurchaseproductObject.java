package pageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseproductObject {

	
	
	@FindBy(xpath = "//a[@title='Add to cart' and @data-id-product='2']")
	
	public static WebElement addtocartbutton;
	

	@FindBy(xpath = "//li[@	id='list']")
    public static WebElement list;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public static WebElement checkout;
	
	
	@FindBy(xpath = "//h1[@id='cart_title']")
    public static WebElement carttittle;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
