package Logs;

import java.sql.Connection;
import java.util.ArrayList;

import DB.ConnPool;

public class Logger {
	
	Connection conn; 
	ConnPool connPool;

	public Logger(Connection conn, ConnPool connPool) {
		super();
		this.conn = conn;
		this.connPool = connPool;
	} 
	
	
	public static void log ( Log log ) { 
		
		//TODO write the log to SUMO logic 
	}
	
	public ArrayList<Log> getLogs(){

        //TODO retrieve all the logs from the cloud 
		return null;
		 
	}
	
	
	

}
