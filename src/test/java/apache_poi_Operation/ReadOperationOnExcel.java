package apache_poi_Operation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperationOnExcel {

	public static void main(String[] args) throws Exception {
		String path="D:\\ExcelSheet\\data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wo=new XSSFWorkbook(fis);
	    XSSFSheet  sheet=wo.getSheet("abc");
//	    System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//	    System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//	    System.out.println(sheet.getRow(1).getCell(2).getNumericCellValue());
//	   
	    int rowcount =sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			
		XSSFRow row=sheet.getRow(i);
		
		  int cellcount=row.getPhysicalNumberOfCells();
		  
		  for (int j = 0; j <cellcount; j++) {
			System.out.print("  "+ row.getCell(j).getStringCellValue());
			 
		}
		  System.out.println();
		  
		}  
	    
	}

}
