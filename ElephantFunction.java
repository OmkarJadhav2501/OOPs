class Animal
{
public void voice()
{
System.out.println("In Animal Voice");
}
}
public class ElephantFunction extends Animal
{
public void voice()
{
super.voice();
System.out.println("In Elephant voice");
}
public static void main(String args[])
{
ElephantFunction e=new ElephantFunction();
e.voice();
}
}