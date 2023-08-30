package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A16_Salesforce {

	@Test
	public void salesforceAccountCreation() {
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
		WebElement salesMenu = driver.findElement(By.xpath("//span/p[text()='Sales']"));
		salesMenu.click();

		WebElement accounts = driver.findElement(By.xpath("//a/span[text() = 'Accounts']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", accounts);

		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestData");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.close();
	}

}
