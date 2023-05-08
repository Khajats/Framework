package com.extentreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	
	WebDriver driver ;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		
	}
	@Test
	public void test2() {
		
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[@class=\"go_DOp\"]/a//span[text()='Become a Seller']")).click();
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
