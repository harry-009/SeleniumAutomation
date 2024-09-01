package launching_empty_browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEmptyEdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		new EdgeDriver();
	}

}
