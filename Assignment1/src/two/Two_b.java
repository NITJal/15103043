package two;
import java.util.Scanner;

public class Two_b {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		
		System.out.println("Enter the number of names");
		n = sc.nextInt();
		String [] str = new String[n];
		
		System.out.println("Enter the names");
		for(i = 0; i < n; i++)
			str[i] = sc.next();
				
		for(i = 0; i < n; i++)
			str[i] = str[i].toLowerCase();
		
		String strT = new String("");
		for(i = 0; i < n; i++)
		{
			for(j = i+1; j < n; j++)
			{
				if(str[i].compareTo(str[j]) > 0)
				{
					strT = str[i];
					str[i] = str[j];
					str[j] = strT;
				}
			}
		}
		System.out.println("Sorted list:");
		for(i = 0; i < n; i++)
		{
			System.out.println(str[i]);
		}
		sc.close();
	}
}
