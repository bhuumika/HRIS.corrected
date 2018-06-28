package com.qait.automationn;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.login.Login;
import com.qait.automation.login.Timesheet;

import junit.framework.Assert;

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
		t=new Timesheet(driver);
	}

	
	@Test
	public void test1()

	{
		boolean check = l.to_check_login_with_incorrect_password("bhumikagupta", "Incorrect Password");
		Assert.assertFalse(check);
	}

	@Test
	public void test2() {
		boolean checker = l.to_check_the_NO_Password_login("bhumikagupta", " ");
		assertTrue(checker);
		
	}
	

	@Test
	public void test3()

	{
		l.to_check_the_correct_user_login("bhumikagupta", "Bhumika@321#");

	}
	
	
	@Test
	public void test4_logOut() {
		t.logout();
	
	}
	
	
	@Test
	public void test5() {
	boolean checking=	l.forgot_password_tab_with_Incorrect_Password("bhumikagupta","xksxksm");
		assertTrue(checking);
		

	}
	@Test
	public void test6()
	{
		String t=l.Login_panel_is_clicked();
		Assert.assertEquals(t, "Login Here");
	}
	@Test
	public void test7()
	{
		String t=l.About_hris_is_clicked();
		Assert.assertEquals(t, "  Use HRIS to ...");
	}@Test
	public void test8()
	{
		String t=l.Celebration_is_clicked();
		Assert.assertEquals(t, "Birthday(s)");
	}@Test
	public void test9()
	{
		String t=l.Did_you_know_is_clicked();
		Assert.assertEquals(t, "Did you know?");
	}@Test
	public void test10()
	{
		String t=l.Food_menu_is_clicked();
		Assert.assertEquals(t, "  Food Menu");
	}@Test
	public void test11()
	{
		String t=l.Login_panel_is_clicked();
		Assert.assertEquals(t, "Login Here");
	}@Test
	public void test12()
	{
		String t=l.HR_Policy_is_clicked();
		Assert.assertEquals(t, "  HR Policy");
	}@Test
	public void test13()
	{
		String t=l.QAIT_updates_is_Clicked_();
		Assert.assertEquals(t, "");
	}
}