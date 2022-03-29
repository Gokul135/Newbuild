package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.commonfunction;
import pageObjectClasses.PurchaseproductObject;

public class PurchaseproductTest extends commonfunction{

	@Test(priority = 7)

	public void addtocartAndcheckout() throws IOException {

		testcase=extent.createTest("Verify addto cart"); 
		
		PageFactory.initElements(driver, PurchaseproductObject.class);
		
		
		PurchaseproductObject.list.click();

		testcase.log(Status.PASS, "clicked on list");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;

		File sourcefile1=  screenshot.getScreenshotAs(OutputType.FILE);

		File destinationfile1 = new File(".\\Screenshots\\addtocart.png");

		org.openqa.selenium.io.FileHandler.copy(sourcefile1, destinationfile1);
		testcase.log(Status.PASS, "Taken screen shot ");
		
		Actions action=new Actions(driver);

		WebElement addcart=driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='2']"));
		
		addcart.click();
		
		PurchaseproductObject.addtocartbutton.click();
		testcase.log(Status.PASS, "Clicked addto cart button");
		/*
	
		 * WebElement mousehover=driver.findElement(By.
		 * xpath("//body[@class=\"category category-3 category-women hide-right-column lang_en\"]"
		 * )); action.moveToElement(mousehover).perform();
		 */
		   try {
				 
			    PurchaseproductObject.checkout.click();
			    
			    System.out.println("try purchase product");
			}
			catch(ElementNotInteractableException e) {
			  
				e.printStackTrace();
				PurchaseproductObject.checkout.click();
			}
					
		  
		
	
		  
		
		
		
		String actualtittle= driver.getTitle();
		
		System.out.println(actualtittle);

		String expectedtittle= "My Store";
		System.out.println("site tittle is "+ actualtittle);
	
		Assert.assertEquals(expectedtittle,actualtittle);

		String Carttittletext= PurchaseproductObject.carttittle.getText();

		System.out.println(Carttittletext);




	}










}
