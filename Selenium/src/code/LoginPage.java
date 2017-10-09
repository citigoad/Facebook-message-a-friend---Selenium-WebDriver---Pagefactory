package code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(how = How.XPATH, using = ".//*[@id='email']")
@CacheLookup
public static WebElement username;

@FindBy(how = How.XPATH, using = ".//*[@id='pass']") 
public static WebElement password;

@FindBy(how = How.XPATH, using = ".//*[@value='Log In']") 
public static WebElement login_button;

public void loginCredentials(String uname, String pass){
	username.sendKeys(uname);
	password.sendKeys(pass);
	login_button.click();
}



		
	

}
