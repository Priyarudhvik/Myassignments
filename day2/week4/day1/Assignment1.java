package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("src")).sendKeys("Madivala Bangalore",Keys.ENTER);
		 driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai",Keys.ENTER);
		 driver.findElement(By.id("onward_cal")).click();
		 driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[5]")).click();
		 driver.findElement(By.id("search_btn")).click();
		 String title = driver.getTitle();
		 System.out.println("the title of the page is:"+title);
		 
		 
		
	}

}
