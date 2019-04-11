package com.AutomationTests.demoProject;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.out.println("["+System.getProperty("user.dir")+"]");

	}
	
	@AfterMethod
	public void closeDriver() {
		System.out.println("closeDriver");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
		
	}
	@Test
	public void Test3() {
		System.out.println("Test3");
	}

}
