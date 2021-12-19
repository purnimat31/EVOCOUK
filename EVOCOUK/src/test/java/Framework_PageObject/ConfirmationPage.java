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

public class ConfirmationPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public ConfirmationPage(WebDriver driver) {
			this.driver=driver;
		}
      	// Define locators for fields in Confirmation  Page
                     
      //*[@id="main-content"]/div/div/form/dl[1]/div[1]/dd[1]
      //*[@id="main-content"]/div/div/form/dl[1]/div[2]/dd[1]
      //*[@id="main-content"]/div/div/form/p/button    
          
        
		 @FindBy(xpath = "//*[@id=\"main-content\"]/div/div/form/p/button")
		 WebElement nextbut; //  Credit Card Option from 3 Options listed - Radio button
		 		 
		 		 		
		public WebElement nextbut(){
				return nextbut;
		}
			
			
		public FinalPage checkyouranswers(String TC){
	    
			Screenshot.capturescreenshot(driver, TC+"Checkyouranswers_1"); //Calling TakeScreenshot utility
			JavascriptExecutor js = (JavascriptExecutor) driver; //Javascript executor to invoke scroll down of page
            js.executeScript("window.scrollBy(0,250)", "");
			Screenshot.capturescreenshot(driver, TC+"Checkyouranswers_2"); //Calling TakeScreenshot utility
            js.executeScript("window.scrollBy(0,250)", "");
			Screenshot.capturescreenshot(driver, TC+"Checkyouranswers_3"); //Calling TakeScreenshot utility
			js.executeScript("window.scrollBy(0,250)", "");
			Screenshot.capturescreenshot(driver, TC+"Checkyouranswers_4"); //Calling TakeScreenshot utility
			nextbut().click();
			return PageFactory.initElements(driver,FinalPage.class);


		}
		}
		
		

		
	


