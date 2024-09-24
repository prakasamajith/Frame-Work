package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

	@DataProvider(name = "data")
	public Object[][] testData() {

		Object[][] obj=new Object[2][2];	
		obj[0][0]="aji@gmail.com";
		obj[0][1]="aji@123";
		
		obj[1][0]="arun@gmail.com";
		obj[1][1]="arun@123";
		return obj;
	}
	@Test(dataProvider = "data")
	public void login(String a, String b) {
		System.out.println(a);
		System.out.println(b);		
	}
	
}
