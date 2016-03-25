
public class C extends Thread{
	
		int k;
		public void run()
		{
			for(k=0;k<5;k++)
			{

				System.out.println("\nFrom thread C\n"+k);
				
			}
			System.out.println("\nExit from C\n");
		}
		}
			


