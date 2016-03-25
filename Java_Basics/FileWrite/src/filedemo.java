import java.io.*;
import java.util.*;
public class filedemo {
 public static void main(String args[])throws IOException
 {
	 String fileName;
	 int mark,i;
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the name of the file");
	 fileName=input.nextLine();
	 PrintWriter output=new PrintWriter(new File(fileName));
	 System.out.println("two marks needed");
	 for(i=1;i<3;i++)
	 {
		 System.out.println("enter marks"+i);
		 mark=input.nextInt();
		 output.println(mark);
		 output.flush();
	 }
	 output.close();
 }
}
