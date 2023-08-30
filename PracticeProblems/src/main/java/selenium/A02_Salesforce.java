package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A17_Salesforce {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("input.username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();

		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dashboard);
		dashboard.click();
		
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("TestData");
		driver.findElement(By.id("submitBtn")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.close(); 

	}
	
}