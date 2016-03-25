import java.sql.*;
import java.io.*;
import java.util.*;

public class Jdbc1
{
	int ch;
	String usn,fname,lname;
	Scanner input=new Scanner(System.in);
	Statement stmt;
	Connection con;
	Jdbc1() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student","student");
		stmt=con.createStatement();
		
		while(true)
		{
		System.out.println("Enter 1.Insert 2.Delete 3.Upadate 4.DisplayAll 5.Display 6.Exit");
		ch=input.nextInt();
		switch(ch)
		{
			case 1:insert();break;
			case 2:delete();break;
			case 3:update();break;
			case 4:display("select * from sv");break;
			case 5:display(null);break;
			case 6:System.exit(0);
			default:System.out.println("Invalid Choice");
		}}
		
	}
	
	
	
	void insert() throws Exception
	{
		
		System.out.println("Enter USN :");
		usn=input.next();
		System.out.println("Enter Student First Name :");
		fname=input.next();
		System.out.println("Enter Student Last Name :");
		lname=input.next();
		stmt.executeUpdate("insert into sv values('"+usn+"','"+fname+"','"+lname+"');");
		System.out.println("Record inserted sucessfully");
	}
	
	void delete() throws Exception
	{
		
		System.out.println("Enter USN to delete record :");
		usn=input.next();
		stmt.executeUpdate("delete from sv where usn='"+usn+"';");
		System.out.println("Record deleted sucessfully");
	}
	
	void update() throws Exception
	{
		
		System.out.println("Enter USN to update record:");
		usn=input.next();
		System.out.println("Enter Student First Name :");
		fname=input.next();
		System.out.println("Enter Student Last Name :");
		lname=input.next();
		stmt.executeUpdate("update sv set fname='"+fname+"',lname='"+lname+"' where usn='"+usn+"';");
		System.out.println("Record updated sucessfully");
	}
	
	void display(String qry) throws Exception
	{
		ResultSet rs;
		if(qry==null)
		{
		System.out.println("Enter USN to display record :");
		usn=input.next();
		qry="select * from sv where usn='"+usn+"';";
		}
		rs=stmt.executeQuery(qry);
		System.out.println("");
		System.out.println("USN\tFirstName      LastName");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
		}
		System.out.println("");
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Jdbc1 obj=new Jdbc1();
	
	}
	}
