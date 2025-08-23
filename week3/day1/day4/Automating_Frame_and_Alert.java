package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_Frame_and_Alert {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//handle alert
		//Alert alert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		String text =driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(text);
		//Add an implicit wait to ensure the webpage elements are fully loaded
	
	}

}
