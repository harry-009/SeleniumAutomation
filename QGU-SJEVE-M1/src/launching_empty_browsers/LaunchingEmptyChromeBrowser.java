package launching_empty_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		new ChromeDriver();
	}

}
