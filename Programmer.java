class Employee
{
int salary=5000;
public void Display()
{
System.out.println("In employee class");
}
}
public class Programmer extends Employee
{
int bonus=1000;
public void show()
{
System.out.println("In programmer class");
}

public static void main(String args[])
{
Programmer p=new Programmer();
int total_income=p.salary+p.bonus;
System.out.println("Total :"+total_income);
p.Display();
p.show();
}
}