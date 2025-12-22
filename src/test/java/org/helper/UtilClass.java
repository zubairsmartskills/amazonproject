package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilClass {
	//Static variable
	public static WebDriver driver;
	public static FileInputStream fi;
	public static Workbook book;
	
	public static String getDataFromExcelSheet(String sheetName,int rowNo,int cellNo) {
		File f= new File("src\\test\\resources\\testdata\\testdata.xlsx");
		
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {}
		
		try {
			 book= new XSSFWorkbook(fi);
		} catch (IOException e) {}
		
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		
		String value=null;
		int cellType = cell.getCellType();
		if (cellType==1) {
			 value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s= new SimpleDateFormat();
			value = s.format(d);
		}
		else {
			double d = cell.getNumericCellValue();//111.0
			//String ---->111.0 
			//double --->long
			//newDataType ref=(newDataType)oldRef;
			long l=(long)d;//111
			 value = String.valueOf(l);
			
		}
	
		return value;
	}
	
	public static void chromeBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void edgeBrowser() {
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	public static void passUrl(String url) {
		driver.get(url);
	}
	
	public static void allElementWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void textpass(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static void closeEntireBrowser() {
		driver.quit();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void dateAndTime() {
		Date d= new Date();
		System.out.println(d);
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String getPassedValueFromElement(WebElement element,String name) {
	
		String value = element.getAttribute(name);
		return value;
		
		
	}
	
	public static void trail() {
		TakesScreenshot t= (TakesScreenshot)driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		
		
	}
	
}
