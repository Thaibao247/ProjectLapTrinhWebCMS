package pj.webt5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pj.webt5.connection.DBConnection;

public class RegisterDao extends DBConnection{
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	
	//Insert to member
	public void insertMember(String name, String email, String password) {
		String sql = "INSERT INTO member (username, password, email,createddate) VALUES (?, ?, ?, now());";
		try {
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public boolean checkExitUsername(String username) {
		boolean duplicate = false;
		String query = "SELECT * FROM member where username= ?;";

		try {
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			rs = ps.executeQuery();

			if(rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return duplicate;
	}
	public boolean checkExitEmail(String email) {
		boolean duplicate = false;
		String query = "SELECT * FROM member where email=?;";

		try {
			conn = DBConnection.getConnect();
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();

			if(rs.next()) {
				duplicate = true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return duplicate;
	}
		
	public boolean register(String username, String password, String email) {
		if(checkExitUsername(username) || checkExitEmail(email)) {
			return false;
		}
		else {
			insertMember(username, password, email);
			return true;
		}
		
	}
}
