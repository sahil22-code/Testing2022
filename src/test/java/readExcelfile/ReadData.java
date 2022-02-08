package readExcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

 public static void main(String[] args) throws IOException {

FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
HSSFWorkbook workbook = new HSSFWorkbook(fis);
HSSFSheet sheet = workbook.getSheet("sample");
int rowCount = sheet.getLastRowNum();
int coulumnCount = sheet.getRow(0).getLastCellNum();



System.out.println("No. of Row in Excel file are: " + rowCount);
System.out.println("No. of Columns in Excel file are: " + coulumnCount);

 }

}