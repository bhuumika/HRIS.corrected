package com.qait.automation.login;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class Timesheet {
WebDriver driver;

	public Timesheet(WebDriver driver) {
	this.driver=driver;
	}
	public void logout() {
	
		driver.findElement(By.cssSelector("#page > div > div.header > div.col-sm-3.col-md-2.col-xs-2 > ul > li > a > img")).click();
		driver.findElement(By.cssSelector("")).click();
	}
	
}
