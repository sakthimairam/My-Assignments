package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Find your account and log in")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Forgotten Password | Can't Log In | Facebook");
		
				
	}

}
