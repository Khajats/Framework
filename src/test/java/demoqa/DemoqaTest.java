package demoqa;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoqaTest {
	
	//@Test
	public void test1() throws InterruptedException {
		String address = "type-6/773 rtps colony";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//div[@class=\"header-text\" and text()='Elements']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-250)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("naresh");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("naresh@gmail.com");
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys(address);
		driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys(address);
		driver.findElement(By.xpath("//div[@id=\"submit\"]")).click();
		driver.quit();
	}
	
	//@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("macbook",Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class='s-item__title']//span[contains(text(),'Apple Macbook Pro 13\" Laptop | U')]")).getText();
		assertEquals(text.contains("Macbook"),true);	
	}
	@Test
	public void test3() {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.worldometers.info/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//span[@class=\"counter-number\"]/span[@rel='current_population']"));
		for (int i = 0; i <=10; i++) {
			System.out.println(element.getText());
		}
	}

}
