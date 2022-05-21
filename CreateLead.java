package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dedalus");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.name("description")).sendKeys("Create Lead");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinodhinichandrakasan@gmail.com");
		 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
			/*
			 * WebElement dropdown =
			 * driver.findElement(By.id("createLeadForm_dataSourceId")); Select obj=new
			 * Select(dropdown); obj.selectByValue("LEAD_CONFERENCE"); driver.close();
			 */		 
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 driver.close();
	}

}
