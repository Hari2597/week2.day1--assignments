package week2.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

public class createlead {
public static void main(String[] args) {
	WebDriverManager.chromedriver();
	ChromeDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("CRM/SFA")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FLORANCE FACTORY");
    driver.findElement(By.id("createLeadForm_dataSourceId")).click();
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hari");
    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ganesh");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hariganesh");
    driver.findElement(By.name("departmentName")).sendKeys("revenue");
	driver.findElement(By.name("description")).sendKeys("salaryincrement");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rambo123@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
	
}
}

