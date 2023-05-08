package com.kts.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.kts.driver.DriverManager;

public final class Sample extends BaseTest {
	
	private Sample() {}

	
	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.xpath("//button[text()='✕']")).click();
		DriverManager.getDriver().findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("automation",Keys.ENTER);
		
	}
	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.xpath("//button[text()='✕']")).click();
		DriverManager.getDriver().findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("appium",Keys.ENTER);
		
	}
	
	

}
