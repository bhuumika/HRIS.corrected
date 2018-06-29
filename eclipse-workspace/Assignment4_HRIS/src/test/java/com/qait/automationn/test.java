package com.qait.automationn;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.login.Login;
import com.qait.automation.login.Timesheet;

public class test {
	WebDriver driver;
	Login l;
	Timesheet t;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com");
		l = new Login(driver);
		t = new Timesheet(driver);
	}

	@Test(priority=1)
	public void test1()

	{
		boolean check = l.to_check_login_with_incorrect_password("bhumikagupta", "Incorrect Password");
		Assert.assertFalse(check);
	}

	@Test(priority=2)
	public void test2() {
		boolean checker = l.to_check_the_NO_Password_login("bhumikagupta", " ");
		assertTrue(checker);

	}

	@Test(priority=3)
	public void test3()

	{
		l.to_check_the_correct_user_login("bhumikagupta", "Bhumika@321#");

	}

	@Test(priority=4)
	public void test4_logOut() {
		t.logout();

	}

	@Test(priority=5)
	public void test5() {
		l.About_hris_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=6)
	public void test6() {
		l.Celebration_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=7)
	public void test7() {
		l.Did_you_know_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=8)
	public void test8() {
		l.foodMenuIsClicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=9)
	public void test9() {
		l.Login_panel_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=10)
	public void test10() {
		l.HR_Policy_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=11)
	public void test11() {
		l.QAIT_updates_is_Clicked_();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=12)
	public void tes12() {
		l.Login_panel_is_clicked();
		Assert.assertEquals("https://hris.qainfotech.com/login.php", driver.getCurrentUrl());
	}

	@Test(priority=13)
	public void test13() {
		boolean checking = l.forgot_password_tab_with_Incorrect_Password("bhumikagupta", "xksxksm");
		assertTrue(checking);
		
		

	}
}