import java.util.Scanner;

public class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,fact=1;
a=sc.nextInt();
for(int i=a;i>=1;i--)
{
fact=fact*i;
}
System.out.println("factorial is:"+fact);
}
}