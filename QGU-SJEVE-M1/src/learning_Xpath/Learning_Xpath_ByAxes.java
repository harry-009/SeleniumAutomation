package learning_Xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_ByAxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		driver.findElement(By.className("_97w5")).click();
		driver.findElement(By.name("firstname")).sendKeys("Harry");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harry");
		
		
		
	}

}
