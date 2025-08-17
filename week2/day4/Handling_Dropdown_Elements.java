package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown_Elements {

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
				//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click the "Login" button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on the "CRM/SFA" link
				driver.findElement(By.partialLinkText("SFA")).click();
				//Click on the "Leads" tab
				driver.findElement(By.linkText("Leads")).click();
				//driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				//driver.findElement(By.xpath("//a[contains(text().'LEAD')]")).click();
				//Enter a FirstName
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sathik");
				//Enter a LastName
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
				//Enter a CompanyName
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("demo");
				//Enter a Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("demo");
				//Select Employee in the source dropdown (using index)
				WebElement DD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				DD.click();
				Select sel = new Select(DD);
				sel.selectByIndex(4);
				//Select Automobile in the Marketing Campaign (using visibleText)
				WebElement DD1 = driver.findElement(By.name("marketingCampaignId"));
				DD1.click();
				Select se = new Select(DD1);
				se.selectByVisibleText("Automobile");
				//Select Corporation in Ownership (using value)
				WebElement DD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				DD2.click();
				Select sele = new Select(DD2);
				se.selectByValue("OWN_CCORP");
				//Click the "Create Lead" button
				driver.findElement(By.name("submitButton")).click();
				//Print theTitle
				String title = driver.getTitle();
				System.out.println(title);
				// Close the browser window.
				driver.close();


				

	}

}
