package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_registration {

	public static void main(String[] args) {
		  // Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		// Add an implicit wait to ensure the web page elements are fully loaded
		

		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("sathik basha");
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("S");
		//Enter the Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("Sathikb@gmail.com");
		//Enter the New password
		driver.findElement(By.id("password_step_input")).sendKeys("happy@123");
		//Handle all three dropdowns in Date of birth
		WebElement element = driver.findElement(By.id("day"));
		element.click();
		Select day = new Select(element);
		day.selectByValue("28");
		
		WebElement ele = driver.findElement(By.name("birthday_month"));
		ele.click();
		Select month = new Select(ele);
		month.selectByVisibleText("Nov");
		
		WebElement el = driver.findElement(By.name("birthday_year"));
		el.click();
		Select year = new Select(el);
		year.selectByValue("2024");
		//Select the radio button in Gender
		driver.findElement(By.xpath("//input[@value='2']/parent::label")).click();
		
		





	}

}
