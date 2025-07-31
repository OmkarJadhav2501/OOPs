import java.util.Scanner;
class SumEvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,SumE=0,SumO=0,i;
System.out.println("Enter the Size oF Array:");
int a[] =new int[n];
System.out.println("Enter the array element:");
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	if(a[i]%2==0)
	{
		SumE=SumE+a[i];
	}
	else
	{
		SumO=SumO+a[i];
	}
}
System.out.println("Sum of even number is:"+SumE);
System.out.println("Sum of odd number is:"+SumO);
}
}