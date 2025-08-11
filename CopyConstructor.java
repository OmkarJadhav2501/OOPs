public class CopyConstructor
{
int emp_id;
String name;
public CopyConstructor(int id,String n)
{
emp_id=id;
name=n;
System.out.println("Empolyee id:  "+emp_id+"  Empolyee name:"+name);
}

public CopyConstructor(CopyConstructor obj)
{
emp_id=obj.emp_id;
name=obj.name;
System.out.println("Empolyee id:  "+emp_id+ "  Empolyee name:"+name);
}

public static void main(String args[])
{
CopyConstructor e=new CopyConstructor(100,"Sai"); //its check which constructor having 2 paramter then execute
CopyConstructor e1=new CopyConstructor(e);
}
}