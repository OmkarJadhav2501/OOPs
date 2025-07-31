import java.util.*;
public class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element :"+i);
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println();
	}
	}
		

		