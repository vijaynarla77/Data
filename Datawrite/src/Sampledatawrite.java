import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampledatawrite {
	
	File f1;
	FileInputStream fs;
	XSSFWorkbook wb;
	XSSFSheet xsff;
	public void sample(String Sheetname,int row,int column,String cellvalue) throws Exception
	{
		f1=new File("C:\\Users\\msa\\Desktop\\kcsm2\\Datawrite\\Dataexcel\\Book1.xlsx");
		
		fs = new FileInputStream(f1);
		wb = new XSSFWorkbook(fs);
		
		xsff = wb.getSheet(Sheetname);
		//xsff.getRow(row).createCell(column).setCellValue(cellvalue);
		
		FileOutputStream fos = new FileOutputStream(f1);		
	}

}
