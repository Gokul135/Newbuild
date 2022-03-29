package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import commonFunctions.commonfunction;
import pageObjectClasses.PurchaseproductObject;
import pageObjectClasses.Searchproducts;
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

import commonFunctions.commonfunction;
import pageObjectClasses.PurchaseproductObject;
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

import commonFunctions.commonfunction;
import pageObjectClasses.PurchaseproductObject;

public class Searchproduct extends commonfunction {



	@Test (priority = 2)
	public void searchproducts() {
		 
		testcase=extent.createTest("Search tescase");
	

		PageFactory.initElements(driver, Searchproducts.class);

		Searchproducts.women.click();
		
		testcase.log(Status.PASS, "Submit button is vissible and succusfully entered");
		

		List<WebElement> Allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'layered_category_')]"));

		int size=Allcheckbox.size();

		for (int i=0 ; i<size ; i++) {

			Allcheckbox.get(i).click();
		}
	}



	@Test (priority = 3)
	public void colourfilter() {
		
		
		 testcase=extent.createTest("Verify colourfilter");
		 

		Searchproducts.size.click();

		testcase.log(Status.PASS, "Click on size");
		
		List<WebElement> colourFilter= driver.findElements(By.xpath("//input[contains (@id,'layered_id_attribute_group_')]"));

		int coloursize=colourFilter.size();

		for(int i=0; i<coloursize; i++) {

			colourFilter.get(i).click();

		}	

	}

	@Test (priority = 4)
	public void fabricfiltercheckbox() throws IOException {

		testcase=extent.createTest("Verify fabricfilter");
		
		
		
		List<WebElement> Fabrictypes= driver.findElements(By.xpath("//input[contains(@id,'ayered_id_feature_')]"));


		for (WebElement Fabrickeck:Fabrictypes){

			String fabricname=Fabrickeck.getAttribute("id");  

			if (fabricname.equals("layered_id_feature_5") || fabricname.equalsIgnoreCase("layered_id_feature_3")) {
             
				Fabrickeck.click();
				 
			testcase.log(Status.FAIL, "Submit button is vissible and succusfully entered");	
			TakesScreenshot screenshot=(TakesScreenshot) driver;

			File sourcefile2=  screenshot.getScreenshotAs(OutputType.FILE);

			File destinationfile2 = new File(".\\Screenshots\\facbricfilterfail.png");

			org.openqa.selenium.io.FileHandler.copy(sourcefile2, destinationfile2);
				
			testcase.addScreenCaptureFromPath(".\\\\Screenshots\\\\facbricfilterfail.png");
				
				
			}

		}

	}


	@Test (priority = 5)
	public void pricefilterslider() {
		
		testcase=extent.createTest("Verify pricefilter");
		
		
		
		Actions action= new Actions(driver);

		WebElement Minprice= driver.findElement(By.xpath("//a[@style='left: 0%;']"));

		Dimension sizeminprice=  Minprice.getSize();

		System.out.println("size is"+ sizeminprice);

		org.openqa.selenium.Point locationminprice=Minprice.getLocation();

		System.out.println("location is"+ locationminprice);

		action.dragAndDropBy(Minprice, 40, 0).build().perform();
		
		testcase.log(Status.PASS, "Drag and drop on price");

		Actions action2= new Actions(driver);

		WebElement Maxprice= driver.findElement(By.xpath("//a[@style='left: 100%;']"));

		action2.dragAndDropBy(Maxprice, -100, 0).build().perform();		

		
			
			
			
		}

	



	@Test (priority = 6)
	public void sortbyproduct() {		

		 testcase=extent.createTest("Verify sortbyproduct");
		
		Select sort=new Select(Searchproducts.sortby);
		
		
		sort.selectByIndex(1);
		
		testcase.info("Product selected in dropdown by index");
		
		/*
		 * WebElement addcart=driver.findElement(By.
		 * xpath("//a[@class='button ajax_add_to_cart_button btn btn-default' and @data-id-product='2']"
		 * ));
		 * 
		 * addcart.click();
		 */
	}

	
	  
	 
		  

     
     









}