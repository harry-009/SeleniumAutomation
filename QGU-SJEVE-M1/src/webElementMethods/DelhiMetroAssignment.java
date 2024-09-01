package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelhiMetroAssignment {
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://delhimetrorail.com/");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("buttonDismiss1")).click();
	  driver.findElement(By.id("FromStation")).click();
	
}
}
