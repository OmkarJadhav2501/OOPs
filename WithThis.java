public class WithThis
{
int roll;
String name;
int marks;

public WithThis(int roll,String name,int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;

}

public void Display()
{
System.out.println("Roll no.: "+roll+ " Name is:  "+name+ " Marks: "+marks);
 
}
public static void main(String args[])
{
WithThis s=new WithThis(35,"OMKAR",35);
s.Display();
}
}