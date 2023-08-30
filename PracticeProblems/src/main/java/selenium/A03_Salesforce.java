package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class A03_Salesforce {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.cssSelector("input.username")).sendKeys("pooranimenon5@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Totest@123");
		driver.findElement(By.id("Login")).click();

		WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@role = 'navigation']/button"));
		hamburgerMenu.click();
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search apps')]")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text() = 'Content']")).click();

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebElement chatter = driver.findElement(By.xpath("//span[text() = 'Chatter']"));
		jsExecutor.executeScript("arguments[0].click();", chatter);
		WebElement ques = driver.findElement(By.xpath("//span[normalize-space()='Question']"));

		if (driver.getTitle().contains("Chatter")) {
			String detail = "Test data for Selenium demo";
			driver.findElement(By.xpath("//span[text() = 'Question']")).click();
			driver.findElement(By.xpath("//textarea[contains(@placeholder, 'What would you like to know?')]"))
					.sendKeys(detail);
			driver.findElement(By.xpath("//button[contains(text(),'Ask')]")).click();
			List<WebElement> li = driver.findElements(By.xpath("//div[@data-aura-class = 'forceChatterFeedBodyQuestionWithoutAnswer']//span[@class = 'uiOutputText']"));
			for (WebElement e : li) {
				String data = e.getText();
				System.out.println(data);
				Assert.assertEquals(true, data.contains(detail));

			}

		}

	}

}
