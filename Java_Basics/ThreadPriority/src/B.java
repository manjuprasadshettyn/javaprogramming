
public class B extends Thread {
	public void run()
	{
	int j;
	for(j=0;j<5;j++)
	{
		System.out.println("\n In thread B\n" +j);
		
	}
System.out.println("\n Exit from B\n");
}

	

}
