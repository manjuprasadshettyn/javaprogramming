import java.io.*;

 class Callme {
	synchronized void call(String msg1,String msg2,String msg) {
		System.out.print(msg1+ msg);

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.print(msg2);
	}
}
class Caller implements Runnable {
	String msg,msg1,msg2;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s1,String s2,String s) {
		target = targ;
		msg = s;
		msg1=s1;
		msg2=s2;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		target.call(msg1,msg2,msg);
	}
}
class Synch1 {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target,"\"","\"" ,"NMAMIT");
		Caller ob2 = new Caller(target,"[","]" , "Nitte");
		Caller ob3 = new Caller(target, "(",")", "Autonomous Institute");
		Caller ob4 = new Caller(target, "{","}", "Karkala");
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			ob4.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

