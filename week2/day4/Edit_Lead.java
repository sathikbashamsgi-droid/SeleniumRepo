package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

	public static void main(String[] args) {
		// 
				ChromeOptions options = new ChromeOptions();
				options.addArguments("guest");
				//Initialize the WebDriver (ChromeDriver).
				ChromeDriver driver=new ChromeDriver(options);
				//Load the URL 
				driver.get("http://leaftaps.com/opentaps/");
				//Maximize the browser window
				driver.manage().window().maximize();
				//Enter the Username as "DemoSalesManager" and the Password as "crmsfa"
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on the Login Button.
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on the CRM/SFA Link
				driver.findElement(By.partialLinkText("SFA")).click();
				//Click on the Leads Button
				driver.findElement(By.partialLinkText("Leads" )).click();
				//Click on Create Lead
				driver.findElement(By.partialLinkText("Create" )).click();
				//Enter the CompanyName Field Using Xpath
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("xyz");
				//Enter the FirstName Field Using Xpath
		        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sathik");
		        //Enter the LastName Field Using Xpath
		        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("s");
		        //Enter the FirstName (Local) Field Using Xpath
		        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Basha");
		        //Enter the Department Field Using any Locator of Your Choice
		        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automation");
		       //Enter the Description Field Using any Locator of your choice
		       driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation testing");
		       //Enter your email in the E-mail address Field using the locator of your choice
		       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("basha@gmail.com");
		       //Select State/Province as NewYork Using Visible Text
		        WebElement ele =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		                    ele.click();
		        Select state = new Select(ele);
		        state.selectByVisibleText("New York");
		       //Click on the Create Button
		        driver.findElement(By.className("smallSubmit")).click();
		      //Click on the edit button
		       driver.findElement(By.linkText("Edit")).click();
		      //Clear the Description Field
		       WebElement el=driver.findElement(By.id("updateLeadForm_description"));
		       el.clear();
		      //Fill the Important Note Field with Any text
		       el.sendKeys("Testing");
		      //Click on the update button
		       driver.findElement(By.className("smallSubmit")).click();
		      //Get the Title of the Resulting Page
		       String title=driver.getTitle();
		       System.out.println(title);
		     //Close the browser window
		      driver.close();

	}

}

