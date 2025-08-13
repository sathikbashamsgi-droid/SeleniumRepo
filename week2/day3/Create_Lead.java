package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Lead {

	public static void main(String[] args) {
		// Open Chrome browser in guest mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link
		driver.findElement(By.partialLinkText("SFA")).click();
		//Click on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathik");
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("demo");
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("demo");
		//Click the "Create Lead" button
		driver.findElement(By.name("submitButton")).click();
		//Print theTitle
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window.
		driver.close();


		
		
		

	}

}
