package com.RohitTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.testdome.com/tests/java-selenium-online-test/209/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test
	public void testApplication1() throws InterruptedException {
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div[1]/section[2]/div[1]/div/div/div[3]/div/a"));
		Thread.sleep(1000);
		element1.click();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
