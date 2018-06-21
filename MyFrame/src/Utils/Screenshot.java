package Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

public class Screenshot {
	static String strDate;
	public static WebDriver driver;
	static String screenShotPath;
	public void launchBrowser() throws Exception {
		
		// Creating folder to place screenshots
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyymmss");  
	    strDate= formatter.format(date);
	    screenShotPath = "D:\\Automation\\TestOutput\\Screenshots\\"+strDate;
		File newFolder = new File(screenShotPath);
		newFolder.mkdir();
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//To Take screenshot
	public  static void screenShot (String screenName)throws Exception {
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File(screenShotPath+"\\"+screenName+".jpeg"));
		//FileUtils.copyFile(screenShot, new File("D:\\Automation\\Screenshots\\"+screenName+".jpeg"));

	}
}
