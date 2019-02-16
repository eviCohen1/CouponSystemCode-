package Main;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.TimerTask;

import javax.xml.crypto.Data;

import DB.DBDAO.CouponDBDAO;
import JavaBeans.Coupon;

public class DailyCouponExpirationTask extends TimerTask implements Runnable {

	/*****************************************
	 * Attributes
	 ************************************/
	public Boolean quit;
	CouponDBDAO couponDBDAO = new CouponDBDAO();
	Coupon coupon = new Coupon();

	/*******************************************
	 * CTOR
	 ***************************************/
	public DailyCouponExpirationTask() {

	}

	/*******************************************
	 * Methods
	 ************************************/
	@Override
	public void run() {

		java.util.Date now;
        this.quit  = true ; 
		try {
			while (quit) {
				couponDBDAO.printAllCoupons();
				now = Utils.timeStamp();
				System.out.println("Time is :" + now); // Display current time
				Thread.sleep((long) 1000);		//sleep one second 
				terminate();   //terminate the task 
			}
		} catch (Exception e) {
			System.out.println("error running thread " + e.getMessage());
			terminate();
		}
	}

	public void terminate() {		
		this.quit = false; 
		
	}

}
