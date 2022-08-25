package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rays.bean.Regestrationbean;


public class UserModel {
	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(Regestrationbean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("insert into user value(?,?,?,?,?,?,?,?)");

		conn.setAutoCommit(false);

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getUserid());
		ps.setString(5, bean.getPwd());
		ps.setString(6, bean.getGender());
		ps.setString(7, bean.getNumber());
		ps.setString(8, bean.getDob());

		ps.executeUpdate();

		conn.commit();

		conn.close();
		ps.close();

		}

		public Regestrationbean Authenticate(String S, String t) throws Exception {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

			PreparedStatement ps = conn.prepareStatement("Select * from user where userid = ? and pwd = ? ");

			ps.setString(1, S);
			ps.setString(2, t);

			ResultSet rs = ps.executeQuery();
			Regestrationbean bean = new Regestrationbean();
			while (rs.next()) {
				bean.setId(rs.getInt(1));
				bean.setFname(rs.getString(2));
				bean.setLname(rs.getString(3));
				bean.setUserid(rs.getString(4));
				bean.setPwd(rs.getString(5));
				bean.setGender(rs.getString(6));
				bean.setNumber(rs.getString(7));
				bean.setDob(rs.getString(8));
			}
			return bean;
}
		
		public Regestrationbean forget(String a) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

			PreparedStatement ps = conn.prepareStatement("Select * from user where userid = ? ");

			ps.setString(1, a);
			ResultSet rs = ps.executeQuery();
			Regestrationbean bean = new Regestrationbean();
			while (rs.next()) {
				bean.setId(rs.getInt(1));
				bean.setFname(rs.getString(2));
				bean.setLname(rs.getString(3));
				bean.setUserid(rs.getString(4));
				bean.setPwd(rs.getString(5));
				bean.setGender(rs.getString(6));
				bean.setNumber(rs.getString(7));
				bean.setDob(rs.getString(8));
			}
			return bean;
			
		}
		
		
}