package one;

import java.util.Scanner;

public class One_a {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Integer");
		int i,j,flag;
		int n = sc.nextInt();
		System.out.println(n);
		if(n == 1)
		{
			System.out.println("The prime number till the given interger is " + n);
			System.exit(0);
		}
		else if(n == 2)
		{
			System.out.println("The prime numbers till the given interger is 1," + n);
			System.exit(0);
		}
		else if(n == 3)
		{
			System.out.println("The prime numbers till the given interger is 1 2 " + n);
			System.exit(0);
		}
		else if(n > 3)
		{
			System.out.print("1 2");
			for(i = 4;i <= n;i++)
			{
				flag = 1;
				for(j = 2;j <= i/2;j++)
				{
					if( i%j == 0)
					{
						flag = 1;
						break;
					}
					else
						flag = 0;
				}
				if(flag == 0)
					System.out.print(" " + i);
			}
		}
		else
			System.out.println("Invalid Number");
		sc.close();
	}
}
