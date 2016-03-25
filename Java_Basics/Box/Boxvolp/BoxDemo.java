import java.util.Scanner;
class Box
{
double height,length,width;
public Box(double h,double w,double l)
{
  height=h;
  width=w;
  length=l;
}

public double volume()
{
 return height*width*length;
}
}


class BoxDemo
{ 
 public static void main(String args[])
 {
double height,length,width;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the height");
 height=s.nextDouble();
 System.out.println("Enter the width");
 width=s.nextDouble();
 System.out.println("Enter the length");
 length=s.nextDouble();

  Box box2=new Box(height,width,length);
  double vol2=box2.volume();
  System.out.println("Volume of Box2 " +vol2);
 }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

