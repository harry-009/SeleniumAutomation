package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https:/makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText']/ancestor::a[@href=\"https://www.makemytrip.com/railways/\"]")).click();
		//driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains active']")).click();
		
		 WebElement frmCity = driver.findElement(By.id("fromCity"));
		 frmCity.click();
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Srinagar");
		 driver.findElement(By.xpath("//span[text()='Srinagar']")).click();
		 //frmCity.sendKeys("Srinagar");
		// driver.findElement(By.id("toCity")).click();
		 //driver.findElement(By.xpath("//input[@value='Kanpur']")).sendKeys("Delhi");
		 //driver.findElement(By.xpath("//span[text()='Delhi']")).click();
		 driver.findElement(By.xpath("//input[@title='To']")).sendKeys("Delhi");
		 
		
		////span[@class='headerIconTextAlignment chNavText darkGreyText']/ancestor::a[@href="https://www.makemytrip.com/railways/"]
		
	}

}
