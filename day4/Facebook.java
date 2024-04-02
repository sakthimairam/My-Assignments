package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("SakRaHari");
		driver.findElement(By.name("lastname")).sendKeys("BagRekPuga");
	//	driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("98765432");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("98765432");
		driver.findElement(By.xpath("//input[@name ='reg_passwd__']")).sendKeys("XCV@1234");
	
		WebElement eledate = driver.findElement(By.id("day"));
		Select dd1 = new Select(eledate);
		dd1.selectByIndex(7);
		
		WebElement elemon = driver.findElement(By.id("month"));
		Select dd2 = new Select(elemon);
		dd2.selectByVisibleText("Apr");
		
		WebElement eleyear = driver.findElement(By.id("year"));
		Select dd3 = new Select(eleyear);
		dd3.selectByValue("1982");
		driver.findElement(By.name("sex")).click();
	
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
