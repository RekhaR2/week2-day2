package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
public static void main(String[] args) throws InterruptedException{
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//4. Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// 5. Click on contacts Button
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		// 6. Click on Create Contact
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		// 7. Enter FirstName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Rekha");
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Ramesh");
		// 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Rek");
		//10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Ram");
		//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		//12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Welcome to xpath finder");
		
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("rekha2ramesh@gmail.com");
		//14. Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st1 = new Select(state);
		st1.selectByVisibleText("New York");
		//15. Click on Create Contact
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//16. Click on edit button 
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		//17. Clear the Description Field using .clear
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		//18. Fill ImportantNote Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("hghfhgfhdjghfhg");
		//19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//20. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
	
	}

}


