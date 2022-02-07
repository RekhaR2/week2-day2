package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLocator {

	public static void main(String[] args)throws InterruptedException{
		// 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rek");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9677201040");
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rekha25");
		// Step 11: Handle all the three drop downs
//		WebElement day = driver.findElement(By.id("day"));
//		Select dd = new Select(day);
//		dd.selectByValue("25");
//		WebElement month = driver.findElement(By.id("month"));
//		Select mm = new Select(month);	
//		mm.selectByVisibleText("Jul");
//		WebElement year = driver.findElement(By.id("year"));
//		Select yy = new Select(year);
//		yy.selectByValue("1985");
		
		
		driver.findElement(By.xpath("//select[@id='day']//option[25]")).click();
		driver.findElement(By.xpath("//select[@id='month']//option[7]")).click();
		driver.findElement(By.xpath("//select[@id='year']//option[38]")).click();
//		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		            
	}
	
}
