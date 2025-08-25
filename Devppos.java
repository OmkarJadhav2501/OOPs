class Emplyee
{
int salary=50000;
}
public class Devppos extends Emplyee
{
int salary=75000;
public void display()
{
System.out.println("In Emplyee Salary:"+super.salary);
System.out.println("In Devppos salary :"+salary);
}

public static void main(String args[])
{
Devppos d=new Devppos();
d.display();
}
}