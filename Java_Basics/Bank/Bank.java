import java.io.*;
import java.util.*;
class customer
{
	String name;
	String accno;
	double balance;
	customer(String s,String a)
	{
		name=s;
		accno=a;
		balance=0;
	}
	
	void display()
	{
		System.out.println("\nName="+name+"\nAccount_no="+accno);
	}
}
class account extends customer
{
	String acc_type;
	double rate;
	
	account(String s,String accno,String at,double r)
	{
		super(s,accno);
		acc_type=at;
		rate=r;
	}
	
	void Deposit(int amt)
	{
		balance+=amt;
	}
	void Withdraw(int amt)
	{
		
		if((balance-amt)<=0)
			System.out.println("Minimum balance required");
		else
			balance=balance-amt;
	}
	double GetBalance()
	{
		return(balance);
	}
	void display()
	{
		super.display();
		System.out.println("\nAccount_type="+acc_type+"\nBalance="+balance+"\nRate_of_Interest"+rate);
	}
}
class Bank
{
	
	public static void main(String[] args)
	{
		
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name,account number,account type,rate of interest");
		String name=s.nextLine();
		String acc=s.nextLine();
		String acct=s.nextLine();
		double rate_=s.nextDouble();
		account a1=new account(name,acc,acct,rate_);	
		while(flag)
                {
		System.out.println("Press 1:Deposit\n2:withdraw\n3:GetBalance\n4:display\n5:exit");
		System.out.println("Enter option");
		int c=s.nextInt();
                
               
		switch(c)
		{
			case 1:System.out.println("Enter the amount");
				int amount=s.nextInt();
				a1.Deposit(amount);
				break;
			case 2:System.out.println("Enter the amount to be withdrawn");
				int at=s.nextInt();
				a1.Withdraw(at);
				break;
			case 3:double b=a1.GetBalance();
				System.out.println("Balance="+b);
				break;
			case 4:a1.display();
				break;
                        case 5:flag=false;
		}
             }
	}
}
				

			
		