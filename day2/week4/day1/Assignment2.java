package week4.day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement findElement = driver.findElement(By.xpath("(//span[text()='Name'])[1]"));
	WebElement findElement2 = driver.findElement(By.xpath("(//span[text()='Quantity'])[1]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(findElement, findElement2).perform();
	WebElement findElement5 = driver.findElement(By.xpath("//span[text()='Columns reordered']"));
	System.out.println("toaster message is:"+findElement5.getText());
	Thread.sleep(100);
WebElement findElement3 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[3]"));
WebElement findElement4 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[4]"));
act.dragAndDrop(findElement3, findElement4).perform();
Thread.sleep(100);
WebElement findElement6 = driver.findElement(By.xpath("//span[text()='Row moved']"));
System.out.println("the toaster message is:"+findElement6.getText());
WebElement findElement7 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
act.dragAndDropBy(findElement7, 10, 20).perform();
WebElement findElement8 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
act.dragAndDropBy(findElement8, -10, -20).perform();
WebElement findElement9 = driver.findElement(By.id("form:logo"));
act.scrollToElement(findElement9).perform();






}
}
