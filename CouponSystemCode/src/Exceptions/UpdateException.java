package Exceptions;

import java.io.IOException;

import Logs.Log;
import Logs.Logger;

public class UpdateException extends Exception{
	
	public UpdateException ( String massage ) throws IOException { 
		super(massage); 
		loggerMassage();
		
		
	}
	
	public void loggerMassage() throws IOException {

		Log log = new Log();
		Logger.log(Log.Error(getMessage(), getStackTrace()));

	}

}
