package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrol {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on men
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(menFashion).perform();
		//to freeze the dom:setTimeout(function(){debugger},5000)
		driver.findElement(By.xpath("//span[text()='Sandals & Floaters']")).click();
		//scroll
		WebElement scroll = driver.findElement(By.xpath("//a[text()='About Us']"));
		act.scrollToElement(scroll).perform();
	}

}