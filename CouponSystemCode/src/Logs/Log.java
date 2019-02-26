package Logs;

import java.sql.Date;
import java.time.LocalDateTime;

import Main.Utils;

public class Log {
	
	private static LocalDateTime timestamp; 
	public enum logType { Error,Info } ;
	
	
	public static String info(String description) { 
		
		String log;
		
		timestamp = Utils.timeStamp();
		log =  "LogType: "  + logType.Info +", Timestamp: " + timestamp +  ", Description: " + description   ; 
		
		return log ; 	
		
	}
	
	public static String Error(String description, String ExceptionMassage) { 
		
		String log;
		
		timestamp = Utils.timeStamp();
		log =  "LogType: "  + logType.Error + ", Timestamp: " + timestamp +  ", Description: " + description + ", ExceptionMassage: " + ExceptionMassage  ; 
		
		return log ; 	
		
	}
	
	

}
