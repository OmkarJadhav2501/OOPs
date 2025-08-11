public class This
{
int roll;
String name;
int marks;

public This(int r,String n,int m)
{
roll=r;
name=n;
marks=m;
}

public void Dispaly()
{
System.out.println("roll : " +roll+ "name :"+name+ "marks:" +marks);
}

public static void main(String args[])
{
This s=new This(33,"Sai",101);
s.Dispaly();
}
}