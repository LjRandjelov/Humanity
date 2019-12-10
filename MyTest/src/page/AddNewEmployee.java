package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewEmployee {

	public static final String staff = "//*[@id=\"sn_staff\"]/span";
	public static final String addEmployees = "//*[@id=\"act_primary\"]";
	public static final String firstName = "//*[@id=\"_asf1\"]";
	public static final String lastName = "//*[@id=\"_asl1\"]";
	public static final String email = "//*[@id=\"_ase1\"]";
	public static final String saveEmployees = "//*[@id=\"_as_save_multiple\"]";

	// clicks on staff module
	public static void clickStaff(WebDriver dr) {
		getStaff(dr).click();
	}

	// finds staff module
	public static WebElement getStaff(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(staff));
		return wb;
	}

	// clicks on add employees button
	public static void clickAddEmployee(WebDriver dr) {
		getAddEmployee(dr).click();
	}

	// finds employees button
	public static WebElement getAddEmployee(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(addEmployees));
		return wb;
	}

	// clicks on first name
	public static void clickFirstName(WebDriver dr) {
		getFirstName(dr).click();
	}

	// finds first name
	public static WebElement getFirstName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(firstName));
		return wb;
	}

	// sets first name
	public static void sendKeysFirstName(WebDriver dr, String str) {
		getFirstName(dr).sendKeys(str);
	}

	// clicks on last name
	public static void clickLastName(WebDriver dr) {
		getLastName(dr).click();
	}

	// finds last name
	public static WebElement getLastName(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(lastName));
		return wb;
	}

	// sets last name
	public static void sendKeysLastName(WebDriver dr, String str) {
		getLastName(dr).sendKeys(str);
	}

	// clicks on email
	public static void clickEmail(WebDriver dr) {
		getEmail(dr).click();
	}

	// finds email
	public static WebElement getEmail(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(email));
		return wb;
	}

	// sets email
	public static void sendKeysEmail(WebDriver dr, String str) {
		getEmail(dr).sendKeys(str);
	}

	// clicks employee button
	public static void clickSaveEmployees(WebDriver dr) {
		getSaveEmployees(dr).click();
	}

	// save employee button
	public static WebElement getSaveEmployees(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(saveEmployees));
		return wb;
	}

}
