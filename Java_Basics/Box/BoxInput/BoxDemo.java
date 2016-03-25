import java.util.Scanner;
class Box
{
int a,b,c;
void values()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the value of a");
 a=s.nextInt();
 System.out.println("Enter the value b");
 b=s.nextInt();
 System.out.println("Enter the value of c");
 c=s.nextInt();

System.out.println("value of a= "+a+" value of b= "+b+ " value of c= " +c );

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
