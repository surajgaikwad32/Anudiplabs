package Assignment1;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			
			}
			for (int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
	}
	}
}
