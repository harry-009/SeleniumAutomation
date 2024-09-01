package leaning_WebDrivers_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrl_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

	}

}
