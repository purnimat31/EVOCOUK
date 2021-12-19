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

public class ContactDetailsPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public ContactDetailsPage(WebDriver driver) {
			this.driver=driver;
		}
        
      	// Define locators for fields in Contact details Page
                        
		 @FindBy(xpath = "//*[@id=\"f-tel\"]")
		 WebElement phonenbr; //  Enter Phone number - Text box
		 		 		 
		 @FindBy(xpath = "//*[@id=\"f-email\"]")
		 WebElement email; //Enter Email - Text box
			       
		 @FindBy(xpath = "//*[@id=\"f-address[address1]\"]")
		 WebElement address1; //Enter Address1 - Text box

		 @FindBy (xpath = "//*[@id=\"f-address[address3]\"]")
		 WebElement address3; //Enter Address3 - Text box
	
		 @FindBy(xpath = "//*[@id=\"f-address[postcode]\"]")
		 WebElement postcode; //Enter Postcode - Text box
		 
		 @FindBy(xpath = "//*[@id=\"continue-button\"]")
		 WebElement contbut; //Click on Continue - Button
		 		
		
		public WebElement phonenbr(){
				return phonenbr;		
		}
					
		public WebElement email(){
				return email;
		}
			
		public WebElement address1(){
				return address1;
		}
			
		public WebElement address3(){
				return address3;
		}
			
		public WebElement postcode(){
			return postcode;
	}
		public WebElement contbut(){
			return contbut;
	}
		
		public DifficultyPage contactdetails(){
	    
			phonenbr().sendKeys("07411445127");
			email().sendKeys("purnit31@gmail.com	");
			Screenshot.capturescreenshot(driver, "ContactDetailsPage_1"); //Calling TakeScreenshot utility
			//JavascriptExecutor js = (JavascriptExecutor) driver; //Javascript executor to invoke scroll down of page
			address1().sendKeys("5 Albion Street");
			Screenshot.capturescreenshot(driver, "ContactDetailsPage_2"); //Calling TakeScreenshot utility
			address3().sendKeys("Swindon");
			postcode().sendKeys("SN1 1EB");
			Screenshot.capturescreenshot(driver, "ContactDetailsPage_3"); //Calling TakeScreenshot utility
			contbut().click();
			return PageFactory.initElements(driver,DifficultyPage.class);

		}
		}
		
		

		
	


