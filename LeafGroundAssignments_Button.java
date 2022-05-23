package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://www.leafground.com/pages/Button.html
		 WebDriverManager.chromedriver().setup();
			
		 ChromeDriver driver=new ChromeDriver();
		 //Launch the Url
		 driver.get("http://www.leafground.com/pages/Button.html");
		 //maximize the browser
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //home page navigate
		 driver.findElement(By.id("home")).click();
		 driver.navigate().back();
		 //get position
		 System.out.println(driver.findElement(By.id("position")).getLocation());
		  
		 //get color
		 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		 
		 //get Size
		 System.out.println(driver.findElement(By.id("size")).getSize());
		  driver.close();
	}

}
