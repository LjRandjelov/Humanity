package utils;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
	WebDriver driver;

	public ChromeDriver SetupDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ljiljana\\Desktop\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.humanity.com/");
		return driver;

	}

	public void checkElement() {

	}

}
