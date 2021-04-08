package testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		try{
		int i=9/0;
	}
		catch(ArithmeticException e)
		{
			System.out.println("invalid syntax");
			int i=9/1;
		
		
		System.out.println(i);
		}
		}

	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("login test");
	}
	
	/*@Test
	public void searchTest(){
		System.out.println("login test");
	}*/
	
}

