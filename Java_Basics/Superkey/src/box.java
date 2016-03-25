
public class box {
	int height,width,depth;
	box()
	{
		height=-1;
		width=-1;
		depth=-1;
	}
	
	box(int a)
	{
		height=a;
		width=a;
		depth=a;
	}
	
	box(int a,int b,int c)
	{
		height=a;
		width=b;
		depth=c;
	}
	void show()
	{
		 System.out.println("value of height is "+height+ " width is "+width+ " depth is " +depth);
	}
	int volume()
	{
		return width*height*depth;
		
	}
	
}
