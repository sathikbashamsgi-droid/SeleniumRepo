package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		/**
		 * -to handle the keyboard and mouse events,in selenium we have a class called Actions.
		 * -need to instantiate the action class and pass the driver as an argument
		 */
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		//instantiate actions
		Actions act=new Actions(driver);
		act.moveToElement(prime).perform();//mandotory mthd

	}

}