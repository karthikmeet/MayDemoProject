package org.pageexecution;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pagerepo.LoginPageRepo;

public class LoginPageExe2 extends BaseClass {
	
	LoginPageRepo repo = new LoginPageRepo();
	
	@Test
	public void method4()
	{
		System.out.println("method 4 - @Test");
		BaseClass.type(repo.getUsername(), "Correct Username");
		BaseClass.type(repo.getPassword(), "Correct Password");
	}
	
	@Test
	public void method5()
	{
		System.out.println("method 5 - @Test");
		BaseClass.type(repo.getUsername(), "Incorrect Username");
		BaseClass.type(repo.getPassword(), "Correct Password");
	}
	
	@Test
	public void method6()
	{
		System.out.println("method 6 - @Test");
		BaseClass.type(repo.getUsername(), "Correct Username");
		BaseClass.type(repo.getPassword(), "Incorrect Password");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before annotation");
		driver.get("https://www.facebook.com/");
	}
	
	@After
	public void after()
	{
		System.out.println("After annotation");
	}
}
