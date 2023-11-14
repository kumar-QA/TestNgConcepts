package apache_poi_Operation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class updateOpeartionInExcel {

	     public static void main(String[] args) throws IOException {
	 		String path="D:\\ExcelSheet\\data.xlsx";
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wo=new XSSFWorkbook(fis);
		    XSSFSheet  sheet=wo.getSheet("abc");
		    sheet.getRow(1).getCell(0).setCellValue("Rajesh");
		    FileOutputStream fos= new FileOutputStream(path);
		     wo.write(fos);
			
		}
	
	
}
