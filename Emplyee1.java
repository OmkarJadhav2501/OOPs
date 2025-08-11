public class Emplyee1
{
int em_id;
String name;
public Emplyee1(int Id,String n)
{
em_id=Id;
name=n;
System.out.println("ID:"+em_id);
System.out.println("Name is:"+name);
}
public static void main(String args[])
{
Emplyee1 e=new Emplyee1(101,"omkar");
}
}