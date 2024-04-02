package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccount {

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
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Hari3");
		WebElement ele1 = driver.findElement(By.name("industryEnumId"));
		Select dd1=new Select(ele1);
		dd1.selectByIndex(2);
		WebElement ele2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd2=new Select(ele2);
		dd2.selectByVisibleText("S-Corporation");
		WebElement ele3 = driver.findElement(By.name("dataSourceId"));
		Select dd3=new Select(ele3);
		dd3.selectByValue("LEAD_EMPLOYEE");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement ele4 = driver.findElement(By.name("marketingCampaignId"));
		Select dd4=new Select(ele4);
		dd4.selectByIndex(5);
		WebElement ele5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5 = new Select(ele5);
		dd5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		String Name=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		String[] Name1=Name.split(" ");
		System.out.println(Name1[0]);
		Assert.assertEquals(Name1[0], "Hari3");
		driver.close();
		
		
	}

}
