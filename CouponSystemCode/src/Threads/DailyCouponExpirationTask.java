package Threads;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.TimerTask;

import javax.xml.crypto.Data;

import DB.DBDAO.CouponDBDAO;
import JavaBeans.Coupon;

/**
 * @author evic
 *
 */

public class DailyCouponExpirationTask extends TimerTask implements Runnable {

	/****************************************** Attributes************************************/
	public Boolean quit;
	CouponDBDAO couponDBDAO = new CouponDBDAO();

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
