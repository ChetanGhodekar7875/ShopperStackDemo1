package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GetSheetData {
	private Sheet sheet;
	private int row;
	private int column;
	
	public GetSheetData(String sheetName) {
			File file=new File("./src/test/resources/externalData/ShopperStackData.xlsx");
			FileInputStream fin;
			try {
				fin = new FileInputStream(file);
				Workbook workbook=WorkbookFactory.create(fin);
				sheet=workbook.getSheet(sheetName);
				row=workbook.getSheet(sheetName).getPhysicalNumberOfRows();
			    column=workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	public Sheet getSheet() {
		return sheet;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
}
