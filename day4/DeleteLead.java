package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("84226260");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText());
		String Leadid=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[text()=\"No records to display\"]")).getText();
		driver.close();
		
		
	}
}
