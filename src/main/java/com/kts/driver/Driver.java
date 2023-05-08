package com.kts.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {
	
	private Driver() {};
	

	
	public static void initDriver() {
		if(Objects.isNull(DriverManager.getDriver())) {
		WebDriver driver = new ChromeDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get("https://demo.opencart.com/");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
		DriverManager.getDriver().quit();
		DriverManager.unload();
		}
	}

}
