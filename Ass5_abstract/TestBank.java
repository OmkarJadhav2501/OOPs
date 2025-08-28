abstract class BankAccount{

abstract void deposit();
abstract void withdrawl();
abstract void checkBalance();
void getDetails()
{
System.out.println("Details of custmer like name,mob number,email ,etc.");
}
}

class SavingAccount extends BankAccount
{
void deposit()
{
System.out.println("Deposit should be more than 10k");
}
void withdrawl()
{
System.out.println("Withdrawl should be more than 1k");
}
void checkBalance()
{
System.out.println("Balance is :100k");
}

}

class CurrentAccount extends BankAccount
{
void deposit()
{
System.out.println("Deposit should be more than 0 rupees");
}
void withdrawl()
{
System.out.println("Withdrawl should be ur bank balance");
}
void checkBalance()
{
System.out.println("Balance is :2000k");
}

}

public class TestBank{

public static void main(String args[])
{
BankAccount b=new SavingAccount();
b.deposit();
b.withdrawl();
b.checkBalance();
b.getDetails();

BankAccount c=new CurrentAccount();
c.deposit();
c.withdrawl();
c.checkBalance();
c.getDetails();

}
}