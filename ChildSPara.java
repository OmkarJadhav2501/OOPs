class Parent
{
public Parent(int roll)
{
System.out.println("In Parent constructor:"+roll);
}
}
public class ChildSPara extends Parent
{
public ChildSPara()
{
super(35);
System.out.println("In ChildSPara :");
}
public static void main(String args[])
{
ChildSPara c=new ChildSPara();

}
}
