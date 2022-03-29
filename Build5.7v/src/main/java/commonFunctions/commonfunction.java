package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.HTMLReader;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class commonfunction {

//common extentreport;
	
	
	 public static ExtentReports extent;
	  
	  public  static ExtentSparkReporter reports;
	  
	  public static ExtentTest testcase;
	 
	
	public static Properties properties=null;

	public static WebDriver driver=null;
	
    public  static Logger  logger=Logger.getLogger(commonfunction.class);

	public Properties loadpropertyFile() throws IOException {

		FileInputStream fileInputStream=new FileInputStream("config.properties");

		properties=new Properties();

		properties.load(fileInputStream);

		return properties;
		
		


	}


	@BeforeSuite

	    public void launchbrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Browser going to star");
        loadpropertyFile();
		String browser=	properties.getProperty("browser");
		logger.info("Hitting the URL");
		String url=	properties.getProperty("url");
		String driverLocation=properties.getProperty("Driverlocation");

       
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Launching chrome");
			driver=new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
	
	
		
		  extent=new ExtentReports();
		  
		  reports = new ExtentSparkReporter(".\\Testreports\\ETestreport.html");
		  
		  extent.attachReporter(reports);
		 
        
        

	}

	@AfterTest

	public void teardown() {
		extent.flush(); 
		/*
		 * logger.info("test done closing the browser"); driver.quit();
		 */
		
	}

}
