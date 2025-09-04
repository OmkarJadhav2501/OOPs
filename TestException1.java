public class TestException1
{
public static void main(String args[])
{

int a=10,b=0;

int s=a-b;
System.out.println("Substraction is:"+s);

int m=a*b;
System.out.println("Multiplication is:"+m);

try
{
int c=a/b;
System.out.println("Division is:"+c);
}
catch(Exception e)
{
System.out.println("We can not any number by zero :"+e);
}

int d=a+b;
System.out.println("Addition is:"+d);
}

}