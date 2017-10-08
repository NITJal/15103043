import java.util.Scanner;

class WrongPinException extends RuntimeException
{
	String str;
	WrongPinException(String s)
	{
		this.str = s;
	}
}

class InvalidAmount extends RuntimeException
{
	String str;
	InvalidAmount(String s)
	{
		this.str = s;
	}
}

class InsufficientBal extends RuntimeException
{
	String str;
	InsufficientBal(String s)
	{
		this.str = s;
	}
}

class InvalidChoice extends RuntimeException
{
	String str;
	InvalidChoice(String s)
	{
		this.str = s;
	}
}
class Account
{
	int pin;
	int balance;
	public Account(int pin,int balance)
	{
		this.pin = pin;
		this.balance = balance;
	}
	public boolean Pin(int p)
	{
		if(pin == p)
			return true;
		else
			throw new WrongPinException("Invalid Pin");
	}
	public void Deposit(int amount)
	{
		balance += amount;
		System.out.println("Available balance : "+ balance);
	}
	
	public void Withdraw(int amt)
	{
		if(amt%100 != 0)
		{
			throw new InvalidAmount("Try a multiple of hundred");
		}
		if(amt < 100)
		{
			throw new InvalidAmount("Minimum withdrawl is Rs. 100");
		}
		if(balance > amt)
		{
			balance -= amt;
			System.out.println("Available balance:" + balance);
		}
		else 
			throw new InsufficientBal("Insufficient Balance,Available Bal :"+balance);
	}
}

public class One {
	public static void main(String args[])
	{
		System.out.println("Enter the pin: ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		Account a = new Account(1000,2000);
		try{
			a.Pin(pin);
		}
		catch(WrongPinException e){
			System.out.println(e.str);
		}
		if(a.Pin(pin))
		{
			System.out.print("Enter your choice:\n1.Deposit\n2.Withdraw\n3.Check Balance\n");
			int choice = sc.nextInt();
			int b;
			switch(choice)
			{
				case 1:
					System.out.println("Enter The Amount:");
					b = sc.nextInt();
					a.Deposit(b);
					break;
				case 2:
					System.out.println("Enter The Amount:");
					b = sc.nextInt();
					try{
						a.Withdraw(b);
					}
					catch(InsufficientBal e)
					{
						System.out.println(e.str);
					}
					catch(InvalidAmount e)
					{
						System.out.println(e.str);
					}
					break;
				case 3:
					System.out.println("Availble balance:"+a.balance);
					break;
				default:
					try{
						throw new InvalidChoice("Please choose from the given options.");
					}
					catch(InvalidChoice e)
					{
						System.out.println(e.str);
					}
			}
		}
	}
}
