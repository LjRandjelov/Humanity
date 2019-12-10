package test;

import org.openqa.selenium.WebDriver;
import page.LogIn;

public class LogInSuccess {

	// fill in log success
	public static void fillForm(WebDriver driver) throws Exception {
		try {

			LogIn.clickLogin(driver);
			Thread.sleep(2000);
			// username

			LogIn.clickUsername(driver);
			LogIn.sendKeysUsername(driver, "ljilja.randjelov@gmail.com");
			// password

			LogIn.clickPassword(driver);
			LogIn.sendKeysPassword(driver, "test123");
			// Log In button
			LogIn.clickLogIn(driver);
			Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://randjelov.humanity.com/app/dashboard/";

			if (actualUrl.equalsIgnoreCase(expectedUrl)) {
				System.out.println(" Log in test passed");
			} else {
				System.out.println("Test failed");
			}

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}

}
