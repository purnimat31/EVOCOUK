package Framework_PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Test_Utilities.Screenshot;

public class FinalPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public FinalPage(WebDriver driver) {
			this.driver=driver;
		}
      	// Define locators for fields in Final Page   
            
           
      //*[@id="main-content"]/div[1]/p[1]
      //*[@id="main-content"]/div[1]/p[2]
        
        
        @FindBy(xpath = "//*[@id=\"continue-button\"]")
		 WebElement contbut; //Click on Continue - Button		
		 
		 		
        public WebElement contbut(){
			return contbut;
	}
		
		
		public void finalsubmit(){
	    
			Screenshot.capturescreenshot(driver, "FinalPage_1"); //Calling TakeScreenshot utility
			contbut().click();
			Screenshot.capturescreenshot(driver, "FinalPage_2");
			
		}
		}
		
		

		
	


