package runMain;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.LogIn;
import test.AddNewEmployeeNoLastName;
import test.AddNewEmployeeSc;
import test.AddNewEmployeeSuccess;
import test.LogInInvalidPass;
import test.LogInSc;
import test.LogInSuccess;

public class MyMainClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ljiljana\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		UserManual.Manual();
		LogIn.openPage(driver);
		Scanner sc = new Scanner(System.in);

		switch (sc.nextInt()) {
		case 1:
			LogInSc.fillForm(driver);// log in via scanner
			break;
		case 2:
			LogInSuccess.fillForm(driver);
			AddNewEmployeeSc.fillFormAddEmployee(driver);// add new employee via scanner
			break;
		case 3:
			LogInSuccess.fillForm(driver); // log in with right credentials
			break;
		case 4:
			LogInInvalidPass.fillForm(driver); // log in with invalid pass
			break;
		case 5:
			LogInSuccess.fillForm(driver);
			AddNewEmployeeSuccess.fillFormAddEmployee(driver); // add employee happy path :)
			break;
		case 6:
			LogInSuccess.fillForm(driver);
			AddNewEmployeeNoLastName.fillFormAddEmployee(driver); // add employee no last name :(
			break;
		}
		Thread.sleep(10000);
		sc.close();
		driver.close();
	}
}
