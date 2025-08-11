public class ThisFun
{
public void Display()
{
this.show();
System.out.println("In Dislpay method");

}
public void show()
{
System.out.println("In show method by using this keyword ");
}

public void RBNB()
{
System.out.println("In RBNB method");
}

public static void main(String args[])
{
ThisFun f=new ThisFun();
f.Display();

}
}