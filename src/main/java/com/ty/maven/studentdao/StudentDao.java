package com.ty.maven.studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.maven.student.util.ConnectionObject;
import com.ty.maven.studentdto.Student;

public class StudentDao {
	
	
	public int saveStudent(Student student)
	{
		Connection connection=ConnectionObject.getConnection();
		String sql="Insert into student values(?,?,?,?)";
		int resultCount=0;
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setString(4, student.getPhone());
			
			resultCount=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
		
		
	}
	
	
	public void deleteStudentById(int id)
	{
		Connection connection=ConnectionObject.getConnection();
		String sql="Delete FROM student where id=?";
		
		try {

		
		PreparedStatement  preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
			connection.close();
			System.out.println("Data deleted");	
	}
		 catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void updateStudent(int id, String name, String email , String phone)
	{
		Connection connection=ConnectionObject.getConnection();
		String sql="UPDATE  student SET name=?,email=? ,phone=? where id=?";
		
		try {
			PreparedStatement  preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1,name );
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, phone);
			preparedStatement.setInt(4, id);
			preparedStatement.execute();
				connection.close();
				System.out.println("Data updated");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void getStudentVById(int id)
	{
		String sql="SELECT * FROM student WHERE id=?";
		Connection  connection=ConnectionObject.getConnection();
	
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			int id1=resultSet.getInt(1);
			String name=resultSet.getString(2);
			String email=resultSet.getString(3);
			String phone=resultSet.getString(4);
			System.out.println("Id Is:"+id1);
			System.out.println("Name Is:"+name);
			System.out.println("Email Is:"+email);
			System.out.println("phone Is:"+phone);
			System.out.println("******************");
			}
			connection.close();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
	}
		

	

}
