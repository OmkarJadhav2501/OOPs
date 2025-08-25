class Player
{
public Player()
{
System.out.println("In player constructor");

}
}
public class Batsman extends Player
{
public Batsman()
{
super();
System.out.println("In Batsman constructor");
}
public static void main(String args[])
{
Batsman b=new Batsman();
}
}