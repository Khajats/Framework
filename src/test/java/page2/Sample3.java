package page2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {

	@BeforeClass
	public void init() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("before method");

	}

	@Test
	public void test1() {

		System.out.println("test 1");

	}

	@Test
	public void test2() {

		System.out.println("test 2");

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("after method");
	}

	@AfterClass
	public void down() {
		System.out.println("after class");
	}
}
