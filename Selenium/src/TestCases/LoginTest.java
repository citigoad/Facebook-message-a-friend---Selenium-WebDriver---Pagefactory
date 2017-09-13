package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import code.DriverSetup;
import code.HomePage;
import code.LoginPage;
import code.SJ;
import code.SearchPage;

public class LoginTest extends DriverSetup{
	WebDriver driver;
	DriverSetup driversetup;
	LoginPage login_page;
	HomePage home_page;
	SearchPage search_page;
	SJ sj;
	

	@Test
	public void sendMessageManual() throws InterruptedException{
		
		 driver = DriverSetup.DriverSetting("firefox", "https://www.facebook.com");
		 
		
		login_page = new LoginPage(driver);
		login_page.loginCredentials("pinkyatmanand@gmail.com", "Waltermeth1");
		
		Thread.sleep(3000);
		
		home_page = new HomePage(driver);
		home_page.typeInSearchField("siva varaprasad reddy");
		
		Thread.sleep(4000);
		
		// https://sqa.stackexchange.com/questions/16773/ajaxelementlocatorfactory-implicit-or-explicit - information for wait in page factory.
		
		search_page = new SearchPage(driver);
		search_page.clickName();
		
		Thread.sleep(4000);
		
		sj = new SJ(driver);
		sj.clickMessage();
		
		Thread.sleep(6000);
			
		/*Iterator<String> itr = getAllwindows();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);*/
		
		sj.enterMessage("Hi...from selenium");	
	}
}
