package com.marco.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.marco.bean.UserBean;
import com.marco.service.DataSource;

public class UserDAOJdbcImpl implements UserDAO, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 678059478957532786L;

	@Override
	public Boolean login(UserBean user) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM public.user WHERE username=? and password=?";
		try{
			conn = DataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setAge(rs.getInt("age"));
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public Boolean exists(String username) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM public.user WHERE username=?";
		try{
			conn = DataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean insert(UserBean user) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String ins = "INSERT INTO public.user(username, password, firstname, lastname, age) "
				+ "VALUES (?, ?, ?, ?, ?);";
		
		if(exists(user.getUsername())){
			System.out.println(user.getUsername());
			return false;
		}
		
		try{
			conn = DataSource.getConnection();
			ps = conn.prepareStatement(ins);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setInt(5, user.getAge());
			
			System.out.println(Integer.toString(ps.executeUpdate()) + " rows inserted");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void delete(UserBean user) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String del = "DELETE FROM public.user WHERE username=?";
		
		
		try{
			conn = DataSource.getConnection();
			ps = conn.prepareStatement(del);
			ps.setString(1, user.getUsername());
			
			System.out.println(Integer.toString(ps.executeUpdate()) + " rows affected");
		
		}
		catch(SQLException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(UserBean user) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		String upd = "UPDATE public.user SET password=?, firstname=?, lastname=?, age=? WHERE username=?";
		
		if(exists(user.getUsername())){
			System.out.println(user.getUsername());
		}
		
		try{
			conn = DataSource.getConnection();
			ps = conn.prepareStatement(upd);
			ps.setString(5, user.getUsername());
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setInt(4, user.getAge());
			
			System.out.println(Integer.toString(ps.executeUpdate()) + " rows affected");
		}
		catch(SQLException e){
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

			
}
