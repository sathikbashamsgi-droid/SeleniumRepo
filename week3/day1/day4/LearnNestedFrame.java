package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	/**
	 * 
	 * No such frame exception
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//outerframe
		WebElement nestFrame = driver.findElement(By.xpath("//h5 [contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nestFrame);
		//inner frame
		driver.switchTo().frame(0);
		//webelement
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();//comes out of all the frames and switch back to the main page
		driver.switchTo().parentFrame();//switch back to the immediate frame
	}

}