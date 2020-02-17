package com.mycryptotrade.mycryptotrade;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {

			SpringApplication.run(Application.class, args);
			while (true) {
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
					System.out.println(cell.toString() + ";");
					if ((String) cell.toString() != null)
						text.append((String) cell.toString());
				}
				System.out.println();
			}
			workbook.close();
			fis.close();

			String row = text.toString();
			Pattern pattern = Pattern.compile("([0-9]*[.,]?[0-9]+)+");
			Matcher matcher = pattern.matcher(row);
			int start = 0;
			String[] price = new String[20];
			while (matcher.find()) {

				price[start] = matcher.group();
				start++;
				if (start >= 20)
					break;

			}

			String BinanceBTC = price[1];
			String PoloniexBTC = price[2];
			String HitbtcBTC = price[3];
			String BinanceETH = price[5];
			String PoloniexETH = price[6];
			String HitbtcETH = price[7];
			String BinanceZEC = price[9];
			String PoloniexZEC = price[10];
			String HitbtcZEC = price[11];
			String BinanceATOM = price[13];
			String PoloniexATOM = price[14];
			String HitbtcATOM = price[15];
			String BinanceXRP = price[17];
			String PoloniexXRP = price[18];
			String HitbtcXRP = price[19];

			Application.asd(price);

			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {

			}
		}
	}

	public static String[] asd (String[] qwe) {
		String[] returnVal = new String[20];
		int a = 1;
		if (a == 1) {
			returnVal = qwe;
			a++;
		}
		return returnVal;
	}
}
