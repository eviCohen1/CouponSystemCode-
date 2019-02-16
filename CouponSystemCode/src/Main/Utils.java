package Main;
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
    
    public static Date endDate( int numDays ) 
    { 
    	 LocalDate localDate = LocalDate.now().plusDays(numDays);
    	 Date date = java.sql.Date.valueOf(localDate);
         return date;
    }
 
    public static Date timeStamp() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
    	return date;    	
    }
    
   
    public static Date timeScheduler() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 31);
        calendar.set(Calendar.HOUR, 10);
//        calendar.set(Calendar.HOUR_OF_DAY,24); 

        return calendar.getTime();
    }
    
    public static String getDriverData() {
		return "org.apache.derby.jdbc.ClientDriver";
	}
    
    public static String getDBUrl() {
		return "jdbc:derby://localhost:3301/MyDB;create=true";
	}


    
    
  }
  


//   (year, month, date, hrs, min, sec)