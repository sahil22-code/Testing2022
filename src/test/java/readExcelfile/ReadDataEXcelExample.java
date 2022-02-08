package readExcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataEXcelExample {

 public static void main(String[] args) throws Exception {

 // File
FileInputStream fis = new FileInputStream("./testData/RegistrationData.xlsx");
// workbook ---- sheet ---- rows ---cells
// .xlsx - XSSFWorkbook
// .xls -- HSSFWorkbook

 XSSFWorkbook workbook = new XSSFWorkbook(fis);
//XSSFSheet sheet = workbook.getSheet("Student");
XSSFSheet sheet = workbook.getSheet("sample");
// XSSFSheet sheet1 = workbook.getSheetAt(0);

 int rowCount = sheet.getLastRowNum();
int columnsCount = sheet.getRow(0).getLastCellNum();

 System.out.println("Row Count : " + rowCount);
System.out.println("Row Count : " + columnsCount);

 for (int i = 1; i <= rowCount; i++) {

 XSSFRow currentRow = sheet.getRow(i);

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