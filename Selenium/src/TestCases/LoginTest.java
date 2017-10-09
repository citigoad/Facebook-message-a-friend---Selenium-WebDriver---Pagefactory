package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import code.HelperImpl;
import code.HomePage;
import code.LoginPage;
import code.SJ;
import code.SearchPage;

public class LoginTest extends HelperImpl{
	WebDriver driver;
	LoginPage login_page;
	HomePage home_page;
	SearchPage search_page;
	SJ sj;
	

	@Test
	public void sendMessageManual(){
		
		 driver = DriverSetting("firefox", "https://www.facebook.com");
		 
		
		login_page = new LoginPage(driver);
		login_page.loginCredentials("pinkyatmanand@gmail.com", "Waltermeth1");
		
		home_page = new HomePage(driver);
		home_page.typeInSearchField("siva varaprasad reddy");
		
		// https://sqa.stackexchange.com/questions/16773/ajaxelementlocatorfactory-implicit-or-explicit - information for wait in page factory.
		
		search_page = new SearchPage(driver);
		search_page.clickName();
		
		sj = new SJ(driver);
		sj.clickMessage();
			
		/*Iterator<String> itr = getAllwindows();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);*/
		
		sj.enterMessage("Hi...from selenium");	
	}
}
