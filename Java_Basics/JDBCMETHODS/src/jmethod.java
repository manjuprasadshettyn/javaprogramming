import java.sql.*;
import java.util.*;
public class jmethod
{
	private static Connection link;
	private static Statement statement;
	private static ResultSet results;
    void displaytable() throws SQLException
	{
			statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			System.out.println("\nInitial contents of table:\n");
			String select = "SELECT * FROM nmamitstudent";
			results = statement.executeQuery(select);
			System.out.println(" usn \t name \t age");
			while (results.next())
				{
					System.out.print(results.getString(1)+"\t");
					System.out.print(results.getString(2)+"\t");
					System.out.println(results.getString(3));
				}
		
	}
	void inserttable()throws SQLException
	{
		statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			Scanner s=new Scanner(System.in);
			System.out.println("enter the usn");
			String usn=s.next();
			System.out.println("enter the name");
			String name=s.next();
			System.out.println("enter the branch");
			 String branch=s.next();
			results.moveToInsertRow();
			results.updateString("usn",usn);
			results.updateString("name", name);
			results.updateString("branch", branch);
			results.insertRow();
		
		link.close();
	}
	
	void updatetable() throws SQLException
	{
	         statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			results.absolute(1);	//(Move to row 2 of ResultSet.)
			results.updateString("usn","123");
			results.updateString("name", "abcd");
			results.updateString("branch","is");
			results.updateRow();
		
		link.close();
	}
	void deletetable() throws SQLException
	{
		statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			displaytable();
		   System.out.println("Enter the row to delete");
		   Scanner s1=new Scanner(System.in);
		   int no=s1.nextInt();
			results.absolute(no); 	//Move to row 3.
			results.deleteRow();
		
		link.close();
	}
	
	void displaySpecific() throws SQLException
	{
		statement = link.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
		   System.out.println("Enter the usn or name of the student  to display");
		   Scanner s2=new Scanner(System.in);
		   String n = s2.nextLine();
		   String st="SELECT * from nmamitstudent where name="+ 'n' + " or usn="+ 'n' + " ";
			results = statement.executeQuery(st);
			System.out.println(" usn \t name \t age");
			while (results.next())
				{
					System.out.print(results.getString(1)+"\t");
					System.out.print(results.getString(2)+"\t");
					System.out.println(results.getString(3));
				}
		
		link.close();
	}
	public static void main(String[] args) throws SQLException
	{
	   boolean f=true;
	   jmethod d1 = new jmethod();	
	try {
	   Class.forName("com.mysql.jdbc.Driver");
	   link = DriverManager.getConnection("jdbc:mysql://172.16.2.3/student", "student", "student");
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

        System.out.println("\nInitial contents of table:\n");
		d1.displaytable();
		System.out.println("1:insert   2:delete   3:display  4:update  5:display specific record 6:exit");
		while(f)
		{
			System.out.println("\nenter your option");
			Scanner s=new Scanner(System.in);
			int op=s.nextInt();
			switch(op)
			{
				case 1: d1.inserttable();
				
						break;
				case 2:d1.deletetable();
				
						break;
				case 3:d1.displaytable();
						break;
				case 4:d1.updatetable();
				
						break;
				case 5:d1.displaySpecific();
				       break;
		
				case 6:f=false;
			}
		
  		}
    }
}	

		

