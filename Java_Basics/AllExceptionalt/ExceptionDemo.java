import java.util.Scanner;

class ExceptionTest{
void arithmeticException()
{ try{
int a=10;
int b=5;
int c=5;
int x=a/(b-c);
System.out.println("X= "+x);
int y=a/(b+c);
System.out.println("Y= "+y);
//throw new ArithmeticException("ExceptionTest");
} 
catch(ArithmeticException e)
{ System.out.println(e); }}
 void ArrayIndexOutOfBoundException()
{ try
{ int a[]=new int[4];
System.out.println(a[5]);}
 catch(ArrayIndexOutOfBoundsException e)
{ System.out.println(e); }} 
void nullPointerexception()
{ try
{ System.out.println("This is invalid use of null reference");
   throw new NullPointerException("test");}
 catch(NullPointerException e)
{System.out.println(e);}}
 void numberFormatException()
{ try
{throw new NumberFormatException("NumberFormat");}
 catch(NumberFormatException e)
{System.out.println(e);}}
void illegalAccessException()
{try	
{throw new IllegalAccessException("Illegel"); }
catch(IllegalAccessException e)
{System.out.println(e);} }}

 public class ExceptionDemo 
{public static void main(String args[])
{int choice;
boolean c=true;
Scanner sc=new Scanner(System.in);
ExceptionTest Exc=new ExceptionTest();
while(c)
{System.out.println("1:Arithmeticexception");
System.out.println("2:ArrayIndexOutofBoundexception");
System.out.println("3:Null pointer Exception");
System.out.println("4:Numberformat Exception");
System.out.println("5:Illegal Access");
System.out.println("6:Exit");
System.out.println("Enter your choice: ");
choice=sc.nextInt();
switch(choice)
{ case 1:
Exc.arithmeticException();
break;
case 2:
Exc.ArrayIndexOutOfBoundException();
break;
case 3:
Exc.nullPointerexception();
break;
case 4:
Exc.numberFormatException();
break;
case 5:
Exc.illegalAccessException();
break;
case 6:
c=false;
break;
default:System.out.println("Invalid choice");
break;}}}}
