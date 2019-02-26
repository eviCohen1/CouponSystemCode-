package Threads;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.TimerTask;

import javax.xml.crypto.Data;

import DB.DBDAO.CouponDBDAO;
import JavaBeans.Coupon;
import Logs.Log;
import Logs.Logger;

/**
 * @author evic
 *
 */

public class DailyCouponExpirationTask extends TimerTask implements Runnable {

	/****************************************** Attributes************************************/
	public Boolean quit;
	CouponDBDAO couponDBDAO = new CouponDBDAO();
	Logger logger = new Logger(); 

	/******************************************** CTOR***************************************/
	public DailyCouponExpirationTask() {

	}

	/******************************************** Methods************************************/
	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {

        this.quit  = true ; 
		try {
			while (quit) {
				
				couponDBDAO.updateCouponsExpiration();
				Thread.sleep((long) 1000);		//sleep one second 
				terminate();   //terminate the task 
				Logger.log(Log.info("Daily Task, update Coupons expiration "));
			}
		} catch (Exception e) {
			System.out.println("error running thread " + e.getMessage());
			terminate();
		}
	}
	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	public void terminate() {		
		this.quit = false; 
		
	}

}
