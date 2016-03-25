
 class Thread1 implements Runnable 
{
	Thread t;	
	int row;
       Matrix m1, m2, m3;
	Thread1(int i, Matrix mat1, Matrix mat2, Matrix mat3)
         	{	
			t = new Thread(this, "Thread "+i);
			row=i;
			m1=mat1;
			m2=mat2;
			m3=mat3;
                	t.start();      // Start the thread
		}
	public void run() 
		{
        		m3.MulMatrix(m1, m2, row); 
		} 
}