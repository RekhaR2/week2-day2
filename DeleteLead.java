package week2.day2.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {

//	http://leaftaps.com/opentaps/control/main 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
//	Delete Lead:
//	1	Launch the browser
		driver.manage().window().maximize();
//	2	Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
//	3	Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
//	4	Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
//	5	Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
//	6	Click Leads link
		driver.findElement(By.partialLinkText("Leads")).click();
//	7	Click Find leads
		driver.findElement(By.partialLinkText("Find Leads")).click();
//	8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//	9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("94567");
//	10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
//	11	Capture lead ID of First Resulting lead
		String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
//	12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//	13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
//	14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//	15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
//	16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(text.equals("No records to display"))
			System.out.println("Lead Deleted Successfully");
		else
			System.out.println("Lead Not deleted");
//	18	Close the browser (Do not log out)
		driver.close();

	}
}
