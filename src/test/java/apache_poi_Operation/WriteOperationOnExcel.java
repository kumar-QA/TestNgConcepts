package apache_poi_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperationOnExcel {

	public static void main(String[] args) throws Exception {
		
		String path="D:\\ExcelSheet\\data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wo=new XSSFWorkbook(fis);
	    XSSFSheet  sheet=wo.getSheet("abc");
	                       
	    XSSFRow   r =sheet.createRow(0);
		   r.createCell(0).setCellValue("Name");
        r.createCell(1).setCellValue("Password");
        r.createCell(2).setCellValue("Authorization");
        
 XSSFRow  r1=sheet.createRow(1);
 
	   r1.createCell(0).setCellValue("prasanna");
    r1.createCell(1).setCellValue("xyz");
    r1.createCell(2).setCellValue("Level1");
    
    
     XSSFRow r2=sheet.createRow(2);
     r2.createCell(0).setCellValue("tesing");
     r2.createCell(1).setCellValue("ACCVDEC");
      r2.createCell(2).setCellValue("level233");
   
         XSSFRow  row3=sheet.createRow(3);
         row3.createCell(0).setCellValue("kumar");
         row3.createCell(1).setCellValue("abc");
         row3.createCell(2).setCellValue("Level2");
         
      
      FileOutputStream fos= new FileOutputStream(path);
     wo.write(fos);
      
          
		         
		
		
		
	}

}
