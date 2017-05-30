package ExcelDemo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	static XSSFWorkbook wBook ;
	static XSSFSheet wSheet;
	static XSSFCell cell;
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Administrator\\Desktop\\Excel.xlsx";
		String sName = "Sheet1";
		
		
		try {
			FileInputStream file = new FileInputStream(path);
			wBook = new XSSFWorkbook(file);
			wSheet = wBook.getSheet(sName);
			cell = wSheet.getRow(1).getCell(1);
			String val = cell.getStringCellValue();
			System.out.println(val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	

}
