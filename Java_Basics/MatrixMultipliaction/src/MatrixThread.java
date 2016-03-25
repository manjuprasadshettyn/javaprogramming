import java.util.Scanner;

class MatrixThread{
	public static void main(String args[]) 
	{
                int i, n;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the order of the matrix");
                n=s.nextInt();
                Matrix m1 = new Matrix(n);
                Matrix m2 = new Matrix(n);
                Matrix m3 = new Matrix(n);
	          System.out.println("Enter the elements of the matrix1");
                m1.ReadMatrix();
                System.out.println("Enter the elements of the matrix2");
		m2.ReadMatrix();
                System.out.println("Matrix1 is:");
                m1.DispMatrix();
                System.out.println("Matrix2 is:");
                m2.DispMatrix();
 Thread1 obj[]=new Thread1[n];
	
                for(i=0;i<n;i++)
		{	 
			obj[i]= new Thread1(i, m1, m2, m3);
                }

                try
		{ 
                        for(i=0;i<n;i++)
			{ 
                                obj[i].t.join(); 
			}
		} 
                catch(Exception e ) {
                	System.out.println(e);	
                }

                System.out.println("Resultant Matrix is:");
                m3.DispMatrix();
	}
}