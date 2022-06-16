package com.google;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Database {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement createStatement = connection.createStatement();
		String query="select *from employee";
		ResultSet result = createStatement.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getInt(1)+ " "+result.getString(2)+" "+result.getString(3));
			//System.out.println(result.getString(2));
			//System.out.println("row id is" +result.getRowId(1));
			//System.out.println(result.getString(3));


		}*/
		//connection.close();
		Actionsdata actionsdata = new Actionsdata();
		actionsdata.getConnection();
		boolean cond=true;
		Scanner scanner=new Scanner(System.in);
		while(cond)
		{
			System.out.println("menu (Enter Add, delete,update ,exit based on your selection)\n"+"Add employee\n"+"select display all data\n"+"delete employee\n"+"update employee details\n"+"exit selection");
			//String cond = "";
			
			String choice=scanner.nextLine();
			

			switch(choice)
			{
			case "add":
				System.out.println("insert new customer details");
				int id=scanner.nextInt();
				String name=scanner.next();
				String address= scanner.next();

				actionsdata.addData(id, name, address);
				break;
			case "delete":
				System.out.println("enter id to delete");
				int eid=scanner.nextInt();
				actionsdata.deletedata( eid);
				break;
			case "update":
				System.out.println("edit customer");
				System.out.println("enter id to update:");
				int uid =  scanner.nextInt();
				System.out.println("enter address to update");
				String addr = scanner.next();

				actionsdata.updatedata( uid, addr);
				break;
			case "select":
				System.out.println("select all data");
				actionsdata.selectdata();
				break;
			case "exit" :
				cond=false;
				System.out.println("exit");
				break;
			default:
				System.out.println("there is no such selection");
				break;

			}
			

		}

		//connection.close();
		scanner.close();
	}
}
