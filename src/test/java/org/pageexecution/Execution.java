package org.pageexecution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginPageExe.class,
	LoginPageExe2.class,
})
public class Execution {
	public static void main(String[] args) {

		Result results = JUnitCore.runClasses(LoginPageExe.class, LoginPageExe2.class);
		
		//To get the test case failure count
		int failuresCount = results.getFailureCount();
		System.out.println(failuresCount);
		
		// To get the execution time or run time
		long runTime = results.getRunTime();
		System.out.println(runTime);
	}
}
