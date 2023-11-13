package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D {
@Test(dataProvider = "f")
public void r(String broswer)
{
	if(broswer.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com//");
	}
	else if(broswer.equalsIgnoreCase("firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com//");
		
	}
	
}
@DataProvider
public Object[] f() {
	
	Object[] o=new Object[2];
	
	o[0]="chrome";
	o[1]="firefox";
	
	return o;
	
	
}
}
