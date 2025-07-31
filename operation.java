import java.util.Scanner;
class operation
{
	public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int a,b,c;
System.out.println(" enter the first number:");
	a=in.nextInt();
System.out.println(" enter the second number:");

	b=in.nextInt();
c=a+b;
System.out.println("sum is:"+c);
int d=a-b;
System.out.println(" subtraction is:"+d);
int e=a*b;
System.out.println(" multiplication  is:"+e);
int f=a/b;
System.out.println(" division is:"+f);




}
}