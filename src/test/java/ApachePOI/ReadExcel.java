package ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	XSSFWorkbook wb=null;
	XSSFSheet sh=null;
	
	public ReadExcel(String path) throws Exception{
		FileInputStream fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);	
	}
	
	public String getData(String sheetname, int row, int col){
		sh=wb.getSheet(sheetname);
		String data= sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int getRow(String sheetname){
		int row=wb.getSheet(sheetname).getLastRowNum();
		row=row+1;
		return row;
	}
	

	public static void main(String[] args) throws Exception{
		ReadExcel read=new ReadExcel("C:\\Users\\Magushai OOONNNNGGGG\\Desktop\\Practice.xlsx");
		int row = read.getRow("Sheet1");
		Object[][] obj=new Object[row][3];
		for(int i=1; i<row; i++){
			System.out.println(obj[i][0]=read.getData("Sheet1", i, 0));
			System.out.println(obj[i][1]=read.getData("Sheet1", i, 1));
			System.out.println(obj[i][2]=read.getData("Sheet1", i, 2));
		}
		
	}

	
}	






