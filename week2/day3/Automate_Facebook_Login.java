package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Facebook_Login {

	public static void main(String[] args) {
		// Launch browser
		ChromeDriver driver =new ChromeDriver();
		//load URL
		driver.get(" https://www.facebook.com/");
		//enter email id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//enter password 
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//click rthe login button
		driver.findElement(By.name("login")).click();
		//print the title
		String title = driver.getTitle();
		System.out.println(title);
	}

}
