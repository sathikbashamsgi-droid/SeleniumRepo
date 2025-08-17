package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Create_Leaftaps_Account {

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
				 //Select "ComputerSoftware" as the industry
				 WebElement ele = driver.findElement(By.name("industryEnumId"));
				 ele.click();
				 Select industry = new Select(ele);
				 industry.selectByValue("IND_SOFTWARE");
				 //Select "S-Corporation" as ownership using SelectByVisibleText
				 WebElement element = driver.findElement(By.name("ownershipEnumId"));
				 element.click();
				 Select ownership = new Select(element);
				 ownership.selectByVisibleText("S-Corporation");
				 //Select "Employee" as the source using SelectByValue
				 WebElement el = driver.findElement(By.name("dataSourceId"));
				 el.click();
				 Select source = new Select(el);
				 source.selectByValue("LEAD_EMPLOYEE");
				 //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
				 WebElement webe = driver.findElement(By.name("marketingCampaignId"));
				 webe.click();
				 Select campaign = new Select(webe);
				 campaign.selectByIndex(6);
				 //Select "Texas" as the state/province using SelectByValue
				 WebElement webele = driver.findElement(By.name("generalStateProvinceGeoId"));
				 webele.click();
				 Select state = new Select(webele);
				 state.selectByValue("TX");
				 //Click the "Create Account" button
				  driver.findElement(By.className("smallSubmit")).click();
				//Verify that the account name is displayed correctly.
				  String title = driver.getTitle(); System.out.println(title);
				//Close the browser window
				 driver.close();
	}

}
