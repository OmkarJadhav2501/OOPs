public class Swapping2
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping:"); 
		System.out.println("value of a:"+a); 
		System.out.println("value of b:"+b);
		a=a+b;// a=30,b=20
		b=a-b; //30-20   b=10
		a=a-b; // 30-10
		System.out.println("After swapping:"); 
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
	}
}