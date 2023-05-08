package page1;

import org.testng.annotations.Test;

public class RegisterTest {

	@Test(groups = {"sanity"})
	public void registerWithValidCredential() {
		System.out.println("register with valid cradential--sanity" +Thread.currentThread().getId());
	
	}

	@Test(groups = {"smoke"})
	public void registerWithInvalidCradential() {
		System.out.println("register with invalid credential--smoke" +Thread.currentThread().getId());
	}

	@Test(groups = {"regression"})
	public void registerWithOutAnyCredential() {
		System.out.println("register with out any credential-- regression "+Thread.currentThread().getId());
	}
	
	@Test(groups = {"smoke"})
	public void registerWithAOutAnyCredential() {
		System.out.println("register with out any a credential-- smoke "+Thread.currentThread().getId());
	}
	

}
