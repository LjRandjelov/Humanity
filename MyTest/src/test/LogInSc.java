package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.LogIn;

public class LogInSc {

	// fill in log in form through console
	public static void fillForm(WebDriver driver) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			LogIn.clickLogin(driver);
			Thread.sleep(2000);
			// username
			System.out.println("Username: ");
			LogIn.clickUsername(driver);
			String username = sc.nextLine();
			LogIn.sendKeysUsername(driver, username);
			// password
			System.out.println("Password: ");
			LogIn.clickPassword(driver);
			String password = sc.nextLine();
			LogIn.sendKeysPassword(driver, password);
			// Log In button
			LogIn.clickLogIn(driver);
			Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://randjelov.humanity.com/app/dashboard/";

			if (actualUrl.equalsIgnoreCase(expectedUrl)) {
				System.out.println("Test passed");
			} else {
				System.out.println("Test failed");
			}

		} catch (Exception ex) {
			System.out.println(ex.toString());
		} 

	}

}
