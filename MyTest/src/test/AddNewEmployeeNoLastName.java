package test;

import org.openqa.selenium.WebDriver;

import page.AddNewEmployee;

public class AddNewEmployeeNoLastName {
	public static void fillFormAddEmployee(WebDriver driver) throws Exception {
		try {

			// navigate to staff
			AddNewEmployee.clickStaff(driver);
			Thread.sleep(2000);
			// add employee button
			AddNewEmployee.clickAddEmployee(driver);
			Thread.sleep(2000);
			// employees name
			AddNewEmployee.clickFirstName(driver);
			AddNewEmployee.sendKeysFirstName(driver, "Milos");
		
	
			// email
			AddNewEmployee.clickEmail(driver);
			AddNewEmployee.sendKeysEmail(driver, "milos.randjelov@yahoo.com");
			// save emloyee button
			AddNewEmployee.clickSaveEmployees(driver);
			Thread.sleep(2000);

		} catch (Exception ex) {
			System.out.println(ex.toString());

		}
	}

}

