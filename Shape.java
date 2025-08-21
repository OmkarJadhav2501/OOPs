public class Shape
{
public void area()
{
int b=10;
int h=5;
int r=b*h;
System.out.println("Area of rectangle is:"+r);
}
public double area(int b,int h)
{
double t=0.5*b*h;
return t;
}
public double area(int r)
{
double c=3.14*r*r;
return c;
}
public static void main(String args[])
{
Shape s=new Shape();
s.area();
System.out.println("Area of Triangle is:"+s.area(5,9));
System.out.println("Area of circle is:"+s.area(10));
}
}