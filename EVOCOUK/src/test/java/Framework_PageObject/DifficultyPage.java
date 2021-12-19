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

public class DifficultyPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public DifficultyPage(WebDriver driver) {
			this.driver=driver;
		}
      	// Define locators for fields in Difficulty Page              
                  
		 @FindBy(xpath = "//*[@id=\"f-moreDifficult-2\"]")
		 WebElement diff; //  Difficulty Yes/No - Radio button
		 		 		 
		 @FindBy(xpath = "//*[@id=\"continue-button\"]")
		 WebElement contbut; //Click on Continue - Button
		 		 		
		public WebElement diff(){
				return diff;
		}
			
		public WebElement contbut(){
			return contbut;
	    }			
				
		public ConfirmationPage difficultyoption(String TC){
	    			
            diff().click();
            contbut().click();
            Screenshot.capturescreenshot(driver, TC+"DifficultyPage_1"); //Calling TakeScreenshot utility
			return PageFactory.initElements(driver,ConfirmationPage.class);
            
            
          

		}
		}
		
		

		
	


