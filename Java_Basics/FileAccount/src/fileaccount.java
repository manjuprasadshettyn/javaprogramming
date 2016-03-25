import java.io.*;

public class fileaccount
{
	private static final int Rec_Size=42;
	private static final int Nam_Size=15;
	private static RandomAccessFile ranAccts;
	public static void writeRecord(long accnum,String name,float balance) throws IOException
	{
		long filepos=ranAccts.length();
		//filepos=(accnum-1)*Rec_Size;
		ranAccts.seek(filepos);
		ranAccts.writeLong(accnum);
		writeString(name,Nam_Size);
		ranAccts.writeFloat(balance);
	}
	
	public static void writeString(String text,int fixedSize) throws IOException
	{
		int size=text.length();
		if(size<=fixedSize)
		{
			ranAccts.writeChars(text);
			for(int i=size;i<fixedSize;i++)
			{
				ranAccts.writeChar(' ');
			}
		}
		else
		{
			ranAccts.writeChars(text.substring(0,fixedSize));
		}
	}

	public static void showRecord() throws IOException
	{
		long numRecords=ranAccts.length()/Rec_Size;
		ranAccts.seek(0);
		System.out.printf("ACC No \t NAME \t \t BALANCE \n");
		for(int i=0;i<numRecords;i++)
		{
			long accnum=ranAccts.readLong();
			String name=readString(Nam_Size);
			float balance=ranAccts.readFloat();
			System.out.println("" + accnum + " \t" + name +  " " + balance);
			}		
		
	}
	public static String readString(int fixedSize) throws IOException
	{
	String value = ""; //Set up empty string.
	for (int i=0; i<fixedSize; i++)
	//Read character and concatenate it onto value...
	value+=ranAccts.readChar();
	return value;
	}
	
	public static void main(String args[]) throws IOException
	{
		ranAccts=new RandomAccessFile("acc.txt","rw");
		writeRecord(1000,"Joseph",800);
		writeRecord(1279,"sunil",600);
		showRecord();
	}
	
}