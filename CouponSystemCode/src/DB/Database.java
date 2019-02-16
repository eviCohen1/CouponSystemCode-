package DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;

import JavaBeans.Company;
import JavaBeans.Coupon;
import JavaBeans.Customer;
import Main.Utils;

public class Database {

	/*
	 * Singleton class
	 */

	private static Database instance = new Database();
	static Connection conn;

	private Database() {
		try {
			Database.createTables();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Database getDatabase() {
		return instance;
	}

	public static void createTables() throws DBException, SQLException {

		// Connection

		try {
			conn = ConnPool.getInstance().getConnection();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			throw new DBException("The Connection is faild");
		}
		String sql;

		// Table 1 creation (Company)
		try {
			java.sql.Statement stmt = conn.createStatement();
			sql = "create table Company("
					+ "ID bigint NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1), "
					+ "COMP_NAME varchar(30) not null, " + "PASSWORD varchar(30) not null,"
					+ "EMAIL varchar(30) not null)";
			stmt.executeUpdate(sql);
			System.out.println("success:" + sql);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		// Table 2 creation (Customer)
		try {
			java.sql.Statement stmt2 = conn.createStatement();
			sql = "create table Customer("
					+ "ID bigint not null primary key generated always as identity(start with 1, increment by 1), "
					+ "CUST_NAME varchar(30) not null, " + "PASSWORD varchar(30) not null)";
			stmt2.executeUpdate(sql);
			System.out.println("success:" + sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		// Table 3 creation (Coupon)
		try {
			java.sql.Statement stmt3 = conn.createStatement();
			sql = "create table Coupon("
					+ "ID bigint not null primary key generated always as identity(start with 1, increment by 1), "
					+ "TITLE varchar(30) not null, " + "START_DATE DATE not null, " + "END_DATE DATE not null,"
					+ "AMOUNT INTEGER not null," + "TYPE varchar(10) not null," + "MESSAGE varchar(30) not null,"
					+ "PRICE double not null," + "IMAGE varchar(200) not null," + "ACTIVE BOOLEAN NOT NULL)";
			stmt3.executeUpdate(sql);
			System.out.println("success:" + sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		// Table 4 creation (Customer_Coupon - Join table)
		try {
			java.sql.Statement stmt4 = conn.createStatement();
			sql = "create table Customer_Coupon(" + "CUST_ID bigint not null REFERENCES Customer(ID),"
					+ "COUPON_ID bigint not null REFERENCES Coupon(ID))";
			stmt4.executeUpdate(sql);
			System.out.println("success:" + sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		// Table 5 creation (Company_Coupon - Join table)
		try {
			java.sql.Statement stmt5 = conn.createStatement();
			sql = "create table Company_Coupon(" + "COMP_ID bigint not null REFERENCES Company(ID),"
					+ "COUPON_ID bigint not null REFERENCES Coupon(ID))";
			stmt5.executeUpdate(sql);
			System.out.println("success:" + sql);

		} catch (SQLException e) {
			throw new DBException("update customer failed");
		} finally {
			// finally block used to close resources
			try {
				if (conn != null)
					ConnPool.getInstance().returnConnection(conn);
			} catch (Exception e) {
				throw new DBException("The close connection action faild");
			}

		}
	}

}