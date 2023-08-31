package selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AmazonBooksSection {

	@Test
	public void getBookDetails() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		all.sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Atomic Habits");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		List<WebElement> li = driver.findElements(By.xpath("//div/h2"));
		for (WebElement list : li) {
			System.out.println(list.getText());
			}
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='Results']/following::img"));
		for(WebElement e : list)
		if(!e.getAttribute("alt").contains("Sponsored"))
		{
			e.click();
			break;
		}
		
		String parent=driver.getWindowHandle();
		Set<String> Handles = driver.getWindowHandles();
		for (String window : Handles) 
		{
			driver.switchTo().window(window);	
		}
		String author = driver.findElement(By.xpath("//div[@id = 'bylineInfo']//following-sibling::a[@class= 'a-link-normal']")).getText();	
		System.out.println("Author name: "+author);
		driver.switchTo().window(parent);
		driver.quit();
		}

	}
