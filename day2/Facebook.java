package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("shanmugapriya");
		driver.findElement(By.name("lastname")).sendKeys("Arumugam");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		WebElement date=driver.findElement(By.id("day"));
		Select day=new Select(date);
		day.selectByIndex(18);
		WebElement mon=driver.findElement(By.id("month"));
		Select month=new Select(mon);
		month.selectByValue("8");
		WebElement yr=driver.findElement(By.id("year"));
		Select year= new Select(yr);
		year.selectByValue("1996");
		driver.findElement(By.name("sex")).click();
		
		

	}

}
