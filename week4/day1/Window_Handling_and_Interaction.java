package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling_and_Interaction {

	public static void main(String[] args) {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("https://www.irctc.co.in/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// handle the alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		// Load the IRCTC webpage and click on the "FLIGHTS" link
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		// get the address of parent window 
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		System.out.println(driver.getTitle());
		
		// Capture the title of the new window that opens (flights window - AirTicket)
		Set<String> newwindow = driver.getWindowHandles();
		List<String> change = new ArrayList<String>(newwindow);
		driver.switchTo().window(change.get(1));
		String current = driver.getWindowHandle();
		System.out.println(current);
		System.out.println(driver.getTitle());
		
		// Close the parent tab (Train ticket booking) alone
		 driver.switchTo().window(change.get(0));
		 driver.close();

	}

}
