package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Formula1_CheckPosition {

	@Test
	public void checkPosition() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formula1.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame("sp_message_iframe_834698");
		driver.findElement(By.xpath("//button[text()='ACCEPT ALL']")).click();
		String driverName = "Oscar Piastri";

		Actions action = new Actions(driver);
		WebElement results = driver.findElement(By.xpath("//a[@href=\"/en/results.html/2023/races.html\"]"));
		action.moveToElement(results).perform();
		driver.findElement(By.xpath("//a[contains(text(), 'Driver Standings')]")).click();

		//Static -- fetches only the given name 
		WebElement name = driver.findElement(By.xpath("//td/a//following::span[text() = 'Piastri']"));
		WebElement positionval = driver
				.findElement(By.xpath("//td/a//following::span[text() = 'Piastri']/ancestor::tr/td[2]"));
		int position = Integer.parseInt(positionval.getText());
		System.out.println("Position of the Player ::: " + position);
		if (position <= 10) {
			System.out.println(driverName + " is within 10 positions");
		} else {
			int difference = position - 10;
			System.out.println(driverName + " is out of 10 positions by " + difference);
		}
	}

}