package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static final String URL = "https://www.humanity.com";
	public static final String lblLogin = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String username = "//*[@id=\"email\"]";
	public static final String password = "//*[@id=\"password\"]";
	public static final String logIn = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	// method to open home page
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}

	// navigates to home page if other page is opened
	public static void navigateToLogin(WebDriver driver) {
		driver.navigate().to(URL);
	}

	// method to open login page
	public static WebElement getLogin(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(lblLogin));
		return wb;
	}

	// clicks on login 
	public static void clickLogin(WebDriver dr) {
		getLogin(dr).click();
	}

	// finds login
	public static WebElement getUsername(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(username));
		return wb;
	}

	// clicks on username field
	public static void clickUsername(WebDriver dr) {
		getUsername(dr).click();
	}

	// sets username
	public static void sendKeysUsername(WebDriver dr, String str) {
		getUsername(dr).sendKeys(str);
	}

	// password
	public static WebElement getPassword(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(password));
		return wb;
	}

	public static void clickPassword(WebDriver dr) {
		getPassword(dr).click();
	}

	public static void sendKeysPassword(WebDriver dr, String str) {
		getPassword(dr).sendKeys(str);
	}

	// log in button
	public static WebElement getLogIn(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(logIn));
		return wb;
	}

	public static void clickLogIn(WebDriver dr) {
		getLogIn(dr).click();
	}

}
