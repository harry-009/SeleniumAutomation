package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCss {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement cssSelect = driver.findElement(By.xpath("//a[@class='ico-register']"));
		String color = cssSelect.getCssValue("color");
		System.out.println(color);
		
		
		
	}

}
