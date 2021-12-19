package FrameWork_TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import FrameWork_EnvSetUp.EnvironmentSetup;
import Framework_PageObject.StartPage;
import Test_Utilities.Screenshot;

public class Test_EVOCOUK_GOVUK_PageObject extends EnvironmentSetup {
// test=> Environmental setup=> path utility
	 
	
	Framework_PageObject.StartPage page;
	
	

	@BeforeMethod
	public void setup() {


		setDriver("chrome", "https://evoco-test-app-frontend.herokuapp.com/barebones/");
		driver = getDriver();		
		page = PageFactory.initElements(driver, StartPage.class);
		driver.manage().window().maximize();
		
	}
	
	@Parameters({"TC001"})
	@Test(priority = 0, description = "TC_001 - Verification of Test page title")
	public void EVOCOUK_PO_PF_TestPage_ValidateTitle(String TC001) {
		 String title =driver.getTitle();
		 Screenshot.capturescreenshot(driver, TC001+"StartPage_1"); //Calling TakeScreenshot utility
		 Assert.assertEquals(driver.getTitle(), "Evoco Technical Test");
		 System.out.println("TC1 - Webpage Title Expected = Evoco Technical Test, Actual =" + title);
         		
		}
	@Parameters({"TC002","firstname1", "lastname1"})
	@Test(priority = 1, description = "TC_002 Verification of Contact details input is accepted as expected", enabled = true)
	public void EVOCOUK_PO_PF_InputandSubmitDetails(String TC002, String firstname, String lastname) throws IOException, InterruptedException {
		 page.starttest(TC002).enterpersonaldetails(TC002, firstname, lastname).selectoptions(TC002).contactdetails(TC002).difficultyoption(TC002).checkyouranswers(TC002).finalsubmit(TC002);		
	     
	}
	@Parameters({"TC003","firstname2", "lastname2"})
	@Test(priority = 2, description = "TC_003 Verification of options selected are accepted as input", enabled = true)
	public void CRUK_PO_PF_Donation_Someoneelsemoney(String TC003, String firstname, String lastname) throws IOException, InterruptedException {
		 page.starttest(TC003).enterpersonaldetails(TC003,firstname, lastname).selectoptions(TC003).contactdetails(TC003).difficultyoption(TC003).checkyouranswers(TC003).finalsubmit(TC003);		
			}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		quitBrowser();
		}

	

}
