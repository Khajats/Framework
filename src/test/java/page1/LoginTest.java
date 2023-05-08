package page1;

import java.lang.reflect.Method;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	@Parameters("url")
	@Test(groups = {"smoke"},description = "login with invalid credential--sanity")
	public void loginWithValidCredential(@Optional("https://www.flipkart.com") String url,Method m) {
		System.out.println("loginWithValidCredential smoke" +Thread.currentThread().getId());
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
