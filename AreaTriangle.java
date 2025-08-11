import java.util.*;
public class AreaTriangle
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base:");
		base=sc.nextDouble();
		System.out.println("Enter the Height:");
		height=sc.nextDouble();
		double area=0.5*base*height;
		

		System.out.print("Area of Triangle is:"+area);
	}

}