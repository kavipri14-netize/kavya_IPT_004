package utility;

import java.io.File;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelData {
    public static String getParticularData(int roValue, int columValue) {
        String data = null;
        try {
            File file = new File("C:\\Users\\hp\\Downloads\\DataDriven_IPT (1).xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");
            Row row = sheet.getRow(roValue);
            Cell cell = row.getCell(columValue);
            // Data Formatter ---> convert each cell in to String value
            DataFormatter dataFormat = new DataFormatter();
            data = dataFormat.formatCellValue(cell);
            //  System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}



