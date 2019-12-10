package test;

import org.openqa.selenium.WebDriver;

import page.LogIn;

public class LogInInvalidPass {

	// fill in log in invalid pass
	public static void fillForm(WebDriver driver) throws Exception {
		try {

			LogIn.clickLogin(driver);
			Thread.sleep(2000);
			// username

			LogIn.clickUsername(driver);
			LogIn.sendKeysUsername(driver, "ljilja.randjelov@gmail.com");
			// password

			LogIn.clickPassword(driver);
			LogIn.sendKeysPassword(driver, "test1234");
			// Log In button
			LogIn.clickLogIn(driver);
			Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://randjelov.humanity.com/app/dashboard/";

			if (actualUrl.equalsIgnoreCase(expectedUrl)) {
				System.out.println("Test failed");
			} else {
				System.out.println("Test passed");
			}

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}

}
