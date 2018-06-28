package com.qait.automation.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;

	}

	public void tap() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(
				"#demo-2 > div > div.tabbable.custom-tabs.tabs-left.tabs-animated.flat.flat-all.hide-label-980.shadow.track-url.auto-scroll > ul > li:nth-child(1) > a"))
				.click();
		driver.findElement(By.cssSelector("input[id=txtUserName]")).clear();
		driver.findElement(By.cssSelector("input[id=txtPassword]")).clear();
	}

	public boolean to_check_login_with_incorrect_password(String user, String Password) {
		this.tap();
		driver.findElement(By.cssSelector("input[id=txtUserName]")).sendKeys(user);
		driver.findElement(By.cssSelector("input[id=txtPassword]")).sendKeys(Password);
		driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > input")).submit();
		this.tap();

		if (driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error > div"))
				.getText().equals("Invalid Login")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean to_check_the_NO_Password_login(String usern, String passw) {
		this.tap();
		driver.findElement(By.cssSelector("input[id=txtUserName]")).sendKeys(usern);
		driver.findElement(By.cssSelector("input[id=txtPassword]")).sendKeys(passw);
		driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > input")).submit();
		if (driver.findElement(By.cssSelector("input[id=txtPassword")).getAttribute("style").contains("red")) {
			return false;
		}

		else
			return true;

	}

	public void to_check_the_correct_user_login(String username, String password) {
		this.tap();
		driver.findElement(By.cssSelector("input[id=txtUserName]")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id=txtPassword]")).sendKeys(password);
		driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > input")).submit();
		Assert.assertTrue(true);

	}

	public boolean forgot_password_tab_with_Incorrect_Password(String username, String email) {
		this.tap();
		driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > label:nth-child(2) > a"))
				.click();
		driver.findElement(
				By.cssSelector("#content > form > table > tbody > tr:nth-child(1) > td > input[type=\"text\"]"))
				.sendKeys(username);
		driver.findElement(
				By.cssSelector("#content > form > table > tbody > tr:nth-child(2) > td > input[type=\"text\"]"))
				.sendKeys(email);
		driver.findElement(By.cssSelector(
				"driver.findElement(By.cssSelector(#login > form > div.loginTxtBtn.extraText > div > label:nth-child(2) > a")).submit();
				
		if (driver.findElement(By.cssSelector("h2.critical")).getText()
				.contains("Email address in the record does not match"))
			return false;
		else
			return true;
	}

	public String Login_panel_is_clicked() {
		driver.findElement(By.cssSelector("a.active")).click();
		String title = driver.getTitle();
		return title;

	}

	public String About_hris_is_clicked() {
		driver.findElement(By.).click();
	String	title=driver.getTitle();
	return title;
	

}public String Celebration_is_clicked() {
	driver.findElement(By.).click();
String	title=driver.getTitle();
return title;

	}public String QAIT_updates_is_Clicked_() {
		driver.findElement(By.).click();
	String	title=driver.getTitle();
	return title;}

	public String HR_Policy_is_clicked() {
		driver.findElement(By.).click();
	String	title=driver.getTitle();
	return title;}

	public String Food_menu_is_clicked() {
		driver.findElement(By.).click();
	String	title=driver.getTitle();
	return title;}

	public String Did_you_know_is_clicked() {
		driver.findElement(By.).click();
	String	title=driver.getTitle();
	return title;
	}
}
