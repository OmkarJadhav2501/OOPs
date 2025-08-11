public class WithoutThis
{
int roll_no;
String name;
int marks;

public  WithoutThis(int roll_no,String name,int marks)
{
roll_no=roll_no;
name=name;
marks=marks;
}

public void Display()
{
System.out.println("Roll no.: "+roll_no+ " Name:"+name+ " Marks : "+marks);
}
public static void main(String args[])
{
WithoutThis s=new WithoutThis(100,"omkar",99);
s.Display();
}
}
