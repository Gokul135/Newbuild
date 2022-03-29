package testCases;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.commonfunction;
import pageObjectClasses.LoginpageObject;

public class Logintestcases extends commonfunction {

	@Test(priority = 1)
	public void Logintestcase() throws IOException {

		testcase=extent.createTest("Login tescase");

		PageFactory.initElements(driver, LoginpageObject.class);

		LoginpageObject.signin.click();

		LoginpageObject.email.sendKeys(properties.getProperty("email"));
		testcase.pass("Enter username");
		testcase.log(Status.PASS, "Usernamebox is visible and passed username ");
		LoginpageObject.password.sendKeys(properties.getProperty("password"));
		testcase.pass("Enter password");
		testcase.log(Status.PASS, "Passwordbox is visible and passed password ");
		LoginpageObject.signinSubmit.click();
		testcase.pass("Enter submit");
		testcase.log(Status.PASS, "Submit button is vissible and succusfully entered");
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);

		File destinationfile = new File(".\\Screenshots\\Login.png");

		org.openqa.selenium.io.FileHandler.copy(sourcefile, destinationfile);
		testcase.log(Status.PASS, "Capyured the screenshot of login page");
	}

}
