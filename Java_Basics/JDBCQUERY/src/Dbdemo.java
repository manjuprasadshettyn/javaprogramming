import java.io.*;
import java.util.*;
import java.sql.*;
class Dbdemo
{
  void displayinfo() throws SQLException
  {
 	try
 {    
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
Statement stm = con.createStatement ( );
String s = "SELECT * FROM nmamitstudent";
ResultSet rs = stm.executeQuery (s); 
while(rs.next())
{
	   System.out.println(rs.getString(1) + "\t" + rs.getString(2)+"\t"+rs.getString(3));
}
rs.close();
	stm.close();
	con.close();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
  }
  void displayspecific() throws SQLException
  {
 	try
 {    
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
Statement stm = con.createStatement ( );


       DataInputStream d = new DataInputStream(System.in);
		System.out.println("Enter the usn");
		String rg1 = d.readLine();
String s = "SELECT * FROM nmamitstudent where usn='"+rg1+"'";
ResultSet rs = stm.executeQuery (s); 
while(rs.next())
{
	   System.out.println(rs.getString(1) + "\t" + rs.getString(2)+"\t"+rs.getString(3));
}
rs.close();
	stm.close();
	con.close();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
  }
void insertinfo() throws SQLException
  {
 	try
 	{   
		String usn,name,dept; 
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
		Statement stm = con.createStatement ( );
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the usn");
		usn=s1.next();
		System.out.println("enter the name");
		name=s1.next();
		System.out.println("enter the dept");
		dept=s1.next();

		String s = "insert into nmamitstudent values('"+usn+"','"+name+"','"+dept+"')";
		int rs = stm.executeUpdate (s); 

		System.out.println(rs +"rows affected");

			stm.close();
			con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }
void deleteinfo() throws SQLException
  {
 	try
 	{    
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con =
		DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");

		 Statement stm = con.createStatement ( ); 
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Enter the usn");
		String rg = d.readLine();
		

		String s2 = "DELETE FROM nmamitstudent WHERE usn='" +rg +"'" ;
		stm.executeUpdate (s2);
     		System.out.println("Database updated successfully!!!!");
		stm.close();
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }
void updateinfo() throws SQLException
  {
 	try
 	{    
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con =
		DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");

 		Statement stm = con.createStatement ( ); 
		DataInputStream d = new DataInputStream(System.in);
		System.out.println("Enter the usn");
		String rg = d.readLine();
		System.out.println("enter the name");
		String name=d.readLine();
		String s3 = "update nmamitstudent set name='" +name+"' where usn='"+rg+"'" ;
		stm.executeUpdate (s3);
     		System.out.println("Database updated successfully!!!!");
		stm.close();
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  }
 }
class operation
{
 public static void main(String args[]) throws SQLException
  {
     	boolean f=true;
	Dbdemo d1 = new Dbdemo();	
	d1.displayinfo();
	System.out.println("1:insert   2:delete   3:display  4:update  5:exit");
	while(f)
	{
		System.out.println("enter your option");
		Scanner s = new Scanner(System.in);
		int op=s.nextInt();
		switch(op)
		{
			case 1: d1.insertinfo();
				   break;
				   
			case 2: d1.deleteinfo();
				   break;
				   
			case 3: d1.displayinfo();
				   break;
				   
			case 4:d1.updateinfo();
				   break;
				   
			case 5:f=false;
		}
		
  	}	
}  
}  