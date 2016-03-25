package pack;
import java.util.*;
import java.lang.*;

public class Stexc
  {
     public String s;
	 public int rollno,i,j,t,count=0,n;
	/*public Stexc(int n1)
	 {
	    n=n1;
	  }*/
    
	 public void read()
	 {
     
	        Scanner s1=new Scanner(System.in);
		    System.out.println("Enter the name of the student");
		    s=s1.nextLine();
		    System.out.println("Enter the rollno of the student");
		    rollno=s1.nextInt();
			
		  
	  }
	  
	  public void display()
	  {
	         
		    System.out.println(s+""+rollno);
			
			
	 }
}
		 
		 
		    
		 
