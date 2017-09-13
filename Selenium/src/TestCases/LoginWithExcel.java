package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import code.DriverSetup;
import code.HomePage;
import code.LoginPage;
import code.SJ;
import code.SearchPage;

public class LoginWithExcel extends DriverSetup{

	WebDriver driver;
	DriverSetup driversetup;
	LoginPage login_page;
	HomePage home_page;
	SearchPage search_page;
	SJ sj;
	
	@BeforeTest
	public void beforeTest() throws Exception{
	driver = DriverSetup.DriverSetting("firefox", "https://www.facebook.com");
	Thread.sleep(2000);
	}
	
	@Test
	public void excelLogin()throws Exception{
		String username = DriverSetup.ReadWithExcel(0, 1, 0);
		String password = DriverSetup.ReadWithExcel(0, 1, 1);
		login_page = new LoginPage(driver);
		login_page.loginCredentials(username, password);
		
		Thread.sleep(3000);
		
		home_page = new HomePage(driver);
		home_page.typeInSearchField(DriverSetup.ReadWithExcel(1, 1, 0));
		
		Thread.sleep(4000);
		
		search_page = new SearchPage(driver);
		search_page.clickName();
		
		Thread.sleep(4000);
		
		sj = new SJ(driver);
		sj.clickMessage();
		
		Thread.sleep(6000);
		
		sj.enterMessage("Hi...from selenium");
		
	}

}
