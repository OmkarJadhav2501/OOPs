abstract class Animal
{
public abstract void voice();

}
public class Dog_abst extends Animal
{
public void voice()
{
System.out.println("Barking method in dog class");
}
public static void main(String args[])
{
Dog_abst a=new Dog_abst();
a.voice();
}
}