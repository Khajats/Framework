package com.kts.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kts.driver.Driver;

public class BaseTest {

	protected BaseTest() {}
	
	
	@BeforeMethod
	public void setup() {
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
	
}
