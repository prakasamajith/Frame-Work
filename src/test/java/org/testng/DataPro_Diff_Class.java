package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataPro_Diff_Class extends BaseClass {

	@Test(dataProvider = "fbdata",dataProviderClass = All_Sample_Codes.class)
	public void fbLogin(String userName, String Password) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, userName);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, Password);
		
	}
}
