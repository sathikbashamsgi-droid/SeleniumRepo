package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Account {

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
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("sathikbasha");
		 //Enter a description as "Selenium Automation Tester"
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 //Enter a Number Of Employees
		  driver.findElement(By.id("numberEmployees")).sendKeys("5");
		  //Enter a Site Name as “LeafTaps” 
		  driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		  //Click the "Create Account" button
		  driver.findElement(By.className("smallSubmit")).click();
		//Print theTitle name
		  String title = driver.getTitle(); System.out.println(title);
		//Close the browser window
		driver.close();
		
	}

}
