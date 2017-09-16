package one;
import java.util.Scanner;

public class One_b {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m,n,i,j,k,l,x;
		System.out.println("Enter the size of 1st matrix");
		m = sc.nextInt();
		n = sc.nextInt();
		
		int one[][] = new int[m][n];
		System.out.println("Enter the elements");
		for(i = 0;i < m;i++)
		{
			for(j = 0;j < n;j++)
			{
				one[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the size of 2nd matrix");
		k = sc.nextInt();
		l = sc.nextInt();
		
		int two[][] = new int[k][l];
		System.out.println("Enter the elements");
		for(i = 0;i < k;i++)
		{
			for(j = 0;j < l;j++)
			{
				two[i][j] = sc.nextInt();
			}
		}
		
		if(n != k){
			System.out.println("Cannot multiply");
			System.exit(0);
		}
		else
		{
			int three[][] = new int [m][l];
			for(i = 0;i < m;i++)
			{
				for(j = 0;j < l;j++)
				{
					for(x = 0;x < n;x++)
					{
						three[i][j]  = three[i][j] + one[i][x]*two[x][j];
					}
				}
			}
			for(i = 0;i < m;i++)
			{
				for(j = 0;j < l;j++)
				{
					System.out.print( three[i][j] + " ");
				} 
				System.out.print("\n");
			}
		}
		sc.close();
	}
}
