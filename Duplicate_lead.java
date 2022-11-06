package week2.Day1;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.edge.EdgeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Duplicate_lead {
		public static void main(String[] args) {
			
			WebDriverManager.edgedriver().setup();;
			EdgeDriver driver=new EdgeDriver();
			driver.manage().window().minimize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			String title=driver.getTitle();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hari");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ganesh");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rambo@gmail.com");
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium");
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hari");
			driver.findElement(By.name("submitButton")).click();
			System.out.println(driver.getTitle());
			}

	}


