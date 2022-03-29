package testCases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonfunction;
import pageObjectClasses.Signuppageobject;

@SuppressWarnings("unused")
public class Signuptest extends commonfunction {

@Test (priority = 2)
	public void Signuppagetest() throws IOException {
		
	   PageFactory.initElements(driver, Signuppageobject.class); 
		
	   Signuppageobject.signin.click();
	   
	   Signuppageobject.emailbox.sendKeys("gokul.prasad110593@gmail.com");
	   
	   Signuppageobject.creatbutton.click();
	   
	   TakesScreenshot screenshot=(TakesScreenshot) driver;
		  
	   File sourcefile=  screenshot.getScreenshotAs(OutputType.FILE);
	   
	   File destinationfile = new File(".\\Screenshots\\screenshot3.png");
	   
	   org.openqa.selenium.io.FileHandler.copy(sourcefile, destinationfile);
	   
	   Signuppageobject.genderSelect.click();
	   
	   Signuppageobject.firstname.sendKeys("Gokul");
	   
	   Signuppageobject.lastname.sendKeys("Prasad");
	   
	   Signuppageobject.password.sendKeys("Hello123#");
	   
	   Select Selectdate=new Select(Signuppageobject.date);
	   
	   Selectdate.selectByIndex(11);
	   
	   Select Selectmonth=new Select(Signuppageobject.Month);
	   
	   Selectmonth.selectByValue("5");
	   
	   Select Selectyears=new Select(Signuppageobject.Years);
	   
	   Selectyears.selectByValue("1993");
		
	   Signuppageobject.company.sendKeys("capgemini");
	    
	   Signuppageobject.address.sendKeys("No 5,Sajapura road");
	    
	   Signuppageobject.address2.sendKeys("Bangalore");
	   
	   Signuppageobject.city.sendKeys("Bangalore");
	  
	   Select stateselect=new Select(Signuppageobject.state);
	   
	   stateselect.selectByVisibleText("New York");
	   
	   List<WebElement> State=stateselect.getAllSelectedOptions();
	   
	   for(WebElement Statlist:State) {
		 
		 String states= Statlist.getText();
	    }
	   
	   Signuppageobject.postcode.sendKeys("10001");
	   
	   Signuppageobject.additionalinfo.sendKeys("12345678911");
	   
	   Signuppageobject.phonenumber.sendKeys("12345678911");
	   
	   Signuppageobject.mobilenumber.sendKeys("12345678911");
	   
	   Signuppageobject.allias.sendKeys("Automation");
	   
	   Signuppageobject.Submitbutton.click();
	   

	   
		   
	   
	   }

	

	
}
