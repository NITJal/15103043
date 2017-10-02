package one;
import java.util.Scanner;

interface booleanExpression{
	public boolean EvaluateExpression(String s);
}

public class One implements booleanExpression {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		exp = exp.replaceAll("True", "1");
		exp = exp.replaceAll("False", "0");
		One a = new One();
		boolean ans = a.EvaluateExpression(exp);
		System.out.println(ans);
		sc.close();
	}
	public boolean EvaluateExpression(String s)
	{
		boolean a = true,b = true;
		int op =1,b_ready = 0;
		int n= s.length();
		if(s.charAt(1) == '1')
			a = true;
		else
			a = false;
		for(int i = 2;i < n;i++)
		{
			if(s.charAt(i) == '1' || s.charAt(i) == '0')
			{
				if(s.charAt(i) == '1')
					b = true;
				else
					b = false;
					
				b_ready = 1; 
			}
			
			else if(s.charAt(i) == 'A' || s.charAt(i) == 'O')
			{
				if(s.charAt(i) == 'A')
					op = 1;
				else
					op = 2;
			}
			else if(s.charAt(i) == '(' &&  i != 0)
			{
				b = EvaluateExpression(s.substring(i+1));
				b_ready = 1;
			}
			if(b_ready == 1)
			{
				if(op == 1)
					a = a&&b;
				else
					a = a||b;
				b_ready = 0;
			}
		}
		return a;
	}	
}
