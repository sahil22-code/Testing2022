package readExcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataEXcelExample2 {

 public static void main(String[] args) throws Exception {

 // File
FileInputStream fis = new FileInputStream("./testData/RegisterStudent.xls");
// workbook ---- sheet ---- rows ---cells
// .xlsx - XSSFWorkbook
// .xls -- HSSFWorkbook

 HSSFWorkbook workbook = new HSSFWorkbook(fis);
//XSSFSheet sheet = workbook.getSheet("Student");
HSSFSheet sheet = workbook.getSheet("sample");
// XSSFSheet sheet1 = workbook.getSheetAt(0);

 int rowCount = sheet.getLastRowNum();
int columnsCount = sheet.getRow(0).getLastCellNum();

 System.out.println("Row Count : " + rowCount);
System.out.println("Row Count : " + columnsCount);

 for (int i = 1; i <= rowCount; i++) {

 HSSFRow currentRow = sheet.getRow(i);

 /*
* for( int j = 0; j < columnsCount; j++) {
*
* String value = currentRow.getCell(j).toString();
* System.out.println("Value are : " + value); }
*/

 // String FirstName = sheet.getRow(i).getCell(0).toString();
String FirstName = currentRow.getCell(0).toString();
String LastName = currentRow.getCell(1).toString();
String email = currentRow.getCell(2).toString();
String phone = currentRow.getCell(3).toString();
String address = currentRow.getCell(4).toString();
System.out.println(FirstName + " " + address);

 }

 }

}