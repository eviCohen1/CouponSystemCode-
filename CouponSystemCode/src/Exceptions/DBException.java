package Exceptions;

import java.util.Arrays;

@SuppressWarnings("serial")
public class DBException extends Exception{

	public DBException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DBException [getMessage()=" + getMessage() + ", getLocalizedMessage()=" + getLocalizedMessage()
				+ ", getCause()=" + getCause() + ", toString()=" + super.toString() + ", fillInStackTrace()="
				+ fillInStackTrace() + ", getClass()=" + getClass() + "]";
	}



	

}
