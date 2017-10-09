package code;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SJ extends HelperImpl{
WebDriver driver;
	public SJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}
	
	@FindBy(how = How.XPATH, using = "(.//*[contains(text(),'Message') and @role='button'])[3]")
	public static WebElement message;
	
	@FindBy(how = How.XPATH, using = ".//*[starts-with(@class,'_1mf _1mj')]")
	@CacheLookup
	public static WebElement text;
	
	
	
	public void clickMessage (){
		waitForElement(driver, 60, message);
		message.click();
	}
	
	public void enterMessage(String info){
		waitForElement(driver, 60, text);
		text.sendKeys(info);
		//text.sendKeys(Keys.ENTER);
	}
	
	

}
