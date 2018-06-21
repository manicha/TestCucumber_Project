package mani.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Utils.TestData;

public class AIGOneClaimScripts extends logger{
	
	public void launch_the_Chrome_browser() throws Throwable {
		launchBrowser();
		screenShot("Login");
		
	}

	public void navigate_to_OneClaim_dashboard() throws Throwable {
		driver.get("https://oneclaimaws-qa.aig.net/");
		Select sel = new Select(driver.findElement(By.id("country")));
		sel.selectByValue(TestData.data("TC03", "Country"));
		driver.findElement(By.id("USER")).sendKeys(TestData.data("TC03", "UserName"));
		driver.findElement(By.id("PASSWORD")).sendKeys(TestData.data("TC03", "Password"));
		screenShot("Credentials Passed");
		driver.findElement(By.xpath("//input[@id='Button-Login']")).click();
		log.info("Logged in to OneClaim application");
		
	}
}
