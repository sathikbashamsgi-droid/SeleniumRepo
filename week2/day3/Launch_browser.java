package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
		// create an object
		ChromeDriver driver =new ChromeDriver();
		//open Chrome browser
		driver.get(" https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//close thw window
		driver.quit();
	}

}
