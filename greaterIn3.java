import java.util.Scanner;
public class greaterIn3
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a:");
		a=sc.nextInt();

		System.out.println("Enter the b:");
		b=sc.nextInt();

		System.out.println("Enter the c:");
		c=sc.nextInt();
		
		if(a>b || b>c)
		{
			if(a>c)
			{
				System.out.println("a is greater among 3");
			}
			else
			{
				System.out.println("b is greater among 3");
			}
		}
		else
		{
			System.out.println("c is greater among 3");
		}
	}
}