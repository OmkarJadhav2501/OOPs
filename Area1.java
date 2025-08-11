import java.util.*;

class Area1(double r)
{
this.r=r;
double area=3.14*r*r;
return area;
}
public class Circle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the area:");
double r=sc.nextInt();
Area1 a=new Area1();
System.out.println("Area of Circle is:"+a.Area1(r));
}
}
