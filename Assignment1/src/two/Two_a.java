package two;
import java.util.Scanner;
import java.lang.StringBuffer;

public class Two_a {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer str = new StringBuffer(sc.nextLine());
		StringBuffer abc = new StringBuffer("");
		abc.append(str);
		str.reverse();
		if(str.toString().equals(abc.toString()))
			System.out.println("Yes it is a pallandrome");
		else
			System.out.println("No it is not a pallandrome");
		
		sc.close();
	}
}
