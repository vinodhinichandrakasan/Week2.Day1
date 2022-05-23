package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 //Launch the Url
		 driver.get("http://www.leafground.com/pages/Dropdown.html");
		 //maximize the browser
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //select dropdown using index
		 WebElement drop1 = driver.findElement(By.id("dropdown1"));
		 Select index=new Select(drop1);
		 index.selectByIndex(2);
		 //select drop-down using text
		 WebElement drop2 = driver.findElement(By.name("dropdown2"));
		 Select program=new Select(drop2);
		 program.selectByVisibleText("Selenium");
		 //select drop-down using value
		 WebElement drop3 = driver.findElement(By.id("dropdown3"));
		 Select training=new Select(drop3);
		 training.selectByValue("1");
		 //count of options in dropdown
		 List<WebElement> ele1 = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		 System.out.println(ele1.size());
		 driver.close();
		 
		
		 
		 
	}

}
