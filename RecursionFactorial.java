import java.util.*;
public class RecursionFactorial
{
	public int fact(int n)
	{
		int total=1;
		if(n>=1)
		{
			total=n*fact(n-1);
		}
	return total;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the value:");
		n=s.nextInt();
		RecursionFactorial f=new RecursionFactorial();
		int ans=f.fact(n);
		System.out.println("Factorial of number is:"+ans);
	}
}