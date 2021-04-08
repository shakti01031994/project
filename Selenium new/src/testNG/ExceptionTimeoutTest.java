package testNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	@Test(timeOut=2000,expectedExceptions=NumberFormatException.class)
	public void infiniteloop()
	{
		int i=1;
		while(i==1){
			System.out.println(i);
		}
		
	}

}
