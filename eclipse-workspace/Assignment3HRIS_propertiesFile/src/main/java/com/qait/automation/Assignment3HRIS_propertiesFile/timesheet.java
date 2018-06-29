package com.qait.automation.Assignment3HRIS_propertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class timesheet {
	WebDriver driver;

	public timesheet(WebDriver driver) {
	this.driver=driver;
	}
	
	public void logout() {
		 driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div[2]/ul/li/a/img")).click();
		  WebDriverWait wait=new WebDriverWait(driver,10); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fa")));
		  driver.findElement(By.className("fa-sign-out")).click();
		  Assert.assertEquals("https://hris.qainfotech.com/login.php",driver.getCurrentUrl());
	}
}
