package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to find the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//size
		int size = allLinks.size();
		System.out.println(size);
		//retreive a single links
		
		WebElement name = allLinks.get(5);
		String text = name.getText();
		System.out.println(text);
		
		//foreachloop
		//for(datatype iterator :oldvaraible)
		//empty list
		List<String> list=new ArrayList<String>();
		for (WebElement each : allLinks) {
				String text2 = each.getText();
				//System.out.println(text2);
				list.add(text2);	
				
		}
		System.out.println(list);
	}

}