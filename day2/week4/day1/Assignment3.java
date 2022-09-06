package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='ui-panelmenu-panel'])[3]/h3")).click();
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='ui-menuitem-link ui-corner-all'])[20]"));
		Actions act =new Actions(driver);
		act.moveToElement(findElement).contextClick().perform();
		
		driver.findElement(By.xpath("(//a[@class='ui-menuitem-link ui-submenu-link ui-corner-all'])[8]")).click();
		 WebElement findElement2 = driver.findElement(By.xpath("//div[@class='ui-slidemenu-backward ui-widget-header ui-corner-all ui-helper-clearfix']"));
		act.contextClick(findElement2).perform();
		
		
		
		
	}

}
