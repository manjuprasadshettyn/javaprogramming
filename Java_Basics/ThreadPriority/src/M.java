
public class M {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		c1.setPriority(Thread.MAX_PRIORITY);
		a1.setPriority(Thread.MIN_PRIORITY);
		b1.setPriority(Thread.NORM_PRIORITY);
		a1.start();
		b1.start();
		c1.start();

	}

}
