package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete_Lead {

	@SuppressWarnings("deprecation")
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
				//Click "Find leads"
				driver.findElement(By.linkText("Find Leads")).click();
				//Click on the "Phone" tab
				driver.findElement(By.linkText("Phone")).click();
				//Enter the phone number
				driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
				driver.findElement(By.name("phoneNumber")).sendKeys("7339205384");
				//Click the "Find leads" button.
				driver.findElement(By.linkText("Find Leads")).click();
				//
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 //Capture the lead ID of the firs resulting lead & Click the first resulting lead 
			      driver.findElement(By.linkText("10029")).click(); 
			      //Click the "Delete" button 
				 driver.findElement(By.linkText("Delete")).click(); 
				 //Click "Find leads" again 
				 driver.findElement(By.linkText("Find Leads")).click();
				  //Enter the captured lead ID
				  driver.findElement(By.name("id")).sendKeys("10029");
				  //Click the "Find leads" button 
				 driver.findElement(By.linkText("Find Leads")).click(); 
				 //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion 
				 WebElement ele = driver.findElement(By.className("x-paging-info")); 
				 String text = ele.getText(); 
				 System.out.println(text); 
				  //Close the browser driver.close();
				    driver.close();
				 


				

				
	}

}
