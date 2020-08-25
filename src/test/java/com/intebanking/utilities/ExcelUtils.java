package com.intebanking.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetname) throws IOException {
		projectpath = System.getProperty("user.dir");
		 wb = new XSSFWorkbook(excelPath);
		 sheet = wb.getSheet(sheetname);
	}
	
	
	public static void main(String[] args){
		// getRowCount();
		getCellDataString(0,0);
	}
	
	public static int getRowCount() {
		int rowCount =0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowCount );
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		return rowCount;
	}
	
public static int getColumnCount() {
	int colCount=0;
		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of rows: "+colCount );
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
		
		return colCount;
	}

		public static String getCellDataString(int rowNum, int colNum) {
			String cellDatasheet = null;
			try {
				
				cellDatasheet= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				System.out.println("Cell data is :"+ cellDatasheet);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
				e.getCause();
				e.printStackTrace();
			}
			return cellDatasheet;
		}
			public static void getCellDataNumeric(int rowNum, int colNum) {
				
				try {
					Double cellDatasheet= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
					System.out.println("Cell data is :"+ cellDatasheet);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.getMessage();
					e.getCause();
					e.printStackTrace();
				}
		
		
	}
	
	

}
