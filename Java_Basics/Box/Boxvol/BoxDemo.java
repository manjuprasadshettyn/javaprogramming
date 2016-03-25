import java.util.Scanner;
class Box1
{
double height,length,width;
public Box1()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the height");
 height=s.nextInt();
 System.out.println("Enter the width");
 width=s.nextInt();
 System.out.println("Enter the length");
 length=s.nextInt();
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
  Box1 box1=new Box1();
  double vol1=box1.volume();
  System.out.println("Volume of Box1 " +vol1);
 }
}
