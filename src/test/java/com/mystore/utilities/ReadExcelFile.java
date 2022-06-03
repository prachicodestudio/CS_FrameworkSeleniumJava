package com.mystore.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {


	public static FileInputStream inputStream;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo/*column no.*/)
	{

		try
		{

			inputStream = new FileInputStream(fileName);
			workBook = new XSSFWorkbook(inputStream);
			excelSheet =  workBook.getSheet(sheetName);
			cell = workBook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);

			workBook.close();

			return cell.getStringCellValue();

		}

		catch (Exception e)

		{
			return "";

		}
	}

	public static int getRowCount (String fileName, String sheetName)
	{

		try

		{

			inputStream = new FileInputStream(fileName);
			//create XSSFWorkBook Class object for excel file manipulation

			workBook = new XSSFWorkbook(inputStream);
			excelSheet =  workBook.getSheet(sheetName);

			//get total no. of rows
			int ttlRows = excelSheet.getLastRowNum() + 1;

			workBook.close();

			return ttlRows;

		}

		catch (Exception e)

		{

			return 0;

		}

	}

	public static int getColCount (String fileName, String sheetName)
	{

		try

		{

			FileInputStream inputStream = new FileInputStream(fileName);
			//create XSSFWorkBook Class object for excel file manipulation
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
			XSSFSheet excelSheet =  workBook.getSheet(sheetName);

			//get total no. of columns
			int ttlCells = excelSheet.getRow(0).getLastCellNum();

			workBook.close();
			return ttlCells;

		}

		catch (Exception e)

		{

			return 0;

		}

	}

}
