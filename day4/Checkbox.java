package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
				
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]")).isEnabled());
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).isEnabled());
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding-sibling::div[1]")).click();
        driver.findElement(By.xpath("//label[text()='Javascript']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Others']/preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//div[@class='card'][4]//div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div[1]")).isEnabled());
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		//driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Paris");
		//driver.findElement(By.xpath("//ul[@role='group']/li[3]")).click()
        driver.findElement(By.xpath("//input[@value='Miami']")).click();
		//driver.findElement(By.xpath("ui-chkbox-box ui-widget ui-corner-all ui-state-default")).click();
		
		
		
		
		
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active']")).click();
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
	}


}
