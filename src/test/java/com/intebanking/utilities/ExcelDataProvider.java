package com.intebanking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	
	@DataProvider(name = "test1data")
	public static Object[][] getdata() throws IOException {
String excelPath = "/Users/pr243589/eclipse-workspace/inetbankingV1/testData/Book1.xlsx";
		
		Object data[][]= testData(excelPath, "Sheet1");
		return data;
		
	}
	
	
	public static Object[][] testData(String excelPath, String sheetName) throws IOException {
		
			ExcelUtils xu = new ExcelUtils(excelPath, sheetName);
			int rowCount = xu.getRowCount();
			int colCount = xu.getColumnCount();
			
			Object data[][] = new Object[rowCount-1][colCount];			
			for (int i=1; i<rowCount; i++) {
				for (int j=0; j<colCount; j++) {
					String cellData = xu.getCellDataString(i, j);
					System.out.println(cellData+" | ");
					data[i-1][j] = cellData;
				}
				System.out.println();
			
			}
			return data;
	}
	       
}
