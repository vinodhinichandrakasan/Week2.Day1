package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment_Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//http://www.leafground.com/pages/Edit.html
		
		 WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 //Launch the Url
		 driver.get("http://www.leafground.com/pages/Edit.html");
		 //maximize the browser
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //enter email address
		 driver.findElement(By.id("email")).sendKeys("vinodhinichandrakasan@gmail.com");
		 //APPEND TEXT
		 driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("data");
		 
		 //get default text
		 System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		 
		 //clear the text
		 driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		 
		 //check disable 
		 
		 Boolean value=driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		 System.out.println(value);
		 if(value==false)
		 {
			 System.out.println("field is disabled");
		 }
		 else
		 {
			 System.out.println("field is enabled");
		 }
		 driver.close();
	}

}
