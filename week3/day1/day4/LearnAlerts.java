package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	/**
	 * 1)No alert present exception
	 * 2)Unhandled alertS
	 * 
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//switch the driver focus to alert box
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//alert.accept();
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		 //driver.switchTo().alert();
		alert.dismiss();
		//prompt alerts
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("saranya");
		alert.accept();
		//sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		

	}

}