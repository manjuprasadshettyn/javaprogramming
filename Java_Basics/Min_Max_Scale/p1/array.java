package p1;
import java.lang.*;
import java.util.*;
import java.io.*;
public class array
{
	int a[],size;
	public array(int size)
        {
		a=new int[size];
        }
	public void getarray(int n)
        {
		
		int i;
		for(i=0;i<n;i++)
       		{
			Scanner s = new Scanner(System.in);

			a[i]=s.nextInt(); 
        	}
	}
	
	
	public int min(int n)
	{
		int small,i;
		small=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
				
			}
		}
		return(small);
	}
	public int max(int n)
	{
		int max,i;
		max=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		return(max);
	}
	public void sort(int n)
	{
		int i,j,temp;
		int b[]=new int[20];
		for(i=0;i<n;i++)
			b[i]=a[i];
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(b[j]>b[j+1])
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
	public void reverse(int n)
	{
		int b[]=new int[10];
		int i,j;
		for(i=n-1,j=0;i>=0;i--,j++)
		{
			
			b[j]=a[i];
			
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
	public void scale(int n,int x)
	{
		
		int i;
		for(i=0;i<n;i++)	
			a[i]=a[i]*x;
		System.out.println("Multiplied array");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
			
	}
}		
		
		
	