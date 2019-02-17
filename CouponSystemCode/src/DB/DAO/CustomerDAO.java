package DB.DAO;
import java.util.ArrayList;
import java.util.Set;

import Exceptions.DBException;
import JavaBeans.Company;
import JavaBeans.Coupon;
import JavaBeans.Customer;

public interface CustomerDAO {
	
	/**
	 * This interface defines all the methods are should implement in the CustomerDBDAO. 
	 * It Contains : 
	 * login
	 * createCustomer
	 * removeCustomer
	 * removeCustomerCoupons
	 * updateCustomer
	 * getCustomerById
	 * getCustomerCoupons
	 * getAllCustomer
	 * printAllCustmers
	 * getCustomer
	 * printAllCustmers
	 * @throws Exception
	 * login 
	 */

	void createCustomer(Customer customer) throws DBException; 
	
	void removeCustomer(Customer customer) throws DBException;
	
	public void removeCustomerCoupons(Customer customer) throws DBException;

	void updateCustomer(Customer customer) throws DBException;

	public Customer getCustomer(String CUST_NAME) throws DBException;
	
	public Set<Customer> getAllCustomer() throws DBException;	
	
	public Set<Coupon> getCoupons() throws DBException; 
	
	public Boolean login(String custName, String password) throws DBException; 
	
	public Customer getCustomerById(long id) throws DBException;
	
	public Set<Coupon> getCustomerCoupons(Customer customer) throws DBException;
	
	public void printAllCustmers() throws DBException;
	
	public void purchaseCoupon(Coupon coupon, Customer customer) throws DBException; 
	
	
}
