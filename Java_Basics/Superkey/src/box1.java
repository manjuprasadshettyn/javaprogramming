
public class box1 extends box{

	 int weight;
	 box1()
	 {
		 super();
		 weight=10;
	 }
	 box1(int len, int wt)
	 {
		 super(len);
		 weight=wt;
	 }
	 box1(int a,int b,int c,int wt)
	 {
		 super(a,b,c);
		 weight=wt;
	 }
	 void showk()
	 {	
		 System.out.println("value of wt is "+weight);
	 }

}
