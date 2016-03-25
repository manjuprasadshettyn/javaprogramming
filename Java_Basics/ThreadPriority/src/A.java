
public class A  extends Thread {
	public void run()
	{ int i;
		for(i=0;i<5;i++)
		{
			System.out.println("\n In thread A\n" +i);
			
		}
	System.out.println("\n Exit from A\n");
	}
	

}
