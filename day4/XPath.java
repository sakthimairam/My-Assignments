package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}

}
