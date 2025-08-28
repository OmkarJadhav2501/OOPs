public abstract class Animal
{
public abstract void voice();

}
public class AbstracDog extends Animal
{
public void bark()
{
System.out.println("Barking method in dog class");
}
public static void main(String args[])
{
AbstracDog a=new AbstracDog();
a.voice();
}
}