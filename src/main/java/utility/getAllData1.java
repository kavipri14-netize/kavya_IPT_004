package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class getAllData1 {
    public static void getAllData() {
        try {
            File file = new File("C:\\Users\\hp\\Downloads\\DataDriven_IPT (1).xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");
            int lastRowNum = sheet.getLastRowNum();
            System.out.println("No of rows: " + lastRowNum);

            short lastCellNum = sheet.getRow(0).getLastCellNum();
            System.out.println("No of rows: " + lastCellNum);
            for (int i = 0; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < lastCellNum; j++) {
                    Cell cell = row.getCell(j);
                    // Data Formatter ---> convert each cell in to String value
                    DataFormatter dataFormat = new DataFormatter();
              String  data = dataFormat.formatCellValue(cell);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public static void main(String[] args) {
            getAllData();
        }
    }
