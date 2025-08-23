package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("mce_0_ifr");
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);
		
		
		// Learn frames
		/**
		 * 
		 * check----1)element location
		 * 	        2)wait statements
		 * 			3)element is present inside the frame
		 */
	
			driver.get("https://www.leafground.com/frame.xhtml");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//switch to frame
			driver.switchTo().frame(0);//index starts from 0
			//click
			driver.findElement(By.id("Click")).click();
			
		}
	

}