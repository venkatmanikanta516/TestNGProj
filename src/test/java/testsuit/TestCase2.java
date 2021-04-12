package testsuit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	@BeforeTest
	public void beforetest()
	{
	 
	 System.out.println("Before Test");
		
	}
	@BeforeMethod
	public void beforemethod()
	{
	 
	 System.out.println("Inside Before Method");
		
	}
	
	 @Test
		public void test3()
		{
		 
		 System.out.println("Inside Test3");
			
		}
	 
	  
	 
	 @Test
		public void test4()
		{
		 
		 System.out.println("Inside Test4");
			
		}
	 
	 @AfterMethod
	 public void afteremethod()
		{
		 
		 System.out.println("Inside After Method");
			
		}

	 
	 @AfterTest
		public void aftertest()
		{
		 
		 System.out.println("After Test");
			
		}
}
