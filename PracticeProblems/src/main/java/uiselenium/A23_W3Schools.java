package uiselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_W3Schools {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("iframeResult");
		WebElement clickOnTry = driver.findElement(By.xpath("//button[text() = 'Try it']"));
		clickOnTry.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		if(driver.findElement(By.id("demo")).getText().equals("You pressed OK!"))
		{
			System.out.println("Verified");
		}
		
		
		driver.quit();
	}
	}

	