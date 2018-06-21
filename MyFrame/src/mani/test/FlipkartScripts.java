package mani.test;

import org.openqa.selenium.By;

import Utils.TestData;

public class FlipkartScripts extends logger{
	
	public void launch_the_browser() throws Throwable {
		launchBrowser();
		screenShot("Login");
	}
	
	public void navigate_to_a_website() throws Throwable {
	   driver.get("https://oneclaimaws-qa.aig.net/");
	   driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(TestData.data("TC01", "UserName"));
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(TestData.data("TC01", "Password"));
	   driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	   screenShot("URL_Passed");
	   log.info("logged into flipkart");
	}
	
	public void validate_the_website() throws Throwable {
	
		
	    
	}


}
