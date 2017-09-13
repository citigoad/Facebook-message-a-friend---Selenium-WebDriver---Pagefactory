package code;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class HomePage extends DriverSetup{

WebDriver driver;



public HomePage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
}

@FindBy(how = How.XPATH, using = ".//input[@aria-label='Search']")
public static WebElement search;

public void typeInSearchField(String name){
	search.sendKeys(name);
	search.sendKeys(Keys.ENTER);
}
}
