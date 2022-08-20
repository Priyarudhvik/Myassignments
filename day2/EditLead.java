package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item'][2]//input")).sendKeys("Divya");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='10034']")).click();
	String title =driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("XYZ LTD");
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
}
}
