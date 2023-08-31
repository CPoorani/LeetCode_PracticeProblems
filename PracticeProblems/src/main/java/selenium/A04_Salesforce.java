package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_Salesforce {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input.username")).sendKeys("pooranimenon5@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Totest@123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Learn More')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String childWindow = driver.getTitle();
		System.out.println("Child Window Title : " +childWindow);
		driver.close();
		
		driver.switchTo().window(list.get(0));
		String parentWindow = driver.getTitle();
		System.out.println("Parent Window Title : " +parentWindow);
		driver.close(); 
	}
}
