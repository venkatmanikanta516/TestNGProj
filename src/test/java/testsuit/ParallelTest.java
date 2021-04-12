package testsuit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	WebDriver driver1;
	 
	 
	@Test
	public void ChromeTest()  
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //For Chrome
	//	System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");//for firefox Browser
		  driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage(). timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	 
	}
	
	@Test
	public void FireFoxTest() 
	{
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //For Chrome
	 	System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");//for firefox Browser
		  driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage(). timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	 
	}

}
