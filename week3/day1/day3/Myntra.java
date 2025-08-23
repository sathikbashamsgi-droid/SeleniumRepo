package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		         // launch browser
				ChromeDriver driver=new ChromeDriver();
				
				// open URL
				driver.get("https://www.myntra.com/");
				
				//maximize the window 
				driver.manage().window().maximize();
				
				// Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				// In the search box, type as "bags" and press enter
				driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
				
			    // To the left of the screen under "Gender" click on "Men"
				driver.findElement(By.xpath("//input[@type='radio']/parent::label")).click();
				
				// Under "Category" click "Laptop bags"
				driver.findElement(By.xpath("(//input[@value='Laptop Bag']/parent::label)[1]")).click();
				
				// Print the count of the items found.
				List<WebElement> item = driver.findElements(By.xpath("//h4[@class='product-product']"));
				
				List<WebElement> bagname = driver.findElements(By.xpath("//h3[@class='product-brand']"));
				int size = item.size();
				System.out.println(size);
				
				WebElement ele = item.get(3);
				String brand = ele.getText();
				System.out.println(brand);
				
				WebElement el = bagname.get(5);
				String bag = el.getText();
				System.out.println(bag);
				
				//Get the list of brand of the products displayed in the page and print the list
				List<String> list=new ArrayList<String>();
				for (WebElement each : item) {
						String nameofproduct = each.getText();
						
						list.add(nameofproduct);	
				}
		            System.out.println(list);
		    
		    //  Get the list of names of the bags and print it
		      List<String> product=new ArrayList<String>();
			       for (WebElement each : bagname) {
					String productname1= each.getText();
					
					product.add(productname1);	
			}
		             System.out.println(product);
		    
			}

		}