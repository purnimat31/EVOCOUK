package Framework_PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Test_Utilities.Screenshot;


public class DetailsPage {
	
		//Declaring global Variables
		private WebDriver driver;
        public DetailsPage(WebDriver driver) {
			this.driver=driver;
		}
    	// Define locators for fields in Details Page
                
		 @FindBy(xpath = "//*[@id=\"f-title\"]")
		 WebElement title;  //Enter Title - Text box
		 
		 @FindBy(xpath = "//*[@id=\"f-first-name\"]")
		 WebElement firstname; //Enter First Name - Text box
		 
		 @FindBy(xpath = "//*[@id=\"f-middle-name\"]")
		 WebElement middlename; //Enter Middle Name - Text box
				
		 @FindBy (xpath = "//*[@id=\"f-lastName\"]")
		 WebElement lastname; //Enter Last Name - Text box
		 
		 @FindBy(xpath = "//*[@id=\"f-dob[dd]\"]")
		 WebElement dobdate; //Enter DOB Date - Text box
		 @FindBy(xpath = "//*[@id=\"f-dob[mm]\"]")
		 WebElement dobmonth; //Enter DOB Month - Text box
		 @FindBy(xpath = "//*[@id=\"f-dob[yyyy]\"]")
		 WebElement dobyear; //Enter DOB Year - Text box
		 
		 @FindBy(xpath = "//*[@id=\"f-nino\"]")
		 WebElement ni; //Click Find Address - Button		 
		   
		 @FindBy(xpath = "//*[@id=\"continue-button\"]")
		 WebElement contbut; //Click on Continue - Button
		 		
		 public WebElement title(){
				return title;
				
			}
		 
		public WebElement firstname(){
			return firstname;
			
		}
		
		public WebElement middlename(){
			return middlename;
			
		}		
		
		public WebElement lastname(){
			return lastname;
			
		}
		
		public WebElement dobdate(){
			return dobdate;
			
		}
		
		public WebElement dobmonth(){
			return dobmonth;
			
		}
		
		public WebElement dobyear(){
			return dobyear;
			
		}
		
		public WebElement ni(){
			return ni;
			
		}
		
		public WebElement contbut(){
			return contbut;
			
		}		
							
		public  OptionsPage enterpersonaldetails(){

			title().sendKeys("Miss");
			firstname().sendKeys("Tester");	
			middlename().sendKeys("middlename");
			lastname().sendKeys("O'Doh-erty");			
			Screenshot.capturescreenshot(driver, "PersonalDetailsPage_1"); //Calling TakeScreenshot utility
			dobdate().sendKeys("12");
			dobmonth().sendKeys("12");
			dobyear().sendKeys("1980");
			ni().sendKeys("SB456789B");			
			Screenshot.capturescreenshot(driver, "PersonalDetailsPage_2"); //Calling TakeScreenshot utility
			contbut().click();
			return PageFactory.initElements(driver,OptionsPage.class);
			
		}
		}
		
		

		
	


