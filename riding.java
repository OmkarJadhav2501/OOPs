class Overriding
{
public void add(int a,int b)          //in overriding concept the method name and parameter must be same and also return type also same
									//in overriding concept the child class method must be call
{
int c=a+b;
System.out.println("In Super class:"+c);
}
}
public class riding extends Overriding
{
public void add(int a,int b)
{
int c=a+b;
System.out.println("In child class:"+c);
}

public static void main(String args[])
{
riding r=new riding();
r.add(10,20);

}
}