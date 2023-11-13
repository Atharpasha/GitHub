package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking {

	@Test
	public void r() throws InterruptedException
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.booking.com/");
	Thread.sleep(2000);
	while (true) 
	{
	try{
		driver.findElement(By.xpath("//input[@name='ss']")).click();
		break;
	}
	catch(Exception e)
	{
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
	}
	}
	
    JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200);", "");
	driver.findElement(By.xpath("(//div[.='Bangalore'])[1]")).click();
	driver.findElement(By.xpath("//span[@aria-label='11 November 2023']")).click();

	driver.findElement(By.xpath("//span[@aria-label='12 November 2023']")).click();	
    driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
	driver.findElement(By.xpath("(//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a'])[2]")).click();
	
	driver.findElement(By.xpath("//select[@name='age']")).click();
	
	driver.findElement(By.xpath("//option[.='5 years old']")).click();
	
	driver.findElement(By.xpath("//span[.='Done']")).click();
	
	driver.findElement(By.xpath("//span[.='Search']")).click();
	}
	
	
	@Test
	public void r1() 
	{
		Integer a=100;
		Integer b=200;
		if(a.equals(b))
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}
	
	@Test
	public void r11() 
	{
		String s1=new String("king");
		String s2="king";
		String s3="king";
		StringBuffer s=new StringBuffer("king");
		StringBuffer ss=new StringBuffer("king");
		ss.append("gg");
		//System.out.println(s4==s);
		System.out.println(s);
		
	}
}
