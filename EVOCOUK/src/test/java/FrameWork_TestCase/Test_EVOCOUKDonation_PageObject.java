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

public class Test_EVOCOUKDonation_PageObject extends EnvironmentSetup {
// test=> Environmental setup=> path utility
	 
	
	Framework_PageObject.StartPage page;
	
	

	@BeforeMethod
	public void setup() {


		setDriver("chrome", "https://evoco-test-app-frontend.herokuapp.com/barebones/");
		driver = getDriver();		
		page = PageFactory.initElements(driver, StartPage.class);
		driver.manage().window().maximize();
		
	}
	
	
	@Test(priority = 0, description = "TC_001 - Verification of Test page title")
	public void EVOCOUK_PO_PF_TestPage_ValidateTitle() {
		 String title =driver.getTitle();
		 Assert.assertEquals(driver.getTitle(), "Evoco Technical Test");
		 System.out.println("TC1 - Webpage Title Expected = Evoco Technical Test, Actual =" + title);
         		
		}
	@Test(priority = 1, description = "TC_002 Verification of donation made with own money in memory of someone for £12", enabled = true)
	public void EVOCOUK_PO_PF_InputandSubmitDetails() throws IOException, InterruptedException {
		 page.starttest().enterpersonaldetails().selectoptions().contactdetails().difficultyoption().checkyouranswers().finalsubmit();		
	     Screenshot.capturescreenshot(driver, "PaymentDetailsPage_6"); //Calling TakeScreenshot utility
	     //System.out.println("TC2 - Final Message Expected = Thank you Tester for your donation £"+ don_amt+", Actual = " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText());	
		 //Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText(), "Thank you Tester for your donation of £"+ don_amt);
	 //StartPage/DetailsPage/OptionsPage/ContactDetailsPage/DifficultyPage/Confirmation Page/FinalPage 
	     //System.out.println("TC2 - Final Message Expected = Thank you Tester for your donation £"+ don_amt+", Actual = " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText());	
	}
	@Parameters({"don_amt1"})
	@Test(priority = 2, description = "TC_003 Verification of donation made with own money in memory of someone for £10", enabled = false)
	public void CRUK_PO_PF_Donation_Someoneelsemoney(String don_amt1) throws IOException, InterruptedException {
		//page.enterdonationdetails(don_amt1).enterpersonaldetails().enterpaymentdetails();     
		Screenshot.capturescreenshot(driver, "PaymentDetailsPage_6"); //Calling TakeScreenshot utility
	    //System.out.println("TC3 - Final Message Expected = Thank you Tester for your donation £"+ don_amt1+", Actual = " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText());	
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText(), "Thank you Tester for your donation of £"+ don_amt1);
	    System.out.println("TC3 - Final Message Expected = Thank you Tester for your donation £"+ don_amt1+", Actual = " + driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/h2[1]")).getText());	
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		quitBrowser();
		}

	

}
