package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eRail_WebTable {

	public static void main(String[] args) {
		 // Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("https://erail.in/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter "MAS" as the "From" station
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("txtStationFrom"));
		source.clear();
		source.sendKeys("MAS");
		WebElement enter = driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']"));
		act.moveToElement(enter).perform();
		enter.click();
		
		
		// Enter "MDU" as the "To" station
		WebElement Distination = driver.findElement(By.id("txtStationTo"));
		Distination.clear();
		Distination.sendKeys("MDU");
		WebElement enter2 = driver.findElement(By.xpath("//div[text()='Madurai Jn']"));
		act.moveToElement(enter2).perform();
		enter2.click();
		
		// Uncheck the "Sort on Date" checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		// Retrieve the train names from the web table
		List<WebElement> train = driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'])/tbody/tr/td[2]/a"));
		List<String> List = new ArrayList<String>();
		for (WebElement name : train) {
			System.out.println("From MAS to MDU Trains are : "+name.getText()+"-->");
			List.add(name.getText());
			
		}
			
		// Verify if there are any duplicate train names in the web table
		
		for (int i = 0; i < List.size(); i++) {
			for (int j = i+1; j < List.size(); j++) {
				if (List.get(i).equals(List.get(j))) {
					System.out.println("Duplicate numbers are"+ List.get(j));
				} 
				
				}
			}
		
			System.out.println("-------No Duplicate Train names");
			
		}
		
	}


