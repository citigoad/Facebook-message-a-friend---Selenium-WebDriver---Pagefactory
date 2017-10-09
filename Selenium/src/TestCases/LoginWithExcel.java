package TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import code.HelperImpl;
import code.HomePage;
import code.LoginPage;
import code.SJ;
import code.SearchPage;

public class LoginWithExcel extends HelperImpl{

	WebDriver driver;
	LoginPage login_page;
	HomePage home_page;
	SearchPage search_page;
	SJ sj;
	
	@BeforeClass
	public void beforeTest(){
	driver = DriverSetting("firefox", "https://www.facebook.com");
	}
	
	@Test
	public void excelLogin()throws Exception{
		String username = ReadWithExcel(0, 1, 0);
		String password = ReadWithExcel(0, 1, 1);
		login_page = new LoginPage(driver);
		login_page.loginCredentials(username, password);
		
		home_page = new HomePage(driver);
		home_page.typeInSearchField(ReadWithExcel(1, 1, 0));
		
		search_page = new SearchPage(driver);
		search_page.clickName();
		
		sj = new SJ(driver);
		sj.clickMessage();
		
		sj.enterMessage("Hi...from selenium");		
	}
	
	@AfterClass
	public void endTest(){
		driver.quit();
	}	
}
