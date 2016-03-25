
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		a1.start();
		b1.start();
		c1.start();

	}

}
