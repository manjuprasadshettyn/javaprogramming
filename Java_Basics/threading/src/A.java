
public class A extends Thread
{
int i;
public void run()
{
	for(i=0;i<5;i++)
	{
		System.out.println("\nFrom thread A\n"+i);
		
	}
	System.out.println("\nExit from A\n");
}
}
