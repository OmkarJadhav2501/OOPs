public class Addition1
{
int a,b;
public Addition1()
{
this(10,20);
System.out.println("In No Argument constructor");

}
public Addition1(int a,int b)
{
int c=a+b;
System.out.println("In parametirized cobstructor: Addition is :"+c);
 
}
public static void main(String args[])
{
Addition1 a=new Addition1();
}

}