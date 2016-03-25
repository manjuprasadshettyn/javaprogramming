 import p1.*;
import java.io.*;
import java.util.*;
import java.lang.*;
class arrayDemo
{
	public static void main(String args[])
	{
		int n,i,x;
		array a1=new array(50);
		System.out.println("Enter the size of the array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the array");
		a1.getarray(n);


		System.out.println("Minimum element in the array is:");
		int small=a1.min(n);
		System.out.println(small);
					
				
		System.out.println("Maximum element in the array is:");			
		int large=a1.max(n);
		System.out.println(large);
					
		System.out.println("Sorted array is:");
		a1.sort(n);
					
		System.out.println("Reversed array is:");
		a1.reverse(n);
		
		System.out.println("Enter the scalar to multiply:");
		Scanner s3=new Scanner(System.in);
		x=s3.nextInt();
		a1.scale(n,x);
		
	}
}
		
		
		
				
				
	
	