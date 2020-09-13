package com.revature.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
		//Singleton Factory
		//private static instance of itself
		private static ConnFactory cf= new ConnFactory();
		
		//private no args constructor
		private ConnFactory() {
			super();
		}
		
		//public static synchronized "getter" method
		public static synchronized ConnFactory getInstance() {
			if (cf==null) {
				cf= new ConnFactory();
			}
			return cf;
		}
		
		//Methods that do stuff
		public Connection getConnection() {
			Connection conn= null;
			Properties prop= new Properties();
			
			try {
				InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("database.properties");
				prop.load(inputStream);
				DriverManager.registerDriver(new org.postgresql.Driver());
				conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
}


