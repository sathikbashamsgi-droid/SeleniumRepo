package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Interface {
	
	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//search phones
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		/*
		 * element.sendKeys("phones"); element.click();
		 */
	 List<WebElement> findElements = driver.findElements(By.xpath("//span[@Class='a-price-whole']"));
	 
		/*
		 * List<Integer> list=new ArrayList<Integer>(); for (WebElement each :
		 * findElements) { String text = each.getText(); String replaceAll =
		 * text.replaceAll(",", ""); if (!replaceAll.isEmpty()) { int mobile =
		 * Integer.parseInt(replaceAll); list.add(mobile); }
		 * 
		 * 
		 * } //sort the list Collections.sort(list); //print the list
		 * System.out.println(list);
		 */
	}

}
