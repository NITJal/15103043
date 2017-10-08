import java.util.Scanner;

public class Two {
	public static void main(String args[]) throws Exception
	{
		//name
		System.out.println("Name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int len = name.length();
		for(int i = 0;i < len;i++)
		{
			if(!((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z')))
			{
				throw new Exception("Invalid name.Use only Alphabets");
			}	
		}
		
		//e-mail
		System.out.println("E-mail:");
		String email = sc.nextLine();
		len = email.length();
		if (email.indexOf('@') < 0 || email.indexOf('.') < 0)
		{
			throw new Exception("Invalid E-mail");
		}
		
		//number
		System.out.println("Number:");
		String number = sc.nextLine();
		len = number.length();
		if(len != 8 )
			throw new Exception("Invalid Number,Enter 8 digits");
		for(int i = 0;i < len;i++)
		{
			if(!(number.charAt(i)>='0' && number.charAt(i)<='9'))
				throw new Exception("Invalid Number");
		}
		//address
		System.out.println("Address:");
		String address = sc.nextLine();
		
		//mobile
		System.out.println("Mobile no :");
		String mnumber = sc.nextLine();
		len = mnumber.length();
		if(len != 10 )
			throw new Exception("Invalid Number,Enter 10 digits");
		for(int i = 0;i < len;i++)
		{
			if(!(mnumber.charAt(i)>='0' && mnumber.charAt(i)<='9'))
				throw new Exception("Invalid Number");
		}
		
		//marks
		System.out.println("Enter the percentage in Hec and Ug");
		double hec = sc.nextDouble();
		double ug = sc.nextDouble();
		if(hec > 100 || hec < 0)
			throw new Exception("Invalid marks in hec");
		if(ug > 100 || ug < 0)
			throw new Exception("Invalid marks in ug");
		
		//eligibility
		if(hec >= 60 && ug > 70)
			System.out.println("Eligible");
		else
			System.out.println("Not-Eligible");
		
		
		
		sc.close();
		
	}
	
}
