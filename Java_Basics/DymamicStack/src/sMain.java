
public class sMain {

	public static void main(String args[]) {
		Stack mystack = new Stack(5);
		Stack tempstack = new Stack(8);
		// these loops cause each stack to grow
		for(int i=0; i<12; i++) 
			mystack.push(i);
		for(int i=0; i<20; i++) 
			tempstack.push(i);
		System.out.println("Stack in mystack:");
		for(int i=0; i<12; i++)
		mystack.pop();
		mystack.display();
		System.out.println("Stack in tempstack:");

		for(int i=0; i<10; i++)
		tempstack.pop();
		tempstack.display();
		}
}
