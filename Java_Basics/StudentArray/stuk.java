import java.io.*;
import java.util.*;

 class func
  {
    String name;
    int roll;

   public void read()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter Student name is ");
        name=s1.nextLine();
        System.out.println("enter Student roll is ");
        roll=s1.nextInt();
    }

   public void display()
    {
       System.out.println("Student name is "+ name);
       System.out.println("Student roll is "+ roll);
    }
  }

 public class stuk
  {
   public static void main(String args[])throws Exception
    {
       int n;
       System.out.println("enter the no of students");
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       func ob[]=new func[10];
        try
         {
           for(int i=0;i<n;i++)
            {
              ob[i]=new func();
              ob[i].read();
         }
      }

     catch(ArrayIndexOutOfBoundsException e)
       {
         System.out.println(e);
       }

      System.out.println("enter a char");
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in)); //to read a character
      char t=(char)b.read();
      int f=0;

      for(int i=0;i<n;i++)
        {
          String sec=ob[i].name;
           if(sec.charAt(0)==t)
            {
               f=1;
               ob[i].display();
               break;
            }
        } 

      if(f==0)
        {
           System.out.println("not found");
        }
    }
}
