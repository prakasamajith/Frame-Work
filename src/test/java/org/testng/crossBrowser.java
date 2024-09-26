package org.testng;

import org.apache.poi.ss.formula.atp.Switch;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser extends BaseClass {
	
	@Test
	@Parameters("browserName")
	public void multipleBrowsers(String browserName) {
		
		switch(browserName){
		case "chrome":
		System.out.println("Chrome");
		chromeBrowserLaunch();
		break;
		
		case"firefox":
		System.out.println("Firefox");
		firefoxBrowserLaunch();
		break;
		
		case "edge":
		System.out.println("Edge");
		edgeBrowserLaunch();
		break;	
		
		default:
		break;
		}
		
	}
	
	@Test
	public void url() {

		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
	}

}
