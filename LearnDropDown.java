package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		WebElement srcdd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(srcdd1);
		dd.selectByVisibleText("Employee");
		WebElement inddd1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd1 = new Select(inddd1);	
		dd1.selectByValue("IND_FINANCE");
		WebElement owndd1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd2 = new Select(owndd1);
		dd2.selectByIndex(2);
		
		
		
	}

}
