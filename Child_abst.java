abstract class Player
{
public abstract void Batsman();    // abstract method
public abstract void Bowler();      // abstract method

public void fitness()              //non-abstract method
{
System.out.print("Must be physically fit");
}

}
public class Child_abst extends Player
{
public void Batsman()
{
System.out.println("Batsman must be right");

}
public void Bowler()
{
System.out.println("Jaspirt Bumrah");
}

public static void main(String args[])
{
Child_abst c=new Child_abst();
c.Batsman();
c.Bowler();
c.fitness();
}
}