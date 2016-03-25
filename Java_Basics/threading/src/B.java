
public class B extends Thread{
	int j;
	public void run()
	{
		for(j=0;j<5;j++)
		{

			System.out.println("\nFrom thread B\n"+j);
			
		}
		System.out.println("\nExit from B\n");
	}
	}
		
