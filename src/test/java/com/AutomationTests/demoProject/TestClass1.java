package com.AutomationTests.demoProject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.out.println("["+System.getProperty("user.dir")+"]");
//		System.setProperty("webdriver.chrome.driver","/Users/harishsindel/eclipse-workspace/demoProject/‎⁨‎⁨drivers/chromedriver");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.safari.driver","‎⁨‎⁨drivers/safaridriver");
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test1 title: "+driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test2 title: "+driver.getTitle());
		
	}
	@Test
	public void Test3() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.println("Test3 title: "+driver.getTitle());
	}

}
