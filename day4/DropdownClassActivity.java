package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClassActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(1000);
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("CRM/SFA" )).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test1");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='primaryPhoneAreaCode']")).click();
		driver.findElement(By.xpath("//input[@name='primaryPhoneAreaCode']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@name='primaryPhoneNumber']")).sendKeys("84226260");
		
		WebElement Srcdd = driver.findElement(By.id("createLeadForm_dataSourceId"));		
		Select dd1 = new Select(Srcdd);
		dd1.selectByVisibleText("Employee");
		
		WebElement Mktdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(Mktdd);
		dd2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement Inddd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd3=new Select(Inddd);
		dd3.selectByIndex(4);
	    Thread.sleep(1000);
		//driver.findElement(By.name("submitButton")).click();
	
	}

}
