package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rays.bean.StudentBean;

public class StudentModel {
	public Integer nextPk() throws Exception {
		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("select max(id) from student");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("insert into Student value(?,?,?,?,?)");

		conn.setAutoCommit(false);

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getRollno());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setString(5, bean.getSession());

		ps.executeUpdate();

		conn.commit();

		conn.close();
		ps.close();

	}

	public void update(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn
				.prepareStatement("update Student set fname = ? , lname = ? , session = ? where rollno = ?");

		conn.setAutoCommit(false);
		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollno());
		ps.executeUpdate();

		conn.commit();
		System.out.println("data updated....");
		conn.close();
		ps.close();

	}

	public void delete(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("delete from Student where rollno = ? ");
		ps.setString(1, bean.getRollno());

		ps.executeUpdate();
		conn.commit();
		System.out.println("data deleted....");
		conn.close();
		ps.close();

	}

	public List<StudentBean> getby(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");

		PreparedStatement ps = conn.prepareStatement("select * from Student where rollno =?");
		ps.setString(1, bean.getRollno());
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {
			StudentBean bean1 = new StudentBean();
			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setSession(rs.getString(5));

			list.add(bean1);

		}
		return list;

	}

	public List<StudentBean> search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb", "root", "Rathod@1234");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("select * from Student");
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		while (rs.next()) {
			StudentBean bean1 = new StudentBean();
			bean1.setId(rs.getInt(1));
			bean1.setRollno(rs.getString(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setSession(rs.getString(5));

			list.add(bean1);

		}
		return list;

	}

}
