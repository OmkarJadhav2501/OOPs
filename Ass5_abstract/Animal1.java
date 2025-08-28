abstract class Animal1
{
public abstract void voice();

public void eat()
{
System.out.println("In Eatting method...");
}
}
public class Tiger_AnimalObj extends Animal1
{
public void voice()
{
System.out.println("In Tiger class...");
}
public static void main(String args[])
{
Animal1 a=new Tiger_AnimalObj();
a.voice();
a.eat();
}
}