package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/**
		 * steps to interact with thewebelement:
		 * 1)locate the element(from the dom)
		 * 2)Sendkeys--->pass the values
		 * 3)click()--->clickable actions
		 */

			ChromeDriver driver=new ChromeDriver();
			
			//load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//maximize the window
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			//enter the password
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//click on login
			driver.findElement(By.className("decorativeSubmit")).click();
			//click crmsfa
			driver.findElement(By.partialLinkText("SFA")).click();

		}

	}