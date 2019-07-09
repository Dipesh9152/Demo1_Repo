package org.kale.corvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage
{
	WebDriver driver;
	
	public LoginPage(WebDriver dr)
	{
		driver=dr;
	}
	
	/**
	 * This method is used to login to CODEX-Auction
	 *
	 * @param username user name of cfs user
	 * @param password password of cfs user
	 * @throws Exception 
	 */
	
	public void login(String username, String password) throws Exception
	{
		driver.findElement(By.id("btntest")).click();
		driver.findElement(By.id("textfield")).sendKeys(username);
		
		driver.findElement(By.id("textfield2")).sendKeys(password);
		driver.findElement(By.name("imgButton")).click();
		
		
		String newwindow=driver.getWindowHandle();
		
		for (String subwindow:driver.getWindowHandles())
		{
			driver.switchTo().window(subwindow);
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
	} 
}
