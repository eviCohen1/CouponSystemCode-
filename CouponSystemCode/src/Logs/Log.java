package Logs;

import java.sql.Date;

public class Log {
	
	private Date timestamp; 
	private String description; 
	public enum logType { Error,info } ;
    private logType logtype;	
	
	public Log(Date timestamp, String description,logType logType) {

		this.timestamp = timestamp;
		this.description = description;
		this.logtype = logType; 
		
	}

	@Override
	public String toString() {
		return "Log [timestamp=" + timestamp + ", description=" + description + ", logtype=" + logtype + "]";
	}
	
	

}
