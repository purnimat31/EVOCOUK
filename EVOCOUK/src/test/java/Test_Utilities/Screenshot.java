package Test_Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshot {

	public static void capturescreenshot(WebDriver driver, String screenshotname) {
	try {
		File r = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(r, new File("./Screenshots/"+screenshotname +".png"));
		
		//System.out.println("Screenshot taken");
	} catch (Exception e) {
		System.out.println("Exception while capturing Screenshot"+e.getMessage());
	
	}
}
}