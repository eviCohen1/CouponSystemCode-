package DB.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

import Exceptions.DBException;
import JavaBeans.*;

public interface CompanyDAO {
	
	/**
	 * This interface defines all the methods are should implement in the CustomerDBDAO. 
	 * It Contains : 
	 * createCompany
	 * removeComapny 
	 * updateComapny 
	 * getCompany by name and by ID
	 * getAllCompanies
	 * getCoupons
	 * login 
	 * @throws Exception
	 */
      
		/**
		 * Create Company 
		 * This method create company and insert to company table 
		 */
		void createCompany(Company company ) throws DBException; 

		/* Remove Company
		 * This method remove company from company table
		 */
		void removeCompany(Company company) throws DBException;
		
		/* Remove Company coupons 
		 * Remove all the company coupons from the join table
		 * Remove all the company coupons from coupon table
		 */
		public void removeCompanyCoupons (Company company) throws DBException;

		/* Update Company
		 * This method update company attributes, password and Email   
		 */
		void updateCompany(Company company) throws DBException;

		/* Get Company
		 * This method return company object by id  
		 */
		Company getCompany(long id) throws DBException;
		
		/**
		 * @return
		 * @throws DBException
		 */
		Set<Company> getAllCompanies() throws DBException;	
		
		/* Get All Companies 
		 * This method return Set collection of Company object that contain all the companies  
		 */
		public void printAllCompanies() throws DBException;
		
		/* Print All Companies 
		 * This method print all the companies 
		 */
		public Set<Coupon> getCompanyCoupons(Company company) throws DBException; 
		
		/* Login
		 * This method return boolean value if the company exist 
		 */
		Boolean login(String compName, String password) throws DBException; 
	
		/* Get company 
		 * This method return company object by company name 
		 */
		public Company getCompany(String comp_name) throws DBException;
		
		
		
	}