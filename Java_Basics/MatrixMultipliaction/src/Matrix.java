import java.util.*;
import java.io.*;
class Matrix
{
	int m[][];
	int n; 
	Matrix(int ord)
	{	n=ord;
		m=new int[n][n];
	}
	void ReadMatrix()
	{	int i, j;
		Scanner s = new Scanner(System.in);
		for(i=0;i<n; i++)
		{ 
 			for(j=0;j<n;j++)
 			{ 
				try{ m[i][j]=s.nextInt(); }
   				catch(Exception e){ 
   				System.out.println(e);	
   				}   
   				}
}
}

void DispMatrix()
	{	int i, j;
		for(i=0;i<n;i++)
		{ 
			for(j=0;j<n;j++)
			{ 
                        	System.out.print(m[i][j]+ " "); 
			}
			System.out.println("");
		}
	}
	void MulMatrix(Matrix m1, Matrix m2, int row)
	{
		int j,k;
		for(j=0;j<n;j++)
		{ 
  			this.m[row][j]=0;
			for(k=0;k<n;k++)
			{ 
		 		this.m[row][j]=this.m[row][j]+m1.m[row][k]*m2.m[k][j]; 
			}
}}}

