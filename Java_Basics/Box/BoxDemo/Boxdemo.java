class Box
{
 double width;
 double height;
 double length;

public Box()
{
 height=0.0;
 width=0.0;
 length=0.0;
}

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

class Boxdemo
{ 
 public static void main(String args[])
 {
  Box box1=new Box();
  double vol1=box1.volume();
  System.out.println("Volume of Box1 " +vol1);

  Box box2=new Box(10,20,40);
  double vol2=box2.volume();
  System.out.println("Volume of Box2 " +vol2);
 }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

