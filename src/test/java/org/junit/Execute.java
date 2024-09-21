package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Execute {
	@Test
	public void m5() {

		Result res = JUnitCore.runClasses(Sample.class, Demo.class);
		System.out.println("Run Count:"+res.getRunCount());
		System.out.println("Failure Count:"+res.getFailureCount());
		System.out.println("Ignore Count:"+res.getIgnoreCount());
		int passCount = res.getRunCount()-res.getFailureCount();
		System.out.println("Pass Count:"+passCount);
		System.out.println("Run time in ms:"+res.getRunTime());
		List<Failure> failures = res.getFailures();
		for (Failure d : failures) {
			System.out.println(d);
		}
		boolean b = res.wasSuccessful();
		System.out.println(b);
	}

}
