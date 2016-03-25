
public class demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int vol;
		box a1=new box();
		a1.show();
		
		box a2=new box(10,20,30);
		a2.show();
		vol=a2.volume();
		System.out.println("volume is "+vol);
		
		box1 b2=new box1(10,20);
		b2.show();
		b2.showk();
		System.out.println("volume is "+b2.volume());
		
		box1 b1 = new box1(10,20,30,5);
		b1.show();
		b1.showk();
		
		b1.showk();
       
       
       
	}

}
