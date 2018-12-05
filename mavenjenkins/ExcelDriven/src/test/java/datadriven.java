import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("C:\\Users\\Shilpa\\Desktop\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		//sheet number and which to select

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);

				//Identify testcases column
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator();//row is collection of cells
				int k=0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcases"));
				}
			}
		}
	}

}
