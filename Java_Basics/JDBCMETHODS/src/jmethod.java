import java.sql.*;//15th prgram
import java.util.*;
import java.io.*;
 class JDBC2Mods
{
	private static Connection link;
	private static Statement statement;
	private static ResultSet results;
	void displaytable()throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			link = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
			}
		catch(ClassNotFoundException cnfEx)
		{
			System.out.println("* Unable to load driver! *");
			System.exit(1);
		}
		catch(SQLException sqlEx)
		{
		System.out.println("* Cannot connect to database! *");
		System.exit(1);
		}
		
			statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);

		
			System.out.println("\nInitial contents of table:\n");
			String select = "SELECT * FROM addd";
			results = statement.executeQuery(select);
			System.out.println("nam \t usn \t age");
			while (results.next())
				{
					System.out.print(results.getString(1)+"\t");
					System.out.print(results.getInt(2)+"\t");
					System.out.println(+results.getInt(3));
				}
		
	}
	void inserttable()throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			link = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
			}
		catch(ClassNotFoundException cnfEx)
		{
			System.out.println("* Unable to load driver! *");
			System.exit(1);
		}
		catch(SQLException sqlEx)
		{
			System.out.println("* Cannot connect to database! *");
			System.exit(1);
		}
		
			Scanner s=new Scanner(System.in);
			System.out.println("enter the usn");
			String usn=s.next();
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the age");
			 int age=s.nextInt();
			results.moveToInsertRow();
			results.updateString("usn",usn);
			results.updateString("name", name);
			results.updateInt("age", age);
			results.insertRow();
		
		link.close();
	}

	void updatetable() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			link = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
			}
		catch(ClassNotFoundException cnfEx)
		{
			System.out.println("* Unable to load driver! *");
			System.exit(1);
		}
		catch(SQLException sqlEx)
		{
			System.out.println("* Cannot connect to database! *");
			System.exit(1);
		}
System.out.println("enter the row to be updated");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
			results.absolute(a);	//(Move to row 2 of ResultSet.)
System.out.println("enter the name");
                         String d=s.next();
			results.updateString("name", d);
			results.updateRow();
		
		link.close();
	}
	
	void deletetable() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			link = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
			}
		catch(ClassNotFoundException cnfEx)
		{
			System.out.println("* Unable to load driver! *");
			System.exit(1);
		}
		catch(SQLException sqlEx)
		{
			System.out.println("* Cannot connect to database! *");
			System.exit(1);
		}
			results.absolute(1); 	//Move to row 3.
			results.deleteRow();
		
		link.close();
	}
}
class operationjava
{

	public static void main(String args[]) throws SQLException
  	{
     	boolean f=true;
		JDBC2Mods d1 = new JDBC2Mods();	
		d1.displaytable();
		System.out.println("1:insert   2:delete   3:display  4:update  5:exit");
		while(f)
		{
			System.out.println("\nenter your option");
			Scanner s=new Scanner(System.in);
			int op=s.nextInt();
			switch(op)
			{
				case 1:d1.inserttable();
				
						break;
				case 2:d1.deletetable();
				
						break;
				case 3:d1.displaytable();
						break;
				case 4:d1.updatetable();
				
						break;
				case 5:f=false;
			}
		
  		}	
	}  
}  		


