import java.io.*;
import java.util.*;
public class RanFile1
{
    private static final int REC_SIZE = 48;
    private static final int SURNAME_SIZE = 15;
    private static final int NUM_INITS = 3;
    private static long acctNum = 0;
    private static String surname, initials;
    private static float balance;
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile ranAccts = new RandomAccessFile("accounts.dat", "rw");
        Scanner input = new Scanner(System.in);
        int op,recno;
        boolean flag=true;
        while(flag) {
                System.out.println("Press 1:insert new record 2:Display all records 3:Display specific record  4:exit");
                op=input.nextInt();
                switch(op)
                {

                        case 1: System.out.println("Enter a account information");
                                acctNum++;
                                System.out.println("\nAccount number " + acctNum + ".\n");
                                System.out.print("Surname: ");
                                input.nextLine();
                                surname = input.nextLine();
                                System.out.print("Initial(s): ");
                                initials = input.nextLine();
                                System.out.print("Balance: ");
                                balance = input.nextFloat();
                                //Now get rid of carriage return(!)...
                                input.nextLine();
                                writeRecord(ranAccts); //Method defined below.
                                break;
                        case 2:  showRecords(ranAccts);
                                break;
                        case 3: System.out.println("Enter a specific record number");
                                recno=input.nextInt();
                                displayRecord(ranAccts,recno);
                                break;
                        case 4: flag=false;
                                break;
                }
            }
    }
    public static void writeRecord(RandomAccessFile file)
    throws IOException
    {
        long filePos = (acctNum-1) * REC_SIZE;

        file.seek(filePos);

        file.writeLong(acctNum);
        writeString(file, surname, SURNAME_SIZE);
        writeString(file, initials, NUM_INITS);
        file.writeFloat(balance);
    }
    public static void writeString(RandomAccessFile file,
        String text, int fixedSize) throws IOException
    {
        int size = text.length();
        if (size<=fixedSize)
        {
            file.writeChars(text);

            for (int i=size; i<fixedSize; i++)
            file.writeChar(' ');
        }
        else
            file.writeChars(text.substring(0,fixedSize));

    }
    public static void showRecords(RandomAccessFile file)
    throws IOException
    {
        long numRecords = file.length()/REC_SIZE;
        file.seek(0); //Go to start of file.
        for (int i=0; i<numRecords; i++)
        {
            acctNum = file.readLong();
            surname = readString(file, SURNAME_SIZE);

            initials = readString(file, NUM_INITS);
            balance = file.readFloat();
            System.out.printf("" + acctNum + " " + surname + " " + initials + " "
            + "%.2f %n",balance);
        }
    }
    public static String readString(
    RandomAccessFile file, int fixedSize)
    throws IOException
    {
            String value = ""; //Set up empty string.
            for (int i=0; i<fixedSize; i++)

            value+=file.readChar();
            return value;

    }

    public static void displayRecord(RandomAccessFile file,int recno)
    throws IOException
    {

        long numRecords = file.length()/REC_SIZE;
        if(recno>numRecords)
            System.out.println("Number of records is less than"+recno);
        else
        {
            long filePos = (recno-1) * REC_SIZE;
            file.seek(filePos);
            acctNum = file.readLong();
            surname = readString(file, SURNAME_SIZE);

            initials = readString(file, NUM_INITS);
            balance = file.readFloat();
            System.out.printf("" + acctNum + " " + surname + " " + initials + " "
            + "%.2f %n",balance);
        }
    }
}
