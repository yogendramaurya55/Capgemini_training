package com.cg;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyConnection {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mysql driver is loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Karan@1709");

			System.out.println("mysql connected");

//			Statement st = con.createStatement();

//			ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMERS");

//			while(rs.next()) {
//				System.out.println(rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("visited_on"));
//			}

//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the customer id");
//
//			int c_id = sc.nextInt();
//
//			ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMERS where id =" + c_id);
//
//			if (rs.next()) {
//				System.out.println(
//						rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("visited_on"));
//			} else {
//				System.out.println("Not found");
//			}

			// ###########################################################################################################################
			// we can use prepared statement if we have dynamic parameter like id

//			PreparedStatement ps = con.prepareStatement("SELECT * FROM CUSTOMERS where name =? and phone = ?");
//			ps.setString(1, "Priya Singh");
//			ps.setString(2, "9876501234");
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				System.out.println(
//						rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("visited_on"));
//			} else {
//				System.out.println("Not found");
//			}

			// ###############################################################################################################
			// Insert data into table

//			PreparedStatement ps = con.prepareStatement("insert into  customers values(?,?,?,?,?)");
//			
//			Scanner sc = new Scanner(System.in);
//			
//			ps.setInt(1, 17);
//			ps.setString(2, "Harry");
//			ps.setString(3, "99999999399");
//			ps.setDate(4, Date.valueOf("2026-02-25"));
//			ps.setInt(5, 1200);
//			
//			int rows = ps.executeUpdate();
//			
//			if(rows > 0) {
//				System.out.println("Customer created");
//			}

			// ##################################################################################################################
			// get number of days user is not active

//			Statement st = con.createStatement();
//
//			ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMERS");
//
//			while(rs.next()) {
//				Date l_v_on = rs.getDate(4);
//				long days = ChornoUnit.DAYS.between();
//				System.out.println(rs.getString("name") + "\t" + rs.getString("phone") + "\t" + rs.getString("visited_on"));
//			}

			// ####################################################################################################################
			// deleted the customer with given id
//			PreparedStatement ps = con.prepareStatement("delete from customers where id = ?");
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter the id to be deleted");
//			ps.setInt(1, 1);
//
//			int rows = ps.executeUpdate();
//			if (rows > 0) {
//				System.out.println("Customer deleted");
//			}
			
			// ####################################################################################################################
		    // update the customer with given id
			PreparedStatement ps = con.prepareStatement("update customers set visited_on = ? where id = ?");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id to be updated");
			ps.setInt(2, 16);
			
			System.out.println("enter the id to be updated");
			ps.setDate(1, Date.valueOf("2026-01-2"));

			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("Customer updated");
			}

		} catch (Exception e) {
			System.out.println("Customer not found");
		}
	}
}
