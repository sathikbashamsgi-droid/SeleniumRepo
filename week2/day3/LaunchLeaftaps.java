package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchLeaftaps {

	public static void main(String[] args) {
		
          ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver1=new EdgeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver1.get("https://www.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		//title 
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
