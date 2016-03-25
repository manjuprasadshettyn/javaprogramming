import pack.*;
import java.util.*;
import java.io.*;

public class Myexpt 
{
      static int i,j;
     static  Stexc st[]=new Stexc[3];
	  static void sort(int n)
	  {
	     try{
	     Stexc temp;
	    for(i=0;i<n-1;i++)
		  {
		    for(j=0;j<n-i-1;j++)
			 {
			   if(st[j].rollno>st[j+1].rollno)
			       {
				      temp=st[j];
					  st[j]=st[j+1];
					  st[j+1]=temp;
					}
			  }
		  }
		 }
		catch(ArrayIndexOutOfBoundsException  e)
		  {
		   }
		 }
	    
      public static void main(String args[])
	   {
	     int n,k=0;
		 Scanner s2=new Scanner (System.in);
          System.out.println("Enter the number of the student");
	      n=s2.nextInt();
	      
		  while(k<n)
		   {
		     try{
			   st[k] = new Stexc();
		           st[k].read();
			   //System.out.println("k"+k);
			  }catch(ArrayIndexOutOfBoundsException e)
			    {
				  System.out.println("Array index out of bounds exception caught");
				}
			k++;
		   }
		  sort(n);
		 System.out.println("Names and  rollnos in sorted order");
		 k=0;
		  while(k<n)
		   {
		     try{
		     st[k].display();
			  }catch(ArrayIndexOutOfBoundsException e)
			    {
				
				}
			k++;
		   }
		
	  }
}
	  
   