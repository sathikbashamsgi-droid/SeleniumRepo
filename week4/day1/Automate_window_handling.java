package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automate_window_handling {

	public static void main(String[] args) throws InterruptedException {
		 // Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter the username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		// Click on the Login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		// Click on the CRM/SFA link
		 driver.findElement(By.partialLinkText("SFA")).click();
		 
		// Click on the Contacts button
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
		// Click on Merge Contacts
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 
		// Click on the widget of the "From Contact"
		 driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		 
		// Click on the first resulting contact
		 Set<String> window = driver.getWindowHandles();
		 List<String> current = new ArrayList<String>(window);
		 driver.switchTo().window(current.get(1));
		 driver.findElement(By.xpath("//a[text()='13864']")).click();
		 
		// Click on the widget of the "To Contact"
		 driver.switchTo().window(current.get(0));
		 Thread.sleep(3000);
		WebElement con =  driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]"));
		 driver.executeScript("arguments[0].click();",con);
		
		// Click on the second resulting contact
		 Set<String> newwindow = driver.getWindowHandles();
		 List<String> win = new ArrayList<String>(newwindow);
		 driver.switchTo().window(win.get(1));
		 driver.findElement(By.xpath("//a[text()='13864']")).click();
		 driver.switchTo().window(current.get(0));
		 
		// Click on the Merge button
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		// Accept the alert
		Alert alert =  driver.switchTo().alert();
		System.out.println("accept the alert:"+alert.getText());
		alert.accept();
		 
		// Verify the title of the page
		String title = driver.getTitle();
		System.out.println("Page title is:"+title);
	}


}
