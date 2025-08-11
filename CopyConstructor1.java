public class CopyConstructor1
{
int emp_id;
//String name;
public CopyConstructor1(int id)
{
emp_id=id;

System.out.println("Empolyee id:  "+emp_id);
}

public CopyConstructor1(CopyConstructor1 obj)
{
emp_id=obj.emp_id;

System.out.println("Empolyee id:  "+emp_id);
}

public static void main(String args[])
{
CopyConstructor1 e=new CopyConstructor1(100); 
CopyConstructor1 e1=new CopyConstructor1(e);
}
}