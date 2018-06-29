package com.qait.automaton.Tatoc_Maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;



public class LAunchUrl {
	protected static WebDriver driver;
	private Object windows;

	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
	}

	public void selectBasicCourse() {
		driver.findElement(By.cssSelector("a")).click();

	}
public void gridGate() {
		driver.findElement(By.className("greenbox")).click();;
	}

	public void frameDungeon() {
	driver.switchTo().frame(0);
		WebElement box1 = driver.findElement(By.id("answer"));
	String Box1_color = box1.getAttribute("class");
		String Box2_color = "";
		while (!Box1_color.equals(Box2_color)) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElement(By.cssSelector("a")).click();
			driver.switchTo().frame(0);			Box2_color = driver.findElement(By.id("answer")).getAttribute("class");
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0).findElement(By.linkText("Proceed")).click();


	}
	public void dragAround()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement dragbox= driver.findElement(By.id("dragbox"));
		((RemoteWebDriver) js).executeScript("arguments[0].setAttribute('style','position: relative; left: 30px; top: -71px;')", dragbox);
		driver.findElement(By.linkText("Proceed")).click();
		
	}
	public void popUpWindow()
	{
		driver.findElement(By.linkText("Launch Popup Window")).click();

		String parentwindow = driver.getWindowHandle();
		String subWindow = null;
		Set<String> windows = driver.getWindowHandles();
		Iterator itr = windows.iterator();
		while (itr.hasNext()) {
			subWindow = (String) itr.next();
		}
		driver.switchTo().window(subWindow);
	driver.findElement(By.id("name")).sendKeys("Bhumika");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.linkText("Proceed")).click();
		
	}
	public void addCookie()
	{
		driver.findElement(By.linkText("Generate Token")).click();
		String token_Text=driver.findElement(By.id("token")).getText();
		String token= token_Text.substring(token_Text.indexOf(":")+2);
		Cookie cookie= new Cookie("Token",token);
		driver.manage().addCookie(cookie);
		driver.findElement(By.linkText("Proceed")).click();
	}
		
	}

