package leaning_WebDrivers_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Quit_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub,
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
