package org.junit;

import org.openqa.selenium.WebElement;

public class Sample extends JunitBaseClass {

	@BeforeClass
	public static void m1() {
		System.out.println("in Before Class");
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		implicitWait(10);
	}

	@AfterClass
	public static void m2() {
		System.out.println("in After Class");
	}

	@After
	public void m3() {
		System.out.println("in After");
		long endTime = System.currentTimeMillis();
		System.out.println("End Time:" + endTime);
	}

	@Before
	public void m4() {
		System.out.println("in Before");
		long StartTime = System.currentTimeMillis();
		System.out.println("Start Time:" + StartTime);
	}

	@Test
	public void m5() {
		WebElement txtUsername = findLocatorById("email");
		elementSendKeys(txtUsername, "ajithprakasam@gmail.com");
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, "Prakasam@77");
	}
}
