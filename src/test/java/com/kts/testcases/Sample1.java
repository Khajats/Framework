package com.kts.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.kts.driver.DriverManager;

public final class Sample1 extends BaseTest {
	
	private Sample1() {}
	
	
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
