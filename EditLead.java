package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rek");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-companyName']//a")).getText();
		System.out.println("Company Name = " + name);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is "+ title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("xyz private ltd");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		if(name.equals(By.xpath("//span[@id='viewLead_companyName_sp']")))
				{
					System.out.println("Company name not updated");
				}
		else
		{
			System.out.println("Company name updated");
		}
		
	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
*/
}


}
