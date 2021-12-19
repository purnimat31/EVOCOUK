package Framework_PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Test_Utilities.Screenshot;



public class StartPage {
	
		private WebDriver driver;
		public StartPage(WebDriver driver) {
			this.driver=driver;
		}
		
    	// Define locators for fields in Starting Page

		 @FindBy(xpath = "//*[@id=\"main-content\"]/p[4]/a")
		 WebElement getstarted;  // Button to invoke the technical test
		
		 public WebElement getstarted(){
				return getstarted;
				
			}
		 
		 public  DetailsPage starttest() throws IOException, InterruptedException{
			
			
			getstarted().click();
			Screenshot.capturescreenshot(driver, "StartPage_1");//Calling TakeScreenshot utility
			
			return PageFactory.initElements(driver,DetailsPage.class);
			
		}
		}
		
		

		
	


