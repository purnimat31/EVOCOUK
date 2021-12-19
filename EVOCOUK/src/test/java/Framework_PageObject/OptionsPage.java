package Framework_PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Test_Utilities.Screenshot;

public class OptionsPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public OptionsPage(WebDriver driver) {
			this.driver=driver;
		}
      	// Define locators for fields in Options Page
        
        
		 @FindBy(xpath = "//*[@id=\"f-boxes\"]")
		 WebElement opt1; //  Option 1
		 		 		 
		 @FindBy(xpath = "//*[@id=\"f-boxes-2\"]")
		 WebElement opt2; //Option 2 
			       
		 @FindBy(xpath = "//*[@id=\"f-boxes-3\"]")
		 WebElement opt3; //Option 3

		 @FindBy (xpath = "//*[@id=\"f-boxes-4\"]")
		 WebElement opt4; //Option 4
	
		 @FindBy(xpath = "//*[@id=\"continue-button\"]")
		 WebElement contbut; //Click on Continue - Button
		 		 		
		public WebElement opt1(){
				return opt1;
		}
			
		public WebElement opt2(){
				return opt2;		
		}
					
		public WebElement opt3(){
				return opt3;
		}
			
		public WebElement opt4(){
				return opt4;
		}
			
		public WebElement contbut(){
			return contbut;
			
		}
		
					
		public  ContactDetailsPage selectoptions(String TC){
	    
			JavascriptExecutor js = (JavascriptExecutor) driver; //Javascript executor to invoke scroll down of page
			opt1().click();
			opt2().click();
			opt3().click();
			opt4().click();
			Screenshot.capturescreenshot(driver, TC+"OptionsPage_1"); //Calling TakeScreenshot utility
			contbut().click();
			return PageFactory.initElements(driver,ContactDetailsPage.class);
					}
		}
		
		

		
	


