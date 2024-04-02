package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//label[text()='Chrome']/preceding::div[1])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Chennai']/preceding::div[1])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//label[text()='Safari']/preceding::div[1])[2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("(//label[text()='Firefox']/preceding::div[1])[2]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("(//label[text()='Chrome']/preceding::div[1])[1]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//label[text()='Edge']/preceding::div[1])[2]")).isSelected());
		
		
		
	}

}
