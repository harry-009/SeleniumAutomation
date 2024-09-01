package learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDynamic {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		///ancestor::div[@class='product-productMetaInfo']
			driver.findElement(By.xpath("//input[@class= 'desktop-searchBar']")).sendKeys("joggers for men",Keys.ENTER);
			WebElement product = driver.findElement(By.xpath("//h4[text()='Men Regular Fit Jogger']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']"));
			System.out.println(product.getText());
	}

}
