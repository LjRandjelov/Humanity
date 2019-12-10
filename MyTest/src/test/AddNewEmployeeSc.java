package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.AddNewEmployee;

public class AddNewEmployeeSc {

	// fill in add employee form through console
	public static void fillFormAddEmployee(WebDriver driver) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);

			// navigate to staff
			AddNewEmployee.clickStaff(driver);
			Thread.sleep(2000);
			// add employee button
			AddNewEmployee.clickAddEmployee(driver);
			Thread.sleep(2000);
			// employees name
			System.out.println("Employees name: ");
			AddNewEmployee.clickFirstName(driver);
			String firstName = sc.nextLine();
			AddNewEmployee.sendKeysFirstName(driver, firstName);
			// last name
			System.out.println("Last name: ");
			AddNewEmployee.clickLastName(driver);
			String lastName = sc.nextLine();
			AddNewEmployee.sendKeysLastName(driver, lastName);
			// email
			System.out.println("Email: ");
			AddNewEmployee.clickEmail(driver);
			String email = sc.nextLine();
			AddNewEmployee.sendKeysEmail(driver, email);
			// save emloyee button
			AddNewEmployee.clickSaveEmployees(driver);
			Thread.sleep(2000);
			
			

		} catch (Exception ex) {
			System.out.println(ex.toString());

		}
	}

}
