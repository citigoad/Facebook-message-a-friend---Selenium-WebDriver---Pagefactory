package code;



import java.io.File;
import java.io.FileInputStream;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSetup {
	 static WebDriver driver; //removed static here
	
	public static WebDriver DriverSetting(String driver_name, String URL){ //removed static here
		
		if(driver_name.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		driver.get(URL);
		return driver;
	}
	
	public Iterator<String> getAllwindows(){
		Set<String> windows  = driver.getWindowHandles();
		Iterator<String> itr =  windows.iterator();
		return itr;
	}
	
	//if you do not put static you will get null pointer exception.
	public static String ReadWithExcel(int sheet, int row, int cell) throws Exception{
		File src=new File("D:\\Softwares\\Selenium\\practice home\\inputNames.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		// Load sheet- Here we are loading first sheet only
		XSSFSheet sh= wb.getSheetAt(sheet);
		
		 String cellValue = sh.getRow(row).getCell(cell).getStringCellValue();
		 
		 wb.close();
		 
		 return cellValue;
		 
		 
	}
	
}	
