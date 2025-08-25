class SuperKeyword
{
public void mult(int a,int b)
{
int c=a*b;
System.out.println("In parent class mult is:"+c);
}
}
public class Super extends SuperKeyword
{
public void mult(int a,int b)
{
super.mult(12,10);
int c=a*b;
System.out.print("in child class mult is:"+c);
} 
public static void main(String args[])
{
Super s=new Super();
s.mult(12,48);
}
}