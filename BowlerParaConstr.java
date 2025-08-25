class Player
{
public Player(String name)
{
System.out.println("in parent constructor :"+name);
}
}
public class BowlerParaConstr extends Player
{
public BowlerParaConstr(String name)
{
super("Sanika");
System.out.println("In BowlerParaConstr :"+name);
}
public static void main(String args[])
{
BowlerParaConstr b=new BowlerParaConstr("Omkar");
}
}