package com.google;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Actionsdata {
	
	Connection connection;
	Statement state;
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	}
	public void addData(int id,String name,String address) throws ClassNotFoundException, SQLException
	{
		
		 state=connection.createStatement();
		String sql="Insert into employee values("+id+",'"+name+"','"+address+"')";
		
		state.executeUpdate(sql);

	}

	public void deletedata(int eid) throws SQLException
	{

		 state=connection.createStatement();
		String sql="delete from employee " + "where id="+eid+"";
		state.executeUpdate(sql);


	}
	public void updatedata(int id,String addr) throws SQLException
	{
		state=connection.createStatement();
		String sql="update employee set address='"+addr+"' where id="+id+"";

		state.executeUpdate(sql);
	}
	public void selectdata() throws SQLException

	{
		state= connection.createStatement();
		String sql= "select * from employee";
		ResultSet resultset = state.executeQuery(sql);
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
		}

	}


}
