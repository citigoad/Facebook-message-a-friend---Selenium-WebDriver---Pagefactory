package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SearchNameWithExcel {
	
	// Add Apache POI Jars
	
	
	public static void main(String []args) throws Exception{
		
		File src=new File("D:\\Softwares\\Selenium\\practice home\\inputNames.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		// Load sheet- Here we are loading first sheet only
		XSSFSheet sh1= wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		
		wb.close();
	}

}
