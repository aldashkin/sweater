package com.mycryptotrade.mycryptotrade;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class Application {

	static String[] price = new String[20];

	public static void main(String[] args) throws IOException {
		while (true) {
			SpringApplication.run(Application.class, args);
			Application app = new Application();
			app.price();
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String[] price () throws IOException {

		File excelFile = new File("BTC.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIt = sheet.iterator();

		StringBuffer text = new StringBuffer("");

		while (rowIt.hasNext()) {
			Row row = rowIt.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if ((String) cell.toString() != null)
					text.append((String) cell.toString());
			}

		}
		workbook.close();
		fis.close();

		String row = text.toString();
		Pattern pattern = Pattern.compile("([0-9]*[.,]?[0-9]+)+");
		Matcher matcher = pattern.matcher(row);
		int start = 0;

		while (matcher.find()) {

			price[start] = matcher.group();
			start++;
			if (start >= 20)
				break;

		}

		return price;
	}

	public String[] getValues(){
		return this.price;
	}
}
