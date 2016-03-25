import java.io.*;
import java.util.*;
class number
{
int n;
synchronized void even(int n)
{
int i;
this.n=n;
System.out.println("Even numbers are:");
for(i=0;i<=n;i+=2)
System.out.print(i+" ");
System.out.println();
}
synchronized void odd(int n)
{
int i;
this.n=n;
System.out.println("Odd numbers are:");
for(i=1;i<=n;i+=2)
System.out.print(i+" ");
System.out.println();
}
}
class Thread1 implements Runnable
{
number obj1;
Thread t;
int n;
Thread1(int n,number ob)
{
this.n=n;
obj1=ob;
t=new Thread(this,"Thread1");
t.start();
}
public void run()
{
obj1.even(n);
}
}
class Thread2 implements Runnable
{
int n;
number obj2;
Thread t;
Thread2(int n,number obj)
{
this.n=n;
obj2=obj;
t=new Thread(this,"Thread2");
t.start();
}
public void run()
{
obj2.odd(n);
}
}
class Evenodd
{
public static void main(String args[])
{
number ob1=new number();
Scanner s=new Scanner(System.in);
System.out.println("Enter the range to print even n odd no.");
int n=s.nextInt();
Thread1 thread1=new Thread1(n,ob1);
Thread2 thread2=new Thread2(n,ob1);
try{
thread1.t.join();
thread2.t.join();
}
catch(Exception e){ }
}
}

