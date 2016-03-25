import java.io.*;
import java.util.*;

class MyEvenException extends Exception
{
  private int n;
  MyEvenException(int a)
  {
       n=a;
   }
   
  public String toString()
  {
      return n+"is a Even Number";
  }
}

class MyOddException extends Exception
{
  private int n;
  MyOddException(int a)
  {
       n=a;
   }
   
  public String toString()
  {
      return n+"is a odd Number";
  }
}

class evenodd
{

    static void even_odd(int a) throws MyEvenException,MyOddException
   {
       if(a%2==0)
	      throw new MyEvenException(a);
	    else
          throw new MyOddException(a);	
    }
	
    public static void main(String args[])
	{
    int a[]=new int[5];
	System.out.println("Enter 5 array elements:");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++)
	  a[i]=s.nextInt();
	for(int i=0;i<5;i++)  
	  {
	  try
	     {
		   even_odd(a[i]);
		 }
		 catch(MyEvenException e)
		  {
		     System.out.println(e);
		   }
		  catch(MyOddException e)
		  {
		     System.out.println(e);
		   }
		 }
     }
}
		   