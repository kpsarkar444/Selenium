package ApachePOI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {
	static XSSFWorkbook wb=null;
	static XSSFSheet sh=null; 
	
	public FileHandling(String path) throws Exception{
		
		
		
		FileInputStream fis =new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		if(wb==null){
			System.out.println("Connection failed");
		}
		fis.close();
		
	}
	
	
	//Get total row count
	public int getTotalRowCount(String sheetName){
		return wb.getSheet(sheetName).getLastRowNum();
	}
	
	//Get total column count
	public int getTotalColumnCount(String sheetName, int rowNum){
		int colNum=0;
		rowNum=rowNum+1;
		if(rowNum>0){
		colNum=wb.getSheet(sheetName).getRow(rowNum).getLastCellNum();
		}
		return colNum;	
		
	}
	
	
	//Read Cell Value
	
	public String readCellValue(String sheetName, int rowNum, int colNum){
		String cellValue=null;
		XSSFCell cel=wb.getSheet(sheetName).getRow(rowNum).getCell(colNum);
		if(cel.getCellType()==cel.CELL_TYPE_STRING){
			cellValue=cel.getStringCellValue();
		}
		else if(cel.getCellType()==cel.CELL_TYPE_NUMERIC){
			double numeric = cel.getNumericCellValue();	
			cellValue=String.valueOf(numeric);
		}
		
		else if(cel.getCellType()==cel.CELL_TYPE_BLANK){
			cellValue="";
		}
		
		return cellValue;
	}
		
	
	public static void main(String[] args) throws Throwable{
		FileHandling file=new FileHandling("C:\\Users\\Magushai OOONNNNGGGG\\Desktop\\Practice.xlsx");
		System.out.println(file.readCellValue("Sheet1", 1, 1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
