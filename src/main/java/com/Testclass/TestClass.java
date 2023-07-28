package com.Testclass;

import com.initiate.BrowserInitiateThings;

public class TestClass {
	@BeforClass
	public void setup() {
		BrowserInitiateThings.initialize();
	}
	@Test
	public void verifyTitle() {
		String title=BrowserInitiateThings.driver.getTitle();
		System.out.println("titlw of the page"+title);
		Assert.asserteuqles("actual","title");
	}
	public void teardown() {
		BrowserInitiateThings.closing();
		
	}

}
