import java.util.Scanner;
class Box
{
String a;
void values()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the value of string");
 a=s.nextLine();

System.out.println("String a is = "+a );

}

}

class BoxDemo
{ 
 public static void main(String args[])
 {
  Box box1=new Box();
  box1.values();

 }
}
