package com.extentreport;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsaMap {
	@Test
	public void california() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		driver.switchTo().frame(driver.findElement(By.id("map-svg")));
//		WebElement element = driver.findElement(By.cssSelector("[id=\"new-york\"]"));
//		executor.executeScript("arguments[0].scrollIntoView();", element);
//		element.click();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"regions\"]/child::*"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getAttribute("id"));

		}

	}

}
