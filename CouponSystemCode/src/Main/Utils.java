package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static Date getDate() {
		LocalDate localDate = LocalDate.now();
		Date date = java.sql.Date.valueOf(localDate);
		return date;
	}

	public static Date endDate(int numDays) {
		LocalDate localDate = LocalDate.now().plusDays(numDays);
		Date date = java.sql.Date.valueOf(localDate);
		return date;
	}

	public static LocalDateTime timeStamp() {

		LocalDateTime localDateTime = LocalDateTime.now();

		return localDateTime;
	}

	public static Date timeScheduler() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 5);
		calendar.set(Calendar.HOUR, 0);
//      calendar.set(Calendar.HOUR_OF_DAY,24); 

		return calendar.getTime();
	}

	/**
	 * @param minutes
	 * @return This method convert minutes to milliseconds
	 */
	public static long minToMilliSec(long minutes) {

		long millisecondes = 0;

		millisecondes = minutes * 60000;

		return millisecondes;

	}

	public static String getDriverData() {

		return "org.apache.derby.jdbc.ClientDriver";
	}

	public static String getDBUrl() {
		return "jdbc:derby://localhost:3301/MyDB;create=true";
	}

	public static String getPathLogsFile() {

		return "C:\\Users\\evic\\OneDrive\\Java\\Project\\Logs\\logs.txt";
	}
	
	public static String getPathDirectoryLogsFile() { 
		
		return "C:\\Users\\evic\\OneDrive\\Java\\Project\\Logs\\" ; 
		
	}

	public static String readLogFile() throws IOException {

		String data = "";
 
		int c;
		try {
			FileInputStream inputStream = new FileInputStream(getPathLogsFile());
			while ((c = inputStream.read()) != -1) {
				data += (char) c;				
			}

			inputStream.close();
		} catch (Exception e) {
			System.out.println("The file not exist !!!");
		}

		return data;
	}

	public static void writeLogFile(String log) throws IOException {

		try {

			createDirctories(false);
			if (!fileExist() || readLogFile() == "") {
				OutputStream outputStream = new FileOutputStream(getPathLogsFile());
				outputStream.write(log.getBytes());
			} else {

				File file = new File(getPathLogsFile());
				BufferedWriter input = new BufferedWriter(new FileWriter(file, true));
				input.newLine();
				input.append(log);
				input.flush();
				input.close();
			}

		} catch (Exception e) {
			System.out.println("Could not create the file");

		}
	}

	public static boolean fileExist() {

		File file = new File(getPathLogsFile());

		return file.exists();

	}

	public static boolean createDirctories(boolean creatParent) {

		File file = new File(getPathDirectoryLogsFile());
		if (creatParent) {
			return file.mkdirs();
		}
		return file.mkdir();
	}
}

