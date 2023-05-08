package page1;

import org.testng.annotations.Test;

public class SearchTest {
	
	@Test(groups = {"smoke"})
	public void searchValidProduct() {
		System.out.println("sreach valid product--smoke"+Thread.currentThread().getId());
	}
	
	@Test(groups = {"sanity"})
	public void searchInvalidProduct() {
		System.out.println("search invalid product--sanity"+Thread.currentThread().getId());
	}

}
