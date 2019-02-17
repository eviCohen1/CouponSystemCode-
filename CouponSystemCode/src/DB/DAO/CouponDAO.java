package DB.DAO;


import java.util.Set;

import Exceptions.DBException;
import JavaBeans.Coupon;

public interface CouponDAO {
	
	/**
	 * This interface defines all the methods are should implement in the CustomerDBDAO. 
	 * It Contains : 
	 * removeCoupon
	 * removeCustomerCoupon
	 * removeCompanyCoupon
	 * updateCoupon
	 * getCoupon
	 * getCouponByTitle
	 * getAllCoupouns
	 * getCouponByType
	 * createCoupon ( create coupon and update join table Company_Coupon)
	 * createCoupon
	 * @throws Exception
	 */


	void createCoupon(Coupon coupon) throws DBException ;
	
	void removeCoupon(Coupon coupon) throws DBException;
	
	public void removeCustomerCoupon(Coupon coupon) throws DBException;
	
	public void removeCompanyCoupon(Coupon coupon) throws DBException;

	void updateCoupon(Coupon coupon) throws DBException;

	Coupon getCoupon(long id) throws DBException;
	
	Set<Coupon> getAllCoupouns() throws DBException;
	
	Set<Coupon> getCouponByType(Coupon coupon) throws DBException; 
	
	public void createCoupon(Coupon coupon, long id) throws DBException;
	
	public Coupon getCouponByTitle(String couponName) throws DBException;
	
	public void printAllCoupons() throws DBException;
	
	
	
	
}
