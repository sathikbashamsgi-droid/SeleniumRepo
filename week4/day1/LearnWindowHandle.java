package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the address of the current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//1F0F05B7B53175A3E3C77E3EC3258141,409693B8B93915A1BBB63B7229A39C22
		//title
		String title = driver.getTitle();
		System.out.println(title);
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get all the windows
		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow=new ArrayList<String>(childWindow );
		
		  //switch 
		driver.switchTo().window(listWindow.get(1));
		//retreive the address
		  String chAddress = driver.getWindowHandle(); 
		  System.out.println(chAddress);
		  System.out.println(driver.getTitle());
		  //driver.close();//close the current tab
		  //driver.switchTo().window(listWindow.get(1));//no such window exception
		  driver.quit();//close all the tabs which is opened
		 
		/*
		 * for (int i = 0; i < listWindow.size(); i++) { String window =
		 * listWindow.get(i); driver.switchTo().window(window);
		 * System.out.println(driver.getTitle());
		 * 
		 * }
		 */
		
	}

}