package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;

import javax.swing.text.StyledEditorKit.ForegroundAction;



import DB.ConnPool;
import DB.Database;
import DB.DBDAO.CompanyDBDAO;
import DB.DBDAO.CouponDBDAO;
import DB.DBDAO.CustomerDBDAO;
import Exceptions.DBException;
import Facade.AdminFacade;
import Facade.CompanyFacade;
import Facade.CouponClientFacade;
import Facade.CustomerFacade;
import JavaBeans.Company;
import JavaBeans.Coupon;
import JavaBeans.CouponType;
import JavaBeans.Customer;
import Logs.Log;
import Logs.Logger; 
import Main.CouponSystem.clientType;
import Threads.DailyCouponExpirationTask;

public class Test {

	public static void main(String[] args) throws Exception {
       
		int i = 1; 

   	
		/************************************Test-threads*************************/
		
//		   Timer time = new Timer();    // Instantiate Timer Object
//	       DailyCouponExpirationTask dailyCouponExpirationTask = new DailyCouponExpirationTask();  // Instantiate SheduledTask class
//	       time.schedule(dailyCouponExpirationTask, Utils.timeScheduler(), Utils.minToMilliSec(1440));// Create task repeating every selected time, in millisecond 

//		Company company = new Company(2, "mPrest", "12345", "oriel@test.com");
//		Coupon coupon = new Coupon(4, "PhoneNote8", Utils.getDate(), Utils.endDate(10),2, CouponType.CAMPING,"wtf", 1251, "image",true);
//		Customer customer = new Customer(3, "Evi", "1234");
//		Customer customer2 = new Customer(4,"Lior", "1234");
//		Coupon coupon1 = new Coupon(3, "Kobi", Utils.getDate(), Utils.endDate(60),5555, CouponType.HEALTH,"wtf", 1251, "image",false);
//		Customer customer3 = new Customer(4, "Haim", "1234");
//		Customer customer4 = new Customer(5, "Shani", "1234");
//		Customer customer5 = new Customer(5, "Noam", "1234");
//		Customer customer6 = new Customer(5, "Uri", "1234");
//		Company company2 = new Company(3, "mPrest", "12345", "oriel@test.com"); 
		
	/************************************Admin-Facade-Test************************/	
       
		try { 
			
			int x = i/0 ; 
			
		}catch (Exception e) {
			
				   throw new DBException("Error Test !!!!!"); 
		}
		


//        AdminFacade adminFacade = new AdminFacade(); 
//        adminFacade.removeCompany(company);
//        CouponDBDAO couponDBDAO = new CouponDBDAO(); 
//        couponDBDAO.removeCoupon(coupon1);
//        adminFacade.createCustomer(customer);
//        adminFacade.createCustomer(customer2);
//        adminFacade.createCompany(company);
//        adminFacade.createCompany(company2);
//        adminFacade.login("Mashav", "12345", clientType.Admin); 
//        adminFacade.updateCompany(company,"Ee123456","Evi.cohen@gmail.com");
//       Set<Company> companies = new HashSet<Company>(); 
//       companies = adminFacade.getAllCompanies(); 
//       Iterator iterator = companies.iterator(); 
//        System.out.println(adminFacade.getAllCompanies());
//       while(iterator.hasNext()) { 
//    	   System.out.println(iterator.next());
//       }
       
//        adminFacade.removeCustomer(customer2); 
//        adminFacade.updateCompany(company2, newPassword, newEmail);
//        adminFacade.removeCompany(company);
	/****************************Test-CreateCoupon*********************************/
//		CompanyFacade companyFacade = new CompanyFacade();
//		companyFacade.login(company.getCompName(), company.getPassword(),clientType.Company);
//        companyFacade.createCoupon(coupon1);
//        companyFacade.createCoupon(coupon);
//        System.out.println(companyFacade.getCouponByType(CouponType.CAMPING)); 
//		companyFacade.removeCoupon(coupon);
//		companyFacade.createCoupon(coupon);

/*********************************************Test-Main****************************/ 
		/*********Admin**************/
//		AdminFacade adminFacade2 = new AdminFacade();
//		adminFacade2 = (AdminFacade) CouponSystem.getCouponSystem().login("admin", "1234", clientType.Admin);
//        if ( adminFacade2 != null ) { 
//        	
//        	adminFacade2.removeCustomer(customer6);
//        	adminFacade2.createCustomer(customer6);
//
//        }
//        	
//
//        	
////        }
//		/*********Customer************/
//        CustomerFacade customerFacade = new CustomerFacade(); 
//        customerFacade = (CustomerFacade) CouponSystem.getCouponSystem().login("Uri", "1234", clientType.Customer); 
//        if(customerFacade!=null) {
//        	customerFacade.purchaseCoupon(coupon);      	
//        }
//        
//        
        
        /*********Company************/
//		CompanyFacade companyFacade = new CompanyFacade(); 
//        companyFacade = (CompanyFacade) CouponSystem.getCouponSystem().login("mPrest", "12345",clientType.Company);
//        if(companyFacade!=null) { 
//        	companyFacade.updateCoupon(coupon);
//        	}
//    
    /****************************Test-PurchasedCoupon*****************************/

//        CustomerFacade customerFacade = new CustomerFacade(); 
//        customerFacade.login(customer.getCustomerName(),customer.getPassword(),clientType.Customer); 
//        customerFacade.purchaseCoupon(coupon);

        

		
//		/**************Coupon HashSet Collection TEST****************/
//		Set<Coupon> coupons = new HashSet<Coupon>();
//		Class.forName("org.apache.derby.jdbc.ClientDriver");
//
//		CouponDBDAO couponDBDAO = new CouponDBDAO(); 
//
//		coupons =couponDBDAO.getAllCoupouns();  
//		Iterator iterator = coupons.iterator(); 
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	


		
//		/**************Customer HashSet Collection TEST****************/
//		Set<Customer> customers = new HashSet<Customer>(); 
//		CustomerDBDAO customerDBDAO = new CustomerDBDAO(); 
//		
//		customers = customerDBDAO.getAllCustomer(); 
//		
//		Iterator iterator2 = customers.iterator(); 
//		
//		while (iterator2.hasNext()) {
//			
//			System.out.println(iterator2.next());
//			
//		}
//		

		}

		

	}

