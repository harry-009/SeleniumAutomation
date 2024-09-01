package leaning_WebDrivers_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitle_Method {
	public static void main(String agrs[]) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
