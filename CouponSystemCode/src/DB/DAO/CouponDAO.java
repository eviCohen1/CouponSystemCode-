package DB.DAO;


import java.util.Set;

import Exceptions.DBException;
import JavaBeans.Company;
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

	
	/* Remove Company 
	 * This method remove a company from company table 
	 */
	void removeCoupon(Coupon coupon) throws DBException;
	
	/* Remove Customer Coupon
	 * This method remove coupon from join table, Customer_Coupon
	 */
	public void removeCustomerCoupon(Coupon coupon) throws DBException;
	
	/* Remove Company Coupons 
	 * This method remove coupon from join table, Company_Coupon
	 */
	public void removeCompanyCoupon(Coupon coupon) throws DBException;

	/* Update Coupon
	 * This method update coupon attributes ( Start date, End Date, Amount , Active ) 
	 */
	void updateCoupon(Coupon coupon) throws DBException;

	/* Get Coupon 
	 * This method returns Coupon object by id 
	 */
	Coupon getCoupon(long id) throws DBException;
	
	/* Print All coupons 
	 * This method print all the coupons 
	 */
	Set<Coupon> getAllCoupouns() throws DBException;
	
	/* Get coupon By type 
	 * This method return Set Collection of Coupon type, contain all the coupons with the same type
	 */
	Set<Coupon> getCouponByType(Coupon coupon) throws DBException; 
	
	/* Create Coupon
	 * This method create coupon and update the join table Company_Coupon
	 */
	public void createCoupon(Coupon coupon, Company company) throws DBException;
	
	/* Get all Coupons 
	 * This method return Set collection of coupon type, contain all the coupons
	 */
	public Coupon getCouponByTitle(String couponName) throws DBException;
	
	/* Print All coupons 
	 * This method print all the coupons 
	 */
	public void printAllCoupons() throws DBException;
	
    /* Update Coupon Expiration 
     *  This method check the coupon expiration and update the Active column ( boolean ) 
     */
	public void  updateCouponsExpiration() throws DBException; 
	
	
	
	
}
