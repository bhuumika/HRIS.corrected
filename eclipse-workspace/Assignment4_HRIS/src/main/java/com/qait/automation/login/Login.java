package com.qait.automation.login;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import junit.framework.Assert;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;

	}

	public void tap() {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
		System.out.println("Enter");
		driver.findElement(By.cssSelector("#login > form > div.loginTxtBtn.extraText > div > label:nth-child(2) > a"))
				.click();
		java.util.Set<String> tabs = driver.getWindowHandles();
		Iterator<String> i = ((java.util.Set<String>) tabs).iterator();
		String main = i.next();
		String child = i.next();
		driver.switchTo().window(child);
		System.out.println("Enter");
		
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[name='mail']")).sendKeys(email);
				
		
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/table/tbody/tr[3]/td/input"))
				.submit();

		if (driver.findElement(By.xpath("")).getText()
				.contains("Email address in the record does not match"))
			return false;
		else
			return true;
		
	}

	public void Login_panel_is_clicked() {
		this.tap();
		driver.findElement(By.cssSelector("a[href='#panel1")).click();
		

	}

	public void About_hris_is_clicked() {
		driver.findElement(By.cssSelector("a[href='#panel2")).click();
	
	

}
	public void Celebration_is_clicked() {
	driver.findElement(By.cssSelector("a[href='#panel3']")).click();


	}
	public void QAIT_updates_is_Clicked_() {
		driver.findElement(By.cssSelector("a[href='#panel4'")).click();
	}
	public void HR_Policy_is_clicked() {
		driver.findElement(By.cssSelector("a[href='#panel5")).click();
}
 
	public void foodMenuIsClicked() {
		driver.findElement(By.cssSelector("a[href='#panel7")).click();
	}

	public void Did_you_know_is_clicked() {
		driver.findElement(By.cssSelector("a[href='#panel6")).click();
	
	}
}
