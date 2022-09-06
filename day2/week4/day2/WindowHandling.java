package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		List<String> str=new ArrayList<String>(windowHandles);
		System.out.println(str);
		driver.switchTo().window(str.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}
	
	
}
