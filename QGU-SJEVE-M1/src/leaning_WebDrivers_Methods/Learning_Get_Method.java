package leaning_WebDrivers_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Get_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
