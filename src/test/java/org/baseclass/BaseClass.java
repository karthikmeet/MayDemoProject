package org.baseclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	
	@BeforeClass
	public static void browserLaunch()
	{
		System.out.println("BeforeClass annotation");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		reporter = new ExtentHtmlReporter("./NewReport.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@After
	public void after()
	{
		extent.flush();
	}
	
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("AfterClass annotation");
	}
}