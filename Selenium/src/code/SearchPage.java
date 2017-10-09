package code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage extends HelperImpl{

	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	@FindBy(how = How.XPATH, using = "(.//img[@width='72' and @height='72'])[1]")
	public static WebElement name;
	
	public void clickName(){
		waitForElement(driver, 60, name);
		name.click();
	}

}
