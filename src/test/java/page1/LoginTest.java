package page1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	@Parameters("browser")
	@Test(groups = {"smoke"})
	public void loginWithValidCredential(String browsername) {
		WebDriver driver = null;
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.quit();
	}

	@Test(groups = {"sanity"})
	public void loginWithInvalidCredential() {
		System.out.println("login with invalid credential--sanity" +Thread.currentThread().getId());
	}

	@Test(groups = { "smoke" })
	public void loginWithOutAnyCredential() {
		System.out.println("login with out any credential---smoke" +Thread.currentThread().getId());
	}

}
