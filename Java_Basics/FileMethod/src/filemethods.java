import java.io.*;
import java.util.*;
public class filemethods
{
	public static void main(String[] args) throws IOException{
	String FileName;
		Scanner input =new Scanner(System.in);
		System.out.println(" enter name of file");
		FileName=input.nextLine();


		File filedir =new File(FileName);
		long len=0;
		if(!filedir.exists())
		{
			System.out.println(FileName +" doesnt exists");
			System.exit(0);
		
		
		}
		System.out.println(FileName +" is a");
	if(filedir.isFile())

		System.out.println("file");
		else
			System.out.println("directory");
		System.out.println(FileName + " is");
		

	if(filedir.canRead())
			System.out.println("readable");
		else
			System.out.println(" not readable");
		System.out.println(FileName + "is");
		

	if(filedir.canWrite())

		System.out.println("writable");
		else
			System.out.println(" not writable");
		len =filedir.length();
		
			System.out.println("length of " + FileName +" is=" +len);
			input.close();
	}
	}
