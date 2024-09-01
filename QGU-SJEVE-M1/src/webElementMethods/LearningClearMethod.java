package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement SearchTf = driver.findElement(By.id("small-searchterms"));
		SearchTf.sendKeys("computer");
		Thread.sleep(2000);
		SearchTf.clear();
		Thread.sleep(2000);
		SearchTf.sendKeys("Books");
		
	}

}
