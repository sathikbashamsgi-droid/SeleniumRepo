package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggabl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//frame
		driver.switchTo().frame(0);
		//locate element
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(drag, 50, 70).perform();
		

	}

}